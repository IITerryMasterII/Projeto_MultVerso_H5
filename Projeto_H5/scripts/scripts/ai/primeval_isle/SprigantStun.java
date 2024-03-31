package ai.primeval_isle;

import l2mv.gameserver.ai.Fighter;
import l2mv.gameserver.model.Skill;
import l2mv.gameserver.model.instances.NpcInstance;
import l2mv.gameserver.network.serverpackets.SocialAction;
import l2mv.gameserver.tables.SkillTable;

public class SprigantStun extends Fighter
{

	private final Skill SKILL = SkillTable.getInstance().getInfo(5085, 1);
	private long _waitTime;
	private static final int TICK_IN_MILISECONDS = 15000;

	public SprigantStun(NpcInstance actor)
	{
		super(actor);
	}

	@Override
	protected boolean thinkActive()
	{
		NpcInstance actor = getActor();
		if (System.currentTimeMillis() > _waitTime)
		{
			actor.doCast(SKILL, actor, false);
			_waitTime = System.currentTimeMillis() + TICK_IN_MILISECONDS;
		}
		actor.broadcastPacket(new SocialAction(actor.getObjectId(), 1));
		super.thinkActive();
		return true;
	}
}
