package Satyam_OOPS.Oops1;

public class Cricket {

    private int player_count;

    public int over_ball;

    private float match_avg;

    public Cricket(int player_count,int over_ball,float match_avg){
      this.player_count=player_count;
      this.over_ball=over_ball;
      this.match_avg=match_avg;
    }

    public void setPlayer_count(int player_count){
        this.player_count=player_count;
    }
    public int getPlayer_count(){
        return player_count;
    }

    public void setMatch_avg(float match_avg) {
        this.match_avg = match_avg;
    }
    public float getMatch_avg(){
        return match_avg;
    }

    public void displayDetails(){
        System.out.println(" Cricket details are below: ");
        System.out.println(" Cricket player count :"+getPlayer_count());
        System.out.println(" Cricket match avg :"+getMatch_avg());
        System.out.println(" Cricket boll :"+over_ball);

    }
}
