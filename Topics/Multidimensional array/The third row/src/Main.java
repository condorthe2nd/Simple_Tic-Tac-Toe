class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        int i = 0;
        for (int[] row : twoDimArray) {
            i++;
            if (i == 3) {
                for (int a : row) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}