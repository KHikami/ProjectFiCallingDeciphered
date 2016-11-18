package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

final class hlf implements gyd {
    private final ViewGroup a;
    private final hlw b;
    private View c;

    public hlf(ViewGroup viewGroup, hlw hlw) {
        this.b = (hlw) gwb.L((Object) hlw);
        this.a = (ViewGroup) gwb.L((Object) viewGroup);
    }

    public void a() {
        try {
            this.b.b();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void a(Bundle bundle) {
        try {
            this.b.a(bundle);
            this.c = (View) gym.a(this.b.f());
            this.a.removeAllViews();
            this.a.addView(this.c);
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void a(hlj hlj) {
        try {
            this.b.a(new hlg(this, hlj));
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void b() {
        try {
            this.b.c();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void c() {
        try {
            this.b.d();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }
}
