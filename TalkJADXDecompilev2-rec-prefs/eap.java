package p000;

import java.util.List;

final class eap {
    int f11059a;
    List<ear> f11060b;

    eap(int i, List<ear> list) {
        this.f11059a = i;
        this.f11060b = list;
        if (ebz.f11037d) {
            int i2 = this.f11059a;
            glk.m17981d("Babel", "Notification list with : messageCount=" + i2 + " conversation count=" + this.f11060b.size(), new Object[0]);
        }
    }

    gjj m13373a() {
        gjj gjj = new gjj();
        for (ear ear : this.f11060b) {
            if (ear.f11070j) {
                for (ecj ecj : ear.f11068h) {
                    gjj.add(((ebq) ecj).p.f11061a);
                }
            } else {
                gjj.add(ear.f11061a);
            }
        }
        return gjj;
    }
}
