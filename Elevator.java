package cscie55.hw3.elevator;

public class Elevator{

        static final int NUM_OF_FLOORS = 7;
        public int currentFloor;
        public int direction;
        public int[] destinations;

        
        Elevator(){
            this.currentFloor = 0;
            this.direction = 1;
            this.destinations = new int[7];
        }
        

        public void move(){
            destinations[currentFloor] = 0;
            System.out.println(this); 
            
            if(direction == 1) //moving upward
                currentFloor += 1;            
            else 
                currentFloor -= 1;
            if(currentFloor == NUM_OF_FLOORS - 1)
                direction = 2;
            if(currentFloor == 0)
                direction = 1;      
        }
        

        public void boardPassenger(int destinationFloor){
            destinations[destinationFloor - 1] += 1;
        }
         

        public String toString(){
            
            int passengersOnBoard = 0;
            for (int i : destinations)
                passengersOnBoard += i;
                
            
        
            return "Floor " + (currentFloor + 1) + ": " + passengersOnBoard + 
                    " passengers";
                    
        } 
}
 
