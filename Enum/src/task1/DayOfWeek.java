package task1;

//Создай enum DayOfWeek, представляющий дни недели
//(MONDAY, TUESDAY, ..., SUNDAY).
//Напиши метод isWeekend(), который возвращает true,
//если день является субботой или воскресеньем

public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}





