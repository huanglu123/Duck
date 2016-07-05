package test;

import duck.Duck;
import duck.MallardDuck;
import duck.RedHeadDuck;
import duck.RubberDuck;

public class test {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		System.out.println("MallardDuck的行为");
		mallard.performFly();
		mallard.performQuack();
		
		Duck rubber = new RubberDuck();
		System.out.println("RubberDuck的行为");
		rubber.performFly();
		rubber.performQuack();
		
		Duck redhead = new RedHeadDuck();
		System.out.println("ReadHeadDuck的行为");
		redhead.performFly();
		redhead.performQuack();
	}
	}
	
