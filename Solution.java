class Solution {
    public String frequencySort(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        
        Map<Character,Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        for(int i=0; i<temp.length; i++){
            list.add(temp[i]);
            map.put(temp[i], map.getOrDefault(temp[i],0)+1);
        }

        Collections.sort(list, (a,b) -> Integer.compare(map.get(b),map.get(a)));

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
