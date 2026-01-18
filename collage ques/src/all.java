
    import java.util.*;
    public class all {
            // 1. Find the sum of all elements in an array
            public static int sumArray(int[] arr) {
                int sum = 0;
                for (int num : arr) sum += num;
                return sum;
            }

            // 2. Find the average of array elements
            public static double averageArray(int[] arr) {
                if (arr.length == 0) return 0;
                return (double) sumArray(arr) / arr.length;
            }

            // 3. Find max and min element
            public static int findMax(int[] arr) {
                int max = arr[0];
                for (int num : arr) if (num > max) max = num;
                return max;
            }

            public static int findMin(int[] arr) {
                int min = arr[0];
                for (int num : arr) if (num < min) min = num;
                return min;
            }

            // 4. Linear Search
            public static int linearSearch(int[] arr, int target) {
                for (int i = 0; i < arr.length; i++)
                    if (arr[i] == target) return i;
                return -1;
            }

            // 5. Count occurrences
            public static int countOccurrences(int[] arr, int target) {
                int count = 0;
                for (int num : arr) if (num == target) count++;
                return count;
            }

            // 6. Replace occurrences
            public static void replaceOccurrences(int[] arr, int oldVal, int newVal) {
                for (int i = 0; i < arr.length; i++)
                    if (arr[i] == oldVal) arr[i] = newVal;
            }

            // 7. Check if array contains given number
            public static boolean contains(int[] arr, int target) {
                return linearSearch(arr, target) != -1;
            }

            // 8. Count even and odd numbers
            public static int[] countEvenOdd(int[] arr) {
                int even = 0, odd = 0;
                for (int num : arr) {
                    if (num % 2 == 0) even++;
                    else odd++;
                }
                return new int[]{even, odd};
            }

            // 9. Separate even and odd into two arrays
            public static void separateEvenOdd(int[] arr) {
                List<Integer> even = new ArrayList<>();
                List<Integer> odd = new ArrayList<>();
                for (int num : arr) {
                    if (num % 2 == 0) even.add(num);
                    else odd.add(num);
                }
            }

            // 10. Copy array
            public static int[] copyArray(int[] arr) {
                return Arrays.copyOf(arr, arr.length);
            }

            // 11. Merge two arrays
            public static int[] mergeArrays(int[] arr1, int[] arr2) {
                int[] merged = new int[arr1.length + arr2.length];
                System.arraycopy(arr1, 0, merged, 0, arr1.length);
                System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
                return merged;
            }

            // 12. Compare arrays
            public static boolean compareArrays(int[] arr1, int[] arr2) {
                int n = arr1.length;
                int m = arr2.length;

                if(n != m) return false;

                for(int i = 0; i < n; i++){
                    if(arr1[i] != arr2[i]) return false;
                }
                return true;
            }

            // 13. Index of first occurrence
            public static int firstIndex(int[] arr, int target) {
                return linearSearch(arr, target);
            }

            // 14. Index of last occurrence
            public static int lastIndex(int[] arr, int target) {
                for (int i = arr.length - 1; i >= 0; i--)
                    if (arr[i] == target) return i;
                return -1;
            }

            // 15. Shift left by one
            public static int[] shiftLeft(int[] arr) {
                if (arr.length == 0) return new int[0];
                int first = arr[0];
                for (int i = 1; i < arr.length; i++) arr[i - 1] = arr[i];
                arr[arr.length - 1] = first;
                return arr;
            }

            // 16. Shift right by one
            public static void shiftRight(int[] arr) {
                if (arr.length == 0) return;
                int last = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) arr[i] = arr[i - 1];
                arr[0] = last;
            }

            // 17. Sort ascending
            public static void sortAscending(int[] arr) {
                Arrays.sort(arr);
            }

            // 18. Sort descending
            public static void sortDescending(int[] arr) {
                Arrays.sort(arr);
                for (int i = 0; i < arr.length / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temp;
                }
            }

            // 19. Find 2nd largest
            public static int secondLargest(int[] arr) {
                Arrays.sort(arr);
                return arr[arr.length-2];
            }

            // 20. Find 2nd smallest
            public static int secondSmallest(int[] arr) {
                Arrays.sort(arr);
                return arr[1];
            }

            // 21. Remove duplicates
            public static int[] removeDuplicates(int[] arr) {
                return Arrays.stream(arr).distinct().toArray();
            }

            // 22. Count frequency
            public static Map<Integer, Integer> frequencyCount(int[] arr) {
                Map<Integer, Integer> freq = new HashMap<>();
                for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);
                return freq;
            }

            // 23. Reverse array in place
            public static void reverseArray(int[] arr) {
                int i = 0, j = arr.length - 1;
                while (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            // 24. Rotate right by k
            public static void rotateRight(int[] arr, int k) {
                k %= arr.length;
                reversePart(arr, 0, arr.length - 1);
                reversePart(arr, 0, k - 1);
                reversePart(arr, k, arr.length - 1);
            }

            // 25. Rotate left by k
            public static void rotateLeft(int[] arr, int k) {
                k %= arr.length;
                reversePart(arr, 0, k - 1);
                reversePart(arr, k, arr.length - 1);
                reversePart(arr, 0, arr.length - 1);
            }

            private static void reversePart(int[] arr, int l, int r) {
                while (l < r) {
                    int temp = arr[l];
                    arr[l++] = arr[r];
                    arr[r--] = temp;
                }
            }

            // 26. Find largest three elements
            public static int[] largestThree(int[] arr) {
                Arrays.sort(arr);
                return new int[]{arr[arr.length - 1], arr[arr.length - 2], arr[arr.length - 3]};
            }

            // 27. Find smallest three elements
            public static int[] smallestThree(int[] arr) {
                Arrays.sort(arr);
                return new int[]{arr[0], arr[1], arr[2]};
            }

            // 28. Sum of even and odd separately
            public static int[] sumEvenOdd(int[] arr) {
                int even = 0, odd = 0;
                for (int num : arr) {
                    if (num % 2 == 0) even += num;
                    else odd += num;
                }
                return new int[]{even, odd};
            }

            // 29. Replace negative with zero
            public static void replaceNegatives(int[] arr) {
                for (int i = 0; i < arr.length; i++)
                    if (arr[i] < 0) arr[i] = 0;
            }

            // 30. Replace zero with one
            public static void replaceZeroes(int[] arr) {
                for (int i = 0; i < arr.length; i++)
                    if (arr[i] == 0) arr[i] = 1;
            }

            // 31. Difference between max and min
            public static int diffMaxMin(int[] arr) {
                return findMax(arr) - findMin(arr);
            }

            // 32. Pairs with given sum
            public static List<int[]> pairsWithSum(int[] arr, int target) {
                List<int[]> pairs = new ArrayList<>();
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] + arr[j] == target) pairs.add(new int[]{arr[i], arr[j]});
                    }
                }
                return pairs;
            }

            // 33. Check if sorted
            public static boolean isSorted(int[] arr) {
                for (int i = 1; i < arr.length; i++)
                    if (arr[i] < arr[i - 1]) return false;
                return true;
            }

            // 34. Count elements greater than given number
            public static int countGreater(int[] arr, int x) {
                int count = 0;
                for (int num : arr) if (num > x) count++;
                return count;
            }

            // 35. Move zeroes to end
            public static void moveZeroes(int[] arr) {
                int index = 0;
                for (int num : arr) if (num != 0) arr[index++] = num;
                while (index < arr.length) arr[index++] = 0;
            }

            // 36. Rearrange pos/neg alternate
            public static void rearrangePosNeg(int[] arr) {
                List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
                for (int num : arr) {
                    if (num >= 0) pos.add(num);
                    else neg.add(num);
                }
                int i = 0, p = 0, n = 0;
                while (p < pos.size() && n < neg.size()) {
                    arr[i++] = pos.get(p++);
                    arr[i++] = neg.get(n++);
                }
                while (p < pos.size()) arr[i++] = pos.get(p++);
                while (n < neg.size()) arr[i++] = neg.get(n++);
            }

            // 37. Majority element (Boyer-Moore)
            public static int majorityElement(int[] arr) {
                int candidate = 0, count = 0;
                for (int num : arr) {
                    if (count == 0) candidate = num;
                    count += (num == candidate) ? 1 : -1;
                }
                return candidate;
            }

            // 38. Intersection of arrays
            public static int[] intersection(int[] arr1, int[] arr2) {
                Set<Integer> set1 = new HashSet<>();
                Set<Integer> res = new HashSet<>();
                for (int num : arr1) set1.add(num);
                for (int num : arr2) if (set1.contains(num)) res.add(num);
                return res.stream().mapToInt(i -> i).toArray();
            }

            // 39. Union of arrays
            public static int[] union(int[] arr1, int[] arr2) {
                Set<Integer> set = new HashSet<>();
                for (int num : arr1) set.add(num);
                for (int num : arr2) set.add(num);
                return set.stream().mapToInt(i -> i).toArray();
            }

            // 40. Find missing number 1..n
            public static int findMissing(int[] arr, int n) {
                int expectedSum = n * (n + 1) / 2;
                int actualSum = sumArray(arr);
                return expectedSum - actualSum;
            }

            // 41. Find duplicate (only one duplicate)
            public static int findDuplicate(int[] arr) {
                Set<Integer> seen = new HashSet<>();
                for (int num : arr) {
                    if (seen.contains(num)) return num;
                    seen.add(num);
                }
                return -1;
            }

            // 42. Find element appearing once while others twice
            public static int findUnique(int[] arr) {
                int xor = 0;
                for (int num : arr) xor ^= num;
                return xor;
            }

            // 43. Max subarray sum (Kadane)
            public static int maxSubarraySum(int[] arr) {
                int maxSoFar = arr[0], maxEndingHere = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
                    maxSoFar = Math.max(maxSoFar, maxEndingHere);
                }
                return maxSoFar;
            }

            // 44. Count subarrays with given sum
            public static int countSubarraysWithSum(int[] arr, int target) {
                Map<Integer, Integer> prefixSum = new HashMap<>();
                prefixSum.put(0, 1);
                int sum = 0, count = 0;
                for (int num : arr) {
                    sum += num;
                    if (prefixSum.containsKey(sum - target))
                        count += prefixSum.get(sum - target);
                    prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
                }
                return count;
            }

            // 45. Longest subarray with all distinct elements
            public static int longestDistinctSubarray(int[] arr) {
                Map<Integer, Integer> map = new HashMap<>();
                int left = 0, maxLen = 0;
                for (int right = 0; right < arr.length; right++) {
                    if (map.containsKey(arr[right]) && map.get(arr[right]) >= left)
                        left = map.get(arr[right]) + 1;
                    map.put(arr[right], right);
                    maxLen = Math.max(maxLen, right - left + 1);
                }
                return maxLen;
            }

            // Main for testing
            public static void main(String[] args) {
                int[] arr = {2, 5, 7, 5, 9, 5, 1};

                System.out.println("Sum = " + sumArray(arr));
                System.out.println("Average = " + averageArray(arr));
                System.out.println("Max = " + findMax(arr));
                System.out.println("Min = " + findMin(arr));
                System.out.println("Occurrences of 5 = " + countOccurrences(arr, 5));
                System.out.println("Is Sorted? " + isSorted(arr));
                System.out.println("Max Subarray Sum = " + maxSubarraySum(arr));
                System.out.println(Arrays.toString(shiftLeft(arr)));
 }
}
