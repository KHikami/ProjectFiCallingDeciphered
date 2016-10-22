import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public final class izh extends PhantomReference<Object> {
    final String a;
    izh b;
    izh c;

    public izh(Object obj, String str, ReferenceQueue<? super Object> referenceQueue) {
        super(obj, referenceQueue);
        this.a = str;
    }

    public void a(izh izh) {
        ba.a((Object) izh);
        this.b = izh;
        this.c = izh.c;
        if (this.c != null) {
            this.c.b = this;
        }
        izh.c = this;
    }

    public izh a() {
        if (this.b != null) {
            this.b.c = this.c;
        }
        if (this.c != null) {
            this.c.b = this.b;
        }
        this.c = null;
        this.b = null;
        return this;
    }
}
