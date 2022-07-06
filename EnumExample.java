enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday};
public class EnumExample {

	public static void Main(String[] args) {
		// TODO Auto-generated method stub
		Day day;
		System.out.println(Day.values());
		Day[] s = Day.values();
		System.out.println(s);
		System.out.println();
		
		for(Day d:Day.values())
		{
			System.out.println();
		}
	}

}
