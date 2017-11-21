public class OrderedSuperArray extends SuperArray{
    public Boolean add(String element){
	super.add(findIndexBinary(element),element);
	return true;
    }
    public int findIndexBinary(String element){
	if(size() == 0){
	    return 0;
	}
	int start = 0;
	int end = size() - 1;
	int index = 0;
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
	    if (element.compareTo(get(i)) > 0){
		index = i;
	    }
	}
	return index;
    }
}
