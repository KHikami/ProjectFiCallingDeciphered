package p000;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public final class eqs extends jzn implements eqk {
    View f12072a;
    private iid aj;
    TextView f12073b;
    View f12074c;
    View f12075d;
    epu f12076e = epu.FAILURE_RETRY;
    private TextView f12077f;
    private Button f12078g;
    private String f12079h;
    private BroadcastReceiver f12080i;

    public int mo495a() {
        return gwb.tJ;
    }

    public int mo1932b() {
        return gwb.tE;
    }

    public boolean mo1933c() {
        if (this.f12076e.equals(epu.SUCCESS)) {
            this.aj.mo1693b().mo1714c(2197);
        } else {
            this.aj.mo1693b().mo1714c(2284);
        }
        Activity activity = getActivity();
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.findViewById(16908290).getWindowToken(), 0);
        }
        return true;
    }

    public boolean mo1934d() {
        return false;
    }

    public int mo1935e() {
        return 8;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("verification_result", this.f12076e);
        super.onSaveInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12079h = getArguments().getString("phone_number", "");
        this.aj = ((iih) this.binder.m25443a(iih.class)).mo1979a(((jca) this.binder.m25443a(jca.class)).mo2317a());
        this.f12072a = layoutInflater.inflate(gwb.tC, viewGroup, false);
        this.f12073b = (TextView) this.f12072a.findViewById(bn.f4021q);
        this.f12077f = (TextView) this.f12072a.findViewById(bn.f4015k);
        this.f12074c = this.f12072a.findViewById(bn.f4019o);
        this.f12075d = this.f12072a.findViewById(bn.f4014j);
        this.f12078g = (Button) getActivity().findViewById(bn.f4006b);
        if (bundle != null) {
            this.f12076e = (epu) bundle.getSerializable("verification_result");
            m14285q();
        } else if (this.f12078g != null) {
            this.f12078g.setVisibility(4);
        }
        ((eqg) this.binder.m25443a(eqg.class)).mo1929b();
        return this.f12072a;
    }

    public void onStart() {
        super.onStart();
        this.f12080i = new eqt(this);
        ik.m22097a(getActivity()).m22100a(this.f12080i, new IntentFilter("phone_verification_outcome"));
    }

    public void onStop() {
        ik.m22097a(getActivity()).m22099a(this.f12080i);
        super.onStop();
    }

    void m14285q() {
        this.f12074c.setVisibility(8);
        if (this.f12076e.equals(epu.SUCCESS)) {
            this.f12075d.setVisibility(0);
            this.f12077f.setVisibility(8);
            this.f12073b.setText(getActivity().getString(gwb.tM, new Object[]{ke.m25637a().m25642a(glq.m18002a(gwb.m1400H(), this.f12079h, glu.f15611c), kp.f22600a)}));
            if (VERSION.SDK_INT >= 17) {
                this.f12073b.setTextAlignment(4);
                return;
            }
            return;
        }
        this.aj.mo1693b().mo1714c(2406);
        this.f12073b.setText(getActivity().getResources().getString(gwb.tQ));
        this.f12077f.setText(getActivity().getResources().getString(gwb.tP));
        if (this.f12078g != null) {
            this.f12078g.setVisibility(0);
        }
    }

    public /* synthetic */ CharSequence mo1931a(dw dwVar, String str) {
        return "";
    }
}
