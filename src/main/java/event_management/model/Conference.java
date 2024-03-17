package event_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@DiscriminatorValue("Conference")
public class Conference extends Exposition{

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Speaker> speakers;
}
