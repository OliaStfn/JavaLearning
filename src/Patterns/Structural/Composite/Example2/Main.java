package Patterns.Structural.Composite.Example2;


public class Main {
    public static void main(String[] args) {
        ITextComponent c=new Letter('c');
        ITextComponent p=new Letter('p');
        ITextComponent a=new Letter('a');
        ITextComponent t=new Letter('t');
        ITextComponent e=new Letter('e');
        ITextComponent n=new Letter('n');

        ITextComponent cat=new TextComponent("word");
        cat.addComponent(c);
        cat.addComponent(a);
        cat.addComponent(t);
        System.out.println(cat.getData());

        ITextComponent eat=new TextComponent("word");
        eat.addComponent(e);
        eat.addComponent(a);
        eat.addComponent(t);
        System.out.println(eat.getData());

        ITextComponent pen=new TextComponent("word");
        pen.addComponent(p);
        pen.addComponent(e);
        pen.addComponent(n);
        System.out.println(pen.getData());

        ITextComponent sentence=new TextComponent("sentence");
        sentence.addComponent(cat);
        sentence.addComponent(eat);
        sentence.addComponent(pen);
        System.out.println(sentence.getData());

        ITextComponent text=new TextComponent("text");
        text.addComponent(sentence);
        System.out.println(text.getData());
    }
}
