package task.repository.repositoryImpl;

import jakarta.persistence.EntityManager;
import task.config.HibernateConfig;
import task.models.Lesson;
import task.models.Task;
import task.repository.TaskRepository;

import java.util.List;

public class TaskRepositoryImpl implements TaskRepository {
    private final EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public void saveTask(Task task, Long lesson_id) {
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, lesson_id);
        lesson.getTasks().add(task);
        entityManager.persist(task);
        entityManager.persist(lesson);
        entityManager.getTransaction().commit();
        entityManager.close();


    }

    @Override
    public void updateTask(Long id, Task task) {
        entityManager.getTransaction().begin();
        Task task1 = entityManager.find(Task.class, id);
        task1.setName(task1.getName());
        task1.setDeadLina(task1.getDeadLina());
        task1.setTask(task.getTask());
        entityManager.refresh(task1);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public List<Task> getAllTaskByLessonId(Long lesson_id) {
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, lesson_id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return lesson.getTasks();
    }

    @Override
    public void deleteTaskById(Long taskId) {
        entityManager.getTransaction().begin();
        Task task = entityManager.find(Task.class, taskId);
        entityManager.remove(task);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
