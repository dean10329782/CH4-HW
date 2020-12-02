
public class p29 {

	public static void main(String[] args) {
		Vehicle[] vc = new Vehicle[2];
		
		vc[0] = new Car29(1234,20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(60);
		
		for(int i = 0; i<vc.length;i++)
		{
			vc[i].show();
		}
	}

}
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();
}
class Car29 extends Vehicle
{
	private int num;
	private double gas;
	
	public Car29(int n , double g)
	{
		gas = g;
		num = n;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}

class Plane extends Vehicle
{
	private int flight;
	
	public Plane(int f)
	{
		flight = f;
		System.out.println("生產"+flight+"班次飛機");
		
	}
	public void show()
	{
		System.out.println("班次是"+flight);
		System.out.println("速度是"+speed);
	}
	
}