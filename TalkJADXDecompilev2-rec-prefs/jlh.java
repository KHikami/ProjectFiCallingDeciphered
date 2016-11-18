package p000;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;

final class jlh {
    public jlh f20413a = this;
    public jlh f20414b = this;
    final jla f20415c;
    private List<Bitmap> f20416d;

    public jlh(jla jla) {
        this.f20415c = jla;
    }

    public int m24644a() {
        return this.f20416d != null ? this.f20416d.size() : 0;
    }

    public void m24645a(Bitmap bitmap) {
        if (this.f20416d == null) {
            this.f20416d = new ArrayList();
        }
        this.f20416d.add(bitmap);
    }

    public Bitmap m24646b() {
        int a = m24644a();
        return a != 0 ? (Bitmap) this.f20416d.remove(a - 1) : null;
    }
}
