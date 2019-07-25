package job.Knowledge.sorted;

public class Maopao {
    public static void main(String[] args) {
        Maopao maopao = new Maopao();
        maopao.sortByMaopao();
    }

    int[] ij= {232,4354,5456,676,8879,98906,3};
    public void sortByMaopao(){

        int tem =0;
        for (int i = 0; i < ij.length-1; i++) {
            for (int j = 0; j < ij.length-1-i; j++) {

                if (ij[j] > ij[j+1]) {
                    tem = ij[j];
                    ij[j]=ij[j+1];
                    ij[j+1]=tem;
                }
            }
        }
        for (int i = 0; i < ij.length; i++) {
            System.out.println(ij[i]);
        }
    }
}

