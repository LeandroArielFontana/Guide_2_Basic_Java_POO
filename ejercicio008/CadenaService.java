package ejercicio008;

public class CadenaService {

    public int mostrarVocales(Cadena frase) {
        int count = 0;
        String palabra = frase.getFrase().toUpperCase();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'A' || palabra.charAt(i) == 'E' || palabra.charAt(i) == 'I' || palabra.charAt(i) == 'O' || palabra.charAt(i) == 'U') {
                count++;
            }
        }

        return count;
    }

    public String invertirFrase(Cadena frase) {
        String aux = "";
        String palabra = frase.getFrase();

        for (int i = (frase.getFrase().length() - 1); i >= 0; i--) {
            aux += palabra.charAt(i);
        }

        return aux;
    }

    public int vecesRepetido(Cadena frase, String letra) {
        int count = 0;
        String palabra = frase.getFrase().toUpperCase();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra.toUpperCase().charAt(0)) {
                count++;
            }
        }

        return count;
    }

    public void compararLongitud(Cadena frase, String word2) {
        if (frase.getFrase().length() < word2.length()) {
            System.out.println("La ultima frase ingresada es mas grande que la del objeto");
        } else if (frase.getFrase().length() > word2.length()) {
            System.out.println("La ultima frase ingresada es mas chica que la del objeto");
        } else {
            System.out.println("La ultima frase ingresada tiene el mismo tamaño que la del objeto ");
        }
    }

    public String unirFrases(Cadena frase, String word3) {
        return (frase.getFrase() + word3);
    }
}
