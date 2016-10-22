package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: csi */
public class csi {
    private Set<csj> a;
    private int b;

    public csi() {
        this.a = new CopyOnWriteArraySet();
        this.b = csk.b;
    }

    void a(int i) {
        if (i != this.b) {
            this.b = i;
            for (csj a : this.a) {
                a.a();
            }
        }
    }

    public int a() {
        return this.b;
    }

    public void a(csj csj) {
        this.a.add(csj);
    }

    public void b(csj csj) {
        this.a.remove(csj);
    }
}
