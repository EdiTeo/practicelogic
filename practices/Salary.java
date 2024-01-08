package practicelogic.practices;

import java.util.*;

class Salary {
    public static void main(String[] args) {
        int[] salaries1 = {4000, 3000, 1000, 2000};
        System.out.println("Average: " + average(salaries1));

        int[] salaries2 = {1000, 2000, 3000};
        System.out.println("Average: " + average(salaries2));

    }
    public static double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        if(salary.length == 1){
            return salary[0];
        }
        if(salary.length == 0){
            return 0.0;
        }else{
             
            for(int i = 0; i < salary.length; i++){
                if(salary[i] > max){
                    max = salary[i];
                } 
                if(salary[i] < min){
                    min = salary[i];
                }
                sum += salary[i];
            }
            sum -= max;
            sum -=min;
            sum = sum / (salary.length - 2);
        }
        return sum;
    }
    
}