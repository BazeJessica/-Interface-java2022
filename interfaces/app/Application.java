package interfaces.app;

import interfaces.factory.HumanFactory;
import interfaces.species.impl.Human;

public class Application {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Human luke = HumanFactory.getInstance().createAnimal();
		Human vader = new Human();
		
	vader.talk("There is no escape. Don't make me destroy you. You do not yet realize your importance. You have only begun to discover your power. Join me and I will complete your training. With our combined strength, we can end this destructive conflict and bring order to the galaxy.");
	luke.talk("I'll never join you!");
	vader.talk("If you only knew the power of the dark side. Obi-Wan never told you what happened to your father.");
	luke.talk("He told me enough! It was you who killed him.");
	vader.talk("No. I am your father.");
	luke.talk("No. No. That's not true! That's impossible!");
	vader.talk("Search your feelings. You know it to be true.");
	luke.talk("No! No! No!");
	vader.talk("Luke. You can destroy the Emperor. He has foreseen this. It is your destiny. Join me, and together we can rule the galaxy as father and son. Come with me. It is the only way.");
	
			}
	
	}


