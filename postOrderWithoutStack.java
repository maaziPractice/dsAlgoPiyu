


postOrder(Node root){

while(true){
  while(root != null){
    stack.push(root)
    root =  root.left
  }

 while(stack.isNotEmpty){
    if(stack.peek.right = null or printedNode = stack.peek.right){
       print stack.peek
       printedNode = stack.pop
       
       if(stack.isEmpty) return;
       
       if(printedNode = stack.peek.left && stack.peek.right != null){
          stack.push(stack.peek.right)
          break;
       }
    }
 }

}   

   
  



}
