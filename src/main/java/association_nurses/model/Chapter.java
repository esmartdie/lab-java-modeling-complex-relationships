package association_nurses.model;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String district;
    @OneToOne(fetch = FetchType.EAGER)
    private Member president;
    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Member> members;

}
