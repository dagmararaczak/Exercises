package codewars;

public class twoSum {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        int[] twoSum = twoSum(numbers, 4);
        for (int i : twoSum) {
            System.out.println(i);
        }


    }

    public static int[] twoSum(int[] numbers, int target){

        int[] result = new int[2];
       for(int i = 0; i <numbers.length; i++){

           for (int k = i+1; k <numbers.length;k++){

               if(numbers[i]+numbers[k] == target){
                   result[0] = i;
                   result[1] = k;
               }

           }
       }

       return result;
    }

}
