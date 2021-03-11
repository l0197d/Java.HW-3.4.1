package ru.netology.manager;


import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class AfishaManagerTest {
    private AfishaManager manager = new AfishaManager();
    private final Movie first = new Movie(1, "first", "Мультфильм");
    private final Movie second = new Movie(2, "second", "Ужасы");
    private final Movie third = new Movie(3, "third", "Боевик");
    private final Movie fourth = new Movie(4, "fourth", "Мюзикал");
    private final Movie fifth = new Movie(5, "fifth", "Драма");

    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
    }

    @Test
    public void addMoviesToEmpty() {
        manager.add(first);
        assertArrayEquals(new Movie[]{first}, manager.getAll());
    }

    @Test
    public void addMoviesToExisted() {
        manager.add(first);
        Movie[] expected = new Movie[]{first};
        Movie[] actual = manager.getAll();
        assertArrayEquals(new Movie[]{first}, manager.getAll());

        manager.add(second);
        Movie[] expectedAdded = new Movie[]{second, first};
        Movie[] actualAdded = manager.getAll();
        assertArrayEquals(expectedAdded, actualAdded);
    }

    @Test
    void moviesForFeed() {
        setUp();
        Movie[] expected = new Movie[]{fifth, fourth, third, second, first};
        Movie[] actual = manager.getMovies();
        assertArrayEquals(expected, actual);
    }

    @Test
    void MoviesMinFeed() {
        manager = new AfishaManager(3);
        setUp();
        Movie[] expected = new Movie[]{fifth, fourth, third};
        Movie[] actual = manager.getMovies();
        assertArrayEquals(expected, actual);
    }
}