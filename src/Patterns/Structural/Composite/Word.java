package Patterns.Structural.Composite;

import java.util.ArrayList;

public class Word implements ITextComponent {
    private ArrayList<ITextComponent> letters;

    public Word() {
        letters=new ArrayList<>();
    }

    @Override
    public String getData() {
        String temp = "";
        for (ITextComponent letter : letters) {
            temp += letter.getData();
        }

        return temp;
    }

    @Override
    public void addComponent(ITextComponent textComponent) {
        letters.add(textComponent);
    }

}
