package task.models;

import jakarta.persistence.*;
import lombok.*;
import task.config.HibernateConfig;


@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Task {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "dead_line")
    private String deadLina;
    private String task;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.PERSIST},
            fetch = FetchType.LAZY)
    private Lesson lesson;

    public Task(String name, String deadLina, String task) {
        this.name = name;
        this.deadLina = deadLina;
        this.task = task;
    }
}
