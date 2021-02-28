package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {
  private Movie[] poster = new Movie[0];
  private int filmQuantity = 10;

  public AfishaManager() {

  }

  //Добавить новый фильм
  public void add(Movie newMovie) {
    int length = poster.length + 1;
    Movie[] newPoster = new Movie[length];
    for (int i = 0; i < poster.length; i++) {
      newPoster[i] = poster[i];
    }
    newPoster[newPoster.length - 1] = newMovie;
    poster = newPoster;
  }

  // Показать последний фильм
  public Movie[] getLast() {
    int quantity = Math.min(filmQuantity, poster.length);
    Movie[] result = new Movie[quantity];
    for (int i = 0; i < quantity; i++) {
      int index = poster.length - 1 - i;
      result[i] = poster[index];
    }
    return result;
  }
}