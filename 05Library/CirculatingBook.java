Class CirculatingBook extends LibraryBook{
    private String currentHolder, dueDate;
    public CirculatingBook(String a,String t,String ISBN,String callNum){
	super(String a,String t,String ISBN,String callNum);
    }
    public void checkout(){
    }
    public void returned(){
    }
    public String circulationStatus(){
    }
    public String toString(){
    }
}
