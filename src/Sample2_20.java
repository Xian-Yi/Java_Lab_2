import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2_20 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = 
        		new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        // 將分數由高到低排序
        sortScores(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "名的分數是" + scores[i]);
        }
    }

    private static void sortScores(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    int temp = scores[j];
                    scores[j] = scores[i];
                    scores[i] = temp;
                }
            }
        }
    }
}
