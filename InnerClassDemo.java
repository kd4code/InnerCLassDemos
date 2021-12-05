package demo.inner;

public class InnerClassDemo {
	int p;
	static int q=20;
   public InnerClassDemo(int p) {
		super();
		this.p = p;
	}


class Inside
  {
	int a;
	static int b=200;
	String name;
	public Inside(int a, String name) {
		super();
		this.a = a;
		this.name = name;
	}
    public void m1()
    {System.out.println(b+p);}
  }
   
  
  public static void main(String[] args) {
	InnerClassDemo ic=new InnerClassDemo(7);
	InnerClassDemo ic1=new InnerClassDemo(8);
    InnerClassDemo.Inside id=ic.new Inside(10,"AAA");
    InnerClassDemo.Inside id1=ic1.new Inside(20,"BBB");
    System.out.println(id.a);
    System.out.println(id1.a);
    id1.m1();
    id.m1();
    
	
 }
}
