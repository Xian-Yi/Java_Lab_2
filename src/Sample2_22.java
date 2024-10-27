public class Sample2_22 {

    public static void main(String[] args) 
    {	
        int[][] scores = {
            {80, 60, 22, 50, 75},
            {90, 55, 68, 72, 0}
        };

        for (int i = 0; i < scores[0].length; i++) 
        {
            System.out.println("第" + (i + 1) + "個人的國語分數是" + scores[0][i] + "分");
            System.out.println("第" + (i + 1) + "個人的數學分數是" + scores[1][i] + "分");
        }
    }
}
