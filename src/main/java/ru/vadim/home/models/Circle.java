package ru.vadim.home.models;

import java.util.Objects;

public class Circle {
  private int radius;
  private final double PI = 3.1415;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double getCircleSquare() {
    return (radius * radius) * PI;
  }

  public double circumference() {
    return (2 * radius) * PI;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;
    return radius == circle.radius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(radius);
  }
}
