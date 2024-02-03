// TC o(nlog(k)) sc: o(k)
class KthLargestInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        for(int num: nums){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
