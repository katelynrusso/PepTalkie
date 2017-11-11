import java.util.*;

public class positivityGen
{
   public static void main(String[] args)
   {
      String noun = noun();
      String adjective = adjGen();
      String aOrAn = aOrAn(adjective);
      System.out.println("You are "+ aOrAn + " " + adjective + " "+ noun+ "!");
   }
   public static String noun()
   {
      int random = (int)(Math.random()*39+1);
      String[] noun = new String[39];
      noun[0] = "ace-in-the-hole";
      noun[1] = "benefactor";
      noun[2] = "catalyst";
      noun[3] = "champion";
      noun[4] = "connoisseur";
      noun[5] = "devotee";
      noun[6] = "dreamboat";
      noun[7] = "enchantress";
      noun[8] = "angel";
      noun[9] = "artisan";
      noun[10] = "beauty";
      noun[11] = "brain";
      noun[12] = "dude";
      noun[13] = "comrade";
      noun[14] = "dear";
      noun[15] = "delight";
      noun[16] = "doll";
      noun[17] = "dawg";
      noun[18] = "fashionista";
      noun[19] = "maxxinista©";
      noun[20] = "garden";
      noun[21] = "gem";
      noun[22] = "genius";
      noun[23] = "god";
      noun[24] = "goddess";
      noun[25] = "guardian";
      noun[26] = "mom";
      noun[27] = "helper";
      noun[28] = "hero";
      noun[29] = "hotshot";
      noun[30] = "go-getter";
      noun[31] = "jester";
      noun[32] = "spirit";
      noun[33] = "kingpin";
      noun[34] = "lady's man";
      noun[35] = "legend";
      noun[36] = "lionheart";
      noun[37] = "princess";
      noun[38] = "cupcake";
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