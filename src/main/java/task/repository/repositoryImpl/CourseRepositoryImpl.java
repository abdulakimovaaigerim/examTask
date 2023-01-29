package task.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import task.config.HibernateConfig;
import task.models.Course;
import task.repository.CourseRepository;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepository {

    private final EntityManager entityManager = HibernateConfig.getEntityManager();


    @Override
    public void saveCourse(Course course) {
        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public Course getCourseById(Long courseId) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return course;
    }

    @Override
    public List<Course> getAllCourse() {
        entityManager.getTransaction().begin();
        List<Course> courses = entityManager.createQuery("select c from Course c", Course.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return courses;
    }

    @Override
    public void deleteCourseById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.find(Course.class,id);
        Course course = new Course();
        course.setCourseName(course.getCourseName());
        course.setDuration(course.getDuration());
        course.setDescription(course.getDescription());
        course.setCreateAt(course.getCreateAt());
        course.setImageLink(course.getImageLink());
        entityManager.merge(course);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public Course getCourseByName(String name) {
        entityManager.getTransaction().begin();
        List<Course> courses = entityManager.createQuery("select c from Course c", Course.class).getResultList();
        for (Course course : courses) {
            if (course.getCourseName().equals(name)){
                return course;
            }
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }

    @Override
    public void updateCourse(Long id, Course course) {
        entityManager.getTransaction().begin();
        Course course1 = entityManager.find(Course.class, id);
        course1.setCourseName(course1.getCourseName());
        course1.setDuration(course1.getDuration());
        course1.setImageLink(course1.getImageLink());
        course1.setCreateAt(course1.getCreateAt());
        System.out.println("Successfully updated!");
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}
