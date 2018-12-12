import java.util.Random;

public class randomStat{

//---------------------------------------------------------------------------
  static int randomize()
  {
    int[] A = new int[4];
    Random r = new Random();
    for (int i=0; i<4; i++)
    {
      A[i] = r.nextInt(6)+1;
    } 
    int stat = finalStat(A);
    return stat;
  }
  
//--------------------------------------------------------------------------------
  static int finalStat(int[] A)
  {
    int smallest = A[0];
    int total = A[0];
    for (int i=1; i<4; i++)
    {
      total += A[i];
      if (smallest > A[i])
      {
        smallest = A[i];
      }
    }
    total = total - smallest;
    return total;
  }
  
//----------------------------------------------------------------------------------
  
  static void randomRace(character bob)
  {
    String[] races = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"};
    Random r = new Random();
    int i = r.nextInt(8);
    bob.race = races[i];
    
    if (bob.race == "Dragonborn")
    {
      bob.str += 2;
      bob.cha += 1;
    }
    else if (bob.race == "Dwarf")
    {
      bob.con += 2; 
    }
    else if (bob.race == "Elf")
    {
      bob.dex += 2;
    }
    else if (bob.race == "Gnome")
    {
      bob.intel += 2; 
    }
    else if (bob.race == "Half-Elf")
    {
      bob.cha += 2;
      int[] b = {1,1,1,1,1,0};
      int[] c = randomAbilityScore(1, bob, b);
      randomAbilityScore(1, bob, c);
    }
    else if (bob.race == "Halfling")
    {
      bob.dex += 2;
    }
    else if (bob.race == "Half-Orc")
    {
      bob.str += 2;
      bob.con += 1;
    }
    else if (bob.race == "Human")
    {
      bob.str++;
      bob.dex++;
      bob.con++;
      bob.intel++;
      bob.wis++;
      bob.cha++;
    }
    else if (bob.race == "Tiefling")
    {
      bob.cha += 2;
      bob.intel += 1;
    }
  }
  
//------------------------------------------------------------------------------------------
  
  static int[] randomAbilityScore(int p, character bob, int[] n)
  {
    int flag = 0;
    int i = 0;
    String[] A = {"str", "dex", "con", "intel", "wis", "cha"};
    
    do{
    Random r = new Random();
    i = r.nextInt(5);
    if (n[i] != 0)
      flag++;
    }while (flag == 0);
    
    n[i] = 0;
    
    if (A[i] == "str")
      bob.str += p;
    else if (A[i] == "dex")
      bob.dex += p;
    else if (A[i] == "con")
      bob.con += p;
    else if (A[i] == "intel")
      bob.intel += p;
    else if (A[i] == "wis")
      bob.wis += p;
    else if (A[i] == "cha")
      bob.cha += p;
    
    return n;
  }
}