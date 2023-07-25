public class UniqueElement {

    public static void main(String[] args) {
        int[] sortedArray = {0, 0, 2, 2, 3, 4, 4, 5, 5};
        int result = findUniqueElement(sortedArray);
        System.out.println("Unique element: " + result);
    }
    public static int findUniqueElement(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if ((mid == 0 || arr[mid] != arr[mid - 1]) && (mid == n - 1 || arr[mid] != arr[mid + 1])) {
                return arr[mid];
            }

            if (mid % 2 == 0) {
                if (arr[mid] == arr[mid + 1]) {
                    left = mid + 2;
                } else {
                    right = mid - 2;
                }
            } else {
                if (arr[mid] == arr[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

   }
//   Асимптотическая сложность алгоритма O(log n)