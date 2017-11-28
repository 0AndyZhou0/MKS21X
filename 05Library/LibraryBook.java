abstract Class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    public LibraryBook(String author,String title,String ISBN,String callNum){
	super(author,title,ISBN);
	callNumber = callNum;
    }
    public String getCallNum(){return callNumber;}
    public void setCallNum(String callNum){callNumber = callNum;}
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    public int compareTo(LibraryBook other){
	return getCallNum().compareTo(other.getCallNum());
    }
    public String toString(){
	return super.toString() + ", " getcirculationStatus() + ", " + getCallNum();
    }
}
