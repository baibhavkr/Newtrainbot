import java.lang.reflect.Array;
import java.util.Arrays;

public class array {
public static void main(String[] args) {
    int [] mynum={1,2,3,4,5,6};
    System.out.println(mynum);
    String[] cars={"BMW","Volvo","hundai","Maruti"};
    cars[2]="Omni";
    System.out.println(cars[2]);

int []my_array1 = {1789, 2035, 1899, 1456, 2013, 
1458, 2458, 1254, 1472, 2365, 
1456, 2165, 1457, 2456};

String []my_string= {"Java","Python","PHP","C#","C Programming","C++"};

    System.out.println("Original Array sort:"+ Arrays.toString(my_array1));

    Arrays.sort(my_array1);
    System.out.println("Sorted Array format:"+ Arrays.toString(my_array1));

    System.out.println("Original String sort:"+ Arrays.toString(my_string));

    Arrays.sort(my_string);
    System.out.println("Sorted Array format"+ Arrays.toString(my_string));
}
}