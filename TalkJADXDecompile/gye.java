import android.os.Bundle;
import java.util.LinkedList;

public abstract class gye<T extends gyd> {
    T a;
    Bundle b;
    LinkedList<gyi> c;
    private final gyn<T> d;

    public gye() {
        this.d = new gyn(this);
    }

    private void a(int i) {
        while (!this.c.isEmpty() && ((gyi) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    private void a(Bundle bundle, gyi gyi) {
        if (this.a != null) {
            gyi.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(gyi);
        if (bundle != null) {
            if (this.b == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                this.b.putAll(bundle);
            }
        }
        a(this.d);
    }

    public T a() {
        return this.a;
    }

    public void a(Bundle bundle) {
        a(bundle, new gyf(this, bundle));
    }

    public abstract void a(gyn<T> gyn_T);

    public void b() {
        a(null, new gyh(this));
    }

    public void c() {
        if (this.a != null) {
            this.a.b();
        } else {
            a(5);
        }
    }

    public void d() {
        if (this.a != null) {
            this.a.c();
        } else {
            a(1);
        }
    }
}
