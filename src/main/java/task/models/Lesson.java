package task.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import task.config.HibernateConfig;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "lessons")

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "video_link")
    private String videoLink;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(cascade = {CascadeType.REMOVE ,
            CascadeType.PERSIST})
    @JoinColumn(name = "lesson_id")
    private List<Task> tasks = new ArrayList<>();


    public Lesson(String name, String videoLink) {
        this.name = name;
        this.videoLink = videoLink;
    }
}
