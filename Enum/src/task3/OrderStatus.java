package task3;

public enum OrderStatus {
    NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED;

    public boolean isCompleted() {
        return this == DELIVERED ||  this == CANCELLED;
    }
}
