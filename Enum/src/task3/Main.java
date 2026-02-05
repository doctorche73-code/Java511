package task3;

public class Main {
    public static void main (String[] args) {
        for (OrderStatus status : OrderStatus.values()){
            System.out.println(status+" "+status.isCompleted());
        }
    }
}
