
public class p32 {

	public static void main(String[] args) {
		Vehicle1[] vc = new Vehicle1[2];
		
		vc[0] = new Car32(1234,20.5);
		
		vc[1] = new Plane1(232);
		
		for(int i = 0; i<vc.length;i++)
		{
			if(vc[i] instanceof Car32)
				System.out.println("第"+(i+1)+"個物件是Car類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
	}

}
abstract class Vehicle1
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed);
	}
	abstract void show();
}
class Car32 extends Vehicle1
{
	private int num;
	private double gas;
	
	public Car32(int n , double g)
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

class Plane1 extends Vehicle1
{
	private int flight;
	
	public Plane1(int f)
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