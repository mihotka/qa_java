package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionDoesHaveManeParamTest {
    private final String sex;
    private final boolean expected;

public LionDoesHaveManeParamTest(String sex, boolean expected) {
    this.sex = sex;
    this.expected = expected;
}

    @Parameterized.Parameters
    public static Object[][] lionDoesHaveManeParamTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}

