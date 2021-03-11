package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {
    private Movie[] poster = new Movie[0];
    private int filmQuantity = 10;

    public AfishaManager() {

    }

    public AfishaManager(int filmQuantity) {
        this.filmQuantity = filmQuantity;
    }


    //Метод для добавления фильмов
    public void add(Movie newMovie) {
        int length = poster.length + 1;
        Movie[] newPoster = new Movie[length];
        for (int i = 0; i < poster.length; i++) {
            newPoster[i] = poster[i];
        }
        newPoster[newPoster.length - 1] = newMovie;
        poster = newPoster;
    }

    //Метод получения всего списка элементов
    public Movie[] getAll() {
        int quantity = Math.min(filmQuantity, poster.length);
        Movie[] result = new Movie[quantity];
        for (int i = 0; i < quantity; i++) {
            int index = poster.length - 1 - i;
            result[i] = poster[index];
        }
        return result;
    }

    //Метод, который выводит 10 фильмов
    public Movie[] getMovies() {
        int feed = this.filmQuantity;
        if (feed > poster.length)
            feed = poster.length;
        Movie[] result = new Movie[feed];
        for (int i = 0; i < result.length; i++) {
            int index = poster.length - i - 1;
            result[i] = poster[index];
        }
        return result;

    }


}