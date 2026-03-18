package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);

        assertTrue(list.hasCity(calgary)); // should FAIL
    }


    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary)); // should FAIL
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        list.addCity(new City("Calgary", "AB"));
        list.addCity(new City("Toronto", "ON"));

        assertEquals(2, list.countCities()); // should FAIL
    }
}