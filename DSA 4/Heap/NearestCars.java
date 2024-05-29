import java.util.PriorityQueue;

public class NearestCars {
    static class Point implements Comparable<Point>{ 
        int x; // all attributes of a car
        int y;
        int distSq;
        int i;
       public Point(int x, int y, int distSq, int i){
         this.x=x;
         this.y=y;
         this.distSq=distSq;
         this.i=i;
       }
       @Override
       public int compareTo(Point p2){
        return this.distSq-p2.distSq;  // acesnding
       }
    }
    public static void main(String[] args) {
        int points[][]={ {3,3}, {5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq =new PriorityQueue<>();
        for(int i=0;i<points.length;i++){ // add to pq
            int distSq=points[i][0]*points[i][0]+points[i][1]*points[i][1]; // x2+y2
            pq.add(new Point(points[i][0], points[i][1], distSq, i));
        }
        // print nearest k cars
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().i);
        }
    }
}
