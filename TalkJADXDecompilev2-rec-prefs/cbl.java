package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public final class cbl extends daj {
    final /* synthetic */ dah f4951a;

    public cbl(dah dah, BaseAdapter baseAdapter) {
        this.f4951a = dah;
        super(false, true, baseAdapter);
    }

    public View mo801a(View view, ViewGroup viewGroup) {
        if (view == null || view.getId() != ba.am) {
            view = LayoutInflater.from(this.f4951a.m11373a()).inflate(gwb.gc, viewGroup, false);
        }
        ((TextView) view.findViewById(ba.cn)).setText(bc.ie);
        return view;
    }

    public void mo802a() {
        if (m7151e() != null) {
            rw rwVar = (rw) m7151e();
            if (rwVar.a() != null) {
                rwVar.a().close();
            }
        }
    }
}
