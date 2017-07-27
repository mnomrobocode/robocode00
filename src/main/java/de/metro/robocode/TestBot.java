package de.metro.robocode;

import robocode.*;

public class TestBot extends Robot {

    @Override
    public void run() {

        double radius = 100.0;
        double angle = 90.0 // Yes, I am that smart!

        while (true) {
            ahead(radius);
            turnLeft(angle);
            turnGunLeft(angle);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(1);
    }

    public void onHitByBullet(HitByBulletEvent e) {
        turnLeft(90 - e.getBearing());
    }

}
