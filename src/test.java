import java.util.ArrayList;
import java.util.List;

class SubsetGenerator {
    public static void main(String[] args) {
        SubsetGenerator generator = new SubsetGenerator();
        int[] arr = {1, 2, 3, 4};
        List<List<Integer>> subsets = generator.generateSubsets(arr);

        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }

    public List<List<Integer>> generateSubsets(int[] arr) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> currentSubset = new ArrayList<>();
        generateSubsets(arr, 0, currentSubset, subsets);
        return subsets;
    }

    private void generateSubsets(int[] arr, int index, List<Integer> currentSubset, List<List<Integer>> subsets) {
        if (index == arr.length) {
            subsets.add(new ArrayList<>(currentSubset));
            return;
        }

        // Include the current element
        currentSubset.add(arr[index]);
        generateSubsets(arr, index + 1, currentSubset, subsets);

        // Exclude the current element
        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(arr, index + 1, currentSubset, subsets);
    }
}
