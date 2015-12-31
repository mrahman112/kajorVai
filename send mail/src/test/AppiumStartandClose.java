package test;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;

public class AppiumStartandClose {
	
	//static CommandLine command;
	//static DefaultExecuteResultHandler resultHandler;
	static DefaultExecutor executor;
	static String yourAppiumPath="C://appium//AppiumForWindows-1.2.4.1";
	
	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException{
		startAppium();
		Thread.sleep(5000);
		closeAppium();
	}
	
	
	public static void startAppium() throws ExecuteException, IOException, InterruptedException
	{
		
		CommandLine command = new CommandLine("cmd");
		command.addArgument("/c");
		command.addArgument(yourAppiumPath+"//Appium//node.exe");
		command.addArgument(yourAppiumPath+"//Appium//node_modules//appium//bin//appium.js");
		command.addArgument("--address");
		command.addArgument("127.0.0.1");
		command.addArgument("--port");
		command.addArgument("4723");
		//command.addArgument("--no-reset");
		//command.addArgument("--log"); if you want to store the appium log use this and next one
		//command.addArgument("C://Users//...//log//appiumLogs.txt");
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		executor.execute(command, resultHandler);
		Thread.sleep(4000);
		
		
		
	}
	
	public static void closeAppium() throws ExecuteException, IOException{
		
		
		CommandLine command = new CommandLine("cmd");
	      command.addArgument("/c");
	      command.addArgument("taskkill");
	      command.addArgument("/F");
	      command.addArgument("/IM");
	      command.addArgument("node.exe");
	     // resultHandler = new DefaultExecuteResultHandler();
	      DefaultExecutor executor = new DefaultExecutor();
			executor.setExitValue(0);
			executor.execute(command);
	     
	      
	      
		
			
		
		
	}
	
	

}
