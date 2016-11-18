package p000;

import java.math.RoundingMode;
import java.util.Arrays;

final class mqr extends mdz {
    final char[] f28127o;
    final int f28128p;
    final int f28129q;
    final int f28130r;
    final int f28131s;
    private final String f28132t;
    private final byte[] f28133u;
    private final boolean[] f28134v;

    mqr(String str, char[] cArr) {
        int i = 0;
        this.f28132t = (String) bm.m6122a((Object) str);
        this.f28127o = (char[]) bm.m6122a((Object) cArr);
        try {
            this.f28129q = mru.m32810a(cArr.length, RoundingMode.UNNECESSARY);
            int min = Math.min(8, Integer.lowestOneBit(this.f28129q));
            try {
                this.f28130r = 8 / min;
                this.f28131s = this.f28129q / min;
                this.f28128p = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (min = 0; min < cArr.length; min++) {
                    boolean z;
                    char c = cArr[min];
                    bm.m6139a(meb.f27568o.mo3738b(c), "Non-ASCII character: %s", c);
                    if (bArr[c] == (byte) -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bm.m6139a(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) min;
                }
                this.f28133u = bArr;
                boolean[] zArr = new boolean[this.f28130r];
                while (i < this.f28131s) {
                    zArr[mru.m32809a(i << 3, this.f28129q, RoundingMode.CEILING)] = true;
                    i++;
                }
                this.f28134v = zArr;
            } catch (Throwable e) {
                Throwable th = e;
                String str2 = "Illegal alphabet ";
                String valueOf = String.valueOf(new String(cArr));
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            }
        } catch (Throwable e2) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
        }
    }

    char m32726a(int i) {
        return this.f28127o[i];
    }

    boolean m32728b(int i) {
        return this.f28134v[i % this.f28130r];
    }

    int m32729c(char c) {
        if (c <= '' && this.f28133u[c] != (byte) -1) {
            return this.f28133u[c];
        }
        String valueOf;
        Object concat;
        if (mef.f27574o.mo3738b(c)) {
            String str = "0x";
            valueOf = String.valueOf(Integer.toHexString(c));
            concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } else {
            concat = Character.valueOf(c);
        }
        valueOf = String.valueOf(concat);
        throw new mqu(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unrecognized character: ").append(valueOf).toString());
    }

    public String toString() {
        return this.f28132t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mqr)) {
            return false;
        }
        return Arrays.equals(this.f28127o, ((mqr) obj).f28127o);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f28127o);
    }

    public boolean mo3738b(char c) {
        return meb.f27568o.mo3738b(c) && this.f28133u[c] != (byte) -1;
    }
}
