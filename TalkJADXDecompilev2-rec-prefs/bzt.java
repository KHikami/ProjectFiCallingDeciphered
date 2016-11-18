package p000;

import android.content.Context;

final class bzt extends jgw implements gia<bow> {
    final /* synthetic */ bzq f4847a;
    private czd f4848b;

    public /* synthetic */ void mo774a(ayo ayo) {
        m7035c();
    }

    public /* bridge */ /* synthetic */ void mo775a(ayo ayo, Exception exception) {
        m7034a(exception);
    }

    public bzt(bzq bzq, Context context, ed edVar) {
        this.f4847a = bzq;
        super(context, edVar);
    }

    private void m7035c() {
        String str = "ConversationChange : ";
        String valueOf = String.valueOf(this.f4847a.f4835b.m6921a());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (this.f4848b == null || !this.f4848b.m11338b()) {
            new bzu(this, this.f4847a.f4834a.mo2320c(), this.f4847a.f4834a.mo2317a()).execute(new Void[0]);
            return;
        }
        this.f4848b.mo1484a();
        this.f4847a.f4835b.m6961u();
    }

    public void mo795a(String str, String str2, String str3, boolean z) {
        this.f4848b = new czd(this.c);
        this.f4848b.mo1486a(str);
    }

    public void mo794a(String str) {
        if (this.f4848b != null) {
            this.f4848b.mo1484a();
        }
    }

    public boolean mo796a(jgz jgz) {
        return false;
    }

    public boolean m7040a() {
        if (this.f4848b != null) {
            this.f4848b.mo1484a();
        }
        gwb.m1863a(new bzw(this, bc.f2939W));
        if (this.f4847a.f4835b.m6954n() == 2) {
            this.f4847a.f4835b.m6939d(1);
        } else if (this.f4847a.f4835b.m6954n() == 1) {
            this.f4847a.f4835b.m6939d(2);
        }
        return false;
    }

    private void m7034a(Exception exception) {
        m7040a();
    }
}
