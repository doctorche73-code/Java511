import java.util.Arrays;

public class MyList {

    int[] arr;
    int size;

    {
        size = 0;
        arr = new int[size];
    }

    public MyList() {
    }

    public void addEnd(int num) {
        int[] tmp = new int[size + 1];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[i];
        }
        tmp[size] = num;
        size++;
        arr = tmp;
    }

    public void addStart(int num) {
        int[] newArr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            newArr[i + 1] = arr[i];
        }
        newArr[0] = num;
        size++;
        arr = newArr;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int get(int index) {
        if (index < 0 || index > size - 1) {
            return 0;
        }
        return arr[index];
    }

    public int getLast() {
        return arr[size - 1];
    }

    public int indexOf(int num) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int num) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public void addByIndex(int index, int num) {
        if (index <= 0) {
            addStart(num);
        } else if (index >= size) {
            addEnd(num);
        } else {
            int[] tmp = new int[size + 1];
            for (int i = 0, j = 0; i < tmp.length; i++) {
                if (i == index) {
                    tmp[i] = num;
                } else {
                    tmp[i] = arr[j++];
                }
            }
            size++;
            arr = tmp;
        }
    }

    public void removeByValueFirst(int num) {
        boolean isHas = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                isHas = true;
                break;
            }
        }
        if (isHas) {
            int[] tmp = new int[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (isHas && arr[i] == num) {
                    isHas = false;
                    continue;
                }
                tmp[j++] = arr[i];
            }
            size--;
            arr = tmp;
        }
    }

    public  boolean isHasValue(int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public  void removeByValueLast(int num){
        if (isHasValue(num)) {
            int[] tmp = new int[size - 1];

            boolean isHas = true;
            for (int i = arr.length-1,j = tmp.length-1; i >= 0; i--) {
                if (arr[i] == num && isHas == true) {
                    isHas = false;
                    continue;
                }
                tmp[j--] = arr[i];
            }

            size--;
            arr = tmp;
        }
    }

    public void reverse() {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}