class maxAreaOfIsland {

  public int method1(int[][] grid) {
    int maxIsland = 0;

    //For each island return each
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 1) {
          int islandSize = 1;
          maxIsland = Math.max(sink(grid, i, j, islandSize), maxIsland);
        }
      }
    }

    return maxIsland;
  }

  public int sink(int[][] grid, int row, int col, int currentIslandSize) {
    if (row < 0 || col < 0 || row > grid.length || col > grid[0].length) {
      return 1;
    }

    grid[row][col] = 0;
    currentIslandSize++;

    sink(grid, row + 1, col, currentIslandSize);
    sink(grid, row - 1, col, currentIslandSize);
    sink(grid, row, col + 1, currentIslandSize);
    sink(grid, row, col - 1, currentIslandSize);

    return currentIslandSize;
  }
}
