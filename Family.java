
/**
 * This code calculates the gender population within families.
 *
 * @Ruhtie Dignan 
 * @11/17/20 
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Family {
    
    public static void main(String[] args) throws IOException {
    //declaring variables
    int GG = 0;
    int BG = 0;
    int BB = 0;
    int GB = 0;
    int count = 0;
    
    //reading tokens
    File fileName = new File("maleFemaleInFamily.txt");
    Scanner inFile = new Scanner(fileName);
       
        while (inFile.hasNext())
           {
              String token = inFile.next();
              if (token.equals("BB"))
              {
                  BB++;
                  count++;
    
              }
                else if (token.equals("GG"))
              {
                  GG++;
                  count++;
              }
                else if (token.equals("GB"))
              {
                  GB++;
                  count++;
              }
    }  
    int size = count;
    int totalGB = GB + BG;
    
    double GGPercent = GG / (double)size*100;
    double BBPercent = BB / (double)size*100;
    double totalGBPercent = GB + BG / (double)size*100;
    
    //printing results
    System.out.println("Sample size : " + size);
    System.out.println(" ");
    System.out.println("Families with two boys: " + BB);
    System.out.println("Families with two boys represents " + BBPercent + "%");
    System.out.println(" ");
    System.out.println("Families with two girls: " + GG);
    System.out.println("Families with two girls represents " + GGPercent + "%");
    System.out.println(" ");
    System.out.println("Families with one boy and one girl: " + GB);
    System.out.println("Families with one boy and one girl represents " + totalGBPercent + "%");
    
  
    
    }
}