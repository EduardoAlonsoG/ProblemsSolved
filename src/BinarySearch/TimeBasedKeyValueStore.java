package BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeBasedKeyValueStore {
    //          key  ,      Value ,  TimeStamp
    private Map<String, List<Pair>> keyStore;


    public TimeBasedKeyValueStore() {
        this.keyStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        //using an ArrayList becouse we are always goin to be adding value to the end of the array
        // adding -> O(1)
        List<Pair> tempValueTime = keyStore.getOrDefault(key , new ArrayList<>());
        Pair pairInserted = new Pair(value , timestamp);
        tempValueTime.add(pairInserted);
        keyStore.put(key , tempValueTime);
    }

    public String get(String key, int timestamp) {
        List<Pair> tempValueTime = keyStore.getOrDefault(key , new ArrayList<>());
        String result = "";

        int left = 0;
        int rigth = tempValueTime.size() - 1;

        while(left <= rigth){
            int middle = left + (rigth - left) / 2;
            if(tempValueTime.get(middle).getTimestamp() > timestamp){
                rigth = middle - 1;
            }else{
                result = tempValueTime.get(middle).getValue();
                left = middle + 1;
            }

        }

        return result;
    }

    public static class Pair{
        private String value;
        private int timestamp;

        Pair(String value , int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }

        public String getValue(){
            return this.value;
        }
        public int getTimestamp(){
            return this.timestamp;
        }
    }
}

