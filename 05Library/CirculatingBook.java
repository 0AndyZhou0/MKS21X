public class CirculatingBook extends LibraryBook{
    private String currentHolder, dueDate;
    public CirculatingBook(String a,String t,String ISBN,String callNum){
	super(a,t,ISBN,callNum);
    }
    public String getCurrentHolder(){
	return currentHolder;
    }
    public String getDueDate(){
	return dueDate;
    }
    public void checkout(String name,String dateDue){
	currentHolder = name;
	dueDate = dateDue;
    }
    public void returned(){
	currentHolder = null;
	dueDate = null;
    }
    public String circulationStatus(){
	if (dueDate == null){
	    return "book available on shelves";
	}
	else{
	    return currentHolder + ": " + dueDate;
	}
    }
    public String toString(){
	return super.toString() + circulationStatus();
    }
}
