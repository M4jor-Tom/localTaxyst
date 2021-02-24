package localTaxyst;

abstract public class Dwelling
{
	private String
		_proprietary,
		_adress;
	
	protected int _surface;
	
	protected Dwelling(
		String proprietary,
		String adress,
		int surface
	)
	{
		_proprietary = proprietary;
		_adress = adress;
		_surface = surface;
	}
	
	public String toString()
	{
		return "\nProrietary: " + _proprietary + "\nAdress : " + _adress + "\nSurface: " + _surface + "m²";
	}
	
	abstract public int tax();
}