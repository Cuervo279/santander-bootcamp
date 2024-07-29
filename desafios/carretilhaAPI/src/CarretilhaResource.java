import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/carretilhas")
public class CarretilhaResource {
    private CarretilhaRepository repository = new CarretilhaRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<ModeloCarretilha> listarCarretilhas() {
        return repository.listarCarretilhas();
    }
}