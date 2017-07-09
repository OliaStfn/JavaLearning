package Patterns.Structural.Proxy;

import java.net.ConnectException;

public class Main {
    public static void main(String[] args) {
        int opNum = 0;
        try
        {
            RobotBombDefuserProxy proxy = new RobotBombDefuserProxy(41);
            proxy.walkStraightForward(100);
            opNum++;
            proxy.turnRight();
            opNum++;
            proxy.walkStraightForward(5);
            opNum++;
            proxy.defuseBomb();
            opNum++;
            System.out.println();
        }
        catch (ConnectException e)
        {
            System.out.println("Exception has been caught with message:"+e.getMessage()+".Decided to have human operate robot there.");
                    planB(opNum);
        }
    }

    private static void planB(int opNum) {
        try {
            RobotBombDefuser humanOperatingRobotDirectly = new RobotBombDefuser();
            if(opNum == 0)
            {
                humanOperatingRobotDirectly.walkStraightForward(100);
                opNum++;
            }
            if (opNum == 1)
            {
                humanOperatingRobotDirectly.turnRight();
                opNum++;
            }
            if (opNum == 2)
            {
                humanOperatingRobotDirectly.walkStraightForward(5);
                opNum++;
            }
            if (opNum == 3)
            {
                humanOperatingRobotDirectly.defuseBomb();
            }
        } catch (ConnectException e) {
            e.printStackTrace();
        }
    }

}
