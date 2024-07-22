//Dentro do projeto, crie a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}