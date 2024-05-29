// flood fill algorithem leedcode 733
public class Graph16 {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        int orgColor = image[sr][sc];
        helper(image, sr, sc, newColor, visited, orgColor);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int newColor, boolean[][] visited, int orgColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || visited[sr][sc] || image[sr][sc] != orgColor) {
            return;
        }

        image[sr][sc] = newColor;
        visited[sr][sc] = true;

        // left
        helper(image, sr, sc - 1, newColor, visited, orgColor);
        // right
        helper(image, sr, sc + 1, newColor, visited, orgColor);
        // up
        helper(image, sr - 1, sc, newColor, visited, orgColor);
        // down
        helper(image, sr + 1, sc, newColor, visited, orgColor);
    }

    public static void main(String[] args) {

    }
}
