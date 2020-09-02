package basicexample;
interface A
{
	void fun();
}
public class Hello implements A {
   public void fun()
   {
	   
   }
	public static void main(String[] args) {
		System.out.print("hello world");
        A obj = new Hello();
        obj.fun();
	}

}
