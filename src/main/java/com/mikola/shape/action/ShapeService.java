package com.mikola.shape.action;

import entity.Ball;
import exception.BallException;

public interface ShapeService {
    public double calculateSurfaceArea(Ball ball) throws Exception;
    public double calculateVolume(Ball ball) throws Exception;
    public boolean isBall(Ball ball) throws Exception;
    public boolean isPertainsCoordinatedPlanes(Ball ball) throws Exception;
}
