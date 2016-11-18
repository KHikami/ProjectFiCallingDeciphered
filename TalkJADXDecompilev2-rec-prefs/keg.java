package p000;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.json.JsonFactory;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.Collections;

public final class keg extends kdv {
    private static kef f21476g = new kef();
    private String f21477h;
    private String f21478i;
    private Collection<String> f21479j;
    private PrivateKey f21480k;
    private String f21481l;
    private String f21482m;

    public /* synthetic */ kdv mo3644a(Long l) {
        return m25648c(l);
    }

    public /* synthetic */ kdv mo3645a(String str) {
        return m25657c(str);
    }

    public /* synthetic */ kdv mo3646a(ked ked) {
        return m25647b(ked);
    }

    public /* synthetic */ kdv mo3648b(Long l) {
        return m25649d(l);
    }

    public /* synthetic */ kdv mo3649b(String str) {
        return m25650d(str);
    }

    public keg() {
        this(new keh());
    }

    private keg(keh keh) {
        super(keh);
        if (keh.f21485k == null) {
            boolean z = keh.f21483i == null && keh.f21484j == null && keh.f21488n == null;
            bc.m4814a(z);
            return;
        }
        this.f21477h = (String) bc.m4799a(keh.f21483i);
        this.f21478i = keh.f21487m;
        this.f21479j = Collections.unmodifiableCollection(keh.f21484j);
        this.f21480k = keh.f21485k;
        this.f21481l = keh.f21486l;
        this.f21482m = keh.f21488n;
    }

    public keg m25657c(String str) {
        return (keg) super.mo3645a(str);
    }

    private keg m25650d(String str) {
        if (str != null) {
            boolean z = (this.f21434e == null || this.f21432c == null || this.f21433d == null) ? false : true;
            bc.m4815a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (keg) super.mo3649b(str);
    }

    private keg m25648c(Long l) {
        return (keg) super.mo3644a(l);
    }

    private keg m25649d(Long l) {
        return (keg) super.mo3648b(l);
    }

    private keg m25647b(ked ked) {
        return (keg) super.mo3646a(ked);
    }

    protected ked mo3647a() {
        if (this.f21480k == null) {
            return super.mo3647a();
        }
        kep kep = new kep();
        kep.m25671b("RS256");
        kep.m25668a("JWT");
        kep.m25672c(this.f21481l);
        kes kes = new kes();
        long a = this.f21431b.mo3671a();
        kes.m25678a(this.f21477h);
        kes.m25677a(this.f21435f);
        kes.m25679b(Long.valueOf(a / 1000));
        kes.m25676a(Long.valueOf((a / 1000) + 3600));
        kes.m25680b(this.f21482m);
        kfy kfy = new kfy(meu.m31959a(' '));
        kes.put("scope", (Object) kfy.f21627a.m31963a(this.f21479j));
        try {
            PrivateKey privateKey = this.f21480k;
            JsonFactory jsonFactory = this.f21434e;
            String valueOf = String.valueOf(gwb.m2234h(jsonFactory.toByteArray(kep)));
            String valueOf2 = String.valueOf(gwb.m2234h(jsonFactory.toByteArray(kes)));
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(".").append(valueOf2).toString();
            valueOf2 = String.valueOf(gwb.m2234h(gwb.m1951a(gwb.aN(), privateKey, kgn.m25772a(valueOf))));
            valueOf = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf).append(".").append(valueOf2).toString();
            kea kea = new kea(this.f21432c, this.f21434e, new GenericUrl(this.f21435f), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            kea.put("assertion", (Object) valueOf);
            return kea.m25620a();
        } catch (Throwable e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }
}
