package task.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import task.config.HibernateConfig;
import task.models.Course;
import task.models.Instructor;
import task.repository.InstructorRepository;

import java.util.List;

public class InstructorRepositoryImpl implements InstructorRepository{
    private final EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void saveInstructor(Instructor instructor) {
        entityManager.getTransaction().begin();
        entityManager.persist(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void updateInstructor(Long id, Instructor instructor) {
        entityManager.getTransaction().begin();
        Instructor instructor1 = entityManager.find(Instructor.class, id);
        instructor1.setFirstName(instructor1.getFirstName());
        instructor1.setLastName(instructor1.getLastName());
        instructor1.setEmail(instructor1.getEmail());
        instructor1.setPhoneNumber(instructor1.getPhoneNumber());
        entityManager.getTransaction().commit();
        entityManager.close();
    }


    @Override
    public Instructor getInstructorById(Long id) {
        entityManager.getTransaction().begin();
        Instructor instructor = entityManager.find(Instructor.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return instructor;
    }

    @Override
    public List<Instructor> getInstructorsByCourseId(Long course_id) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, course_id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return course.getInstructors();
    }

    @Override
    public void deleteInstructorById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.find(Instructor.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void assignInstructorToCourse(Long instructor_id, Long course_id) {
        entityManager.getTransaction().begin();
        Instructor instructor =  entityManager.find(Instructor.class, instructor_id);
        Course course = entityManager.find(Course.class, course_id);
        instructor.getCourses().add(course);
        course.getInstructors().add(instructor);
        entityManager.persist(instructor);
        entityManager.persist(course);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
