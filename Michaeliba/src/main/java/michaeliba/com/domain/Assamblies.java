package michaeliba.com.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

//Genera automaticamente los metodos get y set
@Data
//Convierte la clase en entidad para la db
@Entity
//Para evitar incompatibilidad con la tabla
@Table(name="assamblies")

public class Assamblies implements Serializable{
    
    private static final  long serialVersionUID = 1L;
    
    //Genera la id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_assamblies;
    private String date;
    private String time;
    private String duration;
    private int quorum;
    private String suburb;
}
