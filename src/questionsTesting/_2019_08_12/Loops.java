package questionsTesting._2019_08_12;

public class Loops {
    public static void main(String[] args) {
        outer: for(int i = 5, j = 0; i>0; i--){
        inner: for(;j<5;j++) {
            System.out.println(i + "" + j + " ");
            if (j == 0) continue outer;
        }

        }
    }
}

