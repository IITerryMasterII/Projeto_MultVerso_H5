package l2mv.gameserver.stats.conditions;

import l2mv.gameserver.model.Creature;
import l2mv.gameserver.stats.Env;

public class ConditionTargetSummon extends Condition
{
	private final boolean _flag;

	public ConditionTargetSummon(boolean flag)
	{
		_flag = flag;
	}

	@Override
	protected boolean testImpl(Env env)
	{
		Creature target = env.target;
		return target != null && target.isSummon() == _flag;
	}
}
