import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;

public class jek implements jes, jza, kcj, kcm, kcq {
    final SparseArray<jej> a;
    jer b;
    private jfd c;
    private jfl d;

    public jek(kbu kbu) {
        this(kbu, (byte) 0);
    }

    public jek(kbu kbu, byte b) {
        this.a = new SparseArray();
        kbu.a((kcq) this);
    }

    public final jek a(jyn jyn) {
        jyn.a(jek.class, (Object) this);
        return this;
    }

    public jek a(int i, jej jej) {
        if (this.a.get(i) != null) {
            throw new IllegalArgumentException("Cannot register more than one handler for a given  id: " + i);
        }
        this.a.put(i, jej);
        return this;
    }

    public void a(int i, Intent intent) {
        this.c.a(i);
        if (intent == null) {
            throw new NullPointerException("Intent must not be null!");
        } else if (((jej) this.a.get(i)) == null) {
            throw new IllegalStateException("You must register a result handler for request code" + i + " before starting an activity for result with that request code");
        } else {
            this.b.a(this.c.b(i), intent);
        }
    }

    public final void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (jer) jyn.a(jer.class);
        this.d = (jfl) jyn.a(jfl.class);
        this.c = (jfd) jyn.a(jfd.class);
    }

    public final void R_() {
        this.b.a((jes) this);
        this.c.a(new jel(this));
    }

    public final boolean a(jeh jeh) {
        return this.c.a(jeh.a, new jem(this, jeh));
    }

    public final void T_() {
        this.b.b((jes) this);
    }
}
