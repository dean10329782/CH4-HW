
public class p4 {
	public static void main(String[] args) {
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234 , 20.5);
		rccar1.setCourse(5);
	}
}
class Car4
{
	private int num;
	private double gas;
	
	public Car4()
	{
		num = 0;
		gas= 0;
		System.out.println("生產車子");
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設定"+num+"汽油量設"+gas);
	}

	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCar extends Car4
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
		
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("賽車編號設為"+course);
	}
	
}