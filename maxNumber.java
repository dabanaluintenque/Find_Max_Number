class FindMaxNumber {


public int maxNumber(int[] number){

    int currentMax= number[0];

    int numberLen = number.length;

     for(int i =0; i< numberLen; i++){


         if(number[i]> currentMax){

             currentMax = number[i];
         }
     }

     return currentMax;

}


 public static void main(String[] args) {

    // System.out.println("Hello");

    FindMaxNumber max = new FindMaxNumber();

    int arrayNumbers[] = {1,2,3,100,5,6,7,8,9,10};

     System.out.println("Max number is: "+ max.maxNumber(arrayNumbers));
   }

}