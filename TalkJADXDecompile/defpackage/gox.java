package defpackage;

import java.util.ArrayList;
import java.util.List;
import pc;

/* renamed from: gox */
final class gox implements pc {
    List<pc> a;

    gox() {
        this.a = new ArrayList();
    }

    public void a(int i, float f, int i2) {
        for (pc a : this.a) {
            a.a(i, f, i2);
        }
    }

    public void a(int i) {
        for (pc a : this.a) {
            a.a(i);
        }
    }

    public void b(int i) {
        for (pc b : this.a) {
            b.b(i);
        }
    }
}
