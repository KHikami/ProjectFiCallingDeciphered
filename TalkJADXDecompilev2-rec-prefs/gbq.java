package p000;

import android.content.res.Resources;
import android.graphics.Picture;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;

public final class gbq implements Runnable {
    final /* synthetic */ Resources f14612a;
    final /* synthetic */ int f14613b;
    final /* synthetic */ ImageView f14614c;
    final /* synthetic */ gbs f14615d;
    final /* synthetic */ boolean f14616e;

    public gbq(Resources resources, int i, ImageView imageView, gbs gbs, boolean z) {
        this.f14612a = resources;
        this.f14613b = i;
        this.f14614c = imageView;
        this.f14615d = gbs;
        this.f14616e = z;
    }

    public void run() {
        Picture a = oik.a(this.f14612a.openRawResource(this.f14613b), Integer.valueOf(0), Integer.valueOf(0), false, false, false, oik.a).a();
        float a2 = gwb.m1475a(a.getHeight(), a.getWidth(), this.f14614c.getMeasuredHeight(), this.f14614c.getMeasuredWidth(), this.f14615d, this.f14612a);
        if (a2 > Float.MIN_VALUE) {
            this.f14614c.setImageDrawable(new gbt(a, a2));
            if (this.f14616e) {
                LayoutParams layoutParams = this.f14614c.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.f14614c.setLayoutParams(layoutParams);
            }
        }
    }
}
