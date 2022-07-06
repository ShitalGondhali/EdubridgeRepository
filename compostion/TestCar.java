package compostion;

public class TestCar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine=new Engine();
		
		Car car=new Car("Maruthi",1234,engine);
		car.engine.start();
	}

}
