package advanced_techniques.exercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import student.TestCase;

public class InterfacerTest extends TestCase {
	
	Interfacer interfacer;
	
	@DummyAnnotation
	@TODO(what="Go to bed!", when=1)	
	class DummyClass {
		private int privateField;
		public static final String STATIC_VAR = "I'm a static variable.";
		
		public DummyClass() {
			privateField = 0;
		}
		@DummyAnnotation
		@TODO(what="Go to bed!", when=1)		
		public void publicFunction() {
			System.out.println("Hello World");
			System.out.println(this.privateField);
		}
		public int publicIntFunction() {
			return 1;
		}
		public String publicStringFunction(String param) {
			return "Hello World.";
		}
		public final void staticFunction() {
			System.out.println("Hello World static");
		}
		private void privateFunction() {
			System.out.println("Private function");
		}
		protected void protectedFunction() {
			privateFunction();			
			System.out.println("Private function");
		}		
	}
	
	@Before
	public void setUp() {
		interfacer = new Interfacer();
	}
	
	@Test
	public void testOneLineInterfaceOutput() {
		String result = interfacer.renderInterfaceForClassName("block2.InterfacerTest$DummyClass");
		TestCase.assertEquals("@block2.DummyAnnotation() /** TODO what=Go to bed! when=Release 1 */ "
				+ "public interface DummyClassIf{ "
				+ "@block2.DummyAnnotation() /** TODO what=Go to bed! when=Release 1 */ "
				+ "public void publicFunction(); "
				+ "public int publicIntFunction(); "
				+ "public java.lang.String publicStringFunction(java.lang.String param0); }", result);
	}
	
	@Test
	public void testFormattedInterfaceOutput() {
		String result = interfacer.renderInterfaceForClassName("block2.InterfacerTest$DummyClass", true);
		TestCase.assertEquals("@block2.DummyAnnotation()\n/** TODO what=Go to bed! when=Release 1 */\n"
				+ "public interface DummyClassIf{\n"
				+ "\t@block2.DummyAnnotation()\n"
				+ "\t/** TODO what=Go to bed! when=Release 1 */\n"
				+ "\tpublic void publicFunction();\n"
				+ "\tpublic int publicIntFunction();\n"
				+ "\tpublic java.lang.String publicStringFunction(java.lang.String param0);\n}", result);
	}	
	
	@After
	public void TearDown() {
		interfacer = null;
	}
}
