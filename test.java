public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int num3 = 7;

        int suma = sumarNumeros(num1, num2, num3);
        System.out.println("La suma de los números es: " + suma);
    }

    public static int sumarNumeros(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
public class Coche {
    private int numPuertas;

    public Coche() {
        this.numPuertas = 0;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void agregarPuerta() {
        numPuertas++;
    }
}

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puerta(s).");
    }
}
