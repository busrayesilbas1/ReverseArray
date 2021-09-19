public static List<Integer> reverseArray(List<Integer> a) {
       int N = a.size();
       List<Integer> myArray = new ArrayList<Integer>(); 
        
       for(int i=N-1; i>=0; i--)
           myArray.add(a.get(i));
            
       return myArray;
    }
}
