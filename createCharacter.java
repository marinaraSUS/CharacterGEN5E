public class createCharacter{
  // private randomStats randomStats = new randomStats();
  public static void main(String[] args){
    
    int s = randomStat.randomize();
    int d = randomStat.randomize();
    int con = randomStat.randomize();
    int i = randomStat.randomize();
    int w = randomStat.randomize();
    int cha = randomStat.randomize();
    
    character bob = new character(s, d, con, i, w, cha);
    
    System.out.println(bob.str + " " + bob.dex + " " +bob.con + " " + bob.intel + " " +bob.wis+" "+ bob.cha);
    
    randomStat.randomRace(bob);
    
    System.out.println(bob.str + " " + bob.dex + " " +bob.con + " " + bob.intel + " " +bob.wis+" "+ bob.cha +" "+ bob.race);
  }
}