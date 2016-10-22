import java.util.Arrays;

/* compiled from: PG */
public final class dje {
    private static final djd[] e;
    private static dje f;
    final boolean a;
    public final String[] b;
    public final String[] c;
    public final boolean d;

    static {
        e = new djd[]{djd.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, djd.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, djd.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, djd.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, djd.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, djd.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, djd.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, djd.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, djd.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, djd.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, djd.TLS_RSA_WITH_AES_128_GCM_SHA256, djd.TLS_RSA_WITH_AES_128_CBC_SHA, djd.TLS_RSA_WITH_AES_256_CBC_SHA, djd.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = new djf(true).a(e).a(djo.TLS_1_2, djo.TLS_1_1, djo.TLS_1_0).a(true).a();
        new djf(f).a(djo.TLS_1_0).a(true).a();
        new djf(false).a();
    }

    dje(djf djf) {
        this.a = djf.a;
        this.b = djf.b;
        this.c = djf.c;
        this.d = djf.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dje)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        dje dje = (dje) obj;
        if (this.a != dje.a) {
            return false;
        }
        if (!this.a || (Arrays.equals(this.b, dje.b) && Arrays.equals(this.c, dje.c) && this.d == dje.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        return (this.d ? 0 : 1) + ((((Arrays.hashCode(this.b) + 527) * 31) + Arrays.hashCode(this.c)) * 31);
    }

    public final String toString() {
        int i = 0;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        Object obj;
        String str;
        if (this.b == null) {
            obj = null;
        } else {
            djd[] djdArr = new djd[this.b.length];
            for (int i2 = 0; i2 < this.b.length; i2++) {
                djdArr[i2] = djd.b(this.b[i2]);
            }
            obj = djp.a(djdArr);
        }
        if (obj == null) {
            str = "[use default]";
        } else {
            str = obj.toString();
        }
        djo[] djoArr = new djo[this.c.length];
        while (i < this.c.length) {
            djoArr[i] = djo.a(this.c[i]);
            i++;
        }
        String valueOf = String.valueOf(djp.a(djoArr));
        return new StringBuilder((String.valueOf(str).length() + 72) + String.valueOf(valueOf).length()).append("ConnectionSpec(cipherSuites=").append(str).append(", tlsVersions=").append(valueOf).append(", supportsTlsExtensions=").append(this.d).append(")").toString();
    }
}
