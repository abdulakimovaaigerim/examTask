package task.service.impl;

import task.models.Lesson;
import task.repository.CourseRepository;
import task.repository.LessonRepository;
import task.repository.repositoryImpl.CourseRepositoryImpl;
import task.repository.repositoryImpl.LessonRepositoryImpl;
import task.service.LessonService;

import java.util.List;

public class LessonServiceImpl implements LessonService {

    public final LessonRepository lessonRepository = new LessonRepositoryImpl();

    @Override
    public void saveLesson(Lesson lesson, Long course_id) {
        lessonRepository.saveLesson(lesson, course_id);

    }

    @Override
    public void updateLesson(Long id, Lesson lesson) {
        lessonRepository.updateLesson(id, lesson);

    }

    @Override
    public Lesson getLessonById(Long id) {
        return lessonRepository.getLessonById(id);
    }

    @Override
    public List<Lesson> getLessonByCourseId(Long course_id) {
        return lessonRepository.getLessonByCourseId(course_id);
    }
}
