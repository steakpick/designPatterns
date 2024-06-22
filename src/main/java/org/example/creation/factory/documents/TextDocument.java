package org.example.creation.factory.documents;

public class TextDocument extends Document {
    @Override
    public void create() {
        System.out.println("Text Document has been created");
    }
}
