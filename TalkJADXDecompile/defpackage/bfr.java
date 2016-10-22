package defpackage;

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

/* renamed from: bfr */
public final class bfr extends ery {
    Button a;
    Button b;
    int c;
    String d;
    ProgressBar e;
    TextView f;
    TextView g;
    BroadcastReceiver h;
    bgc i;

    public bfr() {
        super(gwb.je, new int[]{gwb.ja, gwb.jb});
    }

    public static bfr a(boolean z, String str) {
        bfr bfr = new bfr();
        Bundle bundle = new Bundle();
        bundle.putBoolean("callerid_from_promo_flow", z);
        bundle.putString("callerid_current_sim_number", str);
        bfr.setArguments(bundle);
        return bfr;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = ((jca) this.binder.a(jca.class)).a();
        this.i = new bgc(this.context, this.c);
        boolean a = gwb.a(this.c, glq.f(this.context));
        Object onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ba.a(onCreateView);
        this.f = (TextView) onCreateView.findViewById(gwb.iZ);
        this.g = (TextView) onCreateView.findViewById(gwb.iY);
        this.d = getArguments().getString("callerid_current_sim_number");
        gwb.a(this.g, this.context, this.context.getString(ba.gN, new Object[]{glq.h(this.context, this.d), gwb.K("android_caller_id").toString()}));
        this.a = (Button) onCreateView.findViewById(gwb.ja);
        this.b = (Button) onCreateView.findViewById(gwb.jb);
        this.e = (ProgressBar) onCreateView.findViewById(gwb.iV);
        this.b.setText(ba.gG);
        this.a.setText(ba.gJ);
        gwb.a((ImageView) onCreateView.findViewById(gwb.iX), this.context.getResources(), ba.gp);
        if (getArguments().getBoolean("callerid_from_promo_flow")) {
            this.i.a(2252);
            if (a) {
                this.i.a(2253);
            }
            this.b.setEnabled(false);
            this.a.setEnabled(false);
            getActivity().f().b(1, null, new bfv(this)).v();
        } else {
            this.a.setText(this.context.getString(ba.gI));
        }
        Snackbar snackbar = (Snackbar) onCreateView.findViewById(gwb.jc);
        snackbar.a(this.context.getString(ba.gH, new Object[]{((jca) this.binder.a(jca.class)).c().b("account_name")}));
        snackbar.setVisibility(0);
        this.f.setText(this.context.getString(ba.gP, new Object[]{glq.i(this.context, this.d)}));
        this.b.setOnClickListener(new bfs(this));
        return onCreateView;
    }

    protected void b() {
        this.b.setEnabled(true);
        this.a.setEnabled(true);
    }

    public void onPause() {
        super.onPause();
        ik.a(this.context).a(this.h);
    }

    protected String a() {
        return getString(ba.gP);
    }

    protected void a(int i) {
        gwb.f(this.context, this.c);
        super.a(i);
    }
}
