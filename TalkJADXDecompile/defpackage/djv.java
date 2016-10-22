package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

/* renamed from: djv */
public final class djv extends RelativeLayout implements djy {
    private djw a;

    public djv(Context context, int i, LayoutParams layoutParams, boolean z) {
        super(context);
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(gwb.gF, this, true).findViewById(ba.dQ);
        imageView.setImageResource(i);
        imageView.setLayoutParams(layoutParams);
        setVisibility(z ? 0 : 8);
    }

    public void a(djw djw) {
        this.a = djw;
    }

    public View a() {
        return this;
    }

    public void a(itl itl) {
        if (this.a != null) {
            this.a.a(itl);
        }
    }
}
