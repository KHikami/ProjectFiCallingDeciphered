package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

final class hlf implements gyd {
    private final ViewGroup f17067a;
    private final hlw f17068b;
    private View f17069c;

    public hlf(ViewGroup viewGroup, hlw hlw) {
        this.f17068b = (hlw) gwb.m1419L((Object) hlw);
        this.f17067a = (ViewGroup) gwb.m1419L((Object) viewGroup);
    }

    public void mo2603a() {
        try {
            this.f17068b.mo2699b();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void mo2604a(Bundle bundle) {
        try {
            this.f17068b.mo2697a(bundle);
            this.f17069c = (View) gym.m18962a(this.f17068b.mo2705f());
            this.f17067a.removeAllViews();
            this.f17067a.addView(this.f17069c);
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void m20018a(hlj hlj) {
        try {
            this.f17068b.mo2698a(new hlg(this, hlj));
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void mo2605b() {
        try {
            this.f17068b.mo2701c();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }

    public void mo2606c() {
        try {
            this.f17068b.mo2703d();
        } catch (RemoteException e) {
            throw new dt(e);
        }
    }
}
