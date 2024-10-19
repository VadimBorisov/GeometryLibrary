package ru.vadim.home;

public class Sphere {
  private final double PI = 3.1415;
  private int radius;

  public Sphere(int radius) {
    this.radius = radius;
  }

  public double getVolume() {
    return (4 / 3.0) * PI * (radius * radius * radius);
  }
}
