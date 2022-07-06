public class June71 {
	
	 int x=100,y=200;
	
	
	
	public June71(int x, int y) {
		
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public void setX(int x) {
		this.x = x;
	}



	public void setY(int y) {
		this.y = y;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		June71 june=new June71(100,200);
		System.out.println(june);
		System.out.println(june.getX()+ "   " +june.getY());
		
		
		
	}



	

}
