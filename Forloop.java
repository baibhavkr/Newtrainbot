public class Forloop {
/**
 * @param args
 */
public static void main(String[] args){ 
/*{
    for(int i = 1; i <= 2; i = i ++){ 
        System.out.println("Outer" + i );
        for(int j=1; j<=3;j++);
    {
        System.out.println("Inner");
}   
}*/
/*tring[] cars={"Ferrari","Volvo","BMW","Kia"};
for (String i:cars) 
{
System.out.println(i);
}*/
for (int i = 0; i <= 100; i += 10) {
    System.out.println(i);
  }
  for (int j=0; j<=10;j=j+2){
    System.out.println(j);
  } 
  int number=2;
  for(int k=2;k<=10;k++){
    System.out.println(number +"x"+k+"="+(number *k));
  }
  for (int a=1; a<=10;a++){
    if(a==5){
        break;}
    System.out.println(a);
    
    
  }
}

}

