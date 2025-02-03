
public class SmallestNeighborDistance {
    public static int findSmallestNeighborIndex(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int minIndex = 0;
        int minDifference = Math.abs(arr[1] - arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDifference) {
                minDifference = diff;
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 8, 15, 17, 9, 14};
        int index = findSmallestNeighborIndex(numbers);
        System.out.println("Index of first number with smallest neighbor distance: " + index);
    }
}
