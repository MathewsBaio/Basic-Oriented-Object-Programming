import java.util.ArrayList;

public class JogoDaVelha
{
    //atributos
    private String[][] board;
    private ArrayList<Player> players;
    
    //construtores
    public JogoDaVelha(){
        
        board = new String[3][3];
        for(int c = 0; c < 3; c++) {
        
            for(int r = 0; r < 3; r++) {
                 board[c][r] = "-";   //"-" Indica casa vazia
            } 
        }
        
        players = new ArrayList<Player>();
        
    }
    
    //metodos
    
    public boolean isBoardFull(){
        if(players.size() == 2){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isHouseFree(int c, int r){
        if(board[c][r] == "-"){
            return true;
        } else{
            return false;
        }
    }
    
    public void makePlay(String play, int c, int r){
        if(play == players.get(0).getPlay() || play == players.get(0).getPlay() && isHouseFree(c,r)){
            board[c][r] = play;
        }
    }
    
    public boolean someoneWins(){
        boolean winner = false;                                                                                     // 00 - 10 - 20
                                                                                                                    // 01 - 11 - 21
        // Verifica colunas                                                                                         // 02 - 12 - 22
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] != "-"){
            winner = true;
        } else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] != "-"){
            winner = true;
        } else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] != "-"){
            winner = true;
        }
        
        // Verifica linhas
        if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] != "-"){
            winner = true;
        } else if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] != "-"){
            winner = true;
        } else if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] != "-"){
            winner = true;
        }
        
        // Verifica diagonais
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != "-"){
            winner = true;
        } else if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[0][2] != "-"){
            winner = true;
        }
        
        return winner;
    }
    
    
    //acesso
    
    public String getHouse(int c, int r){
        return this.board[c][r];
    }
    
    public void addPlayer(Player player){
        if(!isBoardFull()){
            players.add(player);    
        }
    }
        
    
}
