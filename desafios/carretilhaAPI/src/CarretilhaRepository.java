import java.util.ArrayList;
import java.util.List;

public class CarretilhaRepository {
    private List<ModeloCarretilha> carretilhas = new ArrayList<>();

    public CarretilhaRepository() {
        // Inicializa a lista com alguns modelos de carretilhas
        carretilhas.add(new ModeloCarretilha(1L, "Carretilha de Pesca Básica", "Uma carretilha simples para iniciantes", 20.0));
        carretilhas.add(new ModeloCarretilha(2L, "Carretilha de Pesca Avançada", "Uma carretilha para pescadores experientes", 50.0));
        carretilhas.add(new ModeloCarretilha(3L, "Carretilha de Pesca Esportiva", "Uma carretilha para pescadores esportivos", 100.0));
    }

    public List<ModeloCarretilha> listarCarretilhas() {
        return carretilhas;
    }
}