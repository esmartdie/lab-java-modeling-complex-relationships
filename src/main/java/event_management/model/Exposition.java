package event_management.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type")
public class Exposition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private int duration;
    private String location;
    private String title;
    @OneToMany(mappedBy = "exposition", cascade = CascadeType.ALL)
    private List<Guest> guests;
}
