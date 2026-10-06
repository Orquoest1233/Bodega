
package BodegaVista.Articulo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CArticulo {
    @Autowired
    private SArticulo ser;
    
    @GetMapping("/form")
    public String verForm(Model model){
        model.addAttribute("a",new Articulo());
        return "Grabar";
    }
    @PostMapping("/grabar")
    public String grabar(@ModelAttribute Articulo a){
        ser.grabar(a);
        return "redirect:/form?success";
    }
    @GetMapping("listar")
    public String listar(Model model){
        List<Articulo>lis=ser.listar();
        model.addAttribute("as",lis);
        return "Listar";
    }
}
