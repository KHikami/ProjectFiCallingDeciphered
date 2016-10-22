package defpackage;

import android.content.res.Resources;
import android.graphics.Picture;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import oik;

/* renamed from: gbq */
public final class gbq implements Runnable {
    final /* synthetic */ Resources a;
    final /* synthetic */ int b;
    final /* synthetic */ ImageView c;
    final /* synthetic */ gbs d;
    final /* synthetic */ boolean e;

    public gbq(Resources resources, int i, ImageView imageView, gbs gbs, boolean z) {
        this.a = resources;
        this.b = i;
        this.c = imageView;
        this.d = gbs;
        this.e = z;
    }

    public void run() {
        Picture a = oik.a(this.a.openRawResource(this.b), Integer.valueOf(0), Integer.valueOf(0), false, false, false, oik.a).a();
        float a2 = gwb.a(a.getHeight(), a.getWidth(), this.c.getMeasuredHeight(), this.c.getMeasuredWidth(), this.d, this.a);
        if (a2 > Float.MIN_VALUE) {
            this.c.setImageDrawable(new gbt(a, a2));
            if (this.e) {
                LayoutParams layoutParams = this.c.getLayoutParams();
                layoutParams.height = -2;
                layoutParams.width = -2;
                this.c.setLayoutParams(layoutParams);
            }
        }
    }
}
