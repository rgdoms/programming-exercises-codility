class FrogJmp {
    public int solution(int X, int Y, int D) {
        int dif = Math.abs(Y-X);        
        return dif/D + 1*(dif%D==0?0:1);
    }
}
