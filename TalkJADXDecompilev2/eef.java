package defpackage;

import android.accounts.NetworkErrorException;
import android.content.Context;

final class eef extends jgw implements gia<bow> {
    final /* synthetic */ edv a;
    private final bjg b;
    private czd f;

    public /* synthetic */ void a(ayo ayo, Exception exception) {
        b(exception);
    }

    public eef(edv edv, Context context, ed edVar, bjg bjg) {
        this.a = edv;
        super(context, edVar);
        this.b = bjg;
    }

    private void a() {
        if (this.f != null) {
            this.f.a();
        }
        this.a.a();
    }

    public void a(String str, String str2, String str3, boolean z) {
        if (this.a.isAdded()) {
            this.f = new czd(this.a.getContext());
            this.f.a(str);
        }
    }

    public void a(String str) {
        if (this.f != null) {
            this.f.a();
        }
    }

    public boolean a(jgz jgz) {
        return false;
    }

    private boolean a(Exception exception) {
        if (this.f != null) {
            this.f.a();
        }
        if (exception instanceof NetworkErrorException) {
            this.a.b(this.a.getResources().getString(bc.dy));
        } else {
            this.a.b(this.a.getResources().getString(bc.sn, new Object[]{this.b.e()}));
        }
        return true;
    }

    private void b(Exception exception) {
        a(exception);
    }
}
