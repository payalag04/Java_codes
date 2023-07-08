import java.util.*;
class twosum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = sc.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter "+ length +" values");
        for(int i = 0; i< length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter Target value");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
        sc.close();


    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                return new int[] {i,j};
                }
            }
        }
        return null;
    }
}