import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer id;

  @Column
  @Getter
  @Setter
  private String name;
}
