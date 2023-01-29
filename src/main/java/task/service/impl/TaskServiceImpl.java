package task.service.impl;

import task.models.Lesson;
import task.models.Task;
import task.repository.CourseRepository;
import task.repository.TaskRepository;
import task.repository.repositoryImpl.CourseRepositoryImpl;
import task.repository.repositoryImpl.TaskRepositoryImpl;
import task.service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService {

    public final TaskRepository taskRepository = new TaskRepositoryImpl();

    @Override
    public void saveTask(Task task, Long lesson_id) {
        taskRepository.saveTask(task, lesson_id);

    }

    @Override
    public void updateTask(Long id, Task task) {
        taskRepository.updateTask(id, task);

    }

    @Override
    public List<Task> getAllTaskByLessonId(Long lesson_id) {
        return taskRepository.getAllTaskByLessonId(lesson_id);
    }

    @Override
    public void deleteTaskById(Long taskId) {
        taskRepository.deleteTaskById(taskId);

    }
}
