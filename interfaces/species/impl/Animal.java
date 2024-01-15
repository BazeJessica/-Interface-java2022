package interfaces.species.impl;

import interfaces.bodypart.Arm;
import interfaces.bodypart.Head;
import interfaces.bodypart.Leg;
import interfaces.bodypart.Limb;
import interfaces.bodypart.Trunk;
import interfaces.exception.BodyException;
import interfaces.exception.TooManyArmsException;
import interfaces.species.Family;
import interfaces.species.Species;

public class Animal extends Species{
	protected String name;
	protected Leg frontleftleg;
	protected Leg frontrightleg;
	protected Leg backrightleg;
	protected Leg backleftleg;
	protected Head head;
	protected Trunk trunk;



	@Override
	public Family getFamily() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExtinct() {
		// TODO Auto-generated method stub
		return false;
	}

	

	private void addLeg(Leg aleg) throws TooManyArmsException {
		if(frontleftleg == null) {
			frontleftleg = aleg;
		}else if(backleftleg == null) {
			backleftleg = aleg;
		}else if(frontrightleg == null) {
			frontrightleg = aleg;}
		else if(backrightleg == null) {
			backrightleg = aleg;
		}else {
			throw new TooManyArmsException();
		} ;
		
		
		}

	@Override
	public void addLimb(Limb Alimb) throws BodyException {
		// TODO Auto-generated method stub
		if(Alimb instanceof Leg aleg) {
			this.addLeg(aleg);
		}else {
			throw new BodyException();
		}
}
}
