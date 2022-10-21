import java.util.*;


class loop1{
    public static void main(String[] args){
        System.out.println("This is sum calculator\nPress\n1 for sum of n natural no.\n2 for sum of squares of n no..\n3 for sum of cubes of n no.");
        
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
    
        switch(button){
            
            case 1: System.out.println("Please enter the no. for sum");
                    Scanner a=new Scanner(System.in);
                    int n=a.nextInt();
    
                    int sum=0; 
                    for(int j=0;j<=n;j=j+1){
                    sum=sum+j;
                    System.out.println(sum);
                    }
                    System.out.println("Final sum is:");
                    System.out.println(sum);
            break;  
            
            case 2:System.out.println("Please enter the no. for sum");
                     Scanner b=new Scanner(System.in);
                    int l=b.nextInt();
    
                    int hum=0; 
                    for(int j=0;j<=l;j=j+1){
                        int k=j*j;
                        hum=hum+k;
                        System.out.println(hum);
                    }
                    System.out.println("Final sum is:");
                    System.out.println(hum);
            break;

            case 3:System.out.println("Please enter the no. for sum");
                     Scanner c=new Scanner(System.in);
                    int p=c.nextInt();
    
                    int yum=0; 
                    for(int j=0;j<=p;j=j+1){
                        int k=j*j*j;
                        yum=yum+k;
                        System.out.println(yum);
                    }
                    System.out.println("Final sum is:");
                    System.out.println(yum);
            break;
            
            default:System.out.println("Invalid button");
            






        }               
    }
}  









    
    