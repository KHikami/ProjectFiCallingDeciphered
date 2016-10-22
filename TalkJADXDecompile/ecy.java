import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ecy implements eci {
    private final HashSet<ecg> a;

    public ecy() {
        this.a = new HashSet();
    }

    public boolean a(ecg ecg) {
        boolean add;
        synchronized (this.a) {
            add = this.a.add(ecg);
        }
        return add;
    }

    public List<ecg> b(ecg ecg) {
        List<ecg> linkedList = new LinkedList();
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ecg ecg2 = (ecg) it.next();
                if (ecg.a == ecg2.a && ecg.b == ecg2.b) {
                    if ((ecg.c == null || ecg.c.equals(ecg2.c)) && (ecg.d == null || ecg.d.equals(ecg2.d))) {
                        linkedList.add(ecg2);
                        it.remove();
                    }
                }
            }
        }
        return linkedList;
    }
}
