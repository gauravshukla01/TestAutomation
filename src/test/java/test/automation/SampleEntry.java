package test.automation;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SampleEntry {

    //All the loggers that can be used
    static Logger mainLogger = LogManager.getLogger(SampleEntry.class.getName());

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BasicConfigurator.configure();

        //Create a console appender and attach it to our mainLogger
        ConsoleAppender appender = new ConsoleAppender();
        mainLogger.addAppender(appender);
        mainLogger.info("This is just a logger");
    }
}
