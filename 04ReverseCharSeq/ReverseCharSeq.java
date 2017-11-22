public class ReverseCharSeq implements CharSequence{
    private String chars;
    public ReverseCharSeq(String a){
        chars = "";
	for (int i = a.length();i > 0;i--){
	    chars += a.subString(i,i+1);
	}
    }
    public ReverseCharSeq(char[] a){
	chars = "";
	for (int i = a.length;i > 0;i--){
	    chars += String.valueOf(a[i]);
	}
    }
    public char charAt(int index){
	try{
	    return chars.charAt(index);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index not found");
	    System.exit(1);
	}
    }
    public int length(){
	return chars.length();
    }
    public CharSequence subSequence(int start, int end){
	ReverseCharSeq a = new ReverseCharSeq(chars.subString(start,end));
        a = new ReverseCharSeq(a.toString());
	return a;
    }
    public String toString(){
	return chars;
    }
}
