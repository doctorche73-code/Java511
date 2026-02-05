package task4;

public class Main {
    public static void main (String[] args) {
        TrafficLight current = TrafficLight.RED;
        System.out.println(current);
        System.out.println(current.getNext());
        System.out.println(current.getNext().getNext());
        System.out.println(current.getNext().getNext().getNext());
    }
}
