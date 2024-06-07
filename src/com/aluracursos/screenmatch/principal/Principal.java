package com.aluracursos.screenmatch.principal;
import java.util.ArrayList;

import com.aluracursos.screenmacth.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmacth.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		Pelicula miPelicula = new Pelicula("Encanto", 2021);
		miPelicula.setDuracionEnMinutos(120);
		miPelicula.setIncluidoEnElPlan(true);

		miPelicula.muestraFichaTecnica();
		miPelicula.evalua(10);
		miPelicula.evalua(10);
		miPelicula.evalua(7.8);
		System.out.println(miPelicula.getTotalDelasEvaluaciones());
		System.out.println(miPelicula.calculaMedia());

		Serie casaDragon = new Serie("La casa del dragón", 2022);
		casaDragon.setTemporadas(1);
		casaDragon.setMinutosPorEpisodio(50);
		casaDragon.setEpisodiosPorTemporada(10);
		casaDragon.muestraFichaTecnica();
		System.out.println(casaDragon.getDuracionEnMinutos());

		Pelicula otraPelicula = new Pelicula("Matrix", 1998);
		otraPelicula.setDuracionEnMinutos(180);

		CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
		calculadora.incluye(miPelicula);
		calculadora.incluye(casaDragon);
		calculadora.incluye(otraPelicula);
		System.out.println("Tiempo necesario para ver tus títulos favoritos estas vacaciones "
				+ calculadora.getTiempoTotal() + " minutos");

		FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
		filtroRecomendacion.filtra(miPelicula);

		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setNombre("Dragones destronados");
		episodio.setSerie(casaDragon);
		episodio.setTotalVisualizaciones(2);
		filtroRecomendacion.filtra(episodio);

		var peliculaDeJuan = new Pelicula("El señor de los anillos", 2001);
		peliculaDeJuan.setDuracionEnMinutos(188);

		ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
		listaDePeliculas.add(miPelicula);
		listaDePeliculas.add(otraPelicula);
		listaDePeliculas.add(peliculaDeJuan);

		System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
		System.out.println("Tamaño de la lista: " + listaDePeliculas.get(0).getNombre());
		System.out.println(listaDePeliculas);

		System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());
	}
}
