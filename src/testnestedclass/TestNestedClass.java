/*
 * First test Class
 */
package testnestedclass;

/**
 *First test Class
 * @author asus
 */
public class TestNestedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("First test Nested Class 8");
        
        int Woman = 5;
        System.out.println("My int is "+Woman);

                
        Mother one = new Mother(0);
        
        int size = one.getListOfBabies().size();
         System.out.println("No. of Babies of Mother one = "+ size);
         
                
    }
    
}
