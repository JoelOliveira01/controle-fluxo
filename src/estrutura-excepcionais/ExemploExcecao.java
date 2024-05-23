
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor); // Imprime o valor parseado

        } catch (ParseException e) {
            // Imprime informações sobre a exceção
            
        }
    }
}

