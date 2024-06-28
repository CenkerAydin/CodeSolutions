package Arrays;

/*
 Problem -> https://leetcode.com/problems/duplicate-zeros/description/
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int num : arr) {
            if (num == 0) {
                count++;
            }
        }
        for (int i = n-1; i >=0; i--) {
            if(i + count <n ){
                arr[i+count]= arr[i];
            }
            if(arr[i] == 0){
                count--;
                if(i+count <n){
                    arr[i+count]= 0;
                }
            }
        }
    }
}
