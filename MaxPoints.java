import java.util.Arrays;

class MaxPoints {
    public int bagOfTokensScore(int[] tokens, int power) {
        int point = 0;
        int flippedPos = tokens.length-1;
        Arrays.sort(tokens);

        for(int index1 = 0; index1 <= flippedPos; index1++)
        {
            System.out.println(index1);
            if(tokens[index1]<=power)
            {
                point++;
                power -= tokens[index1];
                System.out.println("UP");
                
                System.out.println("Current Point = " + point);
                System.out.println("Current Power = " + power);
            }
            else if((point>0)&&(index1 + 1 < flippedPos))
            {
                point--;
                power += tokens[flippedPos];
                flippedPos--;
                index1--;

                System.out.println("Down");
                System.out.println("Current Point = " + point);
                System.out.println("Current Power = " + power);
            }
        }
        return point;
    }
}