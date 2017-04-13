class Main {
    
    static long square(long longValue) {
        for(int i = 0; i < 62; i++) {
            if(i == 61) {
                longValue -= 1;
            }
            longValue *= 2;
        }
        return longValue;
    }
    
    public static void main(String argc[]) {
        System.out.println(square(2));
    }
    
}