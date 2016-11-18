package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public final class bdw extends ery {
    iid f3132a;

    public bdw() {
        super(gwb.iQ, null);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.f3132a = ((iih) this.binder.m25443a(iih.class)).mo1979a(((jca) this.binder.m25443a(jca.class)).mo2317a());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        gwb.m1811a((ImageView) onCreateView.findViewById(gwb.iO), getResources(), gwb.iR);
        ((Button) onCreateView.findViewById(gwb.iP)).setOnClickListener(new bdx(this));
        this.f3132a.mo1693b().mo1714c(3131);
        return onCreateView;
    }

    protected String mo495a() {
        return getString(gwb.iS);
    }
}
