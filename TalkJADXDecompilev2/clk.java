package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class clk extends jzn implements cdf {
    private jek a;
    private final jej b = new cll(this);

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = ((jek) this.binder.a(jek.class)).a(gwb.lE, this.b);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public boolean a() {
        ((cgr) this.binder.a(cgr.class)).m();
        if (gwb.a(fde.e(((jca) this.binder.a(jca.class)).a()), bnc.LOCATION_SHARING)) {
            gwb.a(fde.e(((jca) this.binder.a(jca.class)).a()), 1940);
            this.a.a(gwb.lE, ((dut) this.binder.a(dut.class)).a(getActivity()));
        }
        return false;
    }

    public boolean b() {
        return true;
    }
}
