package _01_casting;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class {
	
  public static void main(String[] args) {
	  
    try {
      final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
      executorService.scheduleAtFixedRate(SimpleTesting::executeTask, 1, 2, TimeUnit.SECONDS);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  private static void executeTask() {
    System.out.println("Task Executing... ");
  }
}