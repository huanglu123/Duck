package duck;

import behavior.FlyNoWay;
import behavior.MuteQuack;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

}
