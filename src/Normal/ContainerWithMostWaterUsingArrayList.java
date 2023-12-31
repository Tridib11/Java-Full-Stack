package Normal;

import java.util.ArrayList;

public class ContainerWithMostWaterUsingArrayList {
    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        int result = maxArea(heights);
        System.out.println("Max Area: " + result);
    }

    public static int maxArea(ArrayList<Integer> heights) {
        int left = 0;
        int right = heights.size() - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(heights.get(left), heights.get(right)) * (right - left);
            maxArea = Math.max(area, maxArea);

            if (heights.get(left) < heights.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
