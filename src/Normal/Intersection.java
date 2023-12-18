package Normal;
//https://leetcode.com/problems/intersection-of-two-arrays/description/
import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    static int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    if (!resultArr.contains(arr1[i])) {
                        resultArr.add(arr1[i]);
                    }
                }
            }
        }
        int[] result = new int[resultArr.size()];
        for (int i = 0; i < resultArr.size(); i++) {
            result[i] = resultArr.get(i);
        }
        return result;
    }
}
