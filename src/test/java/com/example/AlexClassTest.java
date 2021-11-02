package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexClassTest {

    @Test
    public void getKittensTest() throws Exception {
        Alex alex = new Alex();
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void getFriendsTest() throws Exception {
        Alex alex = new Alex();
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        Alex alex = new Alex();
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский Зоопарк";
        assertEquals(expected, actual);
    }
}

