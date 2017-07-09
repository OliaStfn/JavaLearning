package Patterns.Structural.Proxy;

import java.net.ConnectException;
import java.util.Random;

public class RobotBombDefuser {
    private Random random = new Random();
    private int robotConfiguredWaveLength = 30;
    private boolean isConnected = false;

    public void connectWireless(int communicationWaveLength) {
        if (communicationWaveLength == robotConfiguredWaveLength) {
            isConnected = isConnectedImmitatingConnectivitiyIssues();
        }
    }

    public boolean isConnectedImmitatingConnectivitiyIssues() {
        return random.nextInt(10) < 4;
    }

    public boolean isConnected() {
        isConnected = isConnectedImmitatingConnectivitiyIssues();
        return isConnected;
    }

    public void walkStraightForward(int steps) throws ConnectException {
        System.out.println("Did steps forward "+steps);
    }

    public void turnRight() throws ConnectException {
        System.out.println("Turned right...");
    }

    public void turnLeft() throws ConnectException {
        System.out.println("Turned left...");

    }

    public void defuseBomb() throws ConnectException {
        System.out.println("Cut red or green or blue wire...");
    }
}
