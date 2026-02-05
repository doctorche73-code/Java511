

void main() {

    MyList list = new MyList();

   // list.print(); //1 2 3 4

    //System.out.println(list.isEmpty()); // false

    //System.out.println(list.get(3)); // 4

    //System.out.println(list.getLast()); //4

    //System.out.println(list.indexOf(2)); //2 имеет индекс 1

    //System.out.println(list.lastIndexOf(1)); //0
    list.addEnd(1);
    list.addEnd(2);
    list.addEnd(3);
    list.addEnd(4);
//    list.addByIndex(1, 100);
//    list.print();

//    list.removeByValueFirst(2);
//    list.print();

list.print();
list.reverse();
list.print();



}
