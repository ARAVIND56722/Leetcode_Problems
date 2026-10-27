// Last updated: 27/10/2026, 7:32:38 pm
1class ParkingSystem {
2    private int big;
3    private int small;
4    private int medium;
5    public ParkingSystem(int big, int medium, int small) {
6        this.big=big;
7        this.small=small;
8        this.medium=medium;
9        
10    }
11    
12    public boolean addCar(int carType) {
13        if(carType==1 && big>0){
14            big--;
15            return true;
16        }
17        else if(carType==2 && medium>0){
18            medium--;
19            return true;
20        }
21        if(carType==3 && small>0){
22            small--;
23            return true;
24        }
25        return false;
26        
27    }
28}
29/**
30 * Your ParkingSystem object will be instantiated and called as such:
31 * ParkingSystem obj = new ParkingSystem(big, medium, small);
32 * boolean param_1 = obj.addCar(carType);
33 */