

postOrder(Node n){

   if n==null return
   push n on stack // seeding


	do{
	  if lastPrinted == stack.top.left
	     n =  stack.top.right
	     while(n != null) {
	       push n
	       n = n.left
	     }
	     lastPrinted = null
	  else 
	  if lastPrinted == stack.top.right
	      lastPrinted = stack.pop
		  print lastPrinted

	}while(stack.isNotEmpty())

}




///////////
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
