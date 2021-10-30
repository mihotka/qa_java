package com.example;

import java.util.List;

public class Alex extends Lion {

    private static final Feline feline = new Feline();

    public Alex() throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский Зоопарк";
    }
}
