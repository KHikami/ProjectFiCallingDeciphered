import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
final class dbq extends cxn {
    final char[] a;
    final int b;
    final int c;
    final int d;
    final int e;
    private final String f;
    private final byte[] g;
    private final boolean[] h;

    dbq(String str, char[] cArr) {
        int i = 0;
        this.f = (String) cob.i((Object) str);
        this.a = (char[]) cob.i((Object) cArr);
        try {
            this.c = dcb.a(cArr.length, RoundingMode.UNNECESSARY);
            int min = Math.min(8, Integer.lowestOneBit(this.c));
            try {
                this.d = 8 / min;
                this.e = this.c / min;
                this.b = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (min = 0; min < cArr.length; min++) {
                    boolean z;
                    char c = cArr[min];
                    cob.a(cxp.a.b(c), "Non-ASCII character: %s", c);
                    if (bArr[c] == (byte) -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cob.a(z, "Duplicate character: %s", c);
                    bArr[c] = (byte) min;
                }
                this.g = bArr;
                boolean[] zArr = new boolean[this.d];
                while (i < this.e) {
                    zArr[dcb.a(i << 3, this.c, RoundingMode.CEILING)] = true;
                    i++;
                }
                this.h = zArr;
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

    final boolean a(int i) {
        return this.h[i % this.d];
    }

    final int c(char c) {
        if (c <= '\u007f' && this.g[c] != -1) {
            return this.g[c];
        }
        String valueOf;
        Object concat;
        if (cxt.a.b(c)) {
            String str = "0x";
            valueOf = String.valueOf(Integer.toHexString(c));
            concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } else {
            concat = Character.valueOf(c);
        }
        valueOf = String.valueOf(concat);
        throw new dbt(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unrecognized character: ").append(valueOf).toString());
    }

    public final String toString() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dbq)) {
            return false;
        }
        return Arrays.equals(this.a, ((dbq) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final boolean b(char c) {
        return cxp.a.b(c) && this.g[c] != -1;
    }
}
