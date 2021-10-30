package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineClassTests {


    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTestVariative() {
        Feline feline = new Feline();
        int actual = feline.getKittens(10);
        int expected = 10;
        assertEquals(expected, actual);
    }
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }
}
