public class Player
{
    private String user;
    private String play;
    
    
    public Player(String play){
        this.play = play;
    }
    public Player(String user, String play){
        this.user = user;
        this.play = play;
    }
    
    
    public void setUser(String user){
        this.user = user;
    }
    
    public String getUser(){
        return this.user;
    }
    
    public void setPlay(String play){
        this.play = play;
    }
    
    public String getPlay(){
        return this.play;
    }
    
}
