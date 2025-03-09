public class jaggedAnd3DArray {
    public static void main(String[] args) {
        
        int nums[][] = new int[3][]; //jagged

        nums[0] = new int[3]; //[][][]
        nums[1] = new int[4]; //[][][][]
        nums[2] = new int[2]; //[][]

        //Assigning
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*10);
            }
        }

        // printing
        for(int n[]:nums){
            for(int m: n){
                System.out.print(m+" ");
            }
            System.err.println();
        }


        // 3D array
        // int numbs[][][] = new int[3][4][2];

        // add another loop k=0 and add randoms
        // add another loop k=0 to print/fetch values

        /*Advantage of Array
         * 
         * Every time you know you have a fixed size
            and if you want to store multiple values,
            array will be the first preference.
         */

        /*Disadvantage of Array
         * inside the heap memory, it will occupy a space,
            and the memory location it will take,
            it's continuous, okay?
            Which means it will simply occupy the space continuously.
            And the problem with this is once you specify the size here,
            you cannot go back.
         */
    }
}
