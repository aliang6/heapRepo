// Shariar Kabir, Owen Zeng, Andy Liang
// APCS2 pd5
// HW #46: Running M[edi]an
// 2016-05-24


/*****************************************************
 * class RunMed
 * Implements an online algorithm to track the median of a growing dataset
 * Maintains 2 heaps: minheap for upper half of dataset, maxheap for lower half
 * Median will always be one of these:
 *  - max of left heap  (lower range)
 *  - min of right heap (upper range)
 *  - mean of heap roots
 *****************************************************/

public class RunMed {

    //instance vars
    private MaxHeap leftHeap;  //for lower range of dataset
    private MinHeap rightHeap; //for upper range of dataset


    /*****************************************************
     * default constructor  ---  inits empty heap
     *****************************************************/
    public RunMed() 
    { 
      leftHeap=new MaxHeap();
      rightHeap=new MinHeap();
    }//O(1)



    /*****************************************************
     * double getMedian()  ---  returns median of dataset
     *****************************************************/
    public double getMedian() 
    {
      int sumEle= (leftHeap._heap.size() + rightHeap._heap.size());
      if ((sumEle % 2)==1 && rightHeap._heap.size() > leftHeap._heap.size()){
        return rightHeap.peekMin();
      }
      else{
        return leftHeap.peekMax();
      
      }
    }//O(1)



    /*****************************************************
     * insert(int)  ---  adds a new element to the dataset
     * postcondition: dataset is maintained such that 
     *                getMedian() can run in constant time
     *****************************************************/
    public void insert( int addVal )
    {   
      if (rightHeap.isEmpty() && rightHeap.peekMin() < addVal){
        rightHeap.add(addVal);
      }
      else{
        leftHeap.add(addVal);
      }
      int Ele= (leftHeap._heap.size() + rightHeap._heap.size());
        
      
      
      
      
     }//O(?)



    /*****************************************************
     * boolean isEmpty()  ---  tells whether a median may be calculated
     * postcondition: dataset structure unchanged
     *****************************************************/
    public boolean isEmpty() 
    {
      if (rightHeap.isEmpty() && leftHeap.isEmpty()){
        return true;
      
      }
      return false;
    }//O(?)



    //main method for testing
    public static void main( String[] args ) {


        RunMed med = new RunMed();
        med.insert(1);
         /*~~~V~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~V~~~
 System.out.println( med.getMedian() ); //1
        med.insert(3);
 System.out.println( med.getMedian() ); //2
        med.insert(5);
 System.out.println( med.getMedian() ); //3
        med.insert(7);
 System.out.println( med.getMedian() ); //4
        med.insert(9);
 System.out.println( med.getMedian() ); //5
 ~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~*/

    }//end main()

}//end class RunMed



    /*****************************************************
     * 
     *****************************************************/
    // (  )
    // {
    //  /*** YOUR IMPLEMENTATION HERE ***/
    // }//O(?)