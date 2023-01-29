package task.service.impl;

import task.models.Instructor;
import task.repository.CourseRepository;
import task.repository.InstructorRepository;
import task.repository.repositoryImpl.CourseRepositoryImpl;
import task.repository.repositoryImpl.InstructorRepositoryImpl;
import task.service.InstructorService;

import java.util.List;

public class InstructorServiceImpl implements InstructorService {

    public final InstructorRepository instructorRepository = new InstructorRepositoryImpl();

    @Override
    public void saveInstructor(Instructor instructor) {
        instructorRepository.saveInstructor(instructor);

    }

    @Override
    public void updateInstructor(Long id, Instructor instructor) {
        instructorRepository.updateInstructor(id, instructor);

    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepository.getInstructorById(id);
    }

    @Override
    public List<Instructor> getInstructorsByCourseId(Long course_id) {
        return instructorRepository.getInstructorsByCourseId(course_id);
    }

    @Override
    public void deleteInstructorById(Long id) {
        instructorRepository.deleteInstructorById(id);

    }

    @Override
    public void assignInstructorToCourse(Long instructor_id, Long course_id) {
        instructorRepository.assignInstructorToCourse(instructor_id, course_id);

    }
}
