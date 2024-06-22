package org.example.creation.factory.factory;

import org.example.creation.factory.documents.Document;
import org.example.creation.factory.documents.SpreadsheetDocument;

public class SpreadsheetApplication extends Application {
    @Override
    public Document createDocument() {
        return new SpreadsheetDocument();
    }
}
