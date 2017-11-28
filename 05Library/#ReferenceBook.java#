Class ReferenceBook extends LibraryBook{
    private String collection;
    public referenceBook(String a,String t,String ISBN,String callNum,String collection){
	super(a,t,ISBN,callNum);
	this.collection = collection;
    }
    public String getCollection(){return collection;}
    public void setCollection(String collection){this.collection = collection;}
    public void checkOut(){
	System.out.println("cannot check out a reference book");
    }
    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible");
    }
    public String circulationStatus(){
	return "non-circulating reference book";
    }
    public String toString(){
	return super.toString() + ", " + getCollection;
    }
}
