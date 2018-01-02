public class SuperArray{
    private String[] data;
    private int size;

    
    public SuperArray(){
	size = 0;
	data = new String[size + 10];
    }

    
    
    public int getSize(){
	return size;
    }

    public void clear(){
	data = new String[data.length];
	size = 0;
    }
    
    public int size(){
	return size;
    }
    
    public Boolean add(String value){
	if (size == data.length){
	    resize();
	}
	data[size] = value;
	size++;
	return true;
    }
    
    public String toString(){
	if (size < 1){
	    return "[]";
	}
	String str = "[";
	for (int i = 0;i < size;i++){
	    str += data[i] + ", ";
	}
	return str.substring(0,str.length() - 2) + "]";
    }
    
    public String get(int index){
	if (index < 0 || index >= size()){
	    return null;
	}
	return data[index];
    }
    
    public String set(int index, String value){
	if (!(index < 0 || index >= size())){
	    String oldValue = data[index];
	    data[index] = value;
	    return oldValue;
	}
	return "Error: Index not Valid";
    }
    
    private void resize(){
	String[] bigger = new String[size * 2];
	for (int i = 0;i < size;i++){
	    bigger[i] = data[i];
	}
	data = bigger;
    }
    
    public Boolean contains(String str){
	for (int i = 0;i < size;i++){
	    if (data[i].equals(str)){
		return true;
	    }
	}
	return false;
    }
    
    public int indexOf(String str){
       	for (int i = 0;i < size;i++){
	    if (data[i].equals(str)){
		return i;
	    }
	}
	return -1;
    }
    
    public int lastIndexOf(String str){
	for (int i = size - 1;i > 0;i--){
	    if (data[i].equals(str)){
		return i;
	    }
	}
	return -1;
    }
    
    public void add(int index,String str){
	if (index >= 0 && index < size){
	    String[] other = new String[(size + index) * 2];
	    for (int i = 0;i < index;i++){
		other[i] = data[i];
	    }
	    other[index] = str;
	    for (int i = index;i <= size;i++){
		other[i + 1] = data[i];
	    }
	    size += 1;
	    data = other;
	}
    }
    
    public String remove(int index){
	if (index < 0 || index > size){
	    return "Errorererowerwioeurwiueroi";
	}
	String removed = data[index];
	String[] other = new String[(size + index) * 2];
	for (int i = 0;i < index;i++){
	    other[i] = data[i];
	}
	for (int i = index;i <= size;i++){
	    other[i] = data[i + 1];
	}
	size -= 1;
	data = other;
	return removed;
    }
    
    public Boolean remove(String str){
	if (indexOf(str) >= 0){
	    remove(indexOf(str));
	    return true;
	}
	return false;
    }
}
