package p000;

import java.util.ArrayList;
import java.util.List;

final class gox implements pc {
    List<pc> f15834a = new ArrayList();

    gox() {
    }

    public void m18239a(int i, float f, int i2) {
        for (pc a : this.f15834a) {
            a.a(i, f, i2);
        }
    }

    public void m18238a(int i) {
        for (pc a : this.f15834a) {
            a.a(i);
        }
    }

    public void m18240b(int i) {
        for (pc b : this.f15834a) {
            b.b(i);
        }
    }
}
