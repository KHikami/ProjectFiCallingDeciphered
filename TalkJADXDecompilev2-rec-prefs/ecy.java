package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ecy implements eci {
    private final HashSet<ecg> f11185a = new HashSet();

    public boolean mo1824a(ecg ecg) {
        boolean add;
        synchronized (this.f11185a) {
            add = this.f11185a.add(ecg);
        }
        return add;
    }

    public List<ecg> mo1825b(ecg ecg) {
        List<ecg> linkedList = new LinkedList();
        synchronized (this.f11185a) {
            Iterator it = this.f11185a.iterator();
            while (it.hasNext()) {
                ecg ecg2 = (ecg) it.next();
                if (ecg.f11165a == ecg2.f11165a && ecg.f11166b == ecg2.f11166b) {
                    if ((ecg.f11167c == null || ecg.f11167c.equals(ecg2.f11167c)) && (ecg.f11168d == null || ecg.f11168d.equals(ecg2.f11168d))) {
                        linkedList.add(ecg2);
                        it.remove();
                    }
                }
            }
        }
        return linkedList;
    }
}
