public class Sorts{
    public static void main(String[] args){
	int[] a = new int[10];
	for (int i = 0;i < a.length;i++){
	    a[i] = (int)(Math.random()*100);
	}
	selectionSort(a);
	System.out.println(a);
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
	    for (int n = i;n < data.length;n++){
		if (data[n] < min){
		    min = data[n];
		}
	    }
	    data[i] = min;
	}
    }

    // Checks if array is in order
    // For testing
    public static boolean isSorted(int[] ary){
	for (int i = 0;i < ary.length - 1;i++){
	    if (ary[i] > ary[i+1]){
		return false;
	    }
	}
	return true;
    }

    public String toString(int[] ary){
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
