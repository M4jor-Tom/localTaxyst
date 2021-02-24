package localTaxyst;

public class MainClass
{
	public static void main(String[] args)
	{
		Dwelling[] dwells = new Dwelling[3];
		dwells[0] = new PrivateDwelling(
			"Tom VAUTRAY",
			"Chez oim",
			800,
			53,
			true
		);

		dwells[1] = new PrivateDwelling(
			"Gros Pleibard",
			"La zone",
			2,
			1,
			false
		);
		
		dwells[2] = new ProfessionnalDwelling(
			"Ma boite",
			"Grimaud",
			1000,
			500
		);
		
		for(int i = 0; i < dwells.length; i++)
			System.out.println(dwells[i] + " pays $" + dwells[i].tax() + " per month");
	}
}