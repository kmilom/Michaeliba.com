package michaeliba.com.web;

import java.util.List;
import michaeliba.com.domain.Users;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import michaeliba.com.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

//{}
@Controller

public class ControladorInicio {
    @Autowired
    private UsersService usersService;   
    
    @GetMapping("/")
    public String inicio(Model model){
        List users = usersService.userList();
        model.addAttribute("users", users);
        return "index";
    }
    
    @GetMapping("/crear-usuario")
    public String crearUsuario(Users usuario){
        return "modificar";
    }
}
