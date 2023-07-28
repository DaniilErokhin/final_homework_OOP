package family_tree;
import java.util.Comparator;
public class HumanComporatorByBirthDate implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2){
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
