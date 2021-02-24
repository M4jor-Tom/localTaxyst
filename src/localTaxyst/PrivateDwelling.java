package localTaxyst;

public class PrivateDwelling extends Dwelling
{
	private int _roomsCount;
	private boolean _pool;
	
	public PrivateDwelling(
		String proprietary,
		String adress,
		int surface,
		int roomsCount,
		boolean pool
	)
	{
		super(
			proprietary,
			adress,
			surface
		);
		_roomsCount = roomsCount;
		_pool = pool;
	}
	
	public String toString()
	{
		return super.toString() + "\nRooms count: " + _roomsCount + "\nPool owner: " + _pool;
	}
	
	public int tax()
	{
		return 10 * _surface + (_pool ? 300 : 0);
	}
}