package org.example.behavioral.chain_of_responability;

import org.example.behavioral.chain_of_responability.logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = Helper.getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an information.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(Logger.ERROR, "This is an error information.");
    }
}
