package localTaxyst;

public class ProfessionnalDwelling extends Dwelling
{
	private int _employeesCount;
	
	public ProfessionnalDwelling(
		String proprietary,
		String adress,
		int surface,
		int employeesCount
	)
	{
		super(
			proprietary,
			adress,
			surface
		);
		_employeesCount = employeesCount;
	}
	
	public String toString()
	{
		return super.toString() + "\nEmployees count: " + _employeesCount;
	}
	
	public int tax()
	{
		return 80 * _surface + 120 * _employeesCount;
	}
}