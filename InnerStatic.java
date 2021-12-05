package demo.inner;

public class InnerStatic {
	
  static class InnerClass
  {
	 public void m1()
	 {System.out.println("Inside Method of Static Inner Class ");}
  }
   public static void main(String[] args) {
	InnerClass in= new InnerClass();
	in.m1();
}
}
