package family_tree;
import java.util.Comparator;
public class HumanComporatorByName implements Comparator <Human>{
    @Override
    public int compare (Human o1, Human o2){
        if(o1.getName().compareTo(o2.getName()) != 0){
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getName().compareTo(o2.getName());
    }    
}
