import java.util.*;
class RideSharingSystem {
    private Queue<Integer> riderQueue;
    private Queue<Integer> driverQueue;
    private Set<Integer> waitingRiders;
    public RideSharingSystem() {
        riderQueue = new LinkedList<>();
        driverQueue = new LinkedList<>();
        waitingRiders = new HashSet<>();
    }
    public void addRider(int riderId) {
        int rimovexalu = riderId;
        riderQueue.offer(rimovexalu);
        waitingRiders.add(rimovexalu);
    }
    public void addDriver(int driverId) {
        int rimovexalu = driverId;
        driverQueue.offer(rimovexalu);
    }
    public int[] matchDriverWithRider() {
        while (!riderQueue.isEmpty() && !waitingRiders.contains(riderQueue.peek())) {
            riderQueue.poll();
        }
        if (riderQueue.isEmpty() || driverQueue.isEmpty()) {
            return new int[] { -1, -1 };
        }
        int driverId = driverQueue.poll();
        int riderId = riderQueue.poll();
        waitingRiders.remove(riderId);
        return new int[] { driverId, riderId };
    }
    public void cancelRider(int riderId) {
        int rimovexalu = riderId;
        waitingRiders.remove(rimovexalu);
    }
}
