package l2mv.gameserver.network.serverpackets;

import l2mv.gameserver.model.Player;
import l2mv.gameserver.model.entity.boat.Boat;
import l2mv.gameserver.utils.Location;

public class GetOffVehicle extends L2GameServerPacket
{
	private int _playerObjectId, _boatObjectId;
	private Location _loc;

	public GetOffVehicle(Player cha, Boat boat, Location loc)
	{
		this._playerObjectId = cha.getObjectId();
		this._boatObjectId = boat.getObjectId();
		this._loc = loc;
	}

	@Override
	protected final void writeImpl()
	{
		this.writeC(0x6f);
		this.writeD(this._playerObjectId);
		this.writeD(this._boatObjectId);
		this.writeD(this._loc.x);
		this.writeD(this._loc.y);
		this.writeD(this._loc.z);
	}
}