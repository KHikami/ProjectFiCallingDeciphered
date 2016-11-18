package p000;

import android.accounts.NetworkErrorException;
import android.content.Context;

final class eef extends jgw implements gia<bow> {
    final /* synthetic */ edv f11306a;
    private final bjg f11307b;
    private czd f11308f;

    public /* synthetic */ void mo775a(ayo ayo, Exception exception) {
        m13705b(exception);
    }

    public eef(edv edv, Context context, ed edVar, bjg bjg) {
        this.f11306a = edv;
        super(context, edVar);
        this.f11307b = bjg;
    }

    private void m13703a() {
        if (this.f11308f != null) {
            this.f11308f.mo1484a();
        }
        this.f11306a.m7002a();
    }

    public void mo795a(String str, String str2, String str3, boolean z) {
        if (this.f11306a.isAdded()) {
            this.f11308f = new czd(this.f11306a.getContext());
            this.f11308f.mo1486a(str);
        }
    }

    public void mo794a(String str) {
        if (this.f11308f != null) {
            this.f11308f.mo1484a();
        }
    }

    public boolean mo796a(jgz jgz) {
        return false;
    }

    private boolean m13704a(Exception exception) {
        if (this.f11308f != null) {
            this.f11308f.mo1484a();
        }
        if (exception instanceof NetworkErrorException) {
            this.f11306a.m13617b(this.f11306a.getResources().getString(bc.dy));
        } else {
            this.f11306a.m13617b(this.f11306a.getResources().getString(bc.sn, new Object[]{this.f11307b.mo571e()}));
        }
        return true;
    }

    private void m13705b(Exception exception) {
        m13704a(exception);
    }
}
