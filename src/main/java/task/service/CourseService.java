package task.service;

import task.models.Course;

import java.util.List;

public interface CourseService {
    void saveCourse(Course course);
    Course getCourseById(Long courseId);
    List<Course> getAllCourse();
    void deleteCourseById(Long id);
    Course getCourseByName(String name);
    void updateCourse(Long id, Course course);
}
