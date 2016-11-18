package defpackage;

import android.content.Context;

final class bzy extends jgw implements gia<bow> {
    czd a;
    final /* synthetic */ bzx b;

    public /* bridge */ /* synthetic */ void a(ayo ayo, Exception exception) {
        a(exception);
    }

    public bzy(bzx bzx, Context context, ed edVar) {
        this.b = bzx;
        super(context, edVar);
    }

    private void a(bow bow) {
        String str = "ConversationChange : ";
        String valueOf = String.valueOf(this.b.b.a());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (this.b.b.n() == 1) {
            new bzz(this, this.b.a.c(), bow, this.b.a.a()).execute(new Void[0]);
        }
    }

    public void a(String str, String str2, String str3, boolean z) {
        this.a = new czd(this.c);
        this.a.a(str);
    }

    public void a(String str) {
        if (this.a != null) {
            this.a.a();
        }
    }

    public boolean a(jgz jgz) {
        return false;
    }

    private boolean a() {
        if (this.a != null) {
            this.a.a();
        }
        gwb.a(new caa(this, gwb.kC));
        return true;
    }

    public void a(Exception exception) {
        a();
    }
}
