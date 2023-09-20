package Reproductor;

public class JerarquiaDeObjetosReproductor {
	/*
	 * Funciones
	 * Lo que hace es que uno escriba una o varias frases que serán la base para generar la letra.
	 * una IA se encargará de ir generando letras de canciones
	 * la persona selecciona si quiere escuchar salsa, rock, merengue, reggaeton, etc, es decir escoge el género
	 * otra IA se encarga de generar la canción acorde a la letra generada
	 * y se reproduce la canción
	 * esté reproduciendo, el usuario agregue hasta dos géneros más, haciendo que las siguientes canciones sean tipo fusión
	 *  
	 */
	public String introducirfrases(String _texto) {
		String ia = "Letra que va a procesar la ia: " + _texto;
		return ia;
	}
	
	public String generarletras(String _frases) {
		String ia = "Letra que genera la IA";
		return ia;
	}
	
	public String definirgenero(String _genero) {
		String ia2 = "Genero que va a procesar la segunda ia: " + _genero;
		return ia2;
	}
	
	public String generarcancion(String _generocancion, String _letracancion) {
		String ia2 = "Canción generada por la segunda ia según la selección del género y la letra";
		ia2 += _generocancion + _letracancion;
		return ia2;
	}
	
	public void reproducircancion(String cancion){
		
	}
	
	//Se define genero2 = "" para volverlo un parametro opcional
	public void agregargeneros(String genero1, String genero2) {
		
	}
	
	public  void main(String[] args) {
		//En el main se trabaja con todas las funciones
		
		//Escribir frases para generar la letra
		String entrada = introducirfrases("Si te he fallado te pido perdón de la única forma que sé");
		
		//IA que genera la letra de las canciones
		String letra = generarletras(entrada);
		
		//Seleccionar genero
		String inputGenero = "Selección del género por el usuario";
		String genero = definirgenero(inputGenero);
		
		//Otra IA genera la canción
		String musica = generarcancion(genero, letra);
		
		//Reproducir la canción
		reproducircancion(musica);
		
		//Agregar uno o dos géneros musicales a la genración de canciones
		String genero1 = "Input del usuario";
		String genero2 = "Input del usuario también xd";
		agregargeneros(genero1, genero2);
		
		
	}
	
	
}
