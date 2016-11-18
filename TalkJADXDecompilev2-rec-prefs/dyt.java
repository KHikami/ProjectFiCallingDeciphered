package p000;

import android.os.Build.VERSION;
import android.view.View;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class dyt extends tt {
    final /* synthetic */ NavigationDrawerFragment f10845b;

    public dyt(NavigationDrawerFragment navigationDrawerFragment) {
        this.f10845b = navigationDrawerFragment;
        super(navigationDrawerFragment.getActivity(), navigationDrawerFragment.f6503b, bc.hf, bc.he);
    }

    public final void m13091a(View view, float f) {
        super.a(view, 0.0f);
        if (f == 0.0f) {
            this.f10845b.ap = false;
        } else if (!this.f10845b.ap && f > 0.0f) {
            this.f10845b.ap = true;
            ba.m4659v(this.f10845b.getActivity().getCurrentFocus());
        }
        if (VERSION.SDK_INT < 21) {
            return;
        }
        if (f > 0.0f) {
            m13087c(gwb.dH);
        } else {
            m13087c(gwb.dV);
        }
    }

    public final void m13090a(View view) {
        super.a(view);
        this.f10845b.getActivity().F_();
        this.f10845b.mo495a();
        gwb.m1823a(m13088e(), 1558);
    }

    public final void m13092b(View view) {
        super.b(view);
        this.f10845b.f6509h.m13093a();
        this.f10845b.f6509h.m13094a(false);
        dw activity = this.f10845b.getActivity();
        if (activity != null) {
            activity.F_();
            if (VERSION.SDK_INT >= 21) {
                m13087c(gwb.dV);
            }
        }
        gwb.m1823a(m13088e(), 1559);
        if (this.f10845b.ao != null) {
            this.f10845b.ao.run();
            this.f10845b.ao = null;
        }
        this.f10845b.f6506e.m9975c(0);
        this.f10845b.m8753b(this.f10845b.f6506e);
    }

    private void m13087c(int i) {
        this.f10845b.getActivity().getWindow().setStatusBarColor(this.f10845b.getResources().getColor(i));
    }

    public void m13089a(int i) {
        super.a(i);
        if (this.f10845b.ao != null) {
            this.f10845b.ao = null;
        }
        if (i != 0) {
            this.f10845b.m8752b();
            this.f10845b.f6509h.m13094a(true);
        }
    }

    private bko m13088e() {
        return fde.m15018e(this.f10845b.ar.mo2317a());
    }
}
