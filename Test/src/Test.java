import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Test {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		String commandToExecute = "first.exe";
		Runtime.getRuntime().exec(commandToExecute).waitFor(2, TimeUnit.SECONDS);

		
	}

}
