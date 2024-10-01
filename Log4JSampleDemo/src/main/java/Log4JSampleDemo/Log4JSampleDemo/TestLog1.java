package Log4JSampleDemo.Log4JSampleDemo;

import org.testng.Reporter;
import org.apache.log4j.Logger;

public class TestLog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Logger log1 = Logger.getLogger(TestLog1.class);

		System.out.println("Pass");
        log1.info("hello world");
        log1.error("An error occoured :");
	}

}
