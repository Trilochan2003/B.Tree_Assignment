class Tree
{
    //Function to return list containing elements of left view of binary tree.
    
ArrayList<Integer> leftView(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null)
            return ans;
        q.add(root);
        
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node temp = q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                if(i==0)
                    ans.add(temp.data);
            }
        }
        return ans;
      
    }
}
