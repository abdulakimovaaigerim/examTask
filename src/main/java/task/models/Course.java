package task.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "courses")
@NoArgsConstructor
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "course_name")
    private String courseName;
    private int duration;

    @Column(name = "create_at")
    private LocalDate createAt;

    @Column(name = "image_link")
    private String imageLink;
    private String description;

    @ManyToMany(cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER, mappedBy = "courses")
    private List<Instructor> instructors;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "course", fetch = FetchType.EAGER)
    private List<Lesson> lessons;

    public Course(String courseName, int duration, LocalDate createAt, String imageLink, String description) {
        this.courseName = courseName;
        this.duration = duration;
        this.createAt = createAt;
        this.imageLink = imageLink;
        this.description = description;
    }

}
