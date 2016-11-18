package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class otu<E> implements Iterable<E> {
    public final List<E> a = new ArrayList();
    int b = 0;
    boolean c = false;
    private int d = 0;

    public boolean a(E e) {
        if (e == null || this.a.contains(e)) {
            return false;
        }
        this.a.add(e);
        this.d++;
        return true;
    }

    public boolean b(E e) {
        if (e == null) {
            return false;
        }
        int indexOf = this.a.indexOf(e);
        if (indexOf == -1) {
            return false;
        }
        if (this.b == 0) {
            this.a.remove(indexOf);
        } else {
            this.c = true;
            this.a.set(indexOf, null);
        }
        this.d--;
        return true;
    }

    public Iterator<E> iterator() {
        return new otv();
    }
}
