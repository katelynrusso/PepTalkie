import java.util.*;

public class positivityGen
{
   public static void main(String[] args)
   {
      String noun = noun();
      String adjective = adjGen();
      String aOrAn = aOrAn(adjective);
      System.out.println("You are"+ aOrAn + " " + adjective + " "+ noun+ "!");
   }
   public static String noun()
   {
      int random = (int)(Math.random()*39+1);
      String[] noun = new String[39];
      noun[0] = "Ace-in-the-hole";
      noun[1] = "Benefactor";
      noun[2] = "Catalyst";
      noun[3] = "Champion";
      noun[4] = "Connoisseur";
      noun[5] = "Devotee";
      noun[6] = "Dreamboat";
      noun[7] = "Enchantress";
      noun[8] = "Angel";
      noun[9] = "Artisan";
      noun[10] = "Beauty";
      noun[11] = "Brain";
      noun[12] = "Dude";
      noun[13] = "Comrade";
      noun[14] = "Dear";
      noun[15] = "Delight";
      noun[16] = "Doll";
      noun[17] = "Dawg";
      noun[18] = "Fashionista";
      noun[19] = "Maxxinista ©";
      noun[20] = "Garden";
      noun[21] = "Gem";
      noun[22] = "Genius";
      noun[23] = "God";
      noun[24] = "Goddess";
      noun[25] = "Guardian";
      noun[26] = "Mom";
      noun[27] = "Helper";
      noun[28] = "Hero";
      noun[29] = "Hotshot";
      noun[30] = "Go-Getter";
      noun[31] = "Jester";
      noun[32] = "Spirit";
      noun[33] = "Kingpin";
      noun[34] = "Lady's Man";
      noun[35] = "Legend";
      noun[36] = "Lionheart";
      noun[37] = "Princess";
      noun[38] = "cupcake";
      noun[39] = "tamale";
      String Noun = noun[random];
      return Noun;
   }
   public static String adjGen()
   {
      int random = (int)(Math.random()*36+1);
      String[] adj = new String[36];
      adj[0]= "kindred";
      adj[1]= "beautiful";
      adj[2]= "dazzling";
      adj[3]= "elegant";
      adj[4]= "fancy";
      adj[5]= "glamorous";
      adj[6]= "gorgeous";
      adj[7]= "handsome";
      adj[8]= "magnificent";
      adj[9]= "muscular";
      adj[10]= "lionhearted";
      adj[11]= "delightful";
      adj[12]= "wonderful";
      adj[13]= "amazing";
      adj[14]= "stupendous";
      adj[15]= "powerful";
      adj[16]= "ambitious";
      adj[17]= "faithful";
      adj[18]= "happy";
      adj[19]= "victorious";
      adj[20]= "zealous";
      adj[21]= "zesty";
      adj[22]= "lively";
      adj[23]= "witty";
      adj[24]= "spectacular";
      adj[25]= "melodic";
      adj[26]= "modern";
      adj[27]= "delicious";
      adj[28]= "sweet";
      adj[29]= "cuddly";
      adj[30]= "smart";
      adj[31]= "sassy";
      adj[32]= "strong";
      adj[33]= "limitless";
      adj[34]= "important";
      adj[35]= "impressive";
      adj[36]= "stunning";
      String Adjective = adj[random];
      return Adjective;
   }
   public static String aOrAn(String adjective)
   {
      String aOrAn= "kjfhadskjf";
      String firstLetter = adjective.substring(0,1);
      if (firstLetter=="a"||firstLetter=="e"||firstLetter=="i"||firstLetter=="o"||firstLetter=="u")
      {
         aOrAn= "an";
         return aOrAn;
      }
      else
      {
         aOrAn= "a";
         return aOrAn;
      }
   }
   
}