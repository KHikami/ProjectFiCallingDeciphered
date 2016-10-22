import java.math.RoundingMode;
import java.util.Arrays;

final class mqr extends mdz {
    final char[] o;
    final int p;
    final int q;
    final int r;
    final int s;
    private final String t;
    private final byte[] u;
    private final boolean[] v;

    mqr(String str, char[] cArr) {
        int i = 0;
        this.t = (String) bm.a((Object) str);
        this.o = (char[]) bm.a((Object) cArr);
        try {
            this.q = mru.a(cArr.length, RoundingMode.UNNECESSARY);
            int min = Math.min(8, Integer.lowestOneBit(this.q));
            try {
                this.r = 8 / min;
                this.s = this.q / min;
                this.p = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (min = 0; min < cArr.length; min++) {
                    boolean z;
                    char c = cArr[min];
                    bm.a(meb.o.b(c), "Non-ASCII character: %s", c);
                    if (bArr[c] == (byte) -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bm.a(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) min;
                }
                this.u = bArr;
                boolean[] zArr = new boolean[this.r];
                while (i < this.s) {
                    zArr[mru.a(i << 3, this.q, RoundingMode.CEILING)] = true;
                    i++;
                }
                this.v = zArr;
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

    char a(int i) {
        return this.o[i];
    }

    boolean b(int i) {
        return this.v[i % this.r];
    }

    int c(char c) {
        if (c <= '\u007f' && this.u[c] != -1) {
            return this.u[c];
        }
        String valueOf;
        Object concat;
        if (mef.o.b(c)) {
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
        return this.t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mqr)) {
            return false;
        }
        return Arrays.equals(this.o, ((mqr) obj).o);
    }

    public int hashCode() {
        return Arrays.hashCode(this.o);
    }

    public boolean b(char c) {
        return meb.o.b(c) && this.u[c] != -1;
    }
}
