import java.util.*;


/**
Time: O(wh) w = width of graph, h = height of graphs
Space: O(wh) w = width of graph, h = height of graphs

Problem can also be solved using DFS recurisvely or iteatiavely with an actual stack DS

**/ 

public class Playground {

    public static void main(String [] args){
        int[][] input = {
                {1, 0, 0, 1, 0},
                {1, 0, 1, 0, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 0},
        };

       List<Integer> output = riverSizes(input);
        System.out.println(output);
      
      //Output should be [2, 1, 5, 2, 2] - Problem specified it could be any order 


    }

    public static List<Integer> riverSizes(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        ArrayList<Integer> results = new ArrayList<>();
        int currentRiverSize = 0;
        for( int i = 0; i< matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (visited[i][j]){
                    continue;
                }
                if(matrix[i][j] == 0){
                    visited[i][j] = true;
                    continue;
                }

                if(matrix[i][j] == 1 && visited[i][j] == false){
                    BFS(matrix, results, currentRiverSize, visited, i, j);
                }
            }
        }
        return results;
    }

    private static ArrayList<Integer> BFS(int[][] matrix, ArrayList<Integer> results, int currentSize, boolean[] [] visited, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        int [] nodeLocations = new int [2];
        nodeLocations[0] = i;
        nodeLocations [1] = j;
        q.add(nodeLocations);
        while(q.size() != 0){
            int[] current = q.poll();
            i = current[0];
            j = current[1];
                if (matrix[i][j] == 1 && visited[i][j] == false){
                    currentSize++;
                    visited[i][j] = true;

                  
                 /** The following code could be put in a helper function for optimzation**/ 
                  
                    // check if up exists and unvisited
                    if( i > 0 && visited[i-1][j] == false){
                        q.add(new int [] {i-1, j});
                    }

                    // check if down exists and unvisited
                    if(i < matrix.length -1 && visited[i+1][j] == false){
                        q.add(new int [] {i+1, j});
                    }

                    // check if left exists and unvisited

                    if(j > 0 && visited[i][j-1] == false){
                        q.add(new int [] {i, j-1});
                    }

                    // check if right exists and unvisited
                    if(j < matrix[0].length - 1 && visited[i][j+1] == false){
                        q.add(new int [] {i, j+1});
                    }
                }

                else if (matrix[i][j] == 0 && visited[i][j] == false){
                    visited[i][j] = true;
                }

                else{
                    continue;
                }
            }
      
      //river size will atleast be 1 so no need to check if zero before adding 
        results.add(currentSize);
        currentSize = 0;
        return results;
    }
}
