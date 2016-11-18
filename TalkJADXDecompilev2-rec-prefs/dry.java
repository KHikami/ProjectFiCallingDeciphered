package p000;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public final class dry extends jbp<jbr> {
    dse aj;

    protected /* bridge */ /* synthetic */ ListAdapter mo1003t() {
        return null;
    }

    void m12587a(dse dse) {
        this.aj = dse;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) super.onCreateView(layoutInflater, viewGroup, bundle);
        m7008b(false);
        jca jca = (jca) jyn.m25426a(getContext(), jca.class);
        iih iih = (iih) jyn.m25426a(getContext(), iih.class);
        iih.mo1979a(jca.mo2317a()).mo1693b().mo1714c(3031);
        setRetainInstance(true);
        ((ImageView) viewGroup2.findViewById(ba.ng)).setImageDrawable(getResources().getDrawable(gwb.rb));
        ((TextView) viewGroup2.findViewById(ba.nj)).setText(getResources().getString(gwb.rd));
        Button button = (Button) viewGroup2.findViewById(ba.nl);
        button.setText(getResources().getString(gwb.rf));
        button.setTextColor(getResources().getColor(gwb.qY));
        button.setOnClickListener(new drz(this, iih, jca));
        button = (Button) viewGroup2.findViewById(ba.nf);
        button.setBackground(getResources().getDrawable(gwb.ra));
        button.setText(getResources().getString(gwb.rc));
        button.setTextColor(getResources().getColor(gwb.qZ));
        button.setOnClickListener(new dsa(this, iih, jca));
        return viewGroup2;
    }

    public void onDestroyView() {
        if (m7009c() != null && getRetainInstance()) {
            m7009c().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    public Dialog mo792a(Bundle bundle) {
        Dialog a = super.mo792a(bundle);
        a.setOnKeyListener(new dsb(this));
        return a;
    }

    protected int mo1001r() {
        return 2;
    }

    protected String mo1000q() {
        return getResources().getString(gwb.re);
    }

    protected OnItemClickListener mo1002s() {
        return null;
    }
}
