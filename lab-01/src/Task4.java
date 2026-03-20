import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> contactsInPhone = new ArrayList<>();
        contactsInPhone.add("Luna");
        contactsInPhone.add("Orion");
        contactsInPhone.add("Nova");

        ArrayList<String> contactsInSim = new ArrayList<>();
        contactsInSim.add("Zephyr");
        contactsInSim.add("Aurora");
        contactsInSim.add("Lyra");

        ArrayList<String> Allcontacts = new ArrayList<>();
        for (String contact : contactsInPhone) {
            if (!Allcontacts.contains(contact)) {
                Allcontacts.add(contact);
            }
        }
        for (String contact : contactsInSim) {
            if (!Allcontacts.contains(contact)) {
                Allcontacts.add(contact);
            }
        }
        Collections.sort(Allcontacts);

        System.out.println("all");
        for (String contact : Allcontacts) {
            System.out.println(contact);
        }
    }
}