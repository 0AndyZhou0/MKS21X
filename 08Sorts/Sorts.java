public class Sorts{
    public static void main(String[] args){
	int[] a = new int[5];
	//for (int i = 0;i < a.length;i++){
	    //a[i] = (int)(Math.random()*100);
	//}
	a[0] = 23;
	a[1] = 16;
	a[2] = 34;
	a[3] = 1;
	a[4] = 27;
	System.out.println(toString(a));
	bubbleSort(a);	
	System.out.println(toString(a));
    }
    
    public static String name(){
	return "10.Zhou.Andy"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	for (int i = 0;i < data.length;i++){
	    int min = data[i];
	    int other = i;
	    for (int n = i;n < data.length;n++){
		if (data[n] < min){
		    min = data[n];
		    other = n;
		}
	    }
	    data[other] = data[i];
	    data[i] = min;
	}
    }

    // Swaps each time instead of shifting data elements
    public static void insertionSort(int[] data){
	for (int i = 1;i < data.length;i++){
	    for (int n = i;n > 0;n--){
		if (data[n] < data[n-1]){
		    swap(data,n,n-1);
		    //System.out.println(toString(data));  //for testing
		}
		else{
		    n = 1;
		}
	    }
	}
    }

    public static void bubbleSort(int[] data){
        while(!isSorted(data)){
	    int n = data.length;
	    for (int i = 1;i < n;i++){
		if (data[i] < data[i-1]){
		    swap(data,i,i-1);
		}
		System.out.println(toString(data));  //for testing
	    }
	    n--;
	}
    }

    private static void swap(int[] ary,int a,int b){
	int toSwap = ary[a];
	ary[a] = ary[b];
	ary[b] = toSwap;
	
    }
    
    // Checks if array is in order
    public static boolean isSorted(int[] ary){
	for (int i = 0;i < ary.length - 1;i++){
	    if (ary[i] > ary[i+1]){
		return false;
	    }
	}
	return true;
    }

    // Returns the string of an array
    public static String toString(int[] ary){
	if (ary.length < 1){
	    return "[]";
	}
	String str = "[";
	for (int i = 0;i < ary.length;i++){
	    str += ary[i] + ", ";
	}
	return str.substring(0,str.length() - 2) + "]";
    }

}
