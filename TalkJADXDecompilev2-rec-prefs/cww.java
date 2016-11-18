package p000;

import android.content.Context;
import android.content.res.Resources;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

public final class cww extends jbp<jbr> {
    ctn aj;
    Context ak;

    protected /* synthetic */ ListAdapter mo1003t() {
        return m11171v();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.ak = context;
        this.aj = ((cuj) jyn.m25426a(context, cuj.class)).mo1392a();
    }

    protected int mo1001r() {
        return 0;
    }

    protected String mo1000q() {
        return getString(gwb.ps);
    }

    private jbr m11171v() {
        jbr jbr = new jbr(getContext());
        Resources resources = getResources();
        jbr.add(new jbt(cwz.f9247a - 1, getString(bc.iU)).m23799a(gwb.m1570a(resources, gwb.pq, null)));
        jbr.add(new jbt(cwz.f9248b - 1, getString(gwb.pr)).m23799a(gwb.m1570a(resources, gwb.pp, null)));
        return jbr;
    }

    protected OnItemClickListener mo1002s() {
        return new cwx(this);
    }
}
