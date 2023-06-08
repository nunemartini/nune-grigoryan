public class Elevator {
    public int minFloor;
    public int maxFloor;
    public int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveUp(){
        currentFloor = getCurrentFloor() + 1;
    }
    public void moveDown(){
        currentFloor = getCurrentFloor() - 1;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void move(int floor){
        if (floor > getCurrentFloor() && floor <=maxFloor){
            while (floor != currentFloor){
                moveUp();
                System.out.println(currentFloor);
            }
        } else if (floor < getCurrentFloor() && floor >=minFloor){
            while (floor != currentFloor){
                moveDown();
                System.out.println(currentFloor);
            }
        } else {
            System.out.println("Что-то пошло не так");
            return;
        }

    }
}
