//In-Order    Left -> Root -> Right

import java.util.ArrayList;

class InOrder{
    
    static class Node{
        int data;
        Node left,right;
        
        Node(int x){
            this.data=x;
            left=right=null;
        }
    }
    public static void inOrder(Node node,ArrayList<Integer> res){
        if(node==null)return;
        
        inOrder(node.left,res);
        
        res.add(node.data);
        
        inOrder(node.right,res);
        
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        
        ArrayList<Integer> res=new ArrayList<>();
        
        inOrder(root,res);
        
        for(Integer node:res){
            System.out.println(node);
        }
    }
}

//Time Complexcity :- O(n)