
package Bodega.Articulo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulo")
public class CArticulo {
    @Autowired
    private SArticulo ser;
    
    @PostMapping
    public ResponseEntity<Articulo>grabar(@RequestBody Articulo a){
        return ser.grabar(a);
    }
    @GetMapping
    public List<Articulo>listar(){
        return ser.listar();
    }
}
