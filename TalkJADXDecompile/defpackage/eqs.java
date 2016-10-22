package defpackage;

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

/* renamed from: eqs */
public final class eqs extends jzn implements eqk {
    View a;
    private iid aj;
    TextView b;
    View c;
    View d;
    epu e;
    private TextView f;
    private Button g;
    private String h;
    private BroadcastReceiver i;

    public eqs() {
        this.e = epu.FAILURE_RETRY;
    }

    public int a() {
        return gwb.tJ;
    }

    public int b() {
        return gwb.tE;
    }

    public boolean c() {
        if (this.e.equals(epu.SUCCESS)) {
            this.aj.b().c(2197);
        } else {
            this.aj.b().c(2284);
        }
        Activity activity = getActivity();
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.findViewById(16908290).getWindowToken(), 0);
        }
        return true;
    }

    public boolean d() {
        return false;
    }

    public int e() {
        return 8;
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putSerializable("verification_result", this.e);
        super.onSaveInstanceState(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.h = getArguments().getString("phone_number", "");
        this.aj = ((iih) this.binder.a(iih.class)).a(((jca) this.binder.a(jca.class)).a());
        this.a = layoutInflater.inflate(gwb.tC, viewGroup, false);
        this.b = (TextView) this.a.findViewById(bn.q);
        this.f = (TextView) this.a.findViewById(bn.k);
        this.c = this.a.findViewById(bn.o);
        this.d = this.a.findViewById(bn.j);
        this.g = (Button) getActivity().findViewById(bn.b);
        if (bundle != null) {
            this.e = (epu) bundle.getSerializable("verification_result");
            q();
        } else if (this.g != null) {
            this.g.setVisibility(4);
        }
        ((eqg) this.binder.a(eqg.class)).b();
        return this.a;
    }

    public void onStart() {
        super.onStart();
        this.i = new eqt(this);
        ik.a(getActivity()).a(this.i, new IntentFilter("phone_verification_outcome"));
    }

    public void onStop() {
        ik.a(getActivity()).a(this.i);
        super.onStop();
    }

    void q() {
        this.c.setVisibility(8);
        if (this.e.equals(epu.SUCCESS)) {
            this.d.setVisibility(0);
            this.f.setVisibility(8);
            this.b.setText(getActivity().getString(gwb.tM, new Object[]{ke.a().a(glq.a(gwb.H(), this.h, glu.c), kp.a)}));
            if (VERSION.SDK_INT >= 17) {
                this.b.setTextAlignment(4);
                return;
            }
            return;
        }
        this.aj.b().c(2406);
        this.b.setText(getActivity().getResources().getString(gwb.tQ));
        this.f.setText(getActivity().getResources().getString(gwb.tP));
        if (this.g != null) {
            this.g.setVisibility(0);
        }
    }

    public /* synthetic */ CharSequence a(dw dwVar, String str) {
        return "";
    }
}
