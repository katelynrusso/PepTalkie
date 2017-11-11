import java.util.*;

public class positivityGen
{
   public static void main(String[] args)
   {
      System.out.println("On a scale from 1-9, how sad are you?");
      Scanner input = new Scanner(System.in);
      int sadLevel = input.nextInt();
      if(sadLevel==1)
      {
         System.out.println("You're too happy for this program... please leave.");
      }
      else if (sadLevel>=2 && sadLevel<=8)
      {
        String noun = noun();
        String adjective = adjGen();
        System.out.println("You are "+ adjective + " "+ noun+ "!"); 
      }
      else
      {
         System.out.println("Please go to healthcenter.gwu.edu for professional help.");
      }
   }
   public static String noun()
   {
      int random = (int)(Math.random()*38);
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
      noun[23] = "tamale";
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
      int random = (int)(Math.random()*35);
      String[] adj = new String[36];
      adj[0]= "a kindred";
      adj[1]= "a beautiful";
      adj[2]= "a dazzling";
      adj[3]= "an elegant";
      adj[4]= "a fancy";
      adj[5]= "a glamorous";
      adj[6]= "a gorgeous";
      adj[7]= "a handsome";
      adj[8]= "a magnificent";
      adj[9]= "a muscular";
      adj[10]= "a lionhearted";
      adj[11]= "a delightful";
      adj[12]= "a wonderful";
      adj[13]= "an amazing";
      adj[14]= "a stupendous";
      adj[15]= "a powerful";
      adj[16]= "an ambitious";
      adj[17]= "a faithful";
      adj[18]= "a happy";
      adj[19]= "a victorious";
      adj[20]= "a zealous";
      adj[21]= "a zesty";
      adj[22]= "a lively";
      adj[23]= "a witty";
      adj[24]= "a spectacular";
      adj[25]= "a melodic";
      adj[26]= "a modern";
      adj[27]= "a delicious";
      adj[28]= "a sweet";
      adj[29]= "a cuddly";
      adj[30]= "a smart";
      adj[31]= "a sassy";
      adj[32]= "a strong";
      adj[33]= "a limitless";
      adj[34]= "an important";
      adj[35]= "an impressive";
      String Adjective = adj[random];
      return Adjective;
   }
}