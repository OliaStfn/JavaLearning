package Patterns.Structural.Proxy;

import java.net.ConnectException;

public class RobotBombDefuserProxy extends RobotBombDefuser {
    private RobotBombDefuser robotBombDefuser;
    private int communicationWaveLength;
    private int connectionAttempts = 3;

    public RobotBombDefuserProxy(int communicationWaveLength) {
        this.communicationWaveLength = communicationWaveLength;
        robotBombDefuser = new RobotBombDefuser();
    }

    @Override
    public void walkStraightForward(int steps) throws ConnectException {
        ensureConnectedWithRobot();
        robotBombDefuser.walkStraightForward(steps);
    }

    @Override
    public void turnRight() throws ConnectException {
        ensureConnectedWithRobot();
        robotBombDefuser.turnRight();
    }

    @Override
    public void turnLeft() throws ConnectException {
        ensureConnectedWithRobot();
        robotBombDefuser.turnLeft();
    }

    @Override
    public void defuseBomb() throws ConnectException {
        ensureConnectedWithRobot();
        robotBombDefuser.defuseBomb();
    }

    private void ensureConnectedWithRobot() throws ConnectException {
            if (robotBombDefuser == null) {
                robotBombDefuser = new RobotBombDefuser();
                robotBombDefuser.connectWireless(communicationWaveLength);
            }
            for (int i = 0; i < communicationWaveLength; i++) {
                if (!robotBombDefuser.isConnected()) {
                    robotBombDefuser.connectWireless(communicationWaveLength);
                } else break;
            }
            if (!robotBombDefuser.isConnected()) {
                throw new ConnectException("No connection with remote bomb diffuser" +
                        " robot could be made after few attempts.");
            }

    }
}
