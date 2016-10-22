import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public final class dey {
    public static final dey a;
    private static final dex[] f;
    public final boolean b;
    public final boolean c;
    final String[] d;
    final String[] e;

    static {
        f = new dex[]{dex.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, dex.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, dex.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, dex.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, dex.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, dex.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, dex.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, dex.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, dex.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, dex.TLS_RSA_WITH_AES_128_GCM_SHA256, dex.TLS_RSA_WITH_AES_128_CBC_SHA, dex.TLS_RSA_WITH_AES_256_CBC_SHA, dex.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        a = new dez(true).a(f).a(dfa.TLS_1_2, dfa.TLS_1_1, dfa.TLS_1_0).a(true).a();
        new dez(a).a(dfa.TLS_1_0).a(true).a();
        new dez(false).a();
    }

    dey(dez dez) {
        this.b = dez.a;
        this.d = dez.b;
        this.e = dez.c;
        this.c = dez.d;
    }

    public final List a() {
        if (this.d == null) {
            return null;
        }
        dex[] dexArr = new dex[this.d.length];
        for (int i = 0; i < this.d.length; i++) {
            dexArr[i] = dex.a(this.d[i]);
        }
        return dfb.a(dexArr);
    }

    public final List b() {
        if (this.e == null) {
            return null;
        }
        dfa[] dfaArr = new dfa[this.e.length];
        for (int i = 0; i < this.e.length; i++) {
            dfaArr[i] = dfa.a(this.e[i]);
        }
        return dfb.a(dfaArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        dey dey = (dey) obj;
        if (this.b != dey.b) {
            return false;
        }
        if (!this.b || (Arrays.equals(this.d, dey.d) && Arrays.equals(this.e, dey.e) && this.c == dey.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.b) {
            return 17;
        }
        return (this.c ? 0 : 1) + ((((Arrays.hashCode(this.d) + 527) * 31) + Arrays.hashCode(this.e)) * 31);
    }

    public final String toString() {
        if (!this.b) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.d != null ? a().toString() : "[all enabled]") + ", tlsVersions=" + (this.e != null ? b().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.c + ")";
    }
}
