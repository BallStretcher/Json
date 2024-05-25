public class data  {
   private int[][] array = new int[5][2];
   private anotherdata lmao;

    public anotherdata getLmao() {
        return lmao;
    }

    public void setLmao(anotherdata lmao) {
        this.lmao = lmao;
    }

    public int[][] getArray() {
        int c=0;
        for(int i=0;i<5;i++){
            for(int g=0;g<2;g++)
                array[i][g]=c++;
        }
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
}
