
public class p42 {

	public static void main(String[] args) {
			Car42 car1 = new Car42(1234 , 20.5);
			car1.vshow();
			car1.mshow();
					
	}

}
interface Vehicle3
{

	void vshow();
}
interface Vehicle4
{

	void mshow();
}

class Car42 implements Vehicle3 ,Vehicle4
{
	private int num;
	private double gas;
	
	public Car42(int n , double g)
	{
		gas = g;
		num = n;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	public void vshow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);

	}
	public void mshow()
	{
		System.out.println("車子的材質是鐵");
	

	}

}
