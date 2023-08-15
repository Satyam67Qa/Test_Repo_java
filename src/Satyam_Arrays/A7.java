package Satyam_Arrays;

public class A7 {
    public static void main(String[] args) {

        int b[][]={{2,4,6,},{8,9,0}};

        System.out.println("THE SIZE OR LENGTH OF TWO DIMENSINAL ARRAY IS "+b.length);//lenghth of 2d array and also row commplte size of the array
        System.out.println("Size or lenghth of the first one dimensinal array is "+b[0].length);// lenth of col and find the 1 array size in the 2d array
        System.out.println("Size or lenghth of the 2nd one dimensinal array is "+ b[1].length);// lenth of col and find the 2 array size in the 2d array

        //for in in 2d array

        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[0].length;j++){
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }


    }
}
