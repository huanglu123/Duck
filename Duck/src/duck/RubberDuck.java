package duck;

import behavior.FlyWithRocket;
import behavior.Squack;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior = new Squack();
		flyBehavior = new FlyWithRocket();
	}

}
