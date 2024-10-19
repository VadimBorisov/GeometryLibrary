package ru.vadim.home;

public class Cube {
  private int edge;

  public Cube(int edge) {
    this.edge = edge;
  }

  public int getVolume() {
    return edge * edge * edge;
  }
}
