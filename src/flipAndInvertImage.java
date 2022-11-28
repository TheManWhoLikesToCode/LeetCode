public class flipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image){
        // INPUT
        // 1 1 0
        // 0 1 0
        // 0 0 0

        // OUTPUT
        // 1 0 0
        // 0 1 0
        // 1 1 1
        int end = image.length-1;
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image.length; col++){

                int temp = image[row][col];
                image[row][col] = image[row][end];
                image[row][end] = temp;
                end--;

            }
        }

        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image.length; col++){

                // Invert the shits
                if(image[row][col] == 0){
                    image[row][col] = 1;
                }
            }
        }

        return image;
    }
}
