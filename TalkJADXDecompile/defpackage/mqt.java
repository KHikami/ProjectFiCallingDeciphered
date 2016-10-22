package defpackage;

/* renamed from: mqt */
final class mqt extends mqv {
    mqt(String str, String str2, Character ch) {
        this(new mqr(str, str2.toCharArray()), ch);
    }

    private mqt(mqr mqr, Character ch) {
        super(mqr, ch);
        bm.a(mqr.o.length == 64);
    }

    void a(Appendable appendable, byte[] bArr, int i, int i2) {
        bm.a((Object) appendable);
        bm.a(i, i + i2, bArr.length);
        int i3 = i;
        for (int i4 = i2; i4 >= 3; i4 -= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            i5 = ((bArr[i5] & 255) << 8) | ((bArr[i3] & 255) << 16);
            i3 = i6 + 1;
            i5 |= bArr[i6] & 255;
            appendable.append(this.d.a(i5 >>> 18));
            appendable.append(this.d.a((i5 >>> 12) & 63));
            appendable.append(this.d.a((i5 >>> 6) & 63));
            appendable.append(this.d.a(i5 & 63));
        }
        if (i3 < i + i2) {
            b(appendable, bArr, i3, (i + i2) - i3);
        }
    }

    int a(byte[] bArr, CharSequence charSequence) {
        int i = 0;
        bm.a((Object) bArr);
        CharSequence a = a().a(charSequence);
        if (this.d.b(a.length())) {
            int i2 = 0;
            while (i < a.length()) {
                int i3 = i + 1;
                int c = this.d.c(a.charAt(i)) << 18;
                i = i3 + 1;
                c |= this.d.c(a.charAt(i3)) << 12;
                i3 = i2 + 1;
                bArr[i2] = (byte) (c >>> 16);
                if (i < a.length()) {
                    i2 = i + 1;
                    int c2 = c | (this.d.c(a.charAt(i)) << 6);
                    c = i3 + 1;
                    bArr[i3] = (byte) (c2 >>> 8);
                    if (i2 < a.length()) {
                        i = i2 + 1;
                        i3 = c2 | this.d.c(a.charAt(i2));
                        i2 = c + 1;
                        bArr[c] = (byte) i3;
                    } else {
                        i = i2;
                        i2 = c;
                    }
                } else {
                    i2 = i3;
                }
            }
            return i2;
        }
        throw new mqu("Invalid input length " + a.length());
    }
}
