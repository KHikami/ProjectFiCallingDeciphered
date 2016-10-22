/* compiled from: PG */
final class dbr extends dbu {
    private char[] d;

    dbr(String str, String str2) {
        this(new dbq(str, str2.toCharArray()));
    }

    private dbr(dbq dbq) {
        boolean z;
        int i = 0;
        super(dbq, null);
        this.d = new char[512];
        if (dbq.a.length == 16) {
            z = true;
        } else {
            z = false;
        }
        cob.a(z);
        while (i < 256) {
            this.d[i] = dbq.a[i >>> 4];
            this.d[i | 256] = dbq.a[i & 15];
            i++;
        }
    }

    final void a(Appendable appendable, byte[] bArr, int i, int i2) {
        cob.i((Object) appendable);
        cob.b(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i + i3] & 255;
            appendable.append(this.d[i4]);
            appendable.append(this.d[i4 | 256]);
        }
    }

    final int a(byte[] bArr, CharSequence charSequence) {
        int i = 0;
        cob.i((Object) bArr);
        if (charSequence.length() % 2 == 1) {
            throw new dbt("Invalid input length " + charSequence.length());
        }
        int i2 = 0;
        while (i < charSequence.length()) {
            int c = this.c.c(charSequence.charAt(i + 1)) | (this.c.c(charSequence.charAt(i)) << 4);
            int i3 = i2 + 1;
            bArr[i2] = (byte) c;
            i += 2;
            i2 = i3;
        }
        return i2;
    }
}
