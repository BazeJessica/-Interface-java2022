package interfaces.species;
import interfaces.bodypart.Limb;
import interfaces.exception.BodyException;

public abstract class Species {
	
	public abstract Family getFamily();
	public abstract boolean isExtinct();
	public abstract void addLimb(Limb A) throws BodyException;
	
		
	

}
