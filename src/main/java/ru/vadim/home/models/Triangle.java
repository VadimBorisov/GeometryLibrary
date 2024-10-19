package ru.vadim.home.models;

import java.util.Objects;

public class Triangle {
  private int side1;
  private int side2;
  private int side3;

  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public int getTrianglePerimeter() {
    return side1 + side2 + side3;
  }

  public double getTriangleSquare() {
    double p = getTrianglePerimeter() / 2.0;
    return Math.sqrt((p - side1) * (p - side2) * (p - side3) * p);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Triangle triangle = (Triangle) o;
    return side1 == triangle.side1 && side2 == triangle.side2 && side3 == triangle.side3;
  }

  @Override
  public int hashCode() {
    return Objects.hash(side1, side2, side3);
  }
}
