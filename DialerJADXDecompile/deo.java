import java.util.Arrays;

/* compiled from: PG */
final class deo {
    final int a;
    final byte[] b;

    deo(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof deo)) {
            return false;
        }
        deo deo = (deo) obj;
        if (this.a == deo.a && Arrays.equals(this.b, deo.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
