import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class bgw extends ery {
    private fbx a;
    private bko b;

    public bgw() {
        super(gwb.jf, new int[]{ba.gZ, ba.ha});
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ba.a(onCreateView);
        this.a = (fbx) jyn.a(getActivity().getApplicationContext(), fbx.class);
        this.b = fde.e(((jca) this.binder.a(jca.class)).a());
        Button button = (Button) onCreateView.findViewById(ba.ha);
        button.setText(gwb.jl);
        Button button2 = (Button) onCreateView.findViewById(ba.gZ);
        button2.setText(gwb.jm);
        if (!this.a.b(getActivity())) {
            button.setText(gwb.jk);
        } else if ("com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction())) {
            button2.setVisibility(8);
            button.setText(gwb.ji);
            ((TextView) onCreateView.findViewById(ba.gV)).setText(gwb.jj);
        }
        gwb.a((ImageView) onCreateView.findViewById(ba.gY), this.context.getResources(), ba.hc);
        return onCreateView;
    }

    protected String a() {
        if (((fbx) jyn.a(getActivity().getApplicationContext(), fbx.class)).b(getActivity()) && "com.google.android.apps.hangouts.phone.recentcalls".equals(getActivity().getIntent().getAction())) {
            return getString(gwb.jj);
        }
        return getString(gwb.jn);
    }

    protected void a(int i) {
        PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("call_promo_shown", true).apply();
        if (i == ba.ha) {
            if (this.a.b(getActivity())) {
                getActivity().startActivity(gwb.m(this.b));
            } else {
                gwb.h(getActivity(), "com.google.android.apps.hangoutsdialer");
            }
        }
        super.a(i);
    }
}
