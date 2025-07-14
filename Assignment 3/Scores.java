package Java;

public class Scores {
    public static int getMax(int[] scores){
        int max = scores[0];

        for (int i = 0; i < scores.length; i++){
            if (max <scores[i]){
                max = scores[i];
            }
        }
        return max;
    }
    public static int getSum(int[] scores){
        int sum = 0;

        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return sum;
    }
    public static int searchValue(int[] scores, int value){

        for (int i = 0; i < scores.length; i++){
            if (value == scores[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] scores = {85, 92, 78, 96, 88};

        System.out.println("Max score is: " + getMax(scores));
        int sum = getSum(scores);
        double average = (double) sum / scores.length;
        System.out.println("Sum of all scores: " + sum + "\nAverage of all scores: " + average);
        int index = searchValue(scores, 8);
        if(index == -1){
            System.out.println("Value not Exist!");
        }else{
            System.out.println("Value is at index: " + index);
        }
    }
}
