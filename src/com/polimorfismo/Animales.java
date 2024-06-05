package com.polimorfismo;

class Animal {
    void hacerSonido() {
        System.out.println("Hace un sonido genérico");
    }
}

class Perro extends Animal {
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    void hacerSonido() {
        System.out.println("El gato maulla");
    }
}

public class Animales {

    public static void main(String[] args) {
        Animal miMascota = new Perro();
        miMascota.hacerSonido(); // Salida: El perro ladra

        miMascota = new Gato();
        miMascota.hacerSonido(); // Salida: El gato maulla
    }

}
