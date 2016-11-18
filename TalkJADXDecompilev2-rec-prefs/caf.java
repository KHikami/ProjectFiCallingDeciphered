package p000;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class caf {
    public View f4906a;
    public ImageView f4907b = ((ImageView) this.f4906a.findViewById(gwb.kL));
    public ImageView f4908c = ((ImageView) this.f4906a.findViewById(gwb.kM));
    public TextView f4909d = ((TextView) this.f4906a.findViewById(gwb.kP));
    public TextView f4910e = ((TextView) this.f4906a.findViewById(gwb.kN));
    public SwitchCompat f4911f = ((SwitchCompat) this.f4906a.findViewById(gwb.kO));
    final /* synthetic */ cae f4912g;

    protected caf(cae cae, Context context, ViewGroup viewGroup) {
        this.f4912g = cae;
        this.f4906a = LayoutInflater.from(context).inflate(ba.iW, viewGroup, false);
        this.f4906a.setTag(this);
        gld.m17934a(this.f4906a, true);
    }

    protected void m7079a() {
        this.f4912g.mo797a(this);
    }
}
