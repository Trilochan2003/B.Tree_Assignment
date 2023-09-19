class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> ans = new ArrayList<>();
         if(root == null) return ans;
         Queue<TreeNode> q = new LinkedList<>();
         q.offer(root);
         while(!q.isEmpty()){
             int count = q.size();
             List<Integer> temp = new ArrayList<>();
             for(int i=0; i<count; i++){
                 TreeNode x = q.poll();
                 temp.add(x.val);
                 if(x.left != null)
                 q.offer(x.left);
                 if(x.right != null)
                 q.offer(x.right);
             }
            ans.add(temp);
         }
         List<List<Integer>> finalRes = new ArrayList<>();
        for(int i =ans.size()-1; i>=0; i--)
          finalRes.add(ans.get(i));

          return finalRes;
    }
}
