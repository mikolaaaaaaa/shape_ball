package com.mikola.shape.entity;

import java.util.Objects;

public class Ball {
    Point center;
    double radius;

    public Ball() {

    }

    public Ball(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.getRadius(), getRadius()) == 0 && Objects.equals(getCenter(), ball.getCenter());
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius + (center == null ? 0 : center.hashCode()));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Ball{")
                .append("center=").append(center)
                .append(", radius=").append(radius)
                .append("}")
                .toString();
    }
}
