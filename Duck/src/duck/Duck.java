package duck;

import interfaces.FlyBehavior;
import interfaces.QuackBehavior;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void setQuackBehavior(QuackBehavior behavior) {
		this.quackBehavior = behavior;
	}

	public void setFlyBehavior(FlyBehavior behavior) {
		this.flyBehavior = behavior;
	}

	public void display(){
		System.out.println("ª·ÕÊ");
	};

	public void swim() {
		System.out.println("ª·”Œ”æ");
	}

}
