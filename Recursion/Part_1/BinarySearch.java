package Recursion.Part_1;

public class BinarySearch {
    public static void main(String[] args) {
//As we know that in binary search we are doing 2 things: 1:Applying condition that number that we are finding which
        // is smaller / Greater and isEqual to the number. 2:Divide array in Half and Search.
        int[] nums = {2, 3, 4, 6, 7, 8, 9, 10, 12, 13, 15, 16, 20};
        int search = 15;
        int binarySearchResult = binarySearch(nums, search, 0, nums.length);
        System.out.println(binarySearchResult);

    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        //As we know in the sorted array of the start is going greater than end , which means start overlaps then other
            // end in search of finding the target element. Which means target element is not in the array;
        // base case: the start index is greater than the end index, which means the target element is not in the array.
            if (start > end) {
                return -1;
            }

            // Calculate the middle index of the subArray.
            int mid = start + (end - start) / 2;

            // If the middle element is the target, return its index.
            if (nums[mid] == target) {
                return mid;
            }

            // If the middle element is greater than the target, recursively search the left half of the array.
            if (nums[mid] > target) {
                return binarySearch(nums, target, start, mid - 1);
            }

            // Otherwise, recursively search the right half of the array.
            return binarySearch(nums, target, mid + 1, end);
        }
    }
