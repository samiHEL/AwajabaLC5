import java.time.LocalDate;

public class Repas {
	
	int numero;//num1
	LocalDate date;
	
	public Repas(int numero, LocalDate date) {
		super();
		this.numero = numero;
		this.date = date;
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
