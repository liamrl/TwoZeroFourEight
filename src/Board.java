public class Board {

    private int[][] grid;

    public Board(){
        grid = new int[4][4];
    }

    public void nextNumAndPlace(){
        int count = 0;
        for (int[] arr : grid){
            for (int i : arr){
                if (i == 0){
                    count++;
                }
            }
        }

        int nextPlace = (int) (Math.random() * count);
        int nextNum = 2;
        if ((int) (Math.random() * 10) >= 8){
            nextNum = 4;
        }

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == 0){
                    if (nextPlace == 0){
                        grid[i][j] = nextNum;
                    }
                    nextPlace--;

                }
            }
        }


    }

    public void printBoard(){
        System.out.println();
        for (int[] arr : grid) {
            for (int i : arr) {
                if (i != 0) {
                    System.out.print(i + "  ");
                }
                else{
                    System.out.print("[] ");
                }
            }
            System.out.println();
        }
    }



    public void moveUp(){
        int k = 0;
        for (int i = 1; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (grid[i][j] != 0){
                    k = i;
                    while (k > 0 && grid[k - 1][j] == 0){
                        k--;
                    }
                    if (k != i) {
                        grid[k][j] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 1; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (grid[i][j] != 0 && (grid[i - 1][j] == grid[i][j])){
                    grid[i - 1][j] += grid[i][j];
                    grid[i][j] = 0;
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 1; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (grid[i][j] != 0){
                    k = i;
                    while (k > 0 && grid[k - 1][j] == 0){
                        k--;

                    }
                    if (k != i) {
                        grid[k][j] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }


    }

    public void moveDown(){
        int k = 0;
        for (int i = 2; i >= 0; i--){
            for (int j = 0; j < 4; j++){
                if (grid[i][j] != 0){
                    k = i;
                    while (k < 3 && grid[k + 1][j] == 0){
                        k++;
                    }
                    if (k != i) {
                        grid[k][j] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 2; i >= 0; i--){
            for (int j = 0; j < 4; j++){
                if (grid[i][j] != 0 && (grid[i + 1][j] == grid[i][j])){
                    grid[i + 1][j] += grid[i][j];
                    grid[i][j] = 0;
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 2; i >= 0; i--){
            for (int j = 0; j < 4; j++){
                if (grid[i][j] != 0){
                    k = i;
                    while (k < 3 && grid[k + 1][j] == 0){
                        k++;
                    }
                    if (k != i) {
                        grid[k][j] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }
    }

    public void moveLeft(){
        int k = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (grid[i][j] != 0){
                    k = j;
                    while (k > 0 && grid[i][k - 1] == 0){
                        k--;
                    }
                    if (k != j) {
                        grid[i][k] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (grid[i][j] != 0 && (grid[i][j - 1] == grid[i][j])){
                    grid[i][j - 1] += grid[i][j];
                    grid[i][j] = 0;
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 1; j < 4; j++){
                if (grid[i][j] != 0){
                    k = j;
                    while (k > 0 && grid[i][k - 1] == 0){
                        k--;
                    }
                    if (k != j) {
                        grid[i][k] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }


    }

    public void moveRight(){
        int k = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 2; j >= 0; j--){
                if (grid[i][j] != 0){
                    k = j;
                    while (k < 3 && grid[i][k + 1] == 0){
                        k++;
                    }
                    if (k != j) {
                        grid[i][k] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 2; j >= 0; j--){
                if (grid[i][j] != 0 && (grid[i][j + 1] == grid[i][j])){
                    grid[i][j + 1] += grid[i][j];
                    grid[i][j] = 0;
                    //printBoard();
                    //System.out.println();
                }
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 2; j >= 0; j--){
                if (grid[i][j] != 0){
                    k = j;
                    while (k < 3 && grid[i][k + 1] == 0){
                        k++;
                    }
                    if (k != j) {
                        grid[i][k] = grid[i][j];
                        grid[i][j] = 0;
                    }
                    //printBoard();
                    //System.out.println();
                }
            }
        }




    }


}
