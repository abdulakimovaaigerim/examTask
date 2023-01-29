package task;

import task.models.Course;
import task.models.Instructor;
import task.models.Lesson;
import task.models.Task;
import task.service.CourseService;
import task.service.InstructorService;
import task.service.LessonService;
import task.service.TaskService;
import task.service.impl.CourseServiceImpl;
import task.service.impl.InstructorServiceImpl;
import task.service.impl.LessonServiceImpl;
import task.service.impl.TaskServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main( String[] args ) {

        CourseService courseService = new CourseServiceImpl();
        InstructorService instructorService = new InstructorServiceImpl();
        LessonService lessonService = new LessonServiceImpl();
        TaskService taskService = new TaskServiceImpl();



//        courseService.saveCourse(new Course("PeakSoft", 9, LocalDate.of(2020, 1, 31),
//                "https://webcache.googleusercontent.com/search?q=cache:fh0NFm2ejIkJ:https://peaksoft.house/&cd=1&hl=ru&ct=clnk&gl=kg",
//                "PeakSoft House - бул PeakSoft IT компаниясынын онлайн жана офлайн окутуу курстары. " +
//                        "Биз талап кылынган Back-end (Java) жана Front-end (JavaScript), " +
//                        "IT адистерин online - offline даярдайбыз. Нолдон баштап биринчи жумуш күнүнө чейин."));


//        instructorService.saveInstructor(new Instructor("Mukhammed",
//                "Toichubai uulu", "mukhammed@gmail.com", "0900121212"));


//        lessonService.saveLesson(new Lesson("Java", "https://www.youtube.com/watch?v=fYwViar9eMY"), 1L);


//        taskService.saveTask(new Task("hibernate", "11:00", "sql"),1L);


//        System.out.println(courseService.getCourseByName("Peaksoft"));

//        courseService.updateCourse(1L, new Course("Codify",8, LocalDate.of(2019, 8, 23),
//                "taplink.cc/codifylab.com", "Codify - бул онлайн жана офлайн окууту курстары" ));

//        System.out.println(courseService.getAllCourse());

//        courseService.deleteCourseById(1L);
//        System.out.println(courseService.getCourseById(1L));


//        System.out.println(instructorService.getInstructorById(1L));

//        instructorService.deleteInstructorById(1L);
//        instructorService.updateInstructor(1L, new Instructor("Aijamal", "Asangazieva", "aijamal@gmail.com", "0777110011"));
//        instructorService.assignInstructorToCourse(1L, 1L);
//        System.out.println(instructorService.getInstructorsByCourseId(1L));


//        System.out.println(lessonService.getLessonByCourseId(1L));
//        lessonService.updateLesson(1L, new Lesson("JS", "https://www.youtube.com/watch?v=fYwViar9eMY");


//        taskService.deleteTaskById(1L);

//        taskService.updateTask(1L, new Task("JDBC", "12:00", "SQL"));
//        System.out.println(taskService.getAllTaskByLessonId(1L));



    }
}
