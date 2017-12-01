public class Barcode{
    public static void main(String[] args){
	Barcode a = new Barcode("12490");
	System.out.println(a.getZip());
    }
    private String[] symbols;
    private String zip;
    public Barcode(String zip){
	this.zip = zip;
	String[] symbols = {"||:::",":::||","::|:|","::||:",":|::|",
		   ":|:|:",":||::","|:::|","|::|:","|:|::"};
    }
    public String getZip(){
	return zip;
    }
    public String getCode(){
	return "You Suck";
    }
    public String toString(){
	return "You are sucks";
    }
    public int compareTo(Barcode other){
	return 0;
    }
    public boolean equals(Barcode other){
	return false;
    }
    private String getChecksum(){
	return "String";
    }
    private String convertZip(){
	return "barcode";
    }
    private String getSymbol(char num){
	return symbols[valueOf(num)];
    }
}
