package thuchanh1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {

        List<String> arr2 = new ArrayList<>();
        arr2.add("trong");
        arr2.add("trong2");
        arr2.add("trong3");

//        check tồn tại
//        System.out.println(arr2.contains(1));
//        System.out.println(arr2.contains("trong"));

//        Check mảng rỗng hay ko
//        System.out.println(arr2.isEmpty());




        List<ConNguoi> arr = new ArrayList<>();
        ConNguoi t1 = new ConNguoi("trong", 23);
        ConNguoi t2 = new ConNguoi("trong1", 24);
        ConNguoi t3 = new ConNguoi("trong3", 23);
        ConNguoi t4 = new ConNguoi("trong6", 25);

//
//Thêm
        arr.add(t1);
        arr.add(t2);
        arr.add(t3);
//
//        System.out.println(arr);
//Xóa tất cả
//        arr.clear();
//        System.out.println(arr);

//        Xét giá trị mới
        arr.set(2, t4);
        System.out.println(arr);




    }
}
