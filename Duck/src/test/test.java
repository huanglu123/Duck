package test;

import duck.Duck;
import duck.MallardDuck;
import duck.RedHeadDuck;
import duck.RubberDuck;

public class test {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println("MallardDuck����Ϊ");
		mallard.performFly();
		mallard.performQuack();
		
		Duck rubber = new RubberDuck();
		System.out.println("RubberDuck����Ϊ");
		rubber.performFly();
		rubber.performQuack();
		
		Duck redhead = new RedHeadDuck();
		System.out.println("ReadHeadDuck����Ϊ");
		redhead.performFly();
		redhead.performQuack();
	}
	}
	
