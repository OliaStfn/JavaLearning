package Patterns.Structural.Composite;

public class Letter implements ITextComponent{
private Character letter;

    public Letter(Character letter) {
        this.letter = letter;
    }

    @Override
    public String getData() {
        return (String) letter.toString();
    }

    @Override
    public void addComponent(ITextComponent textComponent) {
        System.out.println("Cannot add component");
    }
}
