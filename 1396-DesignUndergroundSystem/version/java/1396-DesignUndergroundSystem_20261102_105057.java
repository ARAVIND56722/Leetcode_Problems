// Last updated: 2/11/2026, 10:50:57 am
1
2import java.util.*;
3
4class UndergroundSystem {
5
6    private static class CheckInInfo {
7        String station;
8        int time;
9
10        CheckInInfo(String station, int time) {
11            this.station = station;
12            this.time = time;
13        }
14    }
15
16    private static class JourneyInfo {
17        double totalTime;
18        int count;
19
20        JourneyInfo(double totalTime, int count) {
21            this.totalTime = totalTime;
22            this.count = count;
23        }
24    }
25
26    private Map<Integer, CheckInInfo> checkIns;
27    private Map<String, JourneyInfo> journeys;
28
29    public UndergroundSystem() {
30        checkIns = new HashMap<>();
31        journeys = new HashMap<>();
32    }
33
34    public void checkIn(int id, String stationName, int t) {
35        checkIns.put(id, new CheckInInfo(stationName, t));
36    }
37
38    public void checkOut(int id, String stationName, int t) {
39        CheckInInfo info = checkIns.get(id);
40
41        int travelTime = t - info.time;
42        String route = info.station + "->" + stationName;
43
44        if (!journeys.containsKey(route)) {
45            journeys.put(route, new JourneyInfo(travelTime, 1));
46        } else {
47            JourneyInfo journey = journeys.get(route);
48            journey.totalTime += travelTime;
49            journey.count++;
50        }
51
52        checkIns.remove(id);
53    }
54
55    public double getAverageTime(String startStation, String endStation) {
56        String route = startStation + "->" + endStation;
57
58        JourneyInfo journey = journeys.get(route);
59
60        return journey.totalTime / journey.count;
61    }
62}
63
64
65/**
66 * Your UndergroundSystem object will be instantiated and called as such:
67 * UndergroundSystem obj = new UndergroundSystem();
68 * obj.checkIn(id,stationName,t);
69 * obj.checkOut(id,stationName,t);
70 * double param_3 = obj.getAverageTime(startStation,endStation);
71 */