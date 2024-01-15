package interfaces.factory;

import interfaces.bodypart.Arm;
import interfaces.bodypart.Leg;
import interfaces.species.impl.Human;

public class HumanFactory implements SpeciesFactory{
	
	private static class HumanFactoryHolder{
		private static final HumanFactory INSTANCE = new HumanFactory();
	}
	public static HumanFactory getInstance() {
		return  HumanFactoryHolder.INSTANCE;
	}
	private HumanFactory() {
		super();
	}

	@Override
	public Human createAnimal() {
		// TODO Auto-generated method stub
		
		Human ahuman = new Human();
		try {
		ahuman.addLimb(new Arm());
		ahuman.addLimb(new Arm());
		ahuman.addLimb(new Leg());
		ahuman.addLimb(new Leg());
		}
	catch(Exception e){
		e.printStackTrace();
	}
		return ahuman;
		
		
	}

}
