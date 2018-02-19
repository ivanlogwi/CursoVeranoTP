package ar.edu.unlam.verano.pb2.disco;

public class Disco {
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	private Double pi = 3.14;

	public Disco(Double radioInterior, Double radioExterior) {
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		// this.perimetroInterior = perimetroInterior;
		// this.perimetroExterior = perimetroExterior;
		// this.superficie = superficie;

		this.perimetroInterior = 2 * radioInterior * pi;
		this.perimetroExterior = 2 * radioExterior * pi;
		this.superficie = (pi * radioInterior * radioInterior - pi * radioExterior * radioExterior);
	}

	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Double getPerimetroInterior() {
		return perimetroInterior;
	}

	public void setPerimetroInterior(Double perimetroInterior) {
		this.perimetroInterior = perimetroInterior;
	}

	public Double getPerimetroExterior() {
		return perimetroExterior;
	}

	public void setPerimetroExterior(Double perimetroExterior) {
		this.perimetroExterior = perimetroExterior;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}

	public Boolean verificarDisco(Double radioInterior, Double radioExterior) {
		Boolean estadoDisco = true; // true si se puede crear
		if (radioInterior > radioExterior) {
			estadoDisco = false;
		}
		return estadoDisco;
	}

	public Double getPi() {
		return pi;
	}

	public void setPi(Double pi) {
		this.pi = pi;
	}

}
