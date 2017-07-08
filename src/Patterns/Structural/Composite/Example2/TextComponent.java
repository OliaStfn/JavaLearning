package Patterns.Structural.Composite.Example2;

import java.util.ArrayList;

public class TextComponent implements ITextComponent {
    private String nameComponent;
    private ArrayList<ITextComponent> textComponents;

    public TextComponent(String nameComponent) {
        this.nameComponent = nameComponent;
        textComponents = new ArrayList<>();
    }

    @Override
    public String getData() {
        String temp = "";
        for (ITextComponent textComponent : textComponents) {
            temp += textComponent.getData();
            if (!nameComponent.equals("word")) temp+=" ";
        }
        return temp;
    }

    @Override
    public void addComponent(ITextComponent textComponent) {
        textComponents.add(textComponent);
    }
}
