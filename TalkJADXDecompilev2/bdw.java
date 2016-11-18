package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public final class bdw extends ery {
    iid a;

    public bdw() {
        super(gwb.iQ, null);
    }

    protected void onAttachBinder(Bundle bundle) {
        super.onAttachBinder(bundle);
        this.a = ((iih) this.binder.a(iih.class)).a(((jca) this.binder.a(jca.class)).a());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        gwb.a((ImageView) onCreateView.findViewById(gwb.iO), getResources(), gwb.iR);
        ((Button) onCreateView.findViewById(gwb.iP)).setOnClickListener(new bdx(this));
        this.a.b().c(3131);
        return onCreateView;
    }

    protected String a() {
        return getString(gwb.iS);
    }
}
