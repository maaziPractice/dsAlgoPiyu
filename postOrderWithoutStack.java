postOrder(Node root){
      if root = null return;

      stack.push(root)
      moveLeftMost()
      justPrinted = NULL
      while(stack is not empty){
          if justPrinted == stack.top.right{
             leaf = stack.pop()
             justPrinted = leaf
             print leaf.data
           }else justPrinted == stack.top.left {
              if stack.top.right!=null{
                root = stack.top.right
                stack.push(root)
                moveLeftMost()
              }
              justPrinted = null
           }
      }

}
