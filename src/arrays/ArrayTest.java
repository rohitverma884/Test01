package arrays;

public class ArrayTest {

    public static void main(String abc[]){

        int arr1[][] = new int[5][3];

        int arr5[] = {1,2,3,4};

        int arr6[][] = {  {3,5,7},  {5,7,9},  {78,34,56} , {24,5,67}, {23,5,6}  };
                         //0,1,2     0,1,2      0,1,2        0,1,2     0, 1,2
                          //0          //1      //2          //3         //4


        arr1[0][0] =4;
        arr1[0][1] =6;
        arr1[0][2] =8;


        arr1[1][0] =9;
        arr1[1][1] =7;
        arr1[1][2] =9;

        arr1[2][0] =9;
        arr1[2][1] =7;
        arr1[2][2] =9;

        arr1[3][0] =9;
        arr1[3][1] =7;
        arr1[3][2] =9;

        arr1[4][0] =9;
        arr1[4][1] =7;
        arr1[4][2] =78;

       // System.out.println(arr1[4][2]);

        for(int i=0;i<arr1.length;i++){
            int arr2[] = arr1[i];
            for(int j=0;j<arr2.length;j++) {
                System.out.print(arr2[j]+"  ");
            }
        }




    }
}
