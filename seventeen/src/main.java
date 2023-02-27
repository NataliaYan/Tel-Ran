import de.telrun.scool.classfour;
import de.telrun.scool.classtwo;
public class main {
    public static void main(String[] args) {
        classfour welcome = new classfour();
        classtwo welcome1 = new classtwo();
        System.out.println ("Привет, я учусь в " + welcome.name);
        System.out.println ("Привет, я учусь во " + welcome1.name);
    }
}
