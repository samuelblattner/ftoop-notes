package advanced_techniques.exercises;

@TODO(what="Make this class fancy", when=123)
public class MyClass {

	private int var1 = 0;
	private int var2 = 0;
	public int var3 = 0;
	public String test = "hello";
	
	@TODO(what="Maybe make this method private", when=12)	
	@DummyAnnotation	
	public void HelloWorld(int howMany, String gugus) {
		System.out.println("Hello world.");
		System.out.println(var1);
		System.out.println(var2);
	}
	
	@TODO(what="Make this method public", when=15)
	private String PrivateMethod(int param) {
		return "Hello World";
	}
}
