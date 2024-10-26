import java.util.Scanner;

public class MinAMayuscula {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una frase : ");
        String frase = scanner.nextLine();

        recorreCaracteres(frase);
    }

    public static String recorreCaracteres(String frase){
        StringBuilder resultado = new StringBuilder();
        boolean esInicioPalabra = true;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (esInicioPalabra && Character.isLetter(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
                esInicioPalabra = false;
            } else {
                resultado.append(caracter);
            }
            if (caracter == ' ') {
                esInicioPalabra = true;
            }
        }
        System.out.println(resultado);
        return resultado.toString();
        }
    }


