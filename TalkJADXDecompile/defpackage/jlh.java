package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jlh */
final class jlh {
    public jlh a;
    public jlh b;
    final jla c;
    private List<Bitmap> d;

    public jlh(jla jla) {
        this.a = this;
        this.b = this;
        this.c = jla;
    }

    public int a() {
        return this.d != null ? this.d.size() : 0;
    }

    public void a(Bitmap bitmap) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(bitmap);
    }

    public Bitmap b() {
        int a = a();
        return a != 0 ? (Bitmap) this.d.remove(a - 1) : null;
    }
}
