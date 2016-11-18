package p000;

import java.util.List;

final class jel implements jfe {
    final /* synthetic */ jek f19939a;

    jel(jek jek) {
        this.f19939a = jek;
    }

    public void mo3486a(int i, int i2) {
        List<jeh> a = this.f19939a.f19936b.m24050a(i2);
        if (!a.isEmpty()) {
            for (jeh jeh : a) {
                jej jej = (jej) this.f19939a.f19935a.get(i);
                if (jej != null) {
                    jej.mo747a(jeh.f19933b, jeh.f19934c);
                }
            }
        }
    }
}
