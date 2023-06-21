package com.example.mobileassignmentone;

public class Letter {
    private String letter;
    private int imageId;
    private String soundId;
    private   Letter[] letters;

    public Letter(String letter, int imageId, String soundId) {
        this.letter = letter;
        this.imageId = imageId;
        this.soundId = soundId;
    }

    public  Letter[] getLetters() {
        return letters;
    }

    public void setLetters(Letter[] letters) {
        this.letters = letters;
    }

    public Letter[] populate(){
        Letter[] letters = {
                new Letter("A", R.drawable.a, "a"),
                new Letter("B", R.drawable.b, "b"),
                new Letter("C", R.drawable.c, "c"),
                new Letter("D", R.drawable.d, "d"),
                new Letter("E", R.drawable.e, "e"),
                new Letter("F", R.drawable.f, "f"),
                new Letter("G", R.drawable.g, "g"),
                new Letter("H", R.drawable.h, "h"),
                new Letter("I", R.drawable.i, "i"),
                new Letter("J", R.drawable.j, "j"),
                new Letter("K", R.drawable.k, "k"),
                new Letter("L", R.drawable.l, "l"),
                new Letter("M", R.drawable.m, "m"),
                new Letter("N", R.drawable.n, "n"),
                new Letter("O", R.drawable.o, "o"),
                new Letter("P", R.drawable.p, "p"),
                new Letter("Q", R.drawable.q, "q"),
                new Letter("R", R.drawable.r, "r"),
                new Letter("S", R.drawable.s, "s"),
                new Letter("T", R.drawable.t, "t"),
                new Letter("U", R.drawable.u, "u"),
                new Letter("V", R.drawable.v, "v"),
                new Letter("W", R.drawable.w, "w"),
                new Letter("X", R.drawable.x, "x"),
                new Letter("Y", R.drawable.y, "y"),
                new Letter("Z", R.drawable.z, "z"),
        };
        return letters;
    }

    public Letter() {
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getSoundId() {
        return soundId;
    }

    public void setSoundId(String soundId) {
        this.soundId = soundId;
    }
}
