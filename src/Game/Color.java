package Game;

public enum Color {

    Rouge('R'),
    Vert('V'),
    Bleu('B'),
    Jaune('J'),
    Cyan('C'),
    Magenta('M');

    private final char shortcut;

    private Color(char shortcut)
    {
        this.shortcut = shortcut;
    }


    public char getShortcut() {
        return shortcut;
    }
}
