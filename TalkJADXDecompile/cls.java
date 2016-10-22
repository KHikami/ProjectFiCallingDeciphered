import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

final class cls implements OnItemClickListener {
    final /* synthetic */ clr a;

    cls(clr clr) {
        this.a = clr;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.a();
        clt clt = (clt) this.a.aj.get(((jbt) ((ListView) adapterView).getAdapter().getItem(i)).c());
        cia cia = (cia) jyn.a(this.a.getContext(), clt.c);
        ((iih) jyn.a(this.a.getContext(), iih.class)).a(((jca) jyn.a(this.a.getContext(), jca.class)).a()).b().c(clt.d);
        dr instantiate = dr.instantiate(this.a.getContext(), cia.c().getName());
        ed childFragmentManager = this.a.getParentFragment().getChildFragmentManager();
        childFragmentManager.a().b(gwb.lp, instantiate).a(0).a();
        childFragmentManager.b();
        ((cdf) instantiate).a();
    }
}
