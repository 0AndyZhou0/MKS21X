public class ReverseCharSeq implements CharSequence{
    public static void main(String[] args){
	/*ReverseCharSeq a = new ReverseCharSeq("hello");
	System.out.println(a);
	System.out.println(a.charAt(3));
	System.out.println(a.charAt(6));
	System.out.println(a.length());
	System.out.println(a.subSequence(0,9));*/
	ReverseCharSeq b = new ReverseCharSeq("hello");
	System.out.println(b);
	System.out.println(b.charAt(3));
	System.out.println(b.charAt(6));
	System.out.println(b.length());
	System.out.println(b.subSequence(0,9));
    }
    private String chars;
    public ReverseCharSeq(String a){
	chars = a;	a += "h";
    }
    public ReverseCharSeq(char[] a){
	chars = "";
	for (int i = a.length-1;i >= 0;i--){
	    chars += String.valueOf(a[i]);
	}
    }
    public char charAt(int index){
	try{
	    return chars.charAt(index);
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Index not found");
	}
        return ' ';
    }
    public int length(){
	return chars.length();
    }
    public CharSequence subSequence(int start, int end){
	try{
	    ReverseCharSeq a = new ReverseCharSeq(chars.substring(start,end));
	    a = new ReverseCharSeq(a.toString());
	    return a;
	}catch(IndexOutOfBoundsException e){
	    System.out.println("Indices are not valid");
	}
        return new ReverseCharSeq(" ");
    }
    public String toString(){
	return chars;
    }
}
