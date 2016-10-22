import java.util.Iterator;
import java.util.List;

final class frx implements Runnable {
    boolean a;
    final List<a> b;
    final hwl c;
    final hwq d;
    final hwl e;
    final hwq f;

    public frx(List<a> list, hwl hwl, hwq hwq, hwl hwl2, hwq hwq2) {
        this.b = list;
        this.c = hwl;
        this.d = hwq;
        this.e = hwl2;
        this.f = hwq2;
    }

    public void run() {
        iil.a();
        long a = glj.a();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (frq.a) {
            new StringBuilder(57).append("GmsPeopleCache: onDataBufferReady ").append(glj.a() - a).append(" ms");
        }
        if (this.e != null) {
            this.e.b();
        }
        if (this.f != null) {
            this.f.b();
        }
        this.a = true;
    }
}
