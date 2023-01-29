package task.config;

import jakarta.persistence.EntityManager;
import org.hibernate.cfg.Configuration;
import task.models.Course;
import task.models.Instructor;
import task.models.Lesson;
import task.models.Task;

import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateConfig {

    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/task");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "postgres");
        configuration.setProperty(HBM2DDL_AUTO, "create");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQL9Dialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Course.class);
        configuration.addAnnotatedClass(Instructor.class);
        configuration.addAnnotatedClass(Lesson.class);
        configuration.addAnnotatedClass(Task.class);
        return configuration.buildSessionFactory().createEntityManager();


    }
}