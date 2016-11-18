package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

public class jek implements jes, jza, kcj, kcm, kcq {
    final SparseArray<jej> f19935a;
    jer f19936b;
    private jfd f19937c;
    private jfl f19938d;

    public jek(kbu kbu) {
        this(kbu, (byte) 0);
    }

    public jek(kbu kbu, byte b) {
        this.f19935a = new SparseArray();
        kbu.m25514a((kcq) this);
    }

    public final jek m24034a(jyn jyn) {
        jyn.m25444a(jek.class, (Object) this);
        return this;
    }

    public jek m24033a(int i, jej jej) {
        if (this.f19935a.get(i) != null) {
            throw new IllegalArgumentException("Cannot register more than one handler for a given  id: " + i);
        }
        this.f19935a.put(i, jej);
        return this;
    }

    public void m24035a(int i, Intent intent) {
        this.f19937c.m24075a(i);
        if (intent == null) {
            throw new NullPointerException("Intent must not be null!");
        } else if (((jej) this.f19935a.get(i)) == null) {
            throw new IllegalStateException("You must register a result handler for request code" + i + " before starting an activity for result with that request code");
        } else {
            this.f19936b.m24052a(this.f19937c.m24080b(i), intent);
        }
    }

    public final void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f19936b = (jer) jyn.m25443a(jer.class);
        this.f19938d = (jfl) jyn.m25443a(jfl.class);
        this.f19937c = (jfd) jyn.m25443a(jfd.class);
    }

    public final void R_() {
        this.f19936b.m24054a((jes) this);
        this.f19937c.m24078a(new jel(this));
    }

    public final boolean mo3485a(jeh jeh) {
        return this.f19937c.m24079a(jeh.f19932a, new jem(this, jeh));
    }

    public final void T_() {
        this.f19936b.m24056b((jes) this);
    }
}
