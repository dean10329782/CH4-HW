
public class p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car26[] cars = new Car26[2];
		
		cars[0] = new Car26();
		cars[1] = new Racing();
		
		for(int i=0 ; i<cars.length;i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件是類別是"+cl);
		}
	}
}
class Car26
{
	public Car26()
	{
		System.out.println("生產車子");
	}
	
}
class Racing extends Car26
{
	public Racing()
	{
		System.out.println("生產賽車");
	}
}