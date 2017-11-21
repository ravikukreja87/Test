package AutoITProj.auto;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

public class FirstTest extends TestCase {

	public void testfirstTest() throws InterruptedException, IOException {
		String commandToExecute = "first.exe";
		Runtime.getRuntime().exec(commandToExecute).waitFor(2, TimeUnit.SECONDS);
	}
}
