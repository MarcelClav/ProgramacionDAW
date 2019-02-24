package daw;

public class Lista {

	protected Object[] contenedor;
	protected int numElementos;
	
	
	public Lista(int tamanio) {
		contenedor = new Object[tamanio];
		numElementos = 0;
	}
	
	
	public int getNumElementos() {
		return numElementos;
	}
	
	
	public boolean insertar(Object o) {
		boolean testigo = false;
		
		if (numElementos < contenedor.length) {
			contenedor[numElementos] = o;
			numElementos++;
			testigo = true;
		}
		
		return testigo;
	}
	
	
	public boolean insertar(Object o, int posicion) {
		boolean testigo = false;
				
		if (posicion <= numElementos && posicion >= 0) {
			
			for (int i = numElementos; i > posicion; i--) {
				
				contenedor[i] = contenedor[i-1];
			}
			
			contenedor[posicion] = o;
			numElementos++;
			testigo = true;
		}
		
		return testigo;		
	}
	
	
	public Object devolverElemento(int posicion) {
		
		Object o = new Object();
		
		if (posicion < numElementos && posicion >= 0) {
			o = contenedor[posicion];
		} else {
			o = null;
		}
		
		return o;		
	}
	
	
	public boolean eliminar() {
		boolean testigo = false;
		
		if (numElementos >= 1) {
			numElementos--;
			testigo = true;
		}		
		return testigo;
	}
	
	
	public boolean eliminar(int posicion) {
		boolean testigo = false;
		
		if (posicion < (numElementos - 1) && posicion >= 0) {
			
			for (int i = posicion; i < numElementos; i++) {
				contenedor[i] = contenedor[i+1];
			}
			
			numElementos--;
			testigo = true;
		}
		
		if (posicion == (numElementos - 1) && posicion >= 0) {
			numElementos--;
			testigo = true;
		}
		
		return testigo;	
	}
	
	
	public int devolverPosicion(Object o) {
		
		int posicion = -1;
		
		for (int i = 0; i < numElementos; i++) {
			
			if (o.equals(contenedor[i])) posicion = i;
		}
		
		return posicion;
	}
}
