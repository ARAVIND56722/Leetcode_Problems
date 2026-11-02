// Last updated: 2/11/2026, 10:17:19 am
1class MyHashSet {
2    boolean arr[]=new boolean[1000001];
3    public MyHashSet() {
4        
5    }
6    
7    public void add(int key) {
8        if(arr[key]){
9            return;
10        }
11        else{
12            arr[key]=true;
13        }
14        
15    }
16    
17    public void remove(int key) {
18        if(arr[key]){
19            arr[key]=false;
20        }
21    }
22    
23    public boolean contains(int key) {
24        if(arr[key]){
25            return true;
26        }
27        return false; 
28    }
29   
30}
31
32/**
33 * Your MyHashSet object will be instantiated and called as such:
34 * MyHashSet obj = new MyHashSet();
35 * obj.add(key);
36 * obj.remove(key);
37 * boolean param_3 = obj.contains(key);
38 */