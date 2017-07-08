package Patterns.Structural.Composite.Example2;

public interface ITextComponent {
    String getData();
    void addComponent(ITextComponent textComponent);
}
