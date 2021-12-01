package creator;

import entity.Ball;
import entity.Point;
import exception.BallException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class SimpleBallFactory {
    private static final Logger logger = LogManager.getLogger(SimpleBallFactory.class);

    public Ball createBall(Point point, double radius) throws BallException {
        if (point == null) {
            throw new BallException("Given point is null");
        }
        logger.info("Ball object created");
        return new Ball(point,radius);
    }

}
