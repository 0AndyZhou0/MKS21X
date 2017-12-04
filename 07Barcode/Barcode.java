public class Barcode{
    public static void main(String[] args){
        Barcode a = new Barcode("11245");
	Barcode b = new Barcode("38760");
	Barcode c = new Barcode("11245");
	Barcode d = new Barcode("00294");
	
	System.out.println(a.getZip());//11245
	System.out.println(d.getZip());//00234
	System.out.println(a.getCode());// |:::||:::||::|:|:|::|:|:|:::||:|
	System.out.println(a);// 11245 : |:::||:::||::|:|:|::|:|:|:|
	System.out.println(b);// 38760 : |::||:|::|:|:::|:||::||:::|
	System.out.println(c);// 11245 : |:::||:::||::|:|:|::|:|:|:|
	System.out.println(d);// 00294 : |||:::||:::::|:||:|:::|::||
	System.out.println(a.compareTo(b));// negative
	System.out.println(a.compareTo(c));// 0
	System.out.println(d.compareTo(b));// positive
	System.out.println(a.equals(b));// false
	System.out.println(a.equals(c));// true
	System.out.println(a.equals(d));// false
    }
    private String[] symbols = {"||:::",":::||","::|:|","::||:",":|::|",
		   ":|:|:",":||::","|:::|","|::|:","|:|::"};
    private String zip;
    public Barcode(String zip){
	if (zip.length() != 5){
	    throw new IllegalArgumentException();
	}
	this.zip = zip;
    }

    // prints out the given zip
    public String getZip(){
	return zip;
    }

    //print out the barcode associated with the zip
    public String getCode(){
        return toCode(zip);
    }

    // prints bother the zip and the barcode
    public String toString(){
	return getZip() + " : " + getCode();
    }
 
    // compares the checksums of both barcodes
    // positive means this checksum is larger
    // negative means it's smaller
    // 0 means they're equal
    public int compareTo(Barcode other){
	return getChecksum().compareTo(other.getChecksum());
    }

    // returns true is checksums are equal
    public boolean equals(Barcode other){
	return getChecksum().equals(other.getChecksum());
    }

    // returns sum of digits (mod 10)
    private String getChecksum(){
	int sum = 0;
        for (int i = 0;i < zip.length();i++){
	    sum += Character.getNumericValue(zip.charAt(i));
	}
	return "" + (sum%10);
    }

    // returns the number in a certain index
    private String getSymbol(char num){
	return symbols[Character.getNumericValue(num)];
    }

    // returns code for any given zip
    public String toCode(String zip){
	String code = "";
	for (int i = 0;i < zip.length();i++){
	    code += getSymbol(zip.charAt(i));
	}
	return "|" + code + "|";
    }

    public String toZip(String code){
	if (code.length() % 5 != 0){
	    throw new IllegalArgumentException();
	}
	return "";
    }
}
