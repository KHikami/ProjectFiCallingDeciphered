package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;

/* renamed from: box */
public final class box extends bpb {
    SharedPreferences a;
    final boy b;
    private long c;
    private long d;

    protected box(bnp bnp) {
        super(bnp);
        this.d = -1;
        this.b = new boy(this, "monitoring", ((Long) boq.D.a()).longValue());
    }

    protected final void a() {
        this.a = g().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final long b() {
        cqn.b();
        o();
        if (this.c == 0) {
            long j = this.a.getLong("first_run", 0);
            if (j != 0) {
                this.c = j;
            } else {
                j = f().a();
                Editor edit = this.a.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    e("Failed to commit first run time");
                }
                this.c = j;
            }
        }
        return this.c;
    }

    public final boz c() {
        return new boz(f(), b());
    }

    public final String m() {
        cqn.b();
        o();
        CharSequence string = this.a.getString("installation_campaign", null);
        return TextUtils.isEmpty(string) ? null : string;
    }

    public final long d() {
        cqn.b();
        o();
        if (this.d == -1) {
            this.d = this.a.getLong("last_dispatch", 0);
        }
        return this.d;
    }

    public final void l() {
        cqn.b();
        o();
        long a = f().a();
        Editor edit = this.a.edit();
        edit.putLong("last_dispatch", a);
        edit.apply();
        this.d = a;
    }
}
