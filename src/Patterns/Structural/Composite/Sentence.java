package Patterns.Structural.Composite;

import java.util.ArrayList;

public class Sentence implements ITextComponent {
    private ArrayList<ITextComponent> words;

    public Sentence() {
        words = new ArrayList<>();
    }

    @Override
    public String getData() {
        String temp = "";
        for (ITextComponent word : words) {
            temp += word.getData()+" ";
        }
        return temp;
    }

    @Override
    public void addComponent(ITextComponent textComponent) {
        words.add(textComponent);
    }
}
