import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job {
        int id;
        int profit;
        int deadline;
        public Job(int id, int p, int deadline){
            this.id=id;
            this.profit=p;
            this.deadline=deadline;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={ {4,20}, {1,10}, {1,40}, {1,30}};
      
        ArrayList<Job>jobs=new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][1], jobInfo[i][0]));
        }
        
        //sorting of object
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit-obj1.profit); // desending order of profit

        ArrayList<Integer>seq=new ArrayList<>();
        int time =0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        // print seq
        System.out.println("Max jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
