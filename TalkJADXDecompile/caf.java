import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class caf {
    public View a;
    public ImageView b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public SwitchCompat f;
    final /* synthetic */ cae g;

    protected caf(cae cae, Context context, ViewGroup viewGroup) {
        this.g = cae;
        this.a = LayoutInflater.from(context).inflate(ba.iW, viewGroup, false);
        this.b = (ImageView) this.a.findViewById(gwb.kL);
        this.c = (ImageView) this.a.findViewById(gwb.kM);
        this.d = (TextView) this.a.findViewById(gwb.kP);
        this.e = (TextView) this.a.findViewById(gwb.kN);
        this.f = (SwitchCompat) this.a.findViewById(gwb.kO);
        this.a.setTag(this);
        gld.a(this.a, true);
    }

    protected void a() {
        this.g.a(this);
    }
}
