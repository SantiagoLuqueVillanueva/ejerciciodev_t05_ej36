public class App {
    public static void main(String[] args) throws Exception {
        long numeroIntroducido = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));

        long numero = numeroIntroducido;
        long volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }

        if(volteado == numeroIntroducido)
            System.out.printf("El %d es capicúa.", numeroIntroducido);
        else
            System.out.printf("El %d no es capicúa.", numeroIntroducido);
    }
}
