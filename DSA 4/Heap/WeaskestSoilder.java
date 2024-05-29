import java.util.PriorityQueue;

public class WeaskestSoilder {
    static class Row implements Comparable<Row> {
        int soilders; // no of 1
        int index;

        public Row(int soilders, int index) {
            this.soilders = soilders;
            this.index = index;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soilders == r2.soilders) {
                return this.index - r2.index;
            } else {
                return this.soilders - r2.soilders;
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };

        int k = 2; // 2 weakest
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < army.length; i++) {
            int count = 0; /// count no of 1
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Row(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().index);
        }
    }
}
