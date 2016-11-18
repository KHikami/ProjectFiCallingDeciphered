package p000;

import android.content.Context;

public abstract class fjz implements bhf, bhg, bhj, bhm {
    public final int f13300a;
    public final String f13301b;
    private final bhr f13302c;

    protected abstract euj mo2024b(Context context);

    protected fjz(int i, String str, long j) {
        this.f13300a = i;
        this.f13301b = str;
        bhs c = new bhs().m5271c(j);
        if (j < bhr.f3369a) {
            c.m5270b(j);
        }
        this.f13302c = c.m5267a();
    }

    public bhr mo540a() {
        return this.f13302c;
    }

    public void mo541a(Context context) {
        String str = "Babel_SrvOpTask";
        String str2 = "The task expired:";
        String valueOf = String.valueOf(toString());
        glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
    }

    public bhu mo544d() {
        return new bhv().m5277a(true).m5276a();
    }

    protected void mo2025c(Context context) {
    }

    public final int mo539a(Context context, bhb bhb) {
        String valueOf;
        try {
            mo2025c(context);
            euj b = mo2024b(context);
            try {
                b.m8108f();
                evz d = b.mo1043d();
                if (d == null) {
                    return bhn.f3348a;
                }
                evz.m8117a(this.f13300a, d.f5801c);
                return bhn.f3348a;
            } catch (fdo e) {
                String valueOf2 = String.valueOf(toString());
                valueOf = String.valueOf(b);
                String valueOf3 = String.valueOf(e);
                glk.m17970a("Babel_SrvOpTask", new StringBuilder(((String.valueOf(valueOf2).length() + 25) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()).append("The task ").append(valueOf2).append(" failed in ").append(valueOf).append(" for ").append(valueOf3).toString(), new Object[0]);
                return bhn.f3351d;
            }
        } catch (fka e2) {
            String valueOf4 = String.valueOf(toString());
            valueOf = String.valueOf(e2);
            glk.m17970a("Babel_SrvOpTask", new StringBuilder((String.valueOf(valueOf4).length() + 37) + String.valueOf(valueOf).length()).append("The task ").append(valueOf4).append(" failed in local operations ").append(valueOf).toString(), new Object[0]);
            return bhn.f3351d;
        }
    }

    public bhk mo543c() {
        return bhk.REPLACE_OLD;
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String str = this.f13301b;
        return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()).append(valueOf).append(str).append(this.f13300a).toString();
    }

    protected final String m15523a(String str) {
        String valueOf = String.valueOf(getClass().getSimpleName());
        int i = this.f13300a;
        String str2 = this.f13301b;
        return new StringBuilder(((String.valueOf(valueOf).length() + 41) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(" [account=").append(i).append(", conversationId=").append(str2).append(", ").append(str).append("]").toString();
    }
}
