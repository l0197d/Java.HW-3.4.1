package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager();
    private Movie first = new Movie(1, "first", "Мультфильм", "www.1ссылка.com");
    private Movie second = new Movie(2, "second", "Ужасы", "www.2ссылка.com");
    private Movie third = new Movie(3, "third", "Боевик", "www.3ссылка.com");
    private Movie fourth = new Movie(4, "fourth", "Мюзикал", "www.4ссылка.com");
    private Movie fifth = new Movie(5, "fifth", "Драма", "www.5Url.com");
    private Movie sixth = new Movie(6, "sixth", "Документалка", "www.6Url.com");
    private Movie seventh = new Movie(7, "seventh", "Детектив", "www.7Url.com");
    private Movie eighth = new Movie(8, "eighth", "Комедия", "www.8Url.com");
    private Movie ninth = new Movie(9, "ninth", "ХХХ", "www.9Url.com");
    private Movie tenth = new Movie(10, "tenth", "Шляпа", "www.10Url.com");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
    }

    @Test
    void getLastWithQuantityMoreThanInList() {
        Movie[] actual = manager.getLast();
        Movie[] expected = new Movie[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

}
