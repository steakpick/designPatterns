package org.example.creation.factory;

import org.example.creation.factory.factory.Application;
import org.example.creation.factory.factory.SpreadsheetApplication;
import org.example.creation.factory.factory.TextApplication;

public class Main {
    public static void main(String[] args) {
        Application application = new TextApplication();
        application.newDocument();

        application = new SpreadsheetApplication();
        application.newDocument();
    }
}
