package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: dnw */
final class dnw implements OnItemClickListener {
    final /* synthetic */ dnv a;

    dnw(dnv dnv) {
        this.a = dnv;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        jbq jbq = (jbq) ((jbr) this.a.u()).getItem(i);
        if (jbq instanceof jbt) {
            jbt jbt = (jbt) jbq;
            switch (jbt.c()) {
                case wi.w /*0*/:
                    glk.c("Babel", "Disabling knocking per user request.", new Object[0]);
                    gwb.f(2241);
                    this.a.aj.a(false);
                    this.a.a(jbt, (jbt) this.a.al.getItem(1), dnd.DOMAIN_WITH_EXTERNAL);
                    this.a.al.notifyDataSetChanged();
                    break;
                case wi.j /*1*/:
                    glk.c("Babel", "Enabling knocking per user request.", new Object[0]);
                    gwb.f(1501);
                    this.a.aj.a(true);
                    this.a.a((jbt) this.a.al.getItem(0), jbt, dnd.KNOCKABLE);
                    this.a.al.notifyDataSetChanged();
                    break;
                case wi.l /*2*/:
                    gwb.f(2242);
                    dnv dnv = this.a;
                    doh doh = (doh) jyn.a(dnv.getActivity(), doh.class);
                    Resources resources = dnv.getActivity().getResources();
                    CharSequence f = dgg.a().s().f();
                    String string = resources.getString(ba.kW, new Object[]{f});
                    ((ClipboardManager) dnv.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(resources.getString(ba.kV), f));
                    dnv.ak.postDelayed(new dnx(dnv, doh, string), 100);
                    break;
            }
            this.a.a();
        }
    }
}
