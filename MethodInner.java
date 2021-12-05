package demo.inner;

public class MethodInner {
	int i=50;
   public static void main(String[] args) {
	int a=10;
	int b=20;
	m1();
}
 
public static void m1()
{   int p=20;
	 class MethodInside
	{int x=5;
	public void m2()
	   {  
		   System.out.println(x+p);
	   }
	}
	MethodInside mm=new MethodInside();
	mm.m2();
}

}
