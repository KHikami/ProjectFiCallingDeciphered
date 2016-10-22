package defpackage;

import java.math.RoundingMode;

/* compiled from: PG */
/* renamed from: dbu */
class dbu extends dbp {
    final dbq c;
    private Character d;

    dbu(String str, String str2, Character ch) {
        this(new dbq(str, str2.toCharArray()), ch);
    }

    dbu(dbq dbq, Character ch) {
        this.c = (dbq) cob.i((Object) dbq);
        boolean z = ch == null || !dbq.b(ch.charValue());
        cob.a(z, "Padding character %s was already in alphabet", (Object) ch);
        this.d = ch;
    }

    final cxn a() {
        return this.d == null ? cxn.a() : cxn.a(this.d.charValue());
    }

    final int a(int i) {
        return this.c.d * dcb.a(i, this.c.e, RoundingMode.CEILING);
    }

    void a(Appendable appendable, byte[] bArr, int i, int i2) {
        cob.i((Object) appendable);
        cob.b(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            b(appendable, bArr, i + i3, Math.min(this.c.e, i2 - i3));
            i3 += this.c.e;
        }
    }

    final void b(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        cob.i((Object) appendable);
        cob.b(i, i + i2, bArr.length);
        if (i2 <= this.c.e) {
            z = true;
        } else {
            z = false;
        }
        cob.a(z);
        long j = 0;
        for (i3 = 0; i3 < i2; i3++) {
            j = (j | ((long) (bArr[i + i3] & 255))) << 8;
        }
        int i4 = ((i2 + 1) << 3) - this.c.c;
        i3 = 0;
        while (i3 < (i2 << 3)) {
            appendable.append(this.c.a[((int) (j >>> (i4 - i3))) & this.c.b]);
            i3 += this.c.c;
        }
        if (this.d != null) {
            while (i3 < (this.c.e << 3)) {
                appendable.append(this.d.charValue());
                i3 += this.c.c;
            }
        }
    }

    final int b(int i) {
        return (int) (((((long) this.c.c) * ((long) i)) + 7) / 8);
    }

    int a(byte[] bArr, CharSequence charSequence) {
        cob.i((Object) bArr);
        CharSequence a = a().a(charSequence);
        if (this.c.a(a.length())) {
            int i = 0;
            int i2 = 0;
            while (i2 < a.length()) {
                int i3;
                long j = 0;
                int i4 = 0;
                for (i3 = 0; i3 < this.c.d; i3++) {
                    long j2 = j << this.c.c;
                    if (i2 + i3 < a.length()) {
                        i4++;
                        j = j2 | ((long) this.c.c(a.charAt(i4 + i2)));
                    } else {
                        j = j2;
                    }
                }
                int i5 = (this.c.e << 3) - (i4 * this.c.c);
                i3 = (this.c.e - 1) << 3;
                while (i3 >= i5) {
                    i4 = i + 1;
                    bArr[i] = (byte) ((int) ((j >>> i3) & 255));
                    i3 -= 8;
                    i = i4;
                }
                i2 += this.c.d;
            }
            return i;
        }
        throw new dbt("Invalid input length " + a.length());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        stringBuilder.append(this.c.toString());
        if (8 % this.c.c != 0) {
            if (this.d == null) {
                stringBuilder.append(".omitPadding()");
            } else {
                stringBuilder.append(".withPadChar('").append(this.d).append("')");
            }
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof dbu)) {
            return false;
        }
        dbu dbu = (dbu) obj;
        if (this.c.equals(dbu.c) && cob.a(this.d, dbu.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() ^ cob.a(this.d);
    }
}
