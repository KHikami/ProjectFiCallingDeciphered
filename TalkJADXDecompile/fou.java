import android.content.Intent;
import com.google.api.client.http.HttpStatusCodes;
import java.util.Collection;

public abstract class fou implements fqd {
    private static final long serialVersionUID = 1;
    public String a;
    public edo b;
    public long c;

    protected abstract void a(blo blo, fhc fhc);

    public fou(String str, edo edo, long j) {
        this.a = str;
        this.b = edo;
        this.c = j;
    }

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public edo b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public void a(int i, mfa<Intent> mfa_android_content_Intent) {
        String valueOf;
        String str;
        bko e = fde.e(i);
        if (glk.a("Babel_ServerUpdate", 3)) {
            String str2 = "Babel_ServerUpdate";
            String valueOf2 = String.valueOf(getClass().getSimpleName());
            String valueOf3 = String.valueOf(e.b());
            if (this.a != null) {
                String str3 = "update convId ";
                valueOf = String.valueOf(this.a);
                valueOf = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            } else {
                valueOf = "";
            }
            glk.a(str2, new StringBuilder(((String.valueOf(valueOf2).length() + 32) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf).length()).append("processServerUpdate: ").append(valueOf2).append(", account: ").append(valueOf3).append(valueOf).toString(), new Object[0]);
        }
        fdn e2 = fde.e(e);
        fhc fhc = new fhc();
        fhc.a(e);
        fhc.a();
        blo blo = new blo(gwb.H(), i);
        a(blo, fhc);
        fhc.d();
        Collection b = fhc.b();
        if (!b.isEmpty()) {
            if (glk.a("Babel_ServerUpdate", 3)) {
                int size = b.size();
                String valueOf4 = String.valueOf(getClass().getSimpleName());
                glk.a("Babel_ServerUpdate", new StringBuilder(String.valueOf(valueOf4).length() + 66).append("processServerUpdate: sending ").append(size).append(" requests from processing ").append(valueOf4).toString(), new Object[0]);
            }
            if (e2 != null) {
                e2.a(b, -1);
            }
        }
        fhc.c();
        fhe f = fhc.f();
        if (glk.a("Babel_ServerUpdate", 3)) {
            str = "Babel_ServerUpdate";
            str3 = "update should trigger notification? ";
            valueOf = String.valueOf(f.toString());
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            glk.a(str, valueOf, new Object[0]);
        }
        str = "";
        valueOf = "";
        if (this instanceof fpl) {
            fpl fpl = (fpl) this;
            String a = fpl.a();
            str = fpl.i();
            valueOf = a;
        }
        long b2 = glj.b();
        if (f == fhe.LOUD) {
            ba.a(i, b2, 10, ba.c().a((int) HttpStatusCodes.STATUS_CODE_FORBIDDEN).c(str).a(valueOf));
        }
        if (blo.b(this.b) != 1) {
            if (fhc.g() && fdq.O.b(i)) {
                ((ect) jyn.a(gwb.H(), ect.class)).b(i, f, true, mfa_android_content_Intent);
            } else {
                ((ect) jyn.a(gwb.H(), ect.class)).a(i, f, true, mfa_android_content_Intent);
            }
        }
    }
}
