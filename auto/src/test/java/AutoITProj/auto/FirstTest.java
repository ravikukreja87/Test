package AutoITProj.auto;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

public class FirstTest extends TestCase {

	public void testfirstTest() throws InterruptedException, IOException {
		String command = "cmd /c";
		System.out.println(command);
		String fileName = " first.exe";
		String commandToExecute = command+fileName;
		System.out.println(commandToExecute);
		
		Runtime.getRuntime().exec(commandToExecute).waitFor(2, TimeUnit.SECONDS);
	}
}
