
public class p9 {
	public static void main(String[] args) {
		RacingCar9 rccar1 = new RacingCar9();
				rccar1.newshow();
}
	}

class Car9{
	protected int num;
	protected double gas;
	
	public Car9()
	{
		num = 0;
		gas = 0;
		System.out.println("生產車子");
	}
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
	}
	public void show()
	{
		System.out.println("車號是"+num+"汽油量是"+gas);
	}
}
class RacingCar9 extends Car9
{
	private int course;
	
	public RacingCar9()
	{
		course = 0;
		System.out.println("生產賽車");
	}
	public void newshow()
	{
		System.out.println("賽車車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}

