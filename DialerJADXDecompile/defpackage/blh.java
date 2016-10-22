package defpackage;

/* compiled from: PG */
/* renamed from: blh */
final class blh extends blj {
    private /* synthetic */ bll e;

    blh(bll bll, blg blg, CharSequence charSequence) {
        this.e = bll;
        super(blg, charSequence);
    }

    public final int a(int i) {
        int length = this.e.a.length();
        int length2 = this.b.length() - length;
        int i2 = i;
        while (i2 <= length2) {
            int i3 = 0;
            while (i3 < length) {
                if (this.b.charAt(i3 + i2) == this.e.a.charAt(i3)) {
                    i3++;
                } else {
                    i2++;
                }
            }
            return i2;
        }
        return -1;
    }

    public final int b(int i) {
        return this.e.a.length() + i;
    }
}
