package p000;

import android.content.Intent;
import com.google.api.client.http.HttpStatusCodes;
import java.util.Collection;

public abstract class fou implements fqd {
    private static final long serialVersionUID = 1;
    public String f13593a;
    public edo f13594b;
    public long f13595c;

    protected abstract void mo2061a(blo blo, fhc fhc);

    public fou(String str, edo edo, long j) {
        this.f13593a = str;
        this.f13594b = edo;
        this.f13595c = j;
    }

    public String m15827a() {
        return this.f13593a;
    }

    public void m15830a(String str) {
        this.f13593a = str;
    }

    public edo m15831b() {
        return this.f13594b;
    }

    public long m15832c() {
        return this.f13595c;
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        String valueOf;
        String str;
        bko e = fde.m15018e(i);
        if (glk.m17973a("Babel_ServerUpdate", 3)) {
            String str2 = "Babel_ServerUpdate";
            String valueOf2 = String.valueOf(getClass().getSimpleName());
            String valueOf3 = String.valueOf(e.m5632b());
            if (this.f13593a != null) {
                String str3 = "update convId ";
                valueOf = String.valueOf(this.f13593a);
                valueOf = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            } else {
                valueOf = "";
            }
            glk.m17970a(str2, new StringBuilder(((String.valueOf(valueOf2).length() + 32) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf).length()).append("processServerUpdate: ").append(valueOf2).append(", account: ").append(valueOf3).append(valueOf).toString(), new Object[0]);
        }
        fdn e2 = fde.m15019e(e);
        fhc fhc = new fhc();
        fhc.m15307a(e);
        fhc.m15304a();
        blo blo = new blo(gwb.m1400H(), i);
        mo2061a(blo, fhc);
        fhc.m15315d();
        Collection b = fhc.m15311b();
        if (!b.isEmpty()) {
            if (glk.m17973a("Babel_ServerUpdate", 3)) {
                int size = b.size();
                String valueOf4 = String.valueOf(getClass().getSimpleName());
                glk.m17970a("Babel_ServerUpdate", new StringBuilder(String.valueOf(valueOf4).length() + 66).append("processServerUpdate: sending ").append(size).append(" requests from processing ").append(valueOf4).toString(), new Object[0]);
            }
            if (e2 != null) {
                e2.m15079a(b, -1);
            }
        }
        fhc.m15313c();
        fhe f = fhc.m15317f();
        if (glk.m17973a("Babel_ServerUpdate", 3)) {
            str = "Babel_ServerUpdate";
            str3 = "update should trigger notification? ";
            valueOf = String.valueOf(f.toString());
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.m17970a(str, valueOf, new Object[0]);
        }
        str = "";
        valueOf = "";
        if (this instanceof fpl) {
            fpl fpl = (fpl) this;
            String a = fpl.m15827a();
            str = fpl.m15842i();
            valueOf = a;
        }
        long b2 = glj.m17963b();
        if (f == fhe.LOUD) {
            ba.m4548a(i, b2, 10, ba.m4618c().m12786a((int) HttpStatusCodes.STATUS_CODE_FORBIDDEN).m12798c(str).m12789a(valueOf));
        }
        if (blo.m6006b(this.f13594b) != 1) {
            if (fhc.m15318g() && fdq.f12773O.m14370b(i)) {
                ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1833b(i, f, true, mfa_android_content_Intent);
            } else {
                ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1828a(i, f, true, mfa_android_content_Intent);
            }
        }
    }
}
