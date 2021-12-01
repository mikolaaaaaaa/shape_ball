package entity;

import java.util.Objects;

public class Point {
    private double x;
    private double y;
    private double z;

    public Point() {

    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 && Double.compare(point.getY(), getY()) == 0 && Double.compare(point.getZ(), getZ()) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(x) + Double.hashCode(y) + Double.hashCode(z);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Point{")
                .append("x=").append(x)
                .append(", y=").append(y)
                .append(", z=").append(z)
                .append("}")
                .toString();

    }
}
