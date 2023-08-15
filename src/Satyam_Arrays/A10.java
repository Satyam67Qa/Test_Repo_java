package Satyam_Arrays;

public class A10 {
    public static void main(String[] args) {
        int [] a={2,5,6,9};
        //System.out.println(a.length);

        int temp;

        for (int i=0;i<a.length;i++){
           // System.out.println(a[i]);
            for (int j=i+1;j<a.length;j++){
                //System.out.println("jjjjj"+a[j]);

                if (a[i]<a[j])
                {
                    temp =a[i];
//                    System.out.println("print temp "+temp);
//                    break;
                   a[i]=a[j];
                    a[j]=temp;

                   // System.out.println(temp);
                    //System.out.println("ptint j "+a[i]);
                }
                //System.out.print("print j"+a[j]);
            }
            //System.out.print("p i"+a[i]);
        }
        System.out.println("max" +a[0]);
        for (int arr:a){
            System.out.println("ptint new arr"+arr);
        }
    }
}
