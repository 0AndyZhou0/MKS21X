import java.util.*;
import java.io.*;
public class WordSearch{
    private char[][]data;
    private ArrayList<String> wordsToAdd;
    private ArrayList<String> wordsAdded;
    private Random randgen;
    private char[][]key;

    /**Initialize the grid to the size specified 
     *fill all of the positions with '_'
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols,String fileName){
	wordsToAdd = new ArrayList<String>();
	wordsAdded = new ArrayList<String>();
	randgen = new Random();
	data = new char[rows][cols];
	key = new char[rows][cols];
	for (int i = 0;i < data.length;i++){
	    for (int n = 0;n < data[i].length;n++){
		data[i][n] = '_';
	    }
	}
	try{
	    File words = new File(fileName);
	    Scanner in = new Scanner(words);
	    while(in.hasNext()){
		String word = in.next();
		wordsToAdd.add(word);
	    }
	}catch(FileNotFoundException e){
	    System.out.println("File not found: " + fileName);
	    System.exit(1);
	}
	addAllWords();
	mkKey();
	addLetters();
    }
    
    /*runs a normal word search with a certain seed
     */
    public WordSearch(int rows,int cols,String fileName,int randSeed){
	this(rows,cols,fileName);
	clear();
	randgen = new Random(randSeed);
	wordsAdded = new ArrayList<String>();
  	addAllWords();
	mkKey();
	addLetters();
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
	for (int i = 0;i < data.length;i++){
	    for (int n = 0;n < data[i].length;n++){
		data[i][n] = '_';
	    }
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
	String ary = "";
	for (int i = 0;i < data.length;i++){
	    for (int n = 0;n < data[i].length;n++){
	        ary += data[i][n] + " ";
	    }
	    ary += "\n";
	}
	return ary;
    }

    /*toString for the words for the word search at the bottom
      there are 4 words in each row
     */
    public String listWords(){
	String ary = "";
	for (int i = 0;i < wordsAdded.size() / 4;i++){
	    for (int n = 0;n < 4;n++){
		ary += wordsAdded.get(i*4+n) + " ";
	    }
	    ary += "\n";
	}
	for (int i = wordsAdded.size() % 4;i > 0;i--){
	    ary += wordsAdded.get(wordsAdded.size()-i) + " ";
	}
	return ary;
    }

    /*adds one word to a puzzle based on starting locations and direction of movement
     */
    private boolean addWord(int r, int c, String word, int rowIncrement, int colIncrement){
	for (int i = 0;i < word.length();i++){
	    int row = r+i*rowIncrement;
	    int col = c+i*colIncrement;
	    if (row >= data.length || col >= data[0].length ||
		row < 0 || col < 0 ||
	    	(data[row][col] != '_'&& data[row][col] != word.charAt(i))){
	    	return false;
	    }
	}
	for (int i = 0;i < word.length();i++){
	    int row = r+i*rowIncrement;
	    int col = c+i*colIncrement;
	    data[row][col] = word.charAt(i);
	}
	wordsAdded.add(word);
	return true;
    }

    /*runs all words through add words with random starting locations and
      directions of movement
     */
    private boolean addAllWords(){
	for (int i = 0;i < wordsToAdd.size();i++){
	    for (int x = 0;x < 1000;x++){
		int row = randgen.nextInt(data.length);
		int col = randgen.nextInt(data[0].length);
		int rowInc = randgen.nextInt(3)-1;
		int colInc = randgen.nextInt(3)-1;
		if (rowInc == 0 && colInc == 0){
		    rowInc = 1;
		}
		if (addWord(row,col,wordsToAdd.get(i),rowInc,colInc)){
		    x = 1000;
		}
	    }
	}
        return wordsAdded.size() == wordsToAdd.size();
    }

    /* Prints the random letters in the word search
       not perfect so there might be, on rare ocassions, duplicate words made from random sorting.
     */
    private void addLetters(){
	for (int i = 0;i < data.length;i++){
	    for (int n = 0;n < data[i].length;n++){
		if (data[i][n] == '_'){
		    data[i][n] = (char)((int)'a' + randgen.nextInt(26));
		}
	    }
	}
    }

    public void mkKey(){
        for (int i = 0;i < data.length;i++){
	    for (int n = 0;n < data[i].length;n++){
	        key[i][n] = data[i][n];
	    }
	}
    }
    
    /* Simply returns the answerkey
     */
    public String getKey(){
        String ary = "";
	for (int i = 0;i < key.length;i++){
	    for (int n = 0;n < key[i].length;n++){
	        ary += key[i][n] + " ";
	    }
	    ary += "\n";
	}
	return ary;
    }
    public static void main(String[] args){
	if (args.length == 1 || args.length == 2 || args.length > 5){
	    System.out.println("Driver only takes 0, 3, 4, or 5 inputs");
	    System.exit(1);
	}
	if (args.length == 0){
	    WordSearch a = new WordSearch(20,20,"words.txt");
	    System.out.println(a);
	    System.out.println(a.listWords());
	    System.exit(1);
	}
	try {
	    int[] num = new int[Integer.parseInt(args[0])];
	}catch(NumberFormatException a){
	    System.out.println("Rows must be a positive integer");
	    System.exit(1);
	}catch(NegativeArraySizeException a){
	    System.out.println("Rows must be a positive integer");
	    System.exit(1);
	}
	try {
	    int[] num = new int[Integer.parseInt(args[1])];
	}catch(NumberFormatException a){
	    System.out.println("Columns must be a positive integer");
	    System.exit(1);
	}catch(NegativeArraySizeException a){
	    System.out.println("Columns must be a positive integer");
	    System.exit(1);
	}
	if (args.length == 3){
	    WordSearch a = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),args[2]);
	    System.out.println(a);
	    System.out.println(a.listWords());
	    System.exit(1);
	}
	try {
	    int a = Integer.parseInt(args[3]);
	}catch(NumberFormatException a){
	    System.out.println("Seed must be an Integer");
	    System.exit(1);
	}
	if (args.length == 4){
	    WordSearch a = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),
					  args[2],Integer.parseInt(args[3]));
	    System.out.println(a);
	    System.out.println(a.listWords());
	    System.exit(1);
	}
	if (!args[4].equals("key")){
	    System.out.println("To recieve key, type in key in fifth space");
	    System.exit(1);
	}
	if (args.length == 5){
	    WordSearch a = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),
					  args[2],Integer.parseInt(args[3]));
	    System.out.println(a.getKey());
	    System.out.println(a.listWords());
	    System.exit(1);
	}
    }
}

