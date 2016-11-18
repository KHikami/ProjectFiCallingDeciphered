package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class otu<E> implements Iterable<E> {
    public final List<E> f34281a = new ArrayList();
    int f34282b = 0;
    boolean f34283c = false;
    private int f34284d = 0;

    public boolean m39718a(E e) {
        if (e == null || this.f34281a.contains(e)) {
            return false;
        }
        this.f34281a.add(e);
        this.f34284d++;
        return true;
    }

    public boolean m39719b(E e) {
        if (e == null) {
            return false;
        }
        int indexOf = this.f34281a.indexOf(e);
        if (indexOf == -1) {
            return false;
        }
        if (this.f34282b == 0) {
            this.f34281a.remove(indexOf);
        } else {
            this.f34283c = true;
            this.f34281a.set(indexOf, null);
        }
        this.f34284d--;
        return true;
    }

    public Iterator<E> iterator() {
        return new otv();
    }
}
