package l2mv.gameserver.network.serverpackets;

public class DeleteRadar extends L2GameServerPacket
{
	@Override
	protected final void writeImpl()
	{
		this.writeC(0xB8);
		// TODO ddd
	}
}