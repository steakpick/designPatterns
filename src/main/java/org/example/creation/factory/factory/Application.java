package org.example.creation.factory.factory;

import org.example.creation.factory.documents.Document;

public abstract class Application {

    public abstract Document createDocument();

    public void newDocument() {
        Document document = createDocument();
        document.create();
    }
}
