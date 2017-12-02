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
	    current++;
	}
	else{
	    System.exit(1);
	}
	return current - 1;
    }
     public boolean hasNext(){
	 return current <= end;
     }
}
