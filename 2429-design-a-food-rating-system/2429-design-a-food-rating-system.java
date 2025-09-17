class FoodRatings {
    HashMap<String,Pair<String,Integer>> FCR;
    HashMap<String,PriorityQueue<Pair<Integer,String>>> CR;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        FCR = new HashMap<>();
        CR = new HashMap<>();
        for(int i = 0; i < foods.length; i++){
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            FCR.put(food, new Pair(cuisine,rating));
            CR.putIfAbsent(cuisine,new PriorityQueue<>((a,b) -> {
                int diff = Integer.compare(b.getKey(), a.getKey());
                if(diff != 0) return diff;
                return a.getValue().compareTo(b.getValue());
            }));
            CR.get(cuisine).add(new Pair<>(rating,food));
        }
    }
    
    public void changeRating(String food, int newRating) {
        Pair<String,Integer> old = FCR.get(food);
        String oldcuisine = old.getKey();
        FCR.put(food, new Pair<>(oldcuisine,newRating));
        CR.get(oldcuisine).add(new Pair<>(newRating,food));
    }
    
    public String highestRated(String cuisine) {
        PriorityQueue<Pair<Integer,String>> pq = CR.get(cuisine);
        while(true){
            Pair<Integer,String> top = pq.peek();
            String food = top.getValue();
            int rating = top.getKey();
            int curr = FCR.get(food).getValue();
            if(rating == curr) return food;
            pq.poll();
        }
    }
}

class Pair<K,V>{
    K key;
    V val;
    Pair(K key, V val){
        this.key = key;
        this.val = val;
    }
    
    public K getKey() {
        return key;
    }

    public V getValue() {
        return val;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */