package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double mafiaBonus = growthRate/2;
		double taxes = mafiaBonus * growthRate * population;
		return taxes;
	}
	
}
