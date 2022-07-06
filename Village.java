
public class Village {

	String villageName;
	int postalCode;
	String destrict;
	String tal;
	public Village(String villageName, int postalCode, String destrict, String tal) {
		super();
		this.villageName = villageName;
		this.postalCode = postalCode;
		this.destrict = destrict;
		this.tal = tal;
	}
	
	public void printDetails()
	{
		System.out.println("VillageName "+villageName);
		System.out.println("postalCode "+postalCode);
		System.out.println("destrict "+destrict);
		System.out.println("tal "+tal);
	}
}
