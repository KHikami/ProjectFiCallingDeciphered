package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class clk extends jzn implements cdf {
    private jek f5549a;
    private final jej f5550b = new cll(this);

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f5549a = ((jek) this.binder.m25443a(jek.class)).m24033a(gwb.lE, this.f5550b);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public boolean mo495a() {
        ((cgr) this.binder.m25443a(cgr.class)).mo956m();
        if (gwb.m1923a(fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a()), bnc.LOCATION_SHARING)) {
            gwb.m1823a(fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a()), 1940);
            this.f5549a.m24035a(gwb.lE, ((dut) this.binder.m25443a(dut.class)).mo1683a(getActivity()));
        }
        return false;
    }

    public boolean mo988b() {
        return true;
    }
}
