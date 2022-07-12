import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class GraphAdjacencyMatrix extends Graph implements Explore{
    private ArrayList<ArrayList<Integer>> adjacencyMatrix;

    public GraphAdjacencyMatrix() {
     static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
//represents the number of vertices and edges
     public static void readMatrixByUser()
    {
        int m, n;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the number "
                               + "of rows of the matrix");
            m = in.nextInt();
            System.out.println("Enter the number "
                               + "of columns of the matrix");
            n = in.nextInt();
  
            // Declare the matrix
            int first[][] = new int[m][n];
  
            // Read the matrix values
            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();
  
            // Display the elements of the matrix
            System.out.println("Elements of the matrix are");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(first[n][m] + "  ");
                System.out.println();
            }
        }
        catch (Exception e) {
        }
        finally {
            in.close();
        }
    }
  
    // Driver code
    public static void main(String[] args)
    {
        readMatrixByUser();
    }
}
        try {
            adjacencyMatrix = new ArrayList<ArrayList<Integer>>();
            // Get file containing matrix
            File file = new File("graphTestFile.txt");

            Scanner fileToScan = new Scanner(file);

            while (fileToScan.hasNextLine()) {
                String currentLine = fileToScan.nextLine();
                ArrayList<Integer> buffer = new ArrayList<>();
                // input each neighbor into array
                for (int i = 0; i < currentLine.length(); i++)
                    if (currentLine.charAt(i) != ' ')
                        buffer.add((currentLine.charAt(i) - '0'));
                adjacencyMatrix.add(buffer);
            }

            System.out.println("Edges inserted into matrix");

            fileToScan.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    @Override
    public boolean IsNeighbor(int i, int j) {
    }

    @Override
    public ArrayList<Integer> neighbor(int i) {
    }

    public void BFS(int i){
    }

  
    public void DFS(int i){
    }
       public void DFS(int i){
        Stack<Integer> stack= new  Stack<Integer>();
        stack.add(i);
        boolean visitor[]= new boolean[adjacencyMatrix.size()];
        while (!stack.isEmpty())
        {
            int number=stack.pop();
            if(!visitor[number])
            {
                System.out.print(number + " ");
                visitor[number]=true;
            }
 
            ArrayList<Integer> neighbours=neighbor(i); 
            for (int k = 0; k < neighbours.size(); k++) 
            {
                int n=neighbours.get(k);
                if(n!=0 &&! visitor[n])
                {
                    stack.add(n);
                }
            }
        }
    }

}
