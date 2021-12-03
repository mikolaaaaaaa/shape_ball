package com.mikola.shape.observer;

import com.mikola.shape.action.impl.BallLogic;
import com.mikola.shape.entity.Ball;
import com.mikola.shape.entity.BallParameters;
import com.mikola.shape.exception.BallException;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BallStore implements Observer {
    private static BallStore ballStore;
    private Map<Long, BallParameters> ballMap = new HashMap<>();

    public static BallStore getInstance() {
        if (ballStore == null) {
            ballStore = new BallStore();
        }
        return ballStore;
    }

    public Map<Long, BallParameters> getBallMap() {
        return Collections.unmodifiableMap(ballMap);
    }

    @Override
    public void update(Ball ball) throws BallException {
        BallLogic ballService = new BallLogic();
        double volume = ballService.calculateVolume(ball);
        double surfaceArea = ballService.calculateSurfaceArea(ball);
        ballMap.put(ball.getId(),new BallParameters(volume,surfaceArea));
    }

}
