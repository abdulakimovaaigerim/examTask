package task.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import task.config.HibernateConfig;
import task.models.Course;
import task.models.Lesson;
import task.repository.LessonRepository;

import java.util.List;

public class LessonRepositoryImpl implements LessonRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveLesson(Lesson lesson, Long course_id) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, course_id);
        entityManager.persist(course);
        System.out.println("Successfully saved!");
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void updateLesson(Long id, Lesson lesson) {
        entityManager.getTransaction().begin();
        Lesson lesson1 = entityManager.find(Lesson.class, id);
        lesson1.setName(lesson.getName());
        lesson1.setVideoLink(lesson.getVideoLink());
        entityManager.persist(lesson1);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public Lesson getLessonById(Long id) {
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, id);
        entityManager.persist(lesson);
        entityManager.getTransaction().commit();
        entityManager.close();
        return lesson;
    }

    @Override
    public List<Lesson> getLessonByCourseId(Long course_id) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, course_id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return course.getLessons();
    }
}
