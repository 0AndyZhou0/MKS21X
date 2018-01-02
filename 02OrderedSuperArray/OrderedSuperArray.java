public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
	super();
    }
    public OrderedSuperArray(int init){
	super(init);
    }
    public OrderedSuperArray(String[] ary){
	super();
	for (int i = 0;i < ary.length;i++){
	    add(ary[i]);
	}
    }
    public Boolean add(String element){
	super.add(findIndex(element),element);
	return true;
    }

    public void add(int index, String element){
	add(element);
     }
    
    public int findIndexBinary(String element){
	int index = 0;
	if(size() == 0){
	    return 0;
	}
	int start = 0;
	int end = size();
	for (int i = start;start != end;){
	    index = (start + end) / 2;
		if (element.compareTo(get(i)) > 0){
		start = index + 1;
	    }
	    else{
		end = index - 1;
	    }
	}
	if (element.compareTo(get(index)) > 0){
	     return index + 1;
	 }
	 return index;
    }
    
    public int findIndex(String element){
	int index = 0;
	for (int i = 0;i < size();i++){
	    if (index == 0 && element.compareTo(get(i)) < 0){
		index = i;
	    }
	}
	return index;
    }
}
