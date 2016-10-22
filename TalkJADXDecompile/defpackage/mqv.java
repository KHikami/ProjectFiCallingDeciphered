package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: mqv */
class mqv extends mqq {
    final mqr d;
    final Character e;

    mqv(String str, String str2, Character ch) {
        this(new mqr(str, str2.toCharArray()), ch);
    }

    mqv(mqr mqr, Character ch) {
        this.d = (mqr) bm.a((Object) mqr);
        boolean z = ch == null || !mqr.b(ch.charValue());
        bm.a(z, "Padding character %s was already in alphabet", (Object) ch);
        this.e = ch;
    }

    mdz a() {
        return this.e == null ? mdz.a() : mdz.a(this.e.charValue());
    }

    int a(int i) {
        return this.d.r * mru.a(i, this.d.s, RoundingMode.CEILING);
    }

    void a(Appendable appendable, byte[] bArr, int i, int i2) {
        bm.a((Object) appendable);
        bm.a(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            b(appendable, bArr, i + i3, Math.min(this.d.s, i2 - i3));
            i3 += this.d.s;
        }
    }

    void b(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        bm.a((Object) appendable);
        bm.a(i, i + i2, bArr.length);
        if (i2 <= this.d.s) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z);
        long j = 0;
        for (i3 = 0; i3 < i2; i3++) {
            j = (j | ((long) (bArr[i + i3] & 255))) << 8;
        }
        int i4 = ((i2 + 1) << 3) - this.d.q;
        i3 = 0;
        while (i3 < (i2 << 3)) {
            appendable.append(this.d.a(((int) (j >>> (i4 - i3))) & this.d.p));
            i3 += this.d.q;
        }
        if (this.e != null) {
            while (i3 < (this.d.s << 3)) {
                appendable.append(this.e.charValue());
                i3 += this.d.q;
            }
        }
    }

    int b(int i) {
        return (int) (((((long) this.d.q) * ((long) i)) + 7) / 8);
    }

    int a(byte[] bArr, CharSequence charSequence) {
        bm.a((Object) bArr);
        CharSequence a = a().a(charSequence);
        if (this.d.b(a.length())) {
            int i = 0;
            int i2 = 0;
            while (i2 < a.length()) {
                int i3;
                long j = 0;
                int i4 = 0;
                for (i3 = 0; i3 < this.d.r; i3++) {
                    long j2 = j << this.d.q;
                    if (i2 + i3 < a.length()) {
                        i4++;
                        j = j2 | ((long) this.d.c(a.charAt(i4 + i2)));
                    } else {
                        j = j2;
                    }
                }
                int i5 = (this.d.s << 3) - (i4 * this.d.q);
                i3 = (this.d.s - 1) << 3;
                while (i3 >= i5) {
                    i4 = i + 1;
                    bArr[i] = (byte) ((int) ((j >>> i3) & 255));
                    i3 -= 8;
                    i = i4;
                }
                i2 += this.d.r;
            }
            return i;
        }
        throw new mqu("Invalid input length " + a.length());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        stringBuilder.append(this.d.toString());
        if (8 % this.d.q != 0) {
            if (this.e == null) {
                stringBuilder.append(".omitPadding()");
            } else {
                stringBuilder.append(".withPadChar('").append(this.e).append("')");
            }
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mqv)) {
            return false;
        }
        mqv mqv = (mqv) obj;
        if (this.d.equals(mqv.d) && mez.b(this.e, mqv.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode() ^ Arrays.hashCode(new Object[]{this.e});
    }
}
