Tree Traversal Techniques
  -> Tree traversal refers to the process of visiting or accessing each node of a tree exactly once in a specific order. Unlike linear data structures such as arrays, 
  linked lists, or queues (which have only one logical way of traversal), trees offer multiple ways to traverse their nodes.


Tree traversals are broadly classified into two categories:

  -> Depth-First Traversal (DFT)
  
    Explores as far as possible along a branch before exploring the next branch.
    Types: Inorder, Preorder, Postorder
    Breadth-First Traversal (BFT)

  -> Explores nodes level by level from top to bottom.
  
    Type: Level Order Traversal.
    The level order traversal of the above tree is 1, 2, 3, 4, 5, 6, and 7

<------------------------------------------------------------------------------------------------------------------------------------>

1. Inorder Traversal
Inorder traversal visits the node in the order: Left -> Root -> Right

Algorithm for Inorder Traversal

 Inorder(tree ) 
● Traverse the left subtree, i.e., call Inorder(left->subtree) 
● Visit the root. 
● Traverse the right subtree, i.e., call Inorder(right->subtree) 

Uses of Inorder Traversal

In the case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order.
To get nodes of BST in non-increasing order, a variation of Inorder traversal where Inorder traversal is reversed can be used.
Inorder traversal can be used to evaluate arithmetic expressions stored in expression trees.

<------------------------------------------------------------------------------------------------------------------------------------>

2. Preorder Traversal
Preorder traversal visits the node in the order: Root -> Left -> Right

Algorithm for Preorder Traversal

 Preorder(tree) 

● Visit the root. 
● Traverse the left subtree, i.e., call Preorder(left->subtree) 
● Traverse the right subtree, i.e., call Preorder(right->subtree) 

Uses of Preorder Traversal

Preorder traversal is used to create a copy of the tree.
Preorder traversal is also used to get prefix expressions on an expression tree.

<------------------------------------------------------------------------------------------------------------------------------------>

3. Postorder Traversal
Postorder traversal visits the node in the order: Left -> Right -> Root

Algorithm for Postorder Traversal:

  Postorder(tree) 

●Traverse the left subtree, i.e., call Postorder(left->subtree) 
● Traverse the right subtree, i.e., call Postorder(right->subtree) 
● Visit the root 

Uses of Postorder Traversal

Postorder traversal is used to delete the tree.
Postorder traversal is also useful to get the postfix expression of an expression tree.
Postorder traversal can help in garbage collection algorithms, particularly in systems where manual memory management is used.

