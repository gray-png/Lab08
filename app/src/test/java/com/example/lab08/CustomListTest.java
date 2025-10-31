package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {

        CustomList list = new CustomList();
        City Calgary = new City("Calgary", "AB");
        list.addCity(Calgary);

        assertTrue(list.hasCity(Calgary));
    }

    @Test
    public void testDeleteCity() {

        CustomList list = new CustomList();
        City Edmonton = new City("Edmonton", "AB");
        list.addCity(Edmonton);
        list.deleteCity(Edmonton);

        assertFalse(list.hasCity(Edmonton));
    }
}
