package twoSum;
// Loop through each element i and j to find if there is a target that is equal to i + j

// Time complexity : O(n^2)For each element, we try to find its complement by looping through the rest 
// of array which takes O(n) time. Therefore, the time complexity is O(n^2)

// Space complexity : O(1).
class BruteForceSolution {
    public int[] twoSum(int[] nums, int target) 
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(target == nums[i] + nums[j])
                {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("There is no two number that could add up to target");
    }
}