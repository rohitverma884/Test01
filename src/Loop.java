public class Loop {
    public static void main(String[] abc){
        for(int i=2; i<=21 ; i++){
            System.out.println("i value= "+i+" i*2="+i*2);

        }
        int i=2;
        for(;i<=21;){
            System.out.println(""+i);
            i=i+2;
            //System.out.println(""+i);
            if (i==12){
                break;
            }


        }
    }
}
