package com.abidingtech.waheed;

public class Main {
    //    String ToLower,ToUpper,replace,equals
    public static void main(String[] args) {
        String a="The Result=";
        int[] numbers={10,15,20,30,32};
        numbers[0]=550;
        for (int i=0;i<numbers.length;i++) {
            System.out.println(a+numbers[i]);
        }

        int j=0;
        while (j<5){
            System.out.println(numbers[j]);
            j++;
        }
        int k=0;
        do{
            System.out.println("Do While Result=>"+numbers[k]);
            k++;
        }while (k<5);

        String result="Foreach Result=>";
        for (int b:numbers){
            result=result+" "+b;
        }
        System.out.println(result);
        int [][] abc={
                {4,5,6,5},
                {8,5,4,8,66}
        };

        for (int i=0;i<abc.length;i++)
        {
            for (int l=0;l<abc[i].length;l++)
            {
                System.out.print(" "+abc[i][l]);
            }
            System.out.println("");
        }
    }
}
