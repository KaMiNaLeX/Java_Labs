package stolov;

public class Stol {
    private People[] stol;
    private int stolSize;

    public Stol(int size) {
        this.stolSize = size;
        stol= new People[size];
    }

    public int getFreePlace() {
        for (int i = 0; i < stolSize; i++) {
            if (stol[i] == null)
                return i;
        }
        return -1;
    }

    public synchronized void setPeople(People people) {
        System.out.println("People " + people.getPeopleName() + " is parked");
        stol[getFreePlace()] = people;
    }

    public synchronized void leavePeople(People people){
        for(int i=0;i<stolSize;i++){
            if(stol[i] == people){
                stol[i] = null;
                System.out.println("People " + people.getPeopleName() + "leave the stol");
            }
        }
    }

    public void showStol() {
        System.out.println("Stol places:{");
        for (int i = 0; i < stolSize; i++) {
            if(stol[i] != null){
                System.out.println(i + ") " + stol[i].getPeopleName());
            }
            else{
                System.out.println(i + ") empty");
            }
        }
        System.out.println("}");
    }
}
