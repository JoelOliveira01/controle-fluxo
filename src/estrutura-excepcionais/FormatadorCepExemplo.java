

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado); // Imprime o cep formatado

        } catch (IllegalArgumentException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) {
        if (cep.length() != 8)
            throw new IllegalArgumentException();

        // Simulando um cep formatado
        return "23.765-064";
    }
}

