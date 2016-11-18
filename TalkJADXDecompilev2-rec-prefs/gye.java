package p000;

import android.os.Bundle;
import java.util.LinkedList;

public abstract class gye<T extends gyd> {
    T f16368a;
    Bundle f16369b;
    LinkedList<gyi> f16370c;
    private final gyn<T> f16371d = new gyn(this);

    private void m18946a(int i) {
        while (!this.f16370c.isEmpty() && ((gyi) this.f16370c.getLast()).mo2416a() >= i) {
            this.f16370c.removeLast();
        }
    }

    private void m18947a(Bundle bundle, gyi gyi) {
        if (this.f16368a != null) {
            gyi.mo2417b();
            return;
        }
        if (this.f16370c == null) {
            this.f16370c = new LinkedList();
        }
        this.f16370c.add(gyi);
        if (bundle != null) {
            if (this.f16369b == null) {
                this.f16369b = (Bundle) bundle.clone();
            } else {
                this.f16369b.putAll(bundle);
            }
        }
        mo2608a(this.f16371d);
    }

    public T m18948a() {
        return this.f16368a;
    }

    public void m18949a(Bundle bundle) {
        m18947a(bundle, new gyf(this, bundle));
    }

    public abstract void mo2608a(gyn<T> gyn_T);

    public void m18951b() {
        m18947a(null, new gyh(this));
    }

    public void m18952c() {
        if (this.f16368a != null) {
            this.f16368a.mo2605b();
        } else {
            m18946a(5);
        }
    }

    public void m18953d() {
        if (this.f16368a != null) {
            this.f16368a.mo2606c();
        } else {
            m18946a(1);
        }
    }
}
