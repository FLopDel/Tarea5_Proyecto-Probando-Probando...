package busquedabinaria;

public class busquedabinaria {

	public static int contador;

	public static void main(String[] args) throws Exception {
		int[] v = new int[40000000];
		for(int j=0;j<v.length; j++) {
			v[j] = j;
		}
		int busca = 3447;
		System.out.print("Valor: " + buscab(v,busca) + " encontrado en el intento " + contador);
	}

	public static int buscab(int[] vector, int valorabuscar) {
		int mitad, inferior = 0;
		int superior = vector.length - 1;
		contador = 0;
		do {
			contador++;
			mitad = (inferior + superior) >>> 1;
			if(valorabuscar > vector[mitad]) {
				inferior = mitad + 1;
			} 
			
			else {
				superior = mitad - 1;
			}
		} while(vector[mitad] != valorabuscar && inferior <= superior);
		if(vector[mitad] == valorabuscar) {
			return mitad;
		} else {
			return -1;
		}
	}
}