public class arr {
    public static void main(String[] args) {

        int[][] marks = {
                { 85, 90, 80 },
                { 75, 88, 92 },
                { 95, 82, 89 }
        };

        for(int i =0;i<marks.length;i++){

            for(int j = 0;j<marks[i].length;j++){
                System.out.println(marks[i][j]);
            }
        }

    }
}