import java.util.Scanner;
public class Problem2{ 

        public static int nextBin(int weight[], int n, int c) { 

                

                int res = 0, bin_rem = c; 

                for (int i = 0; i < n; i++) { 
                        
                        if (weight[i] > bin_rem) { 
                                res++; 
                                bin_rem = c - weight[i]; 
                        } 
                        else
                                bin_rem -= weight[i]; 
                        if((weight[i]+bin_rem)==10){
                                System.out.println("Containerres "+res+" contains objects with weight "+ weight[i]+" "+bin_rem);
                                
                        }

                } 
                return res; 
        } 

        
        public static void main(String[] args) { 

            int c = 10; 

            System.out.println("Enter the number of objects: ");

            Scanner Kb = new Scanner(System.in);

            int n = Kb.nextInt();
            System.out.println("Enter the weights of the objects:");
            int []ojects = new int[n];
            for(int i=0; i<n; i++)
                ojects[i] = Kb.nextInt();

                
                System.out.println("Number of bins required : " + nextBin(ojects, n, c)); 
        } 
} 