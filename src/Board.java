public class Board {

    private int[][] grid;

    public Board(){
        grid = new int[4][4];
    }

    public void nextNum(){
        int count = 0;
        for (int[] arr : grid){
            for (int i : arr){
                if (i == 0){
                    count++;
                }
            }
        }

        int nextPlace = (int) (Math.random() * count);
    }
}
