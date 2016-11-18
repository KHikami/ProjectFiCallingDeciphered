package p000;

import java.math.RoundingMode;
import java.util.Arrays;

class mqv extends mqq {
    final mqr f28135d;
    final Character f28136e;

    mqv(String str, String str2, Character ch) {
        this(new mqr(str, str2.toCharArray()), ch);
    }

    mqv(mqr mqr, Character ch) {
        this.f28135d = (mqr) bm.m6122a((Object) mqr);
        boolean z = ch == null || !mqr.mo3738b(ch.charValue());
        bm.m6143a(z, "Padding character %s was already in alphabet", (Object) ch);
        this.f28136e = ch;
    }

    mdz mo3917a() {
        return this.f28136e == null ? mdz.m31924a() : mdz.m31925a(this.f28136e.charValue());
    }

    int mo3915a(int i) {
        return this.f28135d.f28130r * mru.m32809a(i, this.f28135d.f28131s, RoundingMode.CEILING);
    }

    void mo3918a(Appendable appendable, byte[] bArr, int i, int i2) {
        bm.m6122a((Object) appendable);
        bm.m6127a(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            m32735b(appendable, bArr, i + i3, Math.min(this.f28135d.f28131s, i2 - i3));
            i3 += this.f28135d.f28131s;
        }
    }

    void m32735b(Appendable appendable, byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        bm.m6122a((Object) appendable);
        bm.m6127a(i, i + i2, bArr.length);
        if (i2 <= this.f28135d.f28131s) {
            z = true;
        } else {
            z = false;
        }
        bm.m6137a(z);
        long j = 0;
        for (i3 = 0; i3 < i2; i3++) {
            j = (j | ((long) (bArr[i + i3] & 255))) << 8;
        }
        int i4 = ((i2 + 1) << 3) - this.f28135d.f28129q;
        i3 = 0;
        while (i3 < (i2 << 3)) {
            appendable.append(this.f28135d.m32726a(((int) (j >>> (i4 - i3))) & this.f28135d.f28128p));
            i3 += this.f28135d.f28129q;
        }
        if (this.f28136e != null) {
            while (i3 < (this.f28135d.f28131s << 3)) {
                appendable.append(this.f28136e.charValue());
                i3 += this.f28135d.f28129q;
            }
        }
    }

    int mo3919b(int i) {
        return (int) (((((long) this.f28135d.f28129q) * ((long) i)) + 7) / 8);
    }

    int mo3916a(byte[] bArr, CharSequence charSequence) {
        bm.m6122a((Object) bArr);
        CharSequence a = mo3917a().mo3739a(charSequence);
        if (this.f28135d.m32728b(a.length())) {
            int i = 0;
            int i2 = 0;
            while (i2 < a.length()) {
                int i3;
                long j = 0;
                int i4 = 0;
                for (i3 = 0; i3 < this.f28135d.f28130r; i3++) {
                    long j2 = j << this.f28135d.f28129q;
                    if (i2 + i3 < a.length()) {
                        i4++;
                        j = j2 | ((long) this.f28135d.m32729c(a.charAt(i4 + i2)));
                    } else {
                        j = j2;
                    }
                }
                int i5 = (this.f28135d.f28131s << 3) - (i4 * this.f28135d.f28129q);
                i3 = (this.f28135d.f28131s - 1) << 3;
                while (i3 >= i5) {
                    i4 = i + 1;
                    bArr[i] = (byte) ((int) ((j >>> i3) & 255));
                    i3 -= 8;
                    i = i4;
                }
                i2 += this.f28135d.f28130r;
            }
            return i;
        }
        throw new mqu("Invalid input length " + a.length());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        stringBuilder.append(this.f28135d.toString());
        if (8 % this.f28135d.f28129q != 0) {
            if (this.f28136e == null) {
                stringBuilder.append(".omitPadding()");
            } else {
                stringBuilder.append(".withPadChar('").append(this.f28136e).append("')");
            }
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mqv)) {
            return false;
        }
        mqv mqv = (mqv) obj;
        if (this.f28135d.equals(mqv.f28135d) && mez.m31976b(this.f28136e, mqv.f28136e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f28135d.hashCode() ^ Arrays.hashCode(new Object[]{this.f28136e});
    }
}
