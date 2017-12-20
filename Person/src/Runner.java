/*
 * Peter Song
 * S3C7
 * APCS
 * Mr.Daniel
 * This program allows to do something to two "person".
 */

public class Runner {

    
    public static void main(String[] args) {
        Person Peter=new Person("English");
        Person George=new Person("Chinese");
        Peter.SayHello();
        Peter.SayGoodBye();
        Peter.grow(18);
        George.grow(17);
        George.SayHello();
        George.SayGoodBye();
        Peter.color(2);
        George.color(1);
        if (Peter.getAge()<20){
            System.out.println("You are still young, Peter.");          
        }
        else{
            System.out.println("Peter! It is time to go to the University.");
        }
        if (George.getAge()>10){
            System.out.println("Hey George, I know you have already got at least the number of your ages girlfriend.");
        }else{
            System.out.println("George, you are a young man.");
        }
        if (Peter.skinColor()>1){
            System.out.println("Peter is an Asian.");
        }else
            System.out.println("Peter is a white.");
        if (George.skinColor()>0){
            System.out.println("George is an Asian");
        }else
            System.out.println("George is an African.");
      
      
        
            
    }
    
}
