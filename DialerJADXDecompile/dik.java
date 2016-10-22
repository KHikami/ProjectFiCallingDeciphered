import io.grpc.internal.ar;
import io.grpc.internal.c;
import io.grpc.internal.cd;
import io.grpc.internal.t;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
public final class dik extends c {
    static final cd c;
    private static dey d;
    private dey e;
    private dij f;
    private int g;

    static {
        d = new dez(dey.a).a(dex.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, dex.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, dex.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, dex.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, dex.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, dex.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, dex.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, dex.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384).a(dfa.TLS_1_2).a(true).a();
        c = new dil();
    }

    public dik(String str, int i) {
        this(ar.a(str, i));
    }

    private dik(String str) {
        super(str);
        this.e = d;
        this.f = dij.TLS;
        this.g = 104857600;
    }

    protected final t a() {
        SSLSocketFactory sSLSocketFactory;
        switch (dim.a[this.f.ordinal()]) {
            case rq.b /*1*/:
                sSLSocketFactory = null;
                break;
            case rq.c /*2*/:
                sSLSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                break;
            default:
                String valueOf = String.valueOf(this.f);
                throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Unknown negotiation type: ").append(valueOf).toString());
        }
        return new din(null, sSLSocketFactory, this.e, this.g);
    }

    protected final dfc b() {
        int i;
        switch (dim.a[this.f.ordinal()]) {
            case rq.b /*1*/:
                i = 80;
                break;
            case rq.c /*2*/:
                i = 443;
                break;
            default:
                String valueOf = String.valueOf(this.f);
                throw new AssertionError(new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(" not handled").toString());
        }
        dfd a = dfc.a();
        a.a.a.put(dhg.b, Integer.valueOf(i));
        cob.b(a.a != null, (Object) "Already built");
        dfc dfc = a.a;
        a.a = null;
        return dfc;
    }
}
