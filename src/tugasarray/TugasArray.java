package tugasarray;

import java.util.Scanner;

public class TugasArray {

    public static void main(String[] args) {
    int array,R;
        //inputan panjang array
        System.out.print("Masukkan Panjang Array : ");
        array=new Scanner(System.in).nextInt();
        
        System.out.println("-_________________________-");
        
        String nama[]=new String[array];
        int nilai[]=new int[array];
        
        //inputan untuk nama dan nilai
        for(R=0;R<array;R++)
        {
            System.out.print("Masukkan Nama Ke-"+(R+1)+" : ");
            nama[R]=new Scanner(System.in).nextLine();
            System.out.print("Masukkan Nilai Ke-"+(R+1)+" : ");
            nilai[R]=new Scanner(System.in).nextInt();
        }   
            //Output
        System.out.println("");
         for(R=0;R<array;R++)
        {
            System.out.println("Nama Ke-"+(R+1)+" : "+nama[R]+" Dengan Nilai "+nilai[R]);

    }

}
}
