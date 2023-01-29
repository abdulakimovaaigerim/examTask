package task.repository;

import task.models.Lesson;

import java.util.List;

public interface LessonRepository {
    void saveLesson(Lesson lesson, Long course_id);
    void updateLesson(Long id, Lesson lesson);
    Lesson getLessonById(Long id);
    List<Lesson> getLessonByCourseId(Long course_id);
}
