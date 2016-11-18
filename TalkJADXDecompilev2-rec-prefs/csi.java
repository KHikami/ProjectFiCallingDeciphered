package p000;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class csi {
    private Set<csj> f8982a = new CopyOnWriteArraySet();
    private int f8983b = csk.f8986b;

    void m10859a(int i) {
        if (i != this.f8983b) {
            this.f8983b = i;
            for (csj a : this.f8982a) {
                a.m10862a();
            }
        }
    }

    public int m10858a() {
        return this.f8983b;
    }

    public void m10860a(csj csj) {
        this.f8982a.add(csj);
    }

    public void m10861b(csj csj) {
        this.f8982a.remove(csj);
    }
}
