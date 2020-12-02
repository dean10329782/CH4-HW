
public class p38 {

	public static void main(String[] args) {
		Vehicle2[] vc = new Vehicle2[2];
		
		vc[0] = new Car38(1234,20.5);
		
		vc[1] = new Plane2(232);

		
		for(int i = 0; i<vc.length;i++)
		{
			vc[i].show();
		}
	}

}
interface Vehicle2
{
	int weight = 1000;
	void show();
}
class Car38 implements Vehicle2
{
	private int num;
	private double gas;
	
	public Car38(int n , double g)
	{
		gas = g;
		num = n;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);

	}
}

class Plane2 implements Vehicle2
{
	private int flight;
	
	public Plane2(int f)
	{
		flight = f;
		System.out.println("生產"+flight+"班次飛機");
		
	}
	public void show()
	{
		System.out.println("班次是"+flight);
	
	}
	
}