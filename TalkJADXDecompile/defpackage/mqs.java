package defpackage;

/* renamed from: mqs */
final class mqs extends mqv {
    final char[] c;

    mqs(String str, String str2) {
        this(new mqr(str, str2.toCharArray()));
    }

    private mqs(mqr mqr) {
        boolean z;
        int i = 0;
        super(mqr, null);
        this.c = new char[512];
        if (mqr.o.length == 16) {
            z = true;
        } else {
            z = false;
        }
        bm.a(z);
        while (i < 256) {
            this.c[i] = mqr.a(i >>> 4);
            this.c[i | 256] = mqr.a(i & 15);
            i++;
        }
    }

    void a(Appendable appendable, byte[] bArr, int i, int i2) {
        bm.a((Object) appendable);
        bm.a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 255;
            appendable.append(this.c[i4]);
            appendable.append(this.c[i4 | 256]);
        }
    }

    int a(byte[] bArr, CharSequence charSequence) {
        int i = 0;
        bm.a((Object) bArr);
        if (charSequence.length() % 2 == 1) {
            throw new mqu("Invalid input length " + charSequence.length());
        }
        int i2 = 0;
        while (i < charSequence.length()) {
            int c = this.d.c(charSequence.charAt(i + 1)) | (this.d.c(charSequence.charAt(i)) << 4);
            int i3 = i2 + 1;
            bArr[i2] = (byte) c;
            i += 2;
            i2 = i3;
        }
        return i2;
    }
}
