import java.util.List;

/* compiled from: PG */
final class djy {
    private final dlu a;

    djy(dlu dlu) {
        this.a = dlu;
    }

    final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dlx c = ((dju) list.get(i)).f.c();
            Integer num = (Integer) djw.b.get(c);
            if (num != null) {
                a(num.intValue() + 1, 15, 0);
                a(((dju) list.get(i)).g);
            } else {
                this.a.a(0);
                a(c);
                a(((dju) list.get(i)).g);
            }
        }
    }

    private void a(int i, int i2, int i3) {
        if (i < i2) {
            this.a.a(i | 0);
            return;
        }
        this.a.a(i2 | 0);
        int i4 = i - i2;
        while (i4 >= 128) {
            this.a.a((i4 & 127) | 128);
            i4 >>>= 7;
        }
        this.a.a(i4);
    }

    private void a(dlx dlx) {
        a(dlx.b.length, 127, 0);
        dlu dlu = this.a;
        if (dlx == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        dlu.b(dlx.b, 0, dlx.b.length);
    }
}
