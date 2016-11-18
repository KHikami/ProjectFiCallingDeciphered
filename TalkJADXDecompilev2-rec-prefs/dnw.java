package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class dnw implements OnItemClickListener {
    final /* synthetic */ dnv f10195a;

    dnw(dnv dnv) {
        this.f10195a = dnv;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        jbq jbq = (jbq) ((jbr) this.f10195a.m7890u()).getItem(i);
        if (jbq instanceof jbt) {
            jbt jbt = (jbt) jbq;
            switch (jbt.m23803c()) {
                case 0:
                    glk.m17979c("Babel", "Disabling knocking per user request.", new Object[0]);
                    gwb.m2198f(2241);
                    this.f10195a.aj.mo1624a(false);
                    this.f10195a.m12324a(jbt, (jbt) this.f10195a.al.getItem(1), dnd.DOMAIN_WITH_EXTERNAL);
                    this.f10195a.al.notifyDataSetChanged();
                    break;
                case 1:
                    glk.m17979c("Babel", "Enabling knocking per user request.", new Object[0]);
                    gwb.m2198f(1501);
                    this.f10195a.aj.mo1624a(true);
                    this.f10195a.m12324a((jbt) this.f10195a.al.getItem(0), jbt, dnd.KNOCKABLE);
                    this.f10195a.al.notifyDataSetChanged();
                    break;
                case 2:
                    gwb.m2198f(2242);
                    dnv dnv = this.f10195a;
                    doh doh = (doh) jyn.m25426a(dnv.getActivity(), doh.class);
                    Resources resources = dnv.getActivity().getResources();
                    CharSequence f = dgg.m11692a().m11727s().m11983f();
                    String string = resources.getString(ba.kW, new Object[]{f});
                    ((ClipboardManager) dnv.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(resources.getString(ba.kV), f));
                    dnv.ak.postDelayed(new dnx(dnv, doh, string), 100);
                    break;
            }
            this.f10195a.m7002a();
        }
    }
}
