class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        findSubset(0,nums, ans, new ArrayList<>());
        return ans;
    }
    public void findSubset(int ind, int[] arr, List<List<Integer>> ans, List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]){
                continue;
            }
            ds.add(arr[i]);
            findSubset(i+1, arr,ans,ds);
            ds.remove(ds.size()-1);

        }
    }
}