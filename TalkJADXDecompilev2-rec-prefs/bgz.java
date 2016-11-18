package p000;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public final class bgz extends ery {
    public bgz() {
        super(gwb.jh, new int[]{ba.gZ, ba.ha});
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ba.m4536a(onCreateView);
        TextView textView = (TextView) onCreateView.findViewById(ba.gX);
        Uri K = gwb.m1415K("android_sms");
        gwb.m1819a(textView, this.context, getActivity().getString(gwb.jp, new Object[]{K.toString()}));
        ((Button) onCreateView.findViewById(ba.gZ)).setText(gwb.jo);
        ((Button) onCreateView.findViewById(ba.ha)).setText(gwb.jr);
        gwb.m1811a((ImageView) onCreateView.findViewById(ba.gW), this.context.getResources(), ba.hb);
        return onCreateView;
    }

    protected String mo495a() {
        return getString(gwb.jq);
    }

    protected void mo517a(int i) {
        bko e = fde.m15018e(((jca) this.binder.m25443a(jca.class)).mo2317a());
        if (e == null) {
            glk.m17981d("Babel", "[CallPromo.buttonClicked] Account changed?", new Object[0]);
        } else {
            bkq.m5680b(this.context, e, i == ba.ha);
        }
        super.mo517a(i);
    }
}
