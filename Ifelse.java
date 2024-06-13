

public class Ifelse {
/**
 * @param args
 */
public static void main(String[] args) {
   /* Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed*/
int x=5;
int y=10;
if (y>x) {
    System.out.println("Thats Correct");
}
if (x>40) {
    System.out.println("This is Wrong");
    
} else {
    System.out.println("X value is 5 which is less than 40");
}
int time=40;
if (time>40) {
    System.out.println("Good Night");
} else if (time<40) {
    System.out.println("Good Morning");
}
else {
     System.out.println("What the hell is 40");
}
int day=8;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturady");
break;
case 7:
System.out.println("Sunday");
break;
    default:
    System.out.println("No such day exists");
        break;
}
int i=0;
while (i<5) {
    System.out.println(i);
    i++;
}
int d=5;
do{
    System.out.println(d);
    d++;
}
while( d<10);

int countdown=3;
while (countdown<0) {
    System.out.println(countdown);
    countdown++;
}
System.out.println("Happy new Year");

int dice = 1;

while (dice <= 6) {
  if (dice < 6) {
    System.out.println("No Yatzy.");
  } else {
    System.out.println("Yatzy!");
  }
  dice = dice + 1;
}

for(int j =10; j > 0; j ++);
if (j==5);
{
System.out.println(j);}

}
}
