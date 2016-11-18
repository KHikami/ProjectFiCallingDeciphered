package defpackage;

import android.content.Context;

public abstract class fjz implements bhf, bhg, bhj, bhm {
    public final int a;
    public final String b;
    private final bhr c;

    protected abstract euj b(Context context);

    protected fjz(int i, String str, long j) {
        this.a = i;
        this.b = str;
        bhs c = new bhs().c(j);
        if (j < bhr.a) {
            c.b(j);
        }
        this.c = c.a();
    }

    public bhr a() {
        return this.c;
    }

    public void a(Context context) {
        String str = "Babel_SrvOpTask";
        String str2 = "The task expired:";
        String valueOf = String.valueOf(toString());
        glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
    }

    public bhu d() {
        return new bhv().a(true).a();
    }

    protected void c(Context context) {
    }

    public final int a(Context context, bhb bhb) {
        String valueOf;
        try {
            c(context);
            euj b = b(context);
            try {
                b.f();
                evz d = b.d();
                if (d == null) {
                    return bhn.a;
                }
                evz.a(this.a, d.c);
                return bhn.a;
            } catch (fdo e) {
                String valueOf2 = String.valueOf(toString());
                valueOf = String.valueOf(b);
                String valueOf3 = String.valueOf(e);
                glk.a("Babel_SrvOpTask", new StringBuilder(((String.valueOf(valueOf2).length() + 25) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()).append("The task ").append(valueOf2).append(" failed in ").append(valueOf).append(" for ").append(valueOf3).toString(), new Object[0]);
                return bhn.d;
            }
        } catch (fka e2) {
            String valueOf4 = String.valueOf(toString());
            valueOf = String.valueOf(e2);
            glk.a("Babel_SrvOpTask", new StringBuilder((String.valueOf(valueOf4).length() + 37) + String.valueOf(valueOf).length()).append("The task ").append(valueOf4).append(" failed in local operations ").append(valueOf).toString(), new Object[0]);
            return bhn.d;
        }
    }

    public bhk c() {
        return bhk.REPLACE_OLD;
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = this.b;
        return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()).append(valueOf).append(str).append(this.a).toString();
    }

    protected final String a(String str) {
        String valueOf = String.valueOf(getClass().getSimpleName());
        int i = this.a;
        String str2 = this.b;
        return new StringBuilder(((String.valueOf(valueOf).length() + 41) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(" [account=").append(i).append(", conversationId=").append(str2).append(", ").append(str).append("]").toString();
    }
}
