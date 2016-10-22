package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.hangout.HangoutActivity;

/* renamed from: eej */
public final class eej extends jbp<ArrayAdapter<String>> {
    boolean aj;
    private int ak;
    private eem al;

    protected /* bridge */ /* synthetic */ ListAdapter t() {
        return null;
    }

    void a(int i) {
        this.ak = i;
    }

    void a(eem eem) {
        this.al = eem;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ((ImageView) onCreateView.findViewById(ba.ng)).setImageResource(gwb.sl);
        ((TextView) onCreateView.findViewById(ba.nj)).setText(gwb.so);
        Uri K = gwb.K("peer2peer");
        new Object[1][0] = K;
        Button button = (Button) onCreateView.findViewById(ba.nl);
        button.setText(gwb.sn);
        button.setTextColor(getResources().getColor(gwb.sj));
        button.setOnClickListener(new eek(this, K));
        this.aj = false;
        button = (Button) onCreateView.findViewById(ba.nf);
        button.setText(gwb.sm);
        button.setBackgroundResource(gwb.sk);
        button.setTextColor(-1);
        button.setOnClickListener(new eel(this));
        return onCreateView;
    }

    public void onStart() {
        super.onStart();
        gwb.f(2832);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onStop() {
        super.onStop();
        if (this.aj) {
            this.al.c(this.ak);
            gwb.f(2833);
        } else {
            gwb.f(2834);
        }
        ((HangoutActivity) getActivity()).n();
    }

    protected int r() {
        return 2;
    }

    protected String q() {
        return getActivity().getString(gwb.sp);
    }

    protected OnItemClickListener s() {
        return null;
    }
}
