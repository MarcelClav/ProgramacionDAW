package daw;

public class Oveja extends Mamifero implements InterfazExamen {

	private String tipo_lana;
	private static int numeroOvejas = 0;
	
	
	public Oveja(String nombre, int edad, int talla, String nombre_madre, String tipo_lana) {
		super(nombre, edad, talla, nombre_madre);
		this.tipo_lana = tipo_lana;
		this.precio_base += 2*this.talla;
		numeroOvejas++;
	}
	
	
	public Oveja(Oveja o) {
		super(o.nombre, o.edad, o.talla, o.nombre_madre);
		this.tipo_lana = o.tipo_lana;
		this.precio_base += o.precio_base;
		numeroOvejas++;
	}
	
	
	public boolean equals(Object o) {
		boolean testigo = false;
		
		if (o instanceof Oveja) {
			if (((Oveja) o).nombre.equals(this.nombre) && ((Oveja) o).edad == this.edad
					&& ((Oveja) o).talla == this.talla && ((Oveja) o).nombre_madre.equals(this.nombre_madre)
					&& ((Oveja) o).tipo_lana.equals(this.tipo_lana)
					&& ((Oveja) o).precio_base == this.precio_base) {
						testigo = true;
			}
		}
		
		return testigo;
	}
	
	
	public static int contadorOvejas() {
		return numeroOvejas;
	}
	
	@Override
	public String toString() {	
		return "Oveja [" + super.toString() + ", tipo_lana= " + this.tipo_lana;
	}


	public String getTipo_lana() {
		return tipo_lana;
	}


	public static int getNumeroOvejas() {
		return numeroOvejas;
	}
	
	
}
