package test;

import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;

public class AppiumStart {

	static CommandLine command;
    static DefaultExecuteResultHandler resultHandler;
    static DefaultExecutor executor;


       public static void startAppium() throws ExecuteException, IOException 
        {
            
              command = new CommandLine("cmd");
            command.addArgument("/c");
            command.addArgument("C://appium//AppiumForWindows-1.2.4.1//Appium//node.exe");
            command.addArgument("C://appium//AppiumForWindows-1.2.4.1//Appium//node_modules//appium//bin//appium.js");
            command.addArgument("--address");
            command.addArgument("127.0.0.1");
            command.addArgument("--port");
            command.addArgument("4723");
            command.addArgument("--no-reset");
            //command.addArgument("--log"); if you want to store the appium log use this and next one
            //command.addArgument("C://Users//...//log//appiumLogs.txt");
             resultHandler = new DefaultExecuteResultHandler();
             executor = new DefaultExecutor();
            executor.setExitValue(1);
            executor.execute(command, resultHandler);

        }
       
       public static boolean closeAppium() throws ExecuteException, IOException {
           
           
             command = new CommandLine("cmd");
              command.addArgument("/c");
              command.addArgument("taskkill");
              command.addArgument("/F");
              command.addArgument("/IM");
              command.addArgument("node.exe");
             
               resultHandler = new DefaultExecuteResultHandler();
               executor = new DefaultExecutor();
                executor.setExitValue(1);
                executor.execute(command, resultHandler);
                return true;
       }
}
