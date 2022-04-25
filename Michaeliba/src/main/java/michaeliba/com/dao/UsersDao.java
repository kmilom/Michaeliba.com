package michaeliba.com.dao;

import michaeliba.com.domain.Users;
import org.springframework.data.repository.CrudRepository;


public interface UsersDao extends CrudRepository<Users, Long>{
    
}
