import tweeto.Tweeto;
import tweeto.TweetoHT;

/**
 *
 * @author Abood
 */
public class Test {
    public static void main(String[] args){
        TweetoHT ahmed = new TweetoHT();
        
        Tweeto abood = new Tweeto("@uhsigf","hello world");
        ahmed.insert(abood);
        ahmed.insert(new Tweeto("@ifh7f","hefvscdd"));
        ahmed.insert(new Tweeto("@f2425sigf","hellopjjhdddd"));
        ahmed.insert(new Tweeto("@lsigf","ooddd"));
        ahmed.insert(new Tweeto("@l7uh5sigf","hdddd"));
        ahmed.insert(new Tweeto("@klm5sigf","hel lowo"));
        ahmed.insert(new Tweeto("@kdde9"," worldddd"));
        ahmed.insert(new Tweeto("@khbz4","herldddd"));
        ahmed.insert(new Tweeto("@klsigf","ooddd"));
        ahmed.insert(new Tweeto("@k5sigf","ooddd"));
        System.out.println(ahmed.search("@k5sigf", "yhgdjcvhdsjcvdsjcbs").toString());
        
        
    }
     
}
