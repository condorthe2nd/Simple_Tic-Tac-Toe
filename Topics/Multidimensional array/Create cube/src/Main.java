class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] a = new int[3][3][3];
        int count;

        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = count++;
                }
            }
        }
        return a;
    }
}
