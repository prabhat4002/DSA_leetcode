class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        findSubset(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public void findSubset(int ind, int[] arr, List<List<Integer>>ans, List<Integer> ds){
        if(ind==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[ind]);
        findSubset(ind+1,arr,ans,ds);
        ds.remove(ds.size()-1);
        findSubset(ind+1,arr,ans,ds);
    }

}