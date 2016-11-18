package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

final class cls implements OnItemClickListener {
    final /* synthetic */ clr f5555a;

    cls(clr clr) {
        this.f5555a = clr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f5555a.m7002a();
        clt clt = (clt) this.f5555a.aj.get(((jbt) ((ListView) adapterView).getAdapter().getItem(i)).m23803c());
        cia cia = (cia) jyn.m25426a(this.f5555a.getContext(), clt.f5558c);
        ((iih) jyn.m25426a(this.f5555a.getContext(), iih.class)).mo1979a(((jca) jyn.m25426a(this.f5555a.getContext(), jca.class)).mo2317a()).mo1693b().mo1714c(clt.f5559d);
        dr instantiate = dr.instantiate(this.f5555a.getContext(), cia.mo987c().getName());
        ed childFragmentManager = this.f5555a.getParentFragment().getChildFragmentManager();
        childFragmentManager.mo1845a().mo1530b(gwb.lp, instantiate).mo1523a(0).mo1522a();
        childFragmentManager.mo1848b();
        ((cdf) instantiate).mo495a();
    }
}
