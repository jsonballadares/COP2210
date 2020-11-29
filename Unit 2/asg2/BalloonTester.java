package asg2;

public class BalloonTester {
    public static void main(String[] args) {
        Balloon jasonsBalloon = new Balloon("Jason Balladares's Balloon", 100);
        Balloon notJasonsBalloon = new Balloon("Not Jasons's Balloon",-55);
        System.out.println(jasonsBalloon.getName() + " alt:" + jasonsBalloon.getAltitude());
        System.out.println(notJasonsBalloon.getName() + " alt:" + notJasonsBalloon.getAltitude());
        jasonsBalloon.ascendTo(250);
        notJasonsBalloon.ascendTo(350);
        System.out.println(jasonsBalloon.getName() + " alt:" + jasonsBalloon.getAltitude());
        System.out.println(notJasonsBalloon.getName() + " alt:" + notJasonsBalloon.getAltitude());
        notJasonsBalloon.adjustAltitude(-150);
        if(notJasonsBalloon.getAltitude() > jasonsBalloon.getAltitude()){
            jasonsBalloon.ascendTo(notJasonsBalloon.getAltitude());
        }else{
            jasonsBalloon.descendTo(notJasonsBalloon.getAltitude());
        }
        System.out.println(jasonsBalloon.getName() + " alt:" + jasonsBalloon.getAltitude());
        System.out.println(notJasonsBalloon.getName() + " alt:" + notJasonsBalloon.getAltitude());
        jasonsBalloon.ascendTo(jasonsBalloon.getAltitude() * 3);
        notJasonsBalloon.descendTo(notJasonsBalloon.getAltitude() - 300);
        System.out.println(jasonsBalloon.getName() + " alt:" + jasonsBalloon.getAltitude());
        System.out.println(notJasonsBalloon.getName() + " alt:" + notJasonsBalloon.getAltitude());
    }
}
