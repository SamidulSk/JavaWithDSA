import java.util.*;

public class BusRouteConnectivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the number of stops in Route A
        int N = sc.nextInt();
        // Reading the number of stops in Route B
        int M = sc.nextInt();
        
        // Reading stops for Route A
        List<Integer> routeA = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            routeA.add(sc.nextInt());
        }
        
        // Reading stops for Route B
        List<Integer> routeB = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            routeB.add(sc.nextInt());
        }
        
        // Reading source and destination stops
        int source = sc.nextInt();
        int destination = sc.nextInt();
        
        // Check if travel is possible
        boolean isReachable = canTravel(routeA, routeB, source, destination);
        
        if (isReachable) {
            System.out.println("Yes, travel is possible.");
        } else {
            System.out.println("No, travel is not possible.");
        }
        
        sc.close();
    }
    
    public static boolean canTravel(List<Integer> routeA, List<Integer> routeB, int source, int destination) {
        // Check if both source and destination are on the same route
        if (isReachableInRoute(routeA, source, destination) || isReachableInRoute(routeB, source, destination)) {
            return true;
        }
        
        // Check for merging points
        Set<Integer> commonStops = new HashSet<>(routeA);
        commonStops.retainAll(routeB);
        
        // If no common stops, no way to merge
        if (commonStops.isEmpty()) {
            return false;
        }
        
        // Check if source can reach any common stop and from common stop to destination
        for (int stop : commonStops) {
            if (isReachableInRoute(routeA, source, stop) && isReachableInRoute(routeB, stop, destination)) {
                return true;
            }
            if (isReachableInRoute(routeB, source, stop) && isReachableInRoute(routeA, stop, destination)) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean isReachableInRoute(List<Integer> route, int source, int destination) {
        int start = route.indexOf(source);
        int end = route.indexOf(destination);
        
        // If either source or destination is not on the route
        if (start == -1 || end == -1) {
            return false;
        }
        
        // Check if destination comes after or is the same as source
        return start <= end;
    }
}
