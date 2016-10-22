import java.util.List;

final class jel implements jfe {
    final /* synthetic */ jek a;

    jel(jek jek) {
        this.a = jek;
    }

    public void a(int i, int i2) {
        List<jeh> a = this.a.b.a(i2);
        if (!a.isEmpty()) {
            for (jeh jeh : a) {
                jej jej = (jej) this.a.a.get(i);
                if (jej != null) {
                    jej.a(jeh.b, jeh.c);
                }
            }
        }
    }
}
