
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sohel parvez
 */
public class UnicodeIcons {
    
    public static void main(String[] args) {
        String[] names = new String[]{"EVERGREEN TREE", "TANABATA TREE", "CHRISTMAS TREE", "DECIDUOUS TREE", "PALM TREE"};
        String[] icons = new String[]{"\uD83C\uDF32","\uD83C\uDF34", "\uD83C\uDF84", "\uD83C\uDF33", "\uD83C\uDF8B"};
        try {
            
            
            for(int j = 0; j<5; j++) {
                List<Integer> l = new ArrayList<Integer>();
                for(int i = 0; i < icons.length; i++) {
                    int randomNum=getRandomNumberInRange(0, 4);
                    
                    if(i == 0) {
                       // System.out.print(names[randomNum]+" ");
                        System.out.print(icons[randomNum]);
                        l.add(randomNum);
                    } else {
                        while(l.contains(randomNum)) {
                            randomNum=getRandomNumberInRange(0, 4);
                        }
                        l.add(randomNum);
                       // System.out.print(names[randomNum]+" ");
                        System.out.print(icons[randomNum]);
                    }
                    
                }
                
                System.out.println("\n");
            }
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
    }
    
    private static int getRandomNumberInRange(int min, int max) {

            if (min >= max) {
                    throw new IllegalArgumentException("max must be greater than min");
            }

            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
    }
    
}
