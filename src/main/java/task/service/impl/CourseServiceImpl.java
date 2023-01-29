package task.service.impl;

import task.models.Course;
import task.repository.CourseRepository;
import task.repository.repositoryImpl.CourseRepositoryImpl;
import task.service.CourseService;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    public final CourseRepository courseRepository = new CourseRepositoryImpl();

    @Override
    public void saveCourse(Course course) {
        courseRepository.saveCourse(course);

    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseRepository.getCourseById(courseId);
    }

    @Override
    public List<Course> getAllCourse() {
        return courseRepository.getAllCourse();
    }

    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteCourseById(id);
    }

    public void updateCourse(Long id, Course course){
        courseRepository.updateCourse(id, course);

    }
    @Override
    public Course getCourseByName(String name) {
        return courseRepository.getCourseByName(name);
    }
}
