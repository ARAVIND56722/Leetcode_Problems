// Last updated: 17/8/2026, 12:02:04 pm
1class MyLinkedList {
2    class Node{
3        int val;
4        Node prev;
5        Node next;
6        Node(int val){
7            this.prev=null;
8            this.next=null;
9            this.val=val;
10        }
11    }
12    Node head;
13    Node tail;
14    public MyLinkedList() {
15        head=null;
16    }
17    
18    public int get(int index) {
19        Node current=head;
20        for(int i=0;i<index;i++){
21            if(current==null){
22                return -1;
23            }
24            current=current.next;
25        }
26        if(current==null){
27            return -1;
28        }
29        return current.val;
30    }
31    
32    public void addAtHead(int val) {
33        Node newNode=new Node(val);
34        if(head==null){
35            head=newNode;
36            tail=newNode;  
37            return;
38        }
39        head.prev=newNode;
40        newNode.next=head;
41        head=newNode;
42
43        
44    }
45    
46    public void addAtTail(int val) {
47        Node newNode=new Node(val);
48        if(head==null){
49            head=newNode;
50            tail=newNode; 
51            return;
52        }
53        newNode.prev=tail;
54        tail.next=newNode;
55        tail=newNode;
56    }
57    public void addAtIndex(int index, int val) {
58        Node newNode=new Node(val);
59        if(index==0){
60           addAtHead(val);
61            return;
62        }
63        Node current=head;
64        for(int i=0;i<index-1;i++){
65            current=current.next;
66        }
67        if(current==null){
68            return;
69        }
70        if(current.next==null){
71            addAtTail(val);
72            return;
73        }
74        newNode.next=current.next;
75        newNode.prev=current;
76        current.next.prev = newNode;
77        current.next=newNode;
78       
79        
80    }
81    
82    public void deleteAtIndex(int index) {
83        if(head==null){
84            return;
85        }
86       
87        if(index==0){
88          head=head.next;
89          if(head!=null){
90            head.prev=null;
91          }
92          else{
93            tail=null;
94          }
95          return;
96        }
97        Node current=head;
98        for(int i=0;i<index-1;i++){
99            if(current.next==null){
100                return;
101            }
102            current=current.next;
103        }
104        if(current.next==null){
105            return;
106        }
107        current.next=current.next.next;
108        if(current.next!=null){
109           current.next.prev=current;
110        }
111        else{
112            tail=current;
113        }
114    }
115}
116
117/**
118 * Your MyLinkedList object will be instantiated and called as such:
119 * MyLinkedList obj = new MyLinkedList();
120 * int param_1 = obj.get(index);
121 * obj.addAtHead(val);
122 * obj.addAtTail(val);
123 * obj.addAtIndex(index,val);
124 * obj.deleteAtIndex(index);
125 */