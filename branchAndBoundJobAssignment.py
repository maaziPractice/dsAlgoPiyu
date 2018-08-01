
int minCost = INT.MAX;
int jobCost[][];
boolean taken[] = new boolean[n];
int n=jobCost[0].length;
int costSoFar = 0;
int assignee = 0;

void jobAssignment(){
	
    
	for(int i=0; i< n;i++){
       if(taken[i] == false && costSoFar+job[assignee][i] < minCost){

         costSoFar=costSoFar+job[assignee][i];
         taken[i]=true;
         if(assignee=n-1){
           minCost=costSoFar;
         }else{
           assignee++;
           jobAssignment();
           assignee--;
         }
         //removing now
         taken[i]=false;
       }
	}


}

driver(){
	jobAssignment(0);
	print minCost
}
