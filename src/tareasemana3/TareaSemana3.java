
package tareasemana3;

import java.util.ArrayList;

/**
 *
 * @author Helen
 */
public class TareaSemana3 {

    public static void main(String[] args) {
        
        try{
            Pelicula peli = new Pelicula("Correr o morir","Ciencia ficcion","Wes Ball y basad","120 min",true,2009);
        Pelicula peli2 = new Pelicula("Plan de escape","Accion","Mikael","90 min",true,2013);
        Pelicula peli3 = new Pelicula("Steve Jobs","DRAMA, BIOGRÁFICA ","Danny Boyle ","180 min",true,2016);
        Pelicula peli4 = new Pelicula("Buscando a Dory ","animado","Desconocido","105 min",true,2015);
        Pelicula peli5 = new Pelicula("De la calle a Harvard","drama","Desconocido","125 min",true,2012);
       
        
        ArrayList<Pelicula> Peliculas = new ArrayList<>();
        
        Peliculas.add(peli);
        Peliculas.add(peli2);
        Peliculas.add(peli3);
        Peliculas.add(peli4);
        Peliculas.add(peli5);
       
       
        
                Peliculas.get(0).marcarVisto();
		Peliculas.get(4).marcarVisto();

                int indexAnioMasReciente = 0;
		int intVariableAnioTemporal = 0;
		for(int i = 0; i < Peliculas.size(); i++){
			boolean esVisto = Peliculas.get(i).esVisto();

			if(i == 0){
				System.out.println("\n");
				System.out.println("Tipo: "+"PELICULAS VISUALIZADAS");
				System.out.println("\n");
			}
			if(esVisto){
				System.out.println("Titulo: "+Peliculas.get(i).getTitulo());
				System.out.println("Tiempo visualizado: "+Peliculas.get(i).getDuracion());
				System.out.println("Visto: "+"Si");
				System.out.println("\n");
			}
			if(Peliculas.get(i).getAnio() > intVariableAnioTemporal){
				intVariableAnioTemporal = Peliculas.get(i).getAnio();
				indexAnioMasReciente = i;
			}
		}
		System.out.println(Peliculas.get(indexAnioMasReciente).toString());
        
        //Series
        Serie Seri = new Serie("The big bang theory", "Comedia", "Sheldon", "25 minutos", true, 8);
        Serie Seri2 = new Serie("La CQ", "Comedia", "Pedro Ortiz de Pinedo", "22 minutos", false, 10);
        Serie Seri3 = new Serie("Silicon valley", "Comedia", "Mike Judge", "25 minutos", false, 7);
        Serie Seri4 = new Serie("Poopland", "Comedia", "Julieth", "45 minutos", false, 2);
        Serie Seri5 = new Serie("Gotham", "Drama", "Bruno Heller", "22 minutos",false, 22);
       
        
        ArrayList<Serie> Series = new ArrayList<>();
        
        
        Series.add(Seri);
        Series.add(Seri2);
        Series.add(Seri3);
        Series.add(Seri4);
        Series.add(Seri5);
        
            Series.get(1).marcarVisto();
		Series.get(2).marcarVisto();
		Series.get(3).marcarVisto();
		
		// true--> muestra las visualizadas.
                // false--> muestra los registros.
				int indexMasTemporadas = 0;
				int intVariableTemporadaTemporal = 0;
				for(int i = 0; i < Series.size(); i++){
					boolean esVisto = Series.get(i).esVisto();

					if(i == 0){
						System.out.println("\n");
						System.out.println("Tipo: "+"SERIES VISUALIZADAS");
						System.out.println("\n");
					}
					if(esVisto){
						System.out.println("Titulo: "+Series.get(i).getTitulo());
						System.out.println("Tiempo visualizado: " + Series.get(i).getDuracion());
						System.out.println("Visto: " + "Si");
						System.out.println("\n");
					}
					if(Series.get(i).getNoDeTemporadas() > intVariableTemporadaTemporal){
						intVariableTemporadaTemporal = Series.get(i).getNoDeTemporadas();
						indexMasTemporadas = i;
					}
				}
				System.out.println(Series.get(indexMasTemporadas).toString());
		
        }catch(Exception e){
            
            System.out.println("Disculpa. Ocurrio un error inesperado");
            
        }finally{
           System.out.println(":D"); 
        }
    }
    
}
