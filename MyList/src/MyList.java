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

        public void print() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
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

        public int getFirst() {
            return arr[0];
        }

        public boolean isHasValue(int num) {
            if (arr == null || size == 0) {
                return false;
            }
            for (int elemtnt : arr) {
                if (elemtnt == num) {
                    return true;
                }
            }
            return false;
        }

        public int size(){
            if (arr == null){
                return 0;
            }
            return arr.length;
        }

        public void clear() {
        arr = new int[0];
        }

        public int[] removeByIndex (int index) {
            if (index < 0 || index >= arr.length) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы массива "+index);
            }
            int[] newArr = new int[arr.length - 1];
            for (int i = 0; i < index; i++) {
                arr[i] = newArr[i];
            }
            for (int i = index + 1; i < arr.length; i++ ) {
                arr[i] = newArr[i - 1];
            }
            return newArr;
        }

        public  void removeByValueFirst(int num){
            boolean isHas = false;

            for (int i = 0; i < size; i++) {
                if (arr[i] == num) {
                    isHas = true;
                    break;
                }
            }

            if (isHas) {
                int[] tmp = new int[size - 1];
                for (int i = 0,j=0; i < size; i++) {
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
    }





