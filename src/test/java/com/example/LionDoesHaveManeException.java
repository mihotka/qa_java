package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class LionDoesHaveManeException {

    @Mock
    Feline feline;

    @Test(expected = Exception.class)
    public void lionDoesHaveManeExceptionTest() throws Exception {
        Lion lion = new Lion("Новый гендер", feline);
        boolean actual = lion.doesHaveMane();
    }
}
