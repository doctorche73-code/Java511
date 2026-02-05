package task2;

//Простой калькулятор
//Создай enum Operation с элементами
//ADD, SUBTRACT, MULTIPLY, DIVIDE.
//Добавь в него метод apply(double a, double b),
//который выполняет соответствующую арифметическую операцию
//над двумя числами и возвращает результат

public enum Operation {
    ADD {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public double apply(double a, double b) {
            if (b != 0){
                return a/b;
            } else {
                System.out.println("Ошибка! Деление на ноль.");
            }
            return -1;
        }
    };

public abstract double apply(double a, double b);
}
