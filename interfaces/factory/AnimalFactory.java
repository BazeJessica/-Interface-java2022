package interfaces.factory;
import interfaces.bodypart.Leg;
import interfaces.species.Species;
import interfaces.species.impl.Animal;


public class AnimalFactory implements SpeciesFactory{

	@Override
	public Species createAnimal() {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		try {
		animal.addLimb(new Leg());
		animal.addLimb(new Leg());
		animal.addLimb(new Leg());
		animal.addLimb(new Leg());
		
		}
	catch(Exception e){
		e.printStackTrace();
	}
		return animal;
	}

}
