package l2mv.gameserver.network.serverpackets;

public class NormalCamera extends L2GameServerPacket
{
	@Override
	protected final void writeImpl()
	{
		this.writeC(0xd7);
	}
}