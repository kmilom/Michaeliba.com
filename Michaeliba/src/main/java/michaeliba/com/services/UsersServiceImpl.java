package michaeliba.com.services;

import java.util.List;
import michaeliba.com.dao.UsersDao;
import michaeliba.com.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UsersServiceImpl implements UsersService{
    
    @Autowired
    private UsersDao UserDao;

    @Override
    @Transactional(readOnly = true)
    public List<Users> userList() {
        return (List<Users>) UserDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Users usuario) {
        UserDao.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Users usuario) {
        UserDao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Users buscarUsers(Users usuario) {
        return UserDao.findById(usuario.getId_users()).orElse(null);
    }
    
}
