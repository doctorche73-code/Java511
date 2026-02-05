package task4;

//Создай enum TrafficLight с элементами
//RED, YELLOW, GREEN.
//Реализуй метод getNext(), который возвращает следующий
//цвет светофора в стандартной последовательности:
//RED → GREEN → YELLOW → RED и так далее

public enum TrafficLight {
    RED, YELLOW, GREEN;

    public TrafficLight getNext() {
        switch (this) {
            case RED:
                return GREEN;
            case GREEN:
                return YELLOW;
            case YELLOW:
                return RED;
            default:
                return null;
        }
    }
}
