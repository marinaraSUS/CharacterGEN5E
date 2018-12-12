public class character{
  
  int[] stats;
  int str;
  int dex; 
  int con;
  int intel;
  int wis;
  int cha;
  
  String char_class;
  String race;
  
  String name;
  String gender;
  int age;
  double size;
  int speed;
  
  String[] languages;
  
  character(int str, int dex, int con, int intel, int wis, int cha)
  {
      this.str = str;
      this.dex = dex;
      this.con = con;
      this.intel = intel;
      this.wis = wis;
      this.cha = cha;
  }
}