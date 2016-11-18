package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public final class fdn {
    private static final boolean a = false;
    private static final HashSet<Class> d = new HashSet(Arrays.asList(new Class[]{eum.class, evf.class, evg.class, evt.class, evs.class}));
    private final gma b = gma.a("BabelClient");
    private final bko c;

    static {
        kae kae = glk.o;
    }

    public fdn(bko bko) {
        this.c = bko;
    }

    public void a(Collection<? extends fok> collection, int i, fny fny) {
        for (fok a : collection) {
            a(a, i, fny);
        }
    }

    public void a(Collection<? extends fok> collection, int i) {
        a((Collection) collection, -1, null);
    }

    public void a(fok fok, int i) {
        a(fok, i, null);
    }

    private void a(fok fok, int i, fny fny) {
        if (this.c.k() && d.contains(fok.getClass())) {
            String valueOf = String.valueOf(fok.getClass().getSimpleName());
            String valueOf2 = String.valueOf(glk.b(this.c.a()));
            glk.e("BabelClient", new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("Invalid request ").append(valueOf).append(" for account ").append(valueOf2).toString(), new Object[0]);
            return;
        }
        fok.b(i);
        Context H = gwb.H();
        int g = this.c.g();
        valueOf = "BEGIN ";
        String valueOf3 = String.valueOf(fok.getClass().getSimpleName());
        if (valueOf3.length() != 0) {
            valueOf.concat(valueOf3);
        } else {
            valueOf3 = new String(valueOf);
        }
        this.b.b(faz.a(fok));
        gma gma = this.b;
        valueOf3 = String.valueOf(fok.getClass().getSimpleName());
        gma.b(new StringBuilder(String.valueOf(valueOf3).length() + 12).append(valueOf3).append("_").append(i).toString());
        if (fok.a(g) || fdq.J.b(g)) {
            ((bhl) jyn.a(H, bhl.class)).a(new feg(fok, g));
            return;
        }
        Intent n = RequestWriter.n();
        n.putExtra("account_id", g);
        dzz a = RequestWriter.a(fok.a(), g);
        byte[] h = a.h();
        int length = h.length;
        new StringBuilder(31).append("encodedRequestSize: ").append(length);
        long j = -1;
        if (((long) length) > RequestWriter.f) {
            j = foe.a(H).b(a);
            n.putExtra("database_id", j);
        } else {
            n.putExtra("server_request", h);
        }
        if (RequestWriter.e) {
            String valueOf4 = String.valueOf(fok.getClass().getSimpleName());
            new StringBuilder(String.valueOf(valueOf4).length() + 72).append("Creating request service intent for ").append(valueOf4).append(" request row id ").append(j);
        }
        if (fny != null) {
            fny.a(n);
        } else {
            H.startService(n);
        }
    }
}
