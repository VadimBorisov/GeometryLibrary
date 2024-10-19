package ru.vadim.home.models;

import java.util.Objects;

public class Rectangle {
  private int side1;
  private int side2;
  private int side3;
  private int side4;

  public Rectangle(int side1, int side2, int side3, int side4) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.side4 = side4;
  }

  public int getRectanglePerimeter() {
    return side1 + side2 + side3 + side4;
  }

  public int getRectangleSquare() {
    return side1 * side2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Rectangle rectangle = (Rectangle) o;
    return side1 == rectangle.side1 && side2 == rectangle.side2 && side3 == rectangle.side3 && side4 == rectangle.side4;
  }

  @Override
  public int hashCode() {
    return Objects.hash(side1, side2, side3, side4);
  }
}
