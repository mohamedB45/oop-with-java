public class ex04 {

      public static void main(String[] args) {
       int i,j; 
        for(i=0;i<3;i++){
           for(j=0;j<3+i;j++){
            if(j<2-i)
                System.out.print(" ");
            else
                System.out.print("*");
           }
           System.out.print(\n);
        }
    }
}
