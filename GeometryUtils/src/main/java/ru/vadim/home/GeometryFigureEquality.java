package ru.vadim.home;

import ru.vadim.home.models.Circle;
import ru.vadim.home.models.Rectangle;
import ru.vadim.home.models.Triangle;

public class GeometryFigureEquality {

  public static boolean triangleEquality(Triangle a, Triangle b) {
    return a.equals(b);
  }

  public static boolean rectangleEquality(Rectangle a, Rectangle b) {
    return a.equals(b);
  }

  public static boolean circleEquality(Circle a, Circle b) {
    return a.equals(b);
  }
}