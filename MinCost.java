public class MinCost {
    public int minPathCost(int[][] cells) {
        int rows = cells.length;
        int cols = cells[0].length;

        int[][] cell = new int[rows][cols];
        cell[0][0] = cells[0][0];


        for (int j = 1; j < cols; j++) {
            cell[0][j] = cell[0][j - 1] + cells[0][j];
        }


        for (int i = 1; i < rows; i++) {
            cell[i][0] = cell[i - 1][0] + cells[i][0];
        }


        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                cell[i][j] = cells[i][j] + Math.min(cell[i - 1][j], cell[i][j - 1]);
            }
        }

        return cell[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        int[][] cells = {
                {0, 2, 1},
                {3, 7, 8},
                {1, 2, 0}
        };

        MinCost minCost = new MinCost();
        int result = minCost.minPathCost(cells);
        System.out.println(result);
    }
}
