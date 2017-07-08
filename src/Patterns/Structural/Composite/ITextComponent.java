package Patterns.Structural.Composite;

public interface ITextComponent {
    String getData();
    void addComponent(ITextComponent textComponent);
}
