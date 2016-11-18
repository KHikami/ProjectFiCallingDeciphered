package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public final class fdn {
    private static final boolean f12748a = false;
    private static final HashSet<Class> f12749d = new HashSet(Arrays.asList(new Class[]{eum.class, evf.class, evg.class, evt.class, evs.class}));
    private final gma f12750b = gma.m18073a("BabelClient");
    private final bko f12751c;

    static {
        kae kae = glk.f15568o;
    }

    public fdn(bko bko) {
        this.f12751c = bko;
    }

    public void m15080a(Collection<? extends fok> collection, int i, fny fny) {
        for (fok a : collection) {
            m15077a(a, i, fny);
        }
    }

    public void m15079a(Collection<? extends fok> collection, int i) {
        m15080a((Collection) collection, -1, null);
    }

    public void m15078a(fok fok, int i) {
        m15077a(fok, i, null);
    }

    private void m15077a(fok fok, int i, fny fny) {
        if (this.f12751c.m5642k() && f12749d.contains(fok.getClass())) {
            String valueOf = String.valueOf(fok.getClass().getSimpleName());
            String valueOf2 = String.valueOf(glk.m17974b(this.f12751c.m5629a()));
            glk.m17982e("BabelClient", new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("Invalid request ").append(valueOf).append(" for account ").append(valueOf2).toString(), new Object[0]);
            return;
        }
        fok.mo1023b(i);
        Context H = gwb.m1400H();
        int g = this.f12751c.m5638g();
        valueOf = "BEGIN ";
        String valueOf3 = String.valueOf(fok.getClass().getSimpleName());
        if (valueOf3.length() != 0) {
            valueOf.concat(valueOf3);
        } else {
            valueOf3 = new String(valueOf);
        }
        this.f12750b.m18078b(faz.m14869a(fok));
        gma gma = this.f12750b;
        valueOf3 = String.valueOf(fok.getClass().getSimpleName());
        gma.m18078b(new StringBuilder(String.valueOf(valueOf3).length() + 12).append(valueOf3).append("_").append(i).toString());
        if (fok.mo1022a(g) || fdq.f12768J.m14370b(g)) {
            ((bhl) jyn.m25426a(H, bhl.class)).mo550a(new feg(fok, g));
            return;
        }
        Intent n = RequestWriter.m9149n();
        n.putExtra("account_id", g);
        dzz a = RequestWriter.m9145a(fok.mo1021a(), g);
        byte[] h = a.m13261h();
        int length = h.length;
        new StringBuilder(31).append("encodedRequestSize: ").append(length);
        long j = -1;
        if (((long) length) > RequestWriter.f6782f) {
            j = foe.m15782a(H).m15790b(a);
            n.putExtra("database_id", j);
        } else {
            n.putExtra("server_request", h);
        }
        if (RequestWriter.f6781e) {
            String valueOf4 = String.valueOf(fok.getClass().getSimpleName());
            new StringBuilder(String.valueOf(valueOf4).length() + 72).append("Creating request service intent for ").append(valueOf4).append(" request row id ").append(j);
        }
        if (fny != null) {
            fny.mo1186a(n);
        } else {
            H.startService(n);
        }
    }
}
