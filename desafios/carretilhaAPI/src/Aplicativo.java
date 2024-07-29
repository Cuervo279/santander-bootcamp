import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class Aplicativo extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(CarretilhaResource.class);
        return classes;
    }
}