
public class PlanoOperadora {
    public static void main(String[] args) {
        String  plano = "M";

        switch (plano) {
            case "T":
                System.out.println("5G Youtube");

            case "M":
                System.out.println("Whatsapp e Instagram gratis");

            case "B":
                System.out.println("100 minutos de ligação");

            default:
                break;
        }
    }
}
