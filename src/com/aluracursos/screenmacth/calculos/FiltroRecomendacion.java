package com.aluracursos.screenmacth.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificable clasificable) {
        if (clasificable.getClasificable() >= 4) {
            System.out.println("Aclamado por la critica");
        } else if (clasificable.getClasificable() >= 2) {
            System.out.println("Altamente popular");
        } else {
            System.out.println("De nicho");
        }
    }

}
