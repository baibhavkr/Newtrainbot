public class main{
// The main method where the program execution starts.
    public static void main(String[] args) {      
        // Declare and initialize an integer array.
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Declare and initialize a variable to store the sum.
        int sum = 0;
        
        // Iterate over each element of the array using an enhanced for loop.
        for (int i : my_array)
            // Add each element to the sum.
            sum += i;
        
        // Print the sum of the array elements.
        System.out.println("The sum is " + sum);
        int[][] a= new int[10][10];
    for(int i=0;i>=10;i++){
    for(int j=0;j>=10;j++){
        System.out.printf("%2d",a[i][j]);

    }
    System.out.println();
    }
    }
    
}