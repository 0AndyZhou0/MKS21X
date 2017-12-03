import java.util.*;
import java.io.*;
public class SuperArrayIterator implements Iterator<String>{
    int current, end;
    public SuperArrayIterator(int start,int end){
	current = start;
	this.end = end;
    }
    public String next(){
	if (hasNext()){
	    return data.get(current++);
	}
	else{
	    System.exit(0);
	}
    }
     public boolean hasNext(){
	 return current <= end;
     }
}
