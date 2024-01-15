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
import interfaces.species.TalkAble;

public class Human extends Species implements TalkAble{
	protected String name;
	protected Leg leftleg;
	protected Leg rightleg;
	protected Arm rightArm;
	protected Arm leftArm;
	protected Head head;
	protected Trunk trunk;
	
public void setName(String name) {
	this.name = name;
}
	
public void setHead(Head head) {
	this.head = head;
}
public void setTrunk(Trunk trunk) {
	this.trunk = trunk;
}

private void addArm(Arm arm) throws TooManyArmsException {
	if(leftArm == null) {
	    leftArm = arm;
	}else if(rightArm == null) {
		rightArm = arm;
	}else {
		throw new TooManyArmsException();
	};
	
	}
	
	private void addLeg(Leg aleg) throws TooManyArmsException {
		if(leftleg == null) {
			leftleg = aleg;
		}else if(rightleg == null) {
			rightleg = aleg;
		}else {
			throw new TooManyArmsException();
		} ;
	
	
	
}
	@Override
	public Family getFamily() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExtinct() {
		// TODO Auto-generated method stubX
		return false;
	}

	/**
	 *
	 */
	@Override
	public void addLimb(Limb Alimb) throws BodyException {
		// TODO Auto-generated method stub
		
		if(Alimb instanceof Arm arm) {
			this.addArm(arm);
		}else if(Alimb instanceof Leg aleg) {
			this.addLeg(aleg);
		}else {
			throw new BodyException();
		}
		
//		switch(Alimb) {
//		case 
//		}
	}
	public String toString(){
		return " ";
	}

	@Override
	public void talk(String talking) {
		// TODO Auto-generated method stub
		System.out.println("Says: " +talking);
}

	

}
