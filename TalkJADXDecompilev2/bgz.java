package defpackage;

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
        ba.a(onCreateView);
        TextView textView = (TextView) onCreateView.findViewById(ba.gX);
        Uri K = gwb.K("android_sms");
        gwb.a(textView, this.context, getActivity().getString(gwb.jp, new Object[]{K.toString()}));
        ((Button) onCreateView.findViewById(ba.gZ)).setText(gwb.jo);
        ((Button) onCreateView.findViewById(ba.ha)).setText(gwb.jr);
        gwb.a((ImageView) onCreateView.findViewById(ba.gW), this.context.getResources(), ba.hb);
        return onCreateView;
    }

    protected String a() {
        return getString(gwb.jq);
    }

    protected void a(int i) {
        bko e = fde.e(((jca) this.binder.a(jca.class)).a());
        if (e == null) {
            glk.d("Babel", "[CallPromo.buttonClicked] Account changed?", new Object[0]);
        } else {
            bkq.b(this.context, e, i == ba.ha);
        }
        super.a(i);
    }
}
