package com.aluracursos.screenmatch.principal;

import java.util.ArrayList;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class PrincipalConListas {

	public static void main(String[] args) {
		Pelicula miPelicula = new Pelicula("Encanto", 2021);
		Pelicula otraPelicula = new Pelicula("Matrix", 1998);
		var peliculaDeJuan = new Pelicula("El señor de los anillos", 2001);
		Serie casaDragon = new Serie("La casa del dragón", 2022);

		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(miPelicula);
		lista.add(otraPelicula);
		lista.add(peliculaDeJuan);
		lista.add(casaDragon);
	}

}
