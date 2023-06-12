import java.util.*;
import java.io.*;

/* COSC1P03
 * ASSIGNMENT #1
 * Name: (Samuel Onabolu)
 * Student #: (6783369)
 *
 */
public class LifeGame {
 //Start array info
  int [][] arr;// The array i will be reading into
  int [][] newArr; // The array i will be writing the updated state to.
  int [][] original; // Array of the initial gride state.
 int row; //3
 int col; //4
 
 public LifeGame() {
   
 /*This block of code handles the user interaction with the console.
   It uses the countNeighbours function and then updates the game state.**/
   
   String read = " ";
   loadState(read);
   printArray(arr);
   Scanner console= new Scanner(System.in);
System.out.print("How many iterations?"); 
int num =console.nextInt();
 System.out.print("# of Iterations is " + num); 
 if (num==0){
   countNeighbours();
    Update(arr,newArr); 
   countNeighbours();
    Update(arr,newArr); 
   countNeighbours();
     Update(arr,newArr); 
   countNeighbours();
    Update(arr,newArr); 
   printArray(newArr);
 
 }
 

while(num!=0){

 if (num ==1) {
    countNeighbours();
    printArray(newArr);
      
      System.out.print("How many iterations?"); 
  num =console.nextInt();
 System.out.print("# of Iterations is " + num);
    
 }
 
  else if (num ==2) {
    countNeighbours();
     Update(arr,newArr);
     countNeighbours();
   
      printArray(newArr);
       Update(arr,original);
       
        System.out.print("How many iterations?"); 
  num =console.nextInt();
 System.out.print("# of Iterations is " + num);
 
  
   
 }
  
  
    else if (num ==3) {
    countNeighbours();
       Update(arr,newArr); 
  
       
     countNeighbours();
        Update(arr,newArr); 
          countNeighbours();
          Update(arr,newArr);
           printArray(newArr);
        Update(arr,original); 
 
        System.out.print("How many iterations?"); 
  num =console.nextInt();
 System.out.print("# of Iterations is " + num);
    
 }
    
  else if(num>3){
   
   countNeighbours();
    Update(arr,newArr); 
   countNeighbours();
    Update(arr,newArr); 
   countNeighbours();
     Update(arr,newArr); 
   countNeighbours();
    Update(arr,newArr); 
   printArray(newArr);
 
     System.out.print("How many iterations?"); 
  num =console.nextInt();
 System.out.print("# of Iterations is " + num);
  }
  else{
     countNeighbours();
    Update(arr,newArr); 
   countNeighbours();
    Update(arr,newArr); 
   countNeighbours();
     Update(arr,newArr); 
   countNeighbours();
    Update(arr,newArr); 
   printArray(newArr);
 break;
  }
  
}
   console.close();
   
   
   
   

  

 
   
 }
 //This method loads in the data file, and populates all 3 arrays with the initial grid state.
 private void loadState(String filename) {
   
   
  Scanner file;
  try {
    System.out.print("Enter game filename: ");
    Scanner scan =new Scanner(System.in);
   File text = new File(scan.nextLine());
                          

            scan = new Scanner(text);
 
   


   
    
      row = scan.nextInt();
     col = scan.nextInt();
    arr= new int [row][col];
    newArr= new int [row][col];
    original= new int [row][col];
    
      for( int i = 0; i <arr.length; i++){
      for ( int j = 0; j<arr[i].length; j++){
        
        arr[i][j]=scan.nextInt();
        
    newArr[i][j]=arr[i][j];
     original[i][j]=arr[i][j];
    }
    
        
    }
      
       
      System.out.println();

       
        
       
    
  }
    
  catch (Exception exn) {
   
  }
 
 }
 // This method prints an array.

  private void printArray(int [][] array) {
    for( int i = 0; i <array.length; i++){
      for ( int j = 0; j<array[i].length; j++){
    System.out.print(array[i][j]);
    }
   System.out.print("\n");
 }
  }
 
  
  
  /* This method counts the neighbours of each direction with respect to its cell. This method uses to modulus operator
   * to implenent the wrapping. It takes the row legnth which is just arr.length plus the index % the row. Same for the 
   * collumn length which is just arr[i].length plus the index% modulus the collumn. 
   * (i+row)%row;
   * (j+col)%col;
   * 3 ROWS
   * 4 COLLUMNS */
  
  private void countNeighbours () {
      
   for(   int i = 0; i <arr.length; i++){
      for ( int j = 0; j <arr[i].length; j++){
      int deadCell = 0;
      int liveCell=0;

      
                           /*CHECKS ALL DIRECTIONS*/
        
                                  
      
      
                                   /*TOP*/    
   
    
   //Checks for an alive cell 
      if (arr[(i-1+row)%row][(j+col)%col]==1){   
  deadCell++;
 }
 
 /* Checks for an alive cell as a alive cell */ 
   if(arr[i][j]==1&&arr[(i-1+row)%row][(j+col)%col]==1){
  liveCell++;
   
   
  }
   

    
        
 
 

        
  
 
 
                                /*TOP RIGHT*/ 
  
  
   //Checks for an alive cell 
  if (arr[(i-1+row)%row][(j+1+col)%col]==1){
  deadCell++;
  
} 
  /* Checks for an alive cell as a alive cell */  
  if(arr[i][j]==1&&arr[(i-1+row)%row][(j+col)%col]==1){
  liveCell++;
 
  }
  
 
 
    
         
 
                                   /*RIGHT*/   
   
  
   //Checks for an alive cell
  
   if (arr[(i+row)%row][(j+1+col)%col]==1){
    deadCell++;
   }
   
    /* Checks for an alive cell as a alive cell */  
    if(arr[i][j]==1&&arr[(i+row)%row][(j+1+col)%col]==1){
 liveCell++;
   
  }
    

   
    
 
                                /*BOTTOM RIGHT*/ 
    
    
   //Checks for an alive cell 
    
    if (arr[(i+1+row)%row][(j+1+col)%col]==1){
  deadCell++;
   }
   
   /* Checks for an alive cell as a alive cell */ 
    if(arr[i][j]==1&&arr[(i-1+row)%row][(j+1+col)%col]==1){
  liveCell++;
   
  }
    
 
   
   
  
   /*BOTTOM*/  
    

   //Checks for an alive cell  
    
    if (arr[(i+1+row)%row][(j+col)%col]==1){
  deadCell++;
   }
   
 /* Checks for an alive cell as a alive cell */ 
     if(arr[i][j]==1&&arr[(i+1+row)%row][(j+col)%col]==1){
      
liveCell++;
    
  }
     
  
   
                               /*BOTTOM LEFT*/   
    
 
   // Checks for an alive cell
     
    if (arr[(i+1+row)%row][(j-1+col)%col]==1){
    deadCell++;
   }
     
      /* Checks for an alive cell as a alive cell */ 
    if(arr[i][j]==1&&arr[(i+1+row)%row][(j-1+col)%col]==1){  
  liveCell++;
   
  }
    
 
                                    /* LEFT*/   
      
   
    //Checks for an alive cell 
    
      if (arr[(i+row)%row][(j-1+col)%col]==1){
    deadCell++;
       
   }
       /* Checks for an alive cell as a alive cell */ 
     if(arr[i][j]==1&&arr[(i+row)%row][(j-1+col)%col]==1){
  liveCell++;
     
  }
     
   
        
       
                                  /*TOP LEFT*/    
        
   
    //Checks for an alive cell  
     
        if (arr[(i-1+row)%row][(j-1+col)%col]==1){
   deadCell++;
   }
         
          /* Checks for an alive cell as a alive cell */ 
         if(arr[i][j]==1&&arr[(i-1+row)%row][(j-1+col)%col]==1){
 liveCell++;
    
  }
         
         
  
         
         
         
         //These 4 if statments are used to determine the state of the new grid depending on the 4 rules listed below.
        
       
        //dead cell (off/0) will activate if it has precisely three live neighbours
       
         if (deadCell==3){
            
        newArr[i][j]=1;
        
         deadCell= 0;  
       
         }
       
         //A live cell with four or more live neighbours will die of irritation.
          else if (liveCell>=4){
         
        newArr[i][j]=0;
        
         liveCell= 0;  
       
         }
          //A live cell with only one or zero neighbours will die of loneliness.
          else if (liveCell==1||liveCell==0){
         
        newArr[i][j]=0;
               
         liveCell = 0;  
       
         }
          
           //live cell with exactly two or three live neighbours will stay the same (still live). 
           else if (liveCell==2||liveCell==3){
        
        newArr[i][j]=1;
       
        
        liveCell = 0;  
       
         }
          
 
  }
      
  
   }
  
    
  
   System.out.println();
  
  }
  /* This method accepts 2 arrays and assigns elements from b to a. This is used to continously iterate the array.*/
  
  private void Update(int [][] a, int [][] b) {
     
  for(  int i = 0; i <b.length; i++){
      for (int  j = 0; j<b[i].length; j++){
   
         
     a[i][j]=b[i][j];
  }
  
  }
   
  
  }
  
  
  

 public static void main(String args[]) {new LifeGame();}
}
