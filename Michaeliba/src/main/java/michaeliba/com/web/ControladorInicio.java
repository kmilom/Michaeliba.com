package michaeliba.com.web;

import java.util.List;
import michaeliba.com.domain.Users;
import michaeliba.com.services.AssambliesServices;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import michaeliba.com.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.admin.SpringApplicationAdminMXBeanRegistrar;
import org.springframework.web.bind.annotation.PostMapping;
//{}
@Controller

public class ControladorInicio {
    @Autowired
    private UsersService usersService;   
      
    @GetMapping("/")
    public String inicio(){
        return "index";
    }
    
    @GetMapping("/crear-usuario")
    public String crearUsuario(Model model){
        model.addAttribute("usuario", new Users());
        return "crearUsuario";   
    }
    
    @GetMapping("/administrar-usuarios")
    public String adminUsers(Model model){
        List usuarios = usersService.userList();
        model.addAttribute("usuarios", usuarios);
        return "adminUsuarios";
    }
    
    @PostMapping("/guardar")
    public String guardar(Users usuario){
        usersService.guardar(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_users}")
    public String editarUsuario(Users usuario, Model model){
        usuario = usersService.buscarUsers(usuario);
        model.addAttribute("usuario", usuario);
        return "crearUsuario";
    }
}
