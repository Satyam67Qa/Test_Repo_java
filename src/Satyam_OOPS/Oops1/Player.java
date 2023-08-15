package Satyam_OOPS.Oops1;

public abstract class Player extends Cricket{

    private String player_name;

    public Player(int player_count, int over_ball,float match_avg,String player_name)
    {
        super(player_count,over_ball,match_avg);
        this.player_name=player_name;

    }
    public void setPlayer_name(String player_name){
        this.player_name=player_name;
    }
    public String getPlayer_name(){
        return player_name;
    }


    public abstract void displayPlayerScore();


    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println(" Player class display : " +getPlayer_name());
    }

//    public static void main(String[] args)
//    {
//        Player p =new Player(12,3,3,"Satyam Singh");
//        //Player p1 =new Cricket(13,8,87);
//
//        Cricket c= new Player(14,7,89,"sk06");
//       Cricket c1 =new Cricket(10,4, 45);
//        p.displayDetails();
//
//    }
}

class Score extends Player{
    public Score(int player_count, int over_ball, float match_avg, String player_name) {
        super(player_count, over_ball, match_avg, player_name);
    }

    @Override
    public void displayPlayerScore() {
        System.out.println(" Players score is zero");
    }
}

