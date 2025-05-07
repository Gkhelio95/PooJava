package Test;

public class Test {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 4);
        Moto moto1 = new Moto("Yamaha", "MT-07", 2021, "deportivo");

        auto1.acelerar(50);
        moto1.acelerar(30);
        auto1.frenar(10);

        auto1.detalles();
        moto1.detalles();
    }
}

// Clase base
class Vehiculo {
    String marca;
    String modelo;
    int anio;
    int velocidad;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0;
    }

    public void acelerar(int cantidad) {
        velocidad += cantidad;
    }

    public void frenar(int cantidad) {
        velocidad = Math.max(0, velocidad - cantidad);
    }

    public void detalles() {
        System.out.println(marca + " " + modelo + " (" + anio + ") - Velocidad: " + velocidad + " km/h");
    }
}

// Clase Auto que hereda de Vehiculo
class Auto extends Vehiculo {
    int puertas;

    public Auto(String marca, String modelo, int anio, int puertas) {
        super(marca, modelo, anio);
        this.puertas = puertas;
    }

    @Override
    public void detalles() {
        super.detalles();
        System.out.println("Puertas: " + puertas);
    }
}

// Clase Moto que hereda de Vehiculo
class Moto extends Vehiculo {
    String tipoManillar;

    public Moto(String marca, String modelo, int anio, String tipoManillar) {
        super(marca, modelo, anio);
        this.tipoManillar = tipoManillar;
    }

    @Override
    public void detalles() {
        super.detalles();
        System.out.println("Manillar: " + tipoManillar);
    }
}
