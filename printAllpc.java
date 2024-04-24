import java.util.*;

public class printAllpc{
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> permutations = permute(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<List<Integer>> permute(int nums[]){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        f(nums,ans,ds,freq);
        return ans;

    } 

    static void f(int nums[],List<List<Integer>> ans,List<Integer> ds,boolean freq[]){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                f(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;


            }
        }
    }
}