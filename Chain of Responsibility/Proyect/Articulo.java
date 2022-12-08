import java.util.ArrayList;

public class Articulo {

	private double precio;
	private int periodoGarantia;
	private ArrayList<String> garantiaCubierta;
	private String nombre;

	public double getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPeriodoGarantia() {
		return this.periodoGarantia;
	}

	/**
	 * 
	 * @param periodoGarantia
	 */
	public void setPeriodoGarantia(int periodoGarantia) {
		this.periodoGarantia = periodoGarantia;
	}

	public ArrayList<String> getGarantiaCubierta() {
		return this.garantiaCubierta;
	}

	/**
	 * 
	 * @param garantiaCubierta
	 */
	public void setGarantiaCubierta(ArrayList<String> garantiaCubierta) {
		this.garantiaCubierta = garantiaCubierta;
	}

}