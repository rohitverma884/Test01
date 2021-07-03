public class Loop2 {
    public static void main(String[] abc){
        Loop2 mytest = new Loop2();
        mytest.Table(1);
    }
    void Table(int c){

        for(int i=1; i<=10; i++){
            System.out.println(""+i*c);

        }
    }
}
