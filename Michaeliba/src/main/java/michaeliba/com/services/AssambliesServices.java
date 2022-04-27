package michaeliba.com.services;

import java.util.List;
import michaeliba.com.domain.Assamblies;


public interface AssambliesServices {
    
    public List<Assamblies> assamblyList();
    
    public void guardar(Assamblies asamblea);
    
    public void eliminar(Assamblies asamblea);
    
    public Assamblies buscarAssamblies(Assamblies asamblea);
}
