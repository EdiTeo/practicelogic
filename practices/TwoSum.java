package practicelogic.practices;
public class TwoSum {
    public static void main(String[] args) {
        int[] salaries1 = {3,3};
        System.out.println("  " + twoSum(salaries1,6));

        int[] salaries2 = {1,2,3,4,5};
        System.out.println(" " + twoSum(salaries2,6));

    }
    public static int[] twoSum(int[] nums, int target) {
        //[1,2,3,4]          == target 6 sol. [0,1,2]
        int j = 0;
        int[] save = {};
        while(j < nums.length){
             
            for(int i = 0; i < nums.length; i++){
                if(nums[i] + nums[j] == target && j != i){
                    save = new int[]{j,i};
                    break;
                }
            }
            j++;
        }
        return save;
    }
}
