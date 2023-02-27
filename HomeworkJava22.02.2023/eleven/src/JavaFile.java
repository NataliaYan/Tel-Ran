import de.telrun.galary.frower.Lilija;
import de.telrun.galary.tree.Sosna;
import de.telrun.galary.frower.Rose;

public class JavaFile {
    public static void main(String[] args) {
        Sosna welcome = new Sosna();
        Rose welcome1 = new Rose();
        Lilija welcome2 = new Lilija();
        System.out.println ("Привет, я - " + welcome.name);
        System.out.println ("Привет, я - " + welcome1.name);
        System.out.println ("Привет, я - " + welcome2.name);
    }
}