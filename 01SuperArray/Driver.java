public class Driver{
    public static void main(String[] args){
	SuperArray arr = new SuperArray();

      System.out.println(arr);//[]
      for (int i=1;i<25;i+=2){
        arr.add(i + "");
      }
      System.out.println(arr);//[1,3,5,7,9,11,13,15,17,19,21,23]

      System.out.println(arr.get(2));//5
      System.out.println(arr.get(3));//7
      System.out.println(arr.get(23));//Error

      System.out.println(arr.set(1,"pokemon"));//3
      System.out.println(arr.set(5,"ninja"));//11
      System.out.println(arr.set(-2,"hello"));//Error
      System.out.println(arr);
      //[1,pokemon,5,7,9,ninja,13,15,17,19,21,23]

      arr.clear();
      System.out.println(arr);//[]

      for (int i=3;i<2000;i*=-7){
        arr.add(i+"");
        System.out.print(arr+"\n");
        //[3],[3,-21],[3,-21,147],[3,-21,147,-1029]
      }
      arr.add("-21");
      System.out.println(arr);//[3,-21,147,-1029,-21]

      System.out.println(arr.contains("20"));//false
      System.out.println(arr.contains("147"));//true

      System.out.println(arr.indexOf("-21"));//1
      System.out.println(arr.indexOf("hello"));//-1
      System.out.println(arr.lastIndexOf("-21"));//4
      System.out.println(arr.lastIndexOf("hi"));//-1

      arr.add(2,"mcDonalds");
      System.out.println(arr);//[3,-21,mcDonalds,147,-1029,-21]

      for (int i=0;i<7;i++){
        arr.add(2,i+"");
      }
      System.out.println(arr);
      //[3,-21,6,5,4,3,2,1,0,-21,mcDonalds,147,-1029,-21]

      arr.add(999,"this isnt suppose to be here");//Error
      System.out.println(arr);
       //[3,-21,6,5,4,3,2,1,0,-21,mcDonalds,147,-1029,-21]


      System.out.println(arr.remove(3));//5
      System.out.println(arr);
      //[3,-21,6,5,3,2,1,0,-21,mcDonalds,147,-1029,-21]

      System.out.println(arr.remove(100));//Error
      System.out.println(arr.remove("-21"));//true
      System.out.println(arr);
      //[3,-21,6,5,3,2,1,0,mcDonalds,147,-1029,-21]

      System.out.println(arr.remove("105"));//false
      System.out.println(arr);
      //3,-21,6,5,3,2,1,0,mcDonalds,147,-1029,-21]
    }
}
