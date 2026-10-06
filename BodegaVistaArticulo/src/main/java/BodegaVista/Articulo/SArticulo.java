
package BodegaVista.Articulo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SArticulo {
    @Autowired
    private RestTemplate res;
    
    public void grabar(Articulo a){
        String url="http://localhost:8081/articulo";
        res.postForObject(url,a, void.class);
    }
    public List<Articulo>listar(){
        String url="http://localhost:8081/articulo";
        return res.getForObject(url, List.class);
    }
}
