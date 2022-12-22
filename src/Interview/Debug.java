public class Debug{
    
    public void printValues(int[] data, int[] normalizedData){
      System.out.println("Original Data \t\t\t Normalized Data");
      for(int i=0; i<data.length; i++)
        System.out.println(data[i] + "\t\t\t" + normalizedData[i]);
    }
    
  }