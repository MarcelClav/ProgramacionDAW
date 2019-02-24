package daw;

public abstract class Animal implements InterfazExamen {

	protected String nombre;
	protected int edad;
	protected int talla;
	protected int precio_base;
	private static int numeroAnimales = 0;
	
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.precio_base = 15;
		numeroAnimales++;
	}
	
	
	public int precio() {
		return this.precio_base;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getTalla() {
		return talla;
	}


	public void setTalla(int talla) {
		this.talla = talla;
	}


	public int getEdad() {
		return edad;
	}


	public int getPrecio_base() {
		return precio_base;
	}


	public static int getNumeroAnimales() {
		return numeroAnimales;
	}


	public static int contadorAnimales() {
		return numeroAnimales;
	}
	
	
	public abstract boolean equals(Object o);

	@Override
	public String toString() {
		return "nombre= " + this.nombre + ", edad= " + this.edad + ", talla= " + this.talla + ", precio= " + this.precio_base;
	}
}
