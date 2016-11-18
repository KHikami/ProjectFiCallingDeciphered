package p000;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

final class dsx implements dsi {
    final String f10481a = getClass().getName();

    dsx() {
    }

    public void mo1660a(Context context, ed edVar, String str, String str2, String str3, dsk dsk) {
        if (str2 == null) {
            Toast.makeText(context, ba.lN, 0).show();
            return;
        }
        jca jca = (jca) jyn.m25426a(context, jca.class);
        fzw fzw = (fzw) jyn.m25426a(context, fzw.class);
        bko e = fde.m15018e(jca.mo2317a());
        if (dsk != dsk.INVITE || fzw.mo2146a(jca.mo2317a())) {
            dso dso = new dso();
            Bundle bundle = new Bundle();
            bundle.putString("conversation_id", str3);
            bundle.putString("name", str);
            bundle.putString("contact", str2);
            bundle.putSerializable("trigger_action", dsk);
            dso.setArguments(bundle);
            dso.mo2341a(edVar, this.f10481a);
            return;
        }
        gwb.m1823a(e, 1860);
        new dsl(context, str2, str3).m12615a(context, dsm.f10451c);
    }
}
