public class Define {
public static void main(String[] args) {
    String firstname="John";
    String lastname="Douglas";
    int age= 27;
    int Id= 14;
    float salary= 17.5f;
    char grade='b';

    System.out.println("Stodent name=" + firstname +lastname);
    System.out.println("Age=" +age);
    System.out.println("ID="+Id);
    System.out.println("Salary="+salary);
    System.out.println("Class Grade="+grade);
    
    //Area of Rectangle
    int a=54;
    int b=20;
    float area;
    float myfloat=0.5f;

    area= myfloat*a*b;

    System.out.println("Area of rectangle="+ area);

    int items=50;
    float costperitem= 9.99f;
    float totalitem= items*costperitem;
    char currency= '$';

    System.out.println("Number of Items="+ items);
    System.out.println("Cost Per Item="+costperitem + currency);
    System.out.println("Total Price"+totalitem+currency);

    int Maxscore=500;
    int Userscore=467;

    float Percentage= (float) Userscore / Maxscore * 100.0f;
    System.out.println("Total Score="+Percentage);
    int x=5;
    System.out.println(x>3 && x<10);
    System.out.println("this is \r your destiny \t for me \b my hero \f hehe");
}
}
