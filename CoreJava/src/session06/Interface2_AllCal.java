package session06;

public class Interface2_AllCal extends Interface2_CalNumber 
implements Interface2_arithcal, Interface2_CompareCal, Interface2_StatCal
{

	@Override
	public void Avg(int a, int b) {
		// TODO Auto-generated method stub
		float c = (a+b)/2;
		System.out.println("Avg= "+c);
	}

	@Override
	public void min(int a, int b) {
		// TODO Auto-generated method stub
		int c = (a<b)? a:b;
		System.out.println("Min is= "+c);
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("Addition= "+c);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println("Substraction= "+c);
	}
}
