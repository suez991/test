import java.util.Scanner;


public class welcome2
{
    public class Account {
        private string name;
        
        public void SetName(String name){
            this.name = name;
        }

        public String GetName(){
            return name;
        }
    
    
    }

    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);

        Account myAccount1 = new Account();

        myAccount1.SetName("Claudio");


        System.out.println(myAccount1.GetName());
        
        


    }
}
