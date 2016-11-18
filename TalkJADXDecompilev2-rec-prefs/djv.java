package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public final class djv extends RelativeLayout implements djy {
    private djw f9975a;

    public djv(Context context, int i, LayoutParams layoutParams, boolean z) {
        super(context);
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(gwb.gF, this, true).findViewById(ba.dQ);
        imageView.setImageResource(i);
        imageView.setLayoutParams(layoutParams);
        setVisibility(z ? 0 : 8);
    }

    public void m12087a(djw djw) {
        this.f9975a = djw;
    }

    public View mo1579a() {
        return this;
    }

    public void mo1580a(itl itl) {
        if (this.f9975a != null) {
            this.f9975a.m12089a(itl);
        }
    }
}
