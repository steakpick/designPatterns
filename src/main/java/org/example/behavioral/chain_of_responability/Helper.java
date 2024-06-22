package org.example.behavioral.chain_of_responability;

import org.example.behavioral.chain_of_responability.logger.ConsoleLogger;
import org.example.behavioral.chain_of_responability.logger.ErrorLogger;
import org.example.behavioral.chain_of_responability.logger.FileLogger;
import org.example.behavioral.chain_of_responability.logger.Logger;

public class Helper {
    public static Logger getChainOfLoggers() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
