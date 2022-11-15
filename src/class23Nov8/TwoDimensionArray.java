package class23Nov8;

public class TwoDimensionArray {
    public static void main(String[] args) {
        // Declaration of 2D array:
        int data[][];
        //Declaration and initialization of 2D array
        int nums[][]=new int[3][3];


        // DEclare and assign in one line:
        int info[][]={{23,31,34}, {45,67,54}, {34,21,31}};

        // Find number of rows:
        System.out.println(nums.length);
        // Find number of column in a row:
        System.out.println(nums[0].length);

        //Print data at particular index
        System.out.println(nums[1][1]);

        //Print all data from 2D array using index based for loop:
        for (int i=0; i<info.length; i++){
            for (int j=0; j<info[i].length;j++){
                System.out.print(info[i][j]+" ");
            }
            System.out.println();
        }
    }
}
