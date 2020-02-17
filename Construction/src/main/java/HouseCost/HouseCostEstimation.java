package HouseCost;

/*
 * author manojkumar
 * estimates the House cost
 */
public class HouseCostEstimation {
	public int calculateHouseConstrucionCost(boolean standardMaterials , boolean aboveStandardMaterials , boolean highStandardMaterials , boolean automatedHome , int area) {
		
		if(standardMaterials)
			return 1200 * area ; 
		
		else if(aboveStandardMaterials)
		return 1500 * area ; 
		
		else if(highStandardMaterials == true && automatedHome == false)
			return 1800 * area ;
		
		else if(highStandardMaterials == true && automatedHome == true)
			return 2500 * area ; 
		return 0 ;
		
	}

}
