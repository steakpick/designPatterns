package org.example.creation.factory.factory;

import org.example.creation.factory.documents.Document;
import org.example.creation.factory.documents.TextDocument;

public class TextApplication extends Application {

    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
