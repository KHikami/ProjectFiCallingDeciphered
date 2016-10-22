package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import tt;

/* renamed from: dyt */
public final class dyt extends tt {
    final /* synthetic */ NavigationDrawerFragment b;

    public dyt(NavigationDrawerFragment navigationDrawerFragment) {
        this.b = navigationDrawerFragment;
        super(navigationDrawerFragment.getActivity(), navigationDrawerFragment.b, bc.hf, bc.he);
    }

    public final void a(View view, float f) {
        super.a(view, 0.0f);
        if (f == 0.0f) {
            this.b.ap = false;
        } else if (!this.b.ap && f > 0.0f) {
            this.b.ap = true;
            ba.v(this.b.getActivity().getCurrentFocus());
        }
        if (VERSION.SDK_INT < 21) {
            return;
        }
        if (f > 0.0f) {
            c(gwb.dH);
        } else {
            c(gwb.dV);
        }
    }

    public final void a(View view) {
        super.a(view);
        this.b.getActivity().F_();
        this.b.a();
        gwb.a(e(), 1558);
    }

    public final void b(View view) {
        super.b(view);
        this.b.h.a();
        this.b.h.a(false);
        dw activity = this.b.getActivity();
        if (activity != null) {
            activity.F_();
            if (VERSION.SDK_INT >= 21) {
                c(gwb.dV);
            }
        }
        gwb.a(e(), 1559);
        if (this.b.ao != null) {
            this.b.ao.run();
            this.b.ao = null;
        }
        this.b.e.c(0);
        this.b.b(this.b.e);
    }

    private void c(int i) {
        this.b.getActivity().getWindow().setStatusBarColor(this.b.getResources().getColor(i));
    }

    public void a(int i) {
        super.a(i);
        if (this.b.ao != null) {
            this.b.ao = null;
        }
        if (i != 0) {
            this.b.b();
            this.b.h.a(true);
        }
    }

    private bko e() {
        return fde.e(this.b.ar.a());
    }
}
