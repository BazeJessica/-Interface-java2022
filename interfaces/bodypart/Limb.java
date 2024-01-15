package interfaces.bodypart;

public abstract class Limb extends PrintableBodyPart{
	protected String jointName;
	 public String getJointName() {
		 
		 return jointName;
	 }
	

	 public Limb(String jointName) {
		 this.jointName = jointName;
		 
	 }
	 @Override
	 public String toString() {
		 return super.toString() + jointName;
	 }
}
