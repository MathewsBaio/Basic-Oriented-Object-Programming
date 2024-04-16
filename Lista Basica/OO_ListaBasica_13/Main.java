
public class Main
{
    public static void main(String[] args){
        JogoDaVelha board = new JogoDaVelha();
        Player one = new Player("O");
        Player two = new Player("X");
        
        System.out.println("Jogo da Velha:\nJogador O começa!\n");
        printBoard(board);
        System.out.println();
        
        
        
        
    }
    
    public static void printBoard(JogoDaVelha board){
        for(int c = 0; c < 3; c++) {
        
            for(int r = 0; r < 3; r++) {
                 System.out.print("  "+board.getHouse(c,r)+"  ");   
            } 
            System.out.println();
            System.out.println();
        }
    }
   
    
}
