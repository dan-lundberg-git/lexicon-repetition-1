package se.lexicon.validator;

public enum Color {
    COLOR_DEFAULT("\u001B[0m"),
    COLOR_RED("\u001B[31m"),
    COLOR_GREEN("\u001B[32m"),
    COLOR_YELLOW("\u001B[33m"),
    COLOR_BLUE("\u001B[34m");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
