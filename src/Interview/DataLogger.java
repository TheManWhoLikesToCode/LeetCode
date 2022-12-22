public class DataLogger{
    public static void main(String[] args){
      int[] data = convertStringToInt(args);
      int[] normalizedData = normalizeValues(data, -50);
  
      printValues2(data, normalizedData);

      // Create a debug object and call the printValues method
        Debug debug = new Debug();
        debug.printValues(data, normalizedData);

    }
    
    public static int[] convertStringToInt(String[] dataStrings){
      int[] nums = new int[dataStrings.length];
      for(int i=0; i<dataStrings.length; i++)
        nums[i] = Integer.parseInt(dataStrings[i]);
      return nums;
    }
    
    public static int[] normalizeValues(int[] data, int offset){
      int[] nums = new int[data.length];
      for(int i=0; i<data.length; i++)
        nums[i] = data[i]+offset;
      return nums;
    }
  
    public static void printValues2(int[] data, int[] normalizedData){
      System.out.println("Original Data \t\t\t Normalized Data");
      for(int i=0; i<data.length; i++)
        System.out.println(data[i] + "\t\t\t" + normalizedData[i]);
    }
    
  }