
/**
 * Write a description of class RockPaperXDivider here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class RockPaperXDivider {   
    public static void main (String[] args) {
        int ais, ps, x, situation;
        final int dis = 1;
        final int unfit = 2;
        final int fair = 0;

        String s = "";
        Scanner input = new Scanner(System.in);
        System.out.print("AI: Shall we begin our duel, you fleshy human? We shall engage in the age old tradition of BOULDER, PARCHMENT, XDIVIDER!\n");
        ais = (int) (Math.random() * 3);

        s = input.nextLine(); // Save what the person says

        if (s.length() > 50 && DRG.getResponse(s) < 3){
            situation = fair;           
        } else if (DRG.getResponse(s) == 3) situation = dis;
        else if (s.length() < 50) situation = unfit; // Making sure response is at least 50 characters long
        else situation = 45;

        s = s.toLowerCase();
        
        if (situation == fair) {
            ps = DRG.getResponse(s);
            if (ais == ps) x = 0;
            else if (ais == 1 && ps == 0 || ais == 2 && ps == 1 || ais == 0 && ps == 2) x = 1;
            else  x = 2;
            DRG.generateResponse(x, ais , ps);
        } else if (situation == dis) {
            System.out.print("AI: A shame you have declined my generous invitation. We shall meet again.");
        } else if (situation == unfit) {
            ps = DRG.getResponse(s);
            System.out.print("AI: You are unfit to face me, WEAKLING! \n");
            DRG.generateResponse(1, (ps + 1) % 3 , ps);
        } else System.out.print("CODE FAILURE");
    }
}