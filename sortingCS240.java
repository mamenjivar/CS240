//iterative selective sort

/**
  Sorting Array (ascending order) using SELECTION SORT (iterative approach)
  @param array unsorted array
*/
public static void iterativeSelectiveSort()
{
  for (int i = 0; i < array.length - 1; i++)
  {
    for(int j = i + 1; j < array.length - 1; j++)
    {
      //SWAP if smaller
      if(array[j] < array[i])
      {
        int smallNum = array[j];
        array[j] = array[i];
        array[i] = smallNum;
      }
    }
  }
}

/**
  Sorting Array (ascending order) using SELECTION SORT (recursive approach)
  @param array unsorted array
*/

//compareIndex = j
//startIndex = i
//for referene
public static void recursiveSelectiveSort(int[] array, int startIndex, int compareIndex)
{
  //base case when you reach the end of the array
  if(startIndex == array.length - 1)
  {
    return;
  }
  //SWAP
  if(array[compareIndex] < array[startIndex])
  {
    int smallNum = array[compareIndex];
    array[compareIndex] = array[startIndex];
    array[startIndex] = smallNum;
  }
  compareIndex++;

  //reset pointers of compareIndex reaches end of array
  if(compareIndex == array.length - 1)
  {
    startIndex++;
    compareIndex = startIndex + 1;
  }
  recursiveSelectiveSort(array, startIndex, compareIndex);
}

/**
  Sorting Array (ascending order) using INSERTION SORT (iterative approach)
  @param array unsorted array
*/
public static void iterativeInsertionSort(int[] array)
{
  //i = orange pointer
  for(int i = 1; i < array.length; i++)
  {
    int sortedElement = array[i];
    int j = i - 1; //purple pointer

    while( (j >= 0) && (sortedElement < array[j]) )
    {
      //SHIFT
      array[j + 1] = array[j];
      j--;
    }
    //inserting sortedElement in proper location of array
    array[j + 1] = sortedElement;
  }
}

/**
  Sorting Array (ascending order) using INSERTION SORT (recursive approach)
  @param array unsorted array
  @param i pointer to first element in unsorted array
*/

public static void recursiveInsertionSort(int[] array, int i)
{
  //look at iterative approach for hints, Using same variable names!
  //j = initially points to last element in sorted array
  int j = i - 1;
  int sortedElement = array[i]; //data figures out where to go

  //base case
  if(i > 1)
  {
    recursiveInsertionSort(array, i - 1);
  } else{
    while ((j >= 0) && (sortedElement < array[j]))
    {
      array[j + 1] = array[j];
      j--;
    }
  }
  //inserting sortedElement in proper location of array
  array[j + 1] = sortedElement;
}

//STACK implementation
//fixed sized array
public boolean isEmpty()
{
  return topIndex < 0;
}

public void push(T newEntry)
{
  checkInitialization();
  ensureCapacity();
  stack[topIndex + 1] = newEntry;
  topIndex++;
} //end push

public T peek()
{
  checkInitialization();
  if(isEmpty()){
    throw new EmptyStackException();
  } else{
    return stack[topIndex];
  }
} //end peek
