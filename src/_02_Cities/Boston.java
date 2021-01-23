package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double newPop = 0.5 * population;
		double taxes = newPop + population * growthRate;
		return taxes;
	}

}
