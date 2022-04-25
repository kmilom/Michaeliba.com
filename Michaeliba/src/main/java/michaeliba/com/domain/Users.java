package michaeliba.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

// Genera automaticamente los metodos get y set
@Data
// Convierte la clase en entidad para la db
@Entity
// Para evitar incompatibilidad con la tabla
@Table(name="users")

public class Users implements Serializable{
    
    public static final long serialVersion = 1L;
    
    //Genera id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_users;
    private String user;
    private String password;
    
}
