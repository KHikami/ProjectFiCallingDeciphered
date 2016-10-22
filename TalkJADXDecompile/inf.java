import java.util.LinkedHashSet;
import java.util.Set;

final class inf implements Runnable {
    final /* synthetic */ ine a;

    inf(ine ine) {
        this.a = ine;
    }

    public void run() {
        synchronized (this.a.f) {
            if (!this.a.g || this.a.p) {
                return;
            }
            this.a.g = false;
            Object<ind> linkedHashSet = new LinkedHashSet(this.a.i);
            Set<ind> linkedHashSet2 = new LinkedHashSet(this.a.j);
            Object<ind> linkedHashSet3 = new LinkedHashSet(this.a.k);
            this.a.i.clear();
            this.a.j.clear();
            this.a.k.clear();
            boolean z = this.a.o;
            this.a.o = false;
            linkedHashSet2.removeAll(linkedHashSet);
            linkedHashSet2.removeAll(linkedHashSet3);
            for (ind b : linkedHashSet) {
                this.a.b.b(b.b());
            }
            for (ind b2 : linkedHashSet2) {
                if (this.a.h.containsKey(b2.a())) {
                    this.a.b.d(b2.b());
                }
            }
            for (ind b22 : linkedHashSet3) {
                this.a.b.c(b22.b());
            }
            if (z) {
                iil.b("Expected non-null", this.a.n);
                this.a.b.a(this.a.n.b());
            }
        }
    }
}
