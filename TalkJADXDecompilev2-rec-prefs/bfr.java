package p000;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class bfr extends ery {
    Button f3223a;
    Button f3224b;
    int f3225c;
    String f3226d;
    ProgressBar f3227e;
    TextView f3228f;
    TextView f3229g;
    BroadcastReceiver f3230h;
    bgc f3231i;

    public bfr() {
        super(gwb.je, new int[]{gwb.ja, gwb.jb});
    }

    public static bfr m5078a(boolean z, String str) {
        bfr bfr = new bfr();
        Bundle bundle = new Bundle();
        bundle.putBoolean("callerid_from_promo_flow", z);
        bundle.putString("callerid_current_sim_number", str);
        bfr.setArguments(bundle);
        return bfr;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3225c = ((jca) this.binder.m25443a(jca.class)).mo2317a();
        this.f3231i = new bgc(this.context, this.f3225c);
        boolean a = gwb.m1891a(this.f3225c, glq.m18025f(this.context));
        Object onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ba.m4536a(onCreateView);
        this.f3228f = (TextView) onCreateView.findViewById(gwb.iZ);
        this.f3229g = (TextView) onCreateView.findViewById(gwb.iY);
        this.f3226d = getArguments().getString("callerid_current_sim_number");
        gwb.m1819a(this.f3229g, this.context, this.context.getString(ba.gN, new Object[]{glq.m18033h(this.context, this.f3226d), gwb.m1415K("android_caller_id").toString()}));
        this.f3223a = (Button) onCreateView.findViewById(gwb.ja);
        this.f3224b = (Button) onCreateView.findViewById(gwb.jb);
        this.f3227e = (ProgressBar) onCreateView.findViewById(gwb.iV);
        this.f3224b.setText(ba.gG);
        this.f3223a.setText(ba.gJ);
        gwb.m1811a((ImageView) onCreateView.findViewById(gwb.iX), this.context.getResources(), ba.gp);
        if (getArguments().getBoolean("callerid_from_promo_flow")) {
            this.f3231i.m5185a(2252);
            if (a) {
                this.f3231i.m5185a(2253);
            }
            this.f3224b.setEnabled(false);
            this.f3223a.setEnabled(false);
            getActivity().m1095f().mo1998b(1, null, new bfv(this)).m1293v();
        } else {
            this.f3223a.setText(this.context.getString(ba.gI));
        }
        Snackbar snackbar = (Snackbar) onCreateView.findViewById(gwb.jc);
        snackbar.m8334a(this.context.getString(ba.gH, new Object[]{((jca) this.binder.m25443a(jca.class)).mo2320c().mo3440b("account_name")}));
        snackbar.setVisibility(0);
        this.f3228f.setText(this.context.getString(ba.gP, new Object[]{glq.m18038i(this.context, this.f3226d)}));
        this.f3224b.setOnClickListener(new bfs(this));
        return onCreateView;
    }

    protected void m5081b() {
        this.f3224b.setEnabled(true);
        this.f3223a.setEnabled(true);
    }

    public void onPause() {
        super.onPause();
        ik.m22097a(this.context).m22099a(this.f3230h);
    }

    protected String mo495a() {
        return getString(ba.gP);
    }

    protected void mo517a(int i) {
        gwb.m2199f(this.context, this.f3225c);
        super.mo517a(i);
    }
}
