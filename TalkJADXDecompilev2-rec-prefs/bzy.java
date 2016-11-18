package p000;

import android.content.Context;

final class bzy extends jgw implements gia<bow> {
    czd f4863a;
    final /* synthetic */ bzx f4864b;

    public /* bridge */ /* synthetic */ void mo775a(ayo ayo, Exception exception) {
        m7053a(exception);
    }

    public bzy(bzx bzx, Context context, ed edVar) {
        this.f4864b = bzx;
        super(context, edVar);
    }

    private void m7049a(bow bow) {
        String str = "ConversationChange : ";
        String valueOf = String.valueOf(this.f4864b.f4856b.m6921a());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (this.f4864b.f4856b.m6954n() == 1) {
            new bzz(this, this.f4864b.f4855a.mo2320c(), bow, this.f4864b.f4855a.mo2317a()).execute(new Void[0]);
        }
    }

    public void mo795a(String str, String str2, String str3, boolean z) {
        this.f4863a = new czd(this.c);
        this.f4863a.mo1486a(str);
    }

    public void mo794a(String str) {
        if (this.f4863a != null) {
            this.f4863a.mo1484a();
        }
    }

    public boolean mo796a(jgz jgz) {
        return false;
    }

    private boolean m7050a() {
        if (this.f4863a != null) {
            this.f4863a.mo1484a();
        }
        gwb.m1863a(new caa(this, gwb.kC));
        return true;
    }

    public void m7053a(Exception exception) {
        m7050a();
    }
}
