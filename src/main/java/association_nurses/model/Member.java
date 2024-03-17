package association_nurses.model;

import association_nurses.utils.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Date renewalDate;
    @Enumerated(EnumType.STRING)
    private Status status;
}
