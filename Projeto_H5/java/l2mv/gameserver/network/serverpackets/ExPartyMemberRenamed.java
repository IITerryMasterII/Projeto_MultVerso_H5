package l2mv.gameserver.network.serverpackets;

public class ExPartyMemberRenamed extends L2GameServerPacket
{
	@Override
	protected void writeImpl()
	{
		this.writeEx(0xA6);
		// TODO ddd
	}
}