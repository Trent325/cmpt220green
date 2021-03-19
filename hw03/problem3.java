public class problem3 {

    public static void main(String[] args) {

        double x =0.0;
        double y = 0.0;
        double d = 0.0;

        boolean IsInCircle = false;

        while(!IsInCircle){

        x = (Math.random()*5)-0; 
        y = (Math.random()*5)-0; 

        d = Math.abs(Math.pow(Math.pow(x,2) + Math.pow(y,2),0.5));

          if(25 > d) {

              IsInCircle = true;

          }


        }

        System.out.println("The point is ("+ x +","+ y +") and its distance to the center is "+ d);




        
    
      }
    
}
