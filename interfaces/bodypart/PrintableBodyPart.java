package interfaces.bodypart;

public abstract class PrintableBodyPart {
	
	public String toString() {
		return "Parts of the body:" + this.getClass().getSimpleName();
	}

}
