import com.google.api.client.http.GenericUrl;
import com.google.api.client.json.JsonFactory;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.Collections;

public final class keg extends kdv {
    private static kef g;
    private String h;
    private String i;
    private Collection<String> j;
    private PrivateKey k;
    private String l;
    private String m;

    public /* synthetic */ kdv a(Long l) {
        return c(l);
    }

    public /* synthetic */ kdv a(String str) {
        return c(str);
    }

    public /* synthetic */ kdv a(ked ked) {
        return b(ked);
    }

    public /* synthetic */ kdv b(Long l) {
        return d(l);
    }

    public /* synthetic */ kdv b(String str) {
        return d(str);
    }

    static {
        g = new kef();
    }

    public keg() {
        this(new keh());
    }

    private keg(keh keh) {
        super(keh);
        if (keh.k == null) {
            boolean z = keh.i == null && keh.j == null && keh.n == null;
            bc.a(z);
            return;
        }
        this.h = (String) bc.a(keh.i);
        this.i = keh.m;
        this.j = Collections.unmodifiableCollection(keh.j);
        this.k = keh.k;
        this.l = keh.l;
        this.m = keh.n;
    }

    public keg c(String str) {
        return (keg) super.a(str);
    }

    private keg d(String str) {
        if (str != null) {
            boolean z = (this.e == null || this.c == null || this.d == null) ? false : true;
            bc.a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (keg) super.b(str);
    }

    private keg c(Long l) {
        return (keg) super.a(l);
    }

    private keg d(Long l) {
        return (keg) super.b(l);
    }

    private keg b(ked ked) {
        return (keg) super.a(ked);
    }

    protected ked a() {
        if (this.k == null) {
            return super.a();
        }
        kep kep = new kep();
        kep.b("RS256");
        kep.a("JWT");
        kep.c(this.l);
        kes kes = new kes();
        long a = this.b.a();
        kes.a(this.h);
        kes.a(this.f);
        kes.b(Long.valueOf(a / 1000));
        kes.a(Long.valueOf((a / 1000) + 3600));
        kes.b(this.m);
        kfy kfy = new kfy(meu.a(' '));
        kes.put("scope", (Object) kfy.a.a(this.j));
        try {
            PrivateKey privateKey = this.k;
            JsonFactory jsonFactory = this.e;
            String valueOf = String.valueOf(gwb.h(jsonFactory.toByteArray(kep)));
            String valueOf2 = String.valueOf(gwb.h(jsonFactory.toByteArray(kes)));
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(".").append(valueOf2).toString();
            valueOf2 = String.valueOf(gwb.h(gwb.a(gwb.aN(), privateKey, kgn.a(valueOf))));
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(".").append(valueOf2).toString();
            kea kea = new kea(this.c, this.e, new GenericUrl(this.f), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            kea.put("assertion", (Object) valueOf);
            return kea.a();
        } catch (Throwable e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }
}
