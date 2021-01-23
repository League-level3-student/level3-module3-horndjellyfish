package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double airportBonus = growthRate * 2;
		double taxes = airportBonus * population * growthRate;
		return taxes;
	}

}
