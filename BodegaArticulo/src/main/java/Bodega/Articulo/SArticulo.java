
package Bodega.Articulo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SArticulo {
    @Autowired
    private RArticulo rep;
    
    public ResponseEntity<Articulo>grabar(Articulo a){
        Articulo ar=rep.save(a);
        return ResponseEntity.ok(ar);
    }
    public List<Articulo>listar(){
        return rep.findAll();
    }
}
