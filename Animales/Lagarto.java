package daw;

public class Lagarto extends Reptil implements InterfazExamen {

	private static int contadorLagartos = 0;
	
	public Lagarto(String name, int edad, int talla) {
		super(name, edad, 4);
		this.talla = talla;
		this.precio_base += 3*this.talla;
	}
	
	public boolean equals(Object o) {
		boolean testigo = false;
		
		if (((Lagarto) o).nombre.equals(this.nombre) && ((Lagarto) o).edad == this.edad
				&& ((Lagarto) o).talla == this.talla && ((Lagarto) o).num_patas == this.num_patas
				&& ((Lagarto) o).precio_base == this.precio_base) {
					testigo = true;
				}
				
		return testigo;
	}

	public static int getContadorLagartos() {
		return contadorLagartos;
	}
	
}
