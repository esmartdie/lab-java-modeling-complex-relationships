package event_management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int presentationDuration;
}
