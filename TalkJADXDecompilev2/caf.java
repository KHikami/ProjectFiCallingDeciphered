package defpackage;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class caf {
    public View a;
    public ImageView b = ((ImageView) this.a.findViewById(gwb.kL));
    public ImageView c = ((ImageView) this.a.findViewById(gwb.kM));
    public TextView d = ((TextView) this.a.findViewById(gwb.kP));
    public TextView e = ((TextView) this.a.findViewById(gwb.kN));
    public SwitchCompat f = ((SwitchCompat) this.a.findViewById(gwb.kO));
    final /* synthetic */ cae g;

    protected caf(cae cae, Context context, ViewGroup viewGroup) {
        this.g = cae;
        this.a = LayoutInflater.from(context).inflate(ba.iW, viewGroup, false);
        this.a.setTag(this);
        gld.a(this.a, true);
    }

    protected void a() {
        this.g.a(this);
    }
}
