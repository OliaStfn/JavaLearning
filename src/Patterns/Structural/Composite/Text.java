package Patterns.Structural.Composite;

import java.util.ArrayList;

public class Text implements ITextComponent {
    private ArrayList<ITextComponent> sentences;

    public Text() {
        sentences=new ArrayList<>();
    }

    @Override
    public String getData() {
        String temp = "";
        for (ITextComponent sentence : sentences) {
            temp += sentence.getData()+" ";
        }
        return temp;
    }

    @Override
    public void addComponent(ITextComponent textComponent) {
        sentences.add(textComponent);
    }
}
