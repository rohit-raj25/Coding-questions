package forekites;

public class maxWater {
    
    public static int maxWater(int[] walls) {
        int maxWater = 0;
        int left = 0;
        int right = walls.length - 1;
        
        while (left < right) {
            // Calculate the distance between the walls
            int distance = right - left - 1;
            
            // Calculate the amount of water that can be stored between the walls
            int water = distance * Math.min(walls[left], walls[right]);
            
            // Update maxWater if the current amount of water is greater
            maxWater = Math.max(maxWater, water);
            
            // Move the pointer of the smaller wall towards the center
            if (walls[left] < walls[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
    
    public static void main(String[] args) {
        int[] walls = {1, 2, 3, 4, 5};
        int maxWater = maxWater(walls);
        System.out.println("Maximum water that can be accumulated: " + maxWater);
    }
}
