
/**
 * Write a description of class DramaticResponseGenerator here.
 *
 * @author Parsa S.
 * @version Problem Set 3B, 10/10/2023
 * 
 */
public class DRG { // Quick thing I wanted to mention: My code sometimes repeats the same response, while the first response is still being written...
    public static void generateResponse (int x, int a, int b) {
        int r = (int) (Math.random() * 3);
        if (x == 0) { // In the event of a tie:
            System.out.print("AI: It appears we have both chosen " + DRG.numToChoice(b)  + "...\n");            
            
            if (r == 0) System.out.print("AI: Tch, a tie. You won't be so luck next time!");
            else if (r == 1) System.out.print("Papyrus: Look Sans, a HUMAN! \nSans: We're in the wrong game Papyrus.");
            else System.out.print("AI: A tie huh? Good for you.");
        } else if (x == 1) { // AI wins
            System.out.print("AI: Your choice of " + DRG.numToChoice(b) + " was outmatched by my choice of " + DRG.numToChoice(a) + "!\n");
            
            if (r == 0) System.out.print("Dio: You thought it was the AI but IT WAS ME! DIO! IT WAS I WHO HAS WON!");
            else if (r == 1) System.out.print("\"You hear Daganronpa music echo in the back of your mind. It knows you have lost.\"");
            else System.out.print("AI: hah hah hah I have won");        
        } else if (x == 2) {
            System.out.print("AI: My choice of " + DRG.numToChoice(a) + " shall not fail me, unless...\nAI: What? No- you couldn't have chosen " + DRG.numToChoice(b) + "! NOOOO!\n");
            
            if (r == 0) System.out.print("AI: Impossible! A HUMAN beat ME?");
            else if (r == 1) System.out.print("Jotaro: Yare yare daze \nKakyoin: Jotaro we appear to be lost. Well done on your victory though.");
            else System.out.print("AI: What? Impossible! You: This... is requiem.\nYou have won!");        
        } else {
            System.out.print("System Failure.");
        }
    }    
    
    public static int getResponse (String str) {
        if (str.toLowerCase().contains("boulder")) return 0;
        else if (str.toLowerCase().contains("parchment")) return 1;
        else if (str.toLowerCase().contains("xdivider")) return 2;
        else return 3;
    }
    
    public static String numToChoice (int i) {
        if (i == 0) return "Boulder";
        if (i == 1) return "Parchment";
        if (i == 2) return "XDivider";
        return "";
    }
}
