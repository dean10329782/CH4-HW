
public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar6 rccar1 = new RacingCar6(1234,20.5,5);
	}}
class Car6
{
	private int num;
	private double gas;
	
	public Car6()
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	public Car6(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號:"+num+"汽油量:"+gas+"的車子");
	}
}
class RacingCar6 extends Car6
{
	private int course;
	
	public RacingCar6()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	public RacingCar6(int n , double g,int c)
	{
		super(n,g);
		course = c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	
}
