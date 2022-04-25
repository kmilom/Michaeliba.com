package michaeliba.com.services;

import java.util.List;
import michaeliba.com.domain.Users;


public interface UsersService {
    
    public List<Users> userList();
    
    public void guardar(Users usuario);
    
    public void eliminar(Users usuario);
    
    public Users buscarUsers(Users usuario);
    
}
