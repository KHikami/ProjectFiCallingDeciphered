package p000;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class bgw extends ery {
    private fbx f3336a;
    private bko f3337b;

    public bgw() {
        super(gwb.jf, new int[]{ba.gZ, ba.ha});
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ba.m4536a(onCreateView);
        this.f3336a = (fbx) jyn.m25426a(getActivity().getApplicationContext(), fbx.class);
        this.f3337b = fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a());
        Button button = (Button) onCreateView.findViewById(ba.ha);
        button.setText(gwb.jl);
        Button button2 = (Button) onCreateView.findViewById(ba.gZ);
        button2.setText(gwb.jm);
        if (!this.f3336a.mo1971b(getActivity())) {
            button.setText(gwb.jk);
        } else if ("com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction())) {
            button2.setVisibility(8);
            button.setText(gwb.ji);
            ((TextView) onCreateView.findViewById(ba.gV)).setText(gwb.jj);
        }
        gwb.m1811a((ImageView) onCreateView.findViewById(ba.gY), this.context.getResources(), ba.hc);
        return onCreateView;
    }

    protected String mo495a() {
        if (((fbx) jyn.m25426a(getActivity().getApplicationContext(), fbx.class)).mo1971b(getActivity()) && "com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction())) {
            return getString(gwb.jj);
        }
        return getString(gwb.jn);
    }

    protected void mo517a(int i) {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("call_promo_shown", true).apply();
        if (i == ba.ha) {
            if (this.f3336a.mo1971b(getActivity())) {
                getActivity().startActivity(gwb.m2295m(this.f3337b));
            } else {
                gwb.m2239h(getActivity(), "com.google.android.apps.hangoutsdialer");
            }
        }
        super.mo517a(i);
    }
}
