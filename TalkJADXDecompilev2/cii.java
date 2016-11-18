package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.rastermill.FrameSequenceDrawable.OnFinishedListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;

final class cii implements bnq {
    private final OnFinishedListener a;
    private final bko b;
    private final ImageView c;
    private bnn d;

    public cii(OnFinishedListener onFinishedListener, bko bko, ImageView imageView) {
        this.a = onFinishedListener;
        this.b = bko;
        this.c = imageView;
    }

    public void a(bnn bnn) {
        this.d = bnn;
    }

    public void a() {
        if (this.d != null) {
            this.d.b();
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (gkt != null) {
            glk.e("Babel", "Unexpected refCountedBitmap returned on a STICKER_REQUEST", new Object[0]);
            gkt.b();
        }
        if (bnn == this.d) {
            this.d = null;
            if (z && gjo != null) {
                int a;
                if (bnn.l() instanceof Integer) {
                    a = gwb.a((Integer) bnn.l());
                } else {
                    a = 1;
                }
                LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.removeRule(9);
                    layoutParams.removeRule(11);
                    layoutParams.removeRule(14);
                } else {
                    layoutParams.addRule(9, 0);
                    layoutParams.addRule(11, 0);
                    layoutParams.addRule(14, 0);
                }
                switch (a) {
                    case 2:
                        layoutParams.addRule(9, -1);
                        break;
                    case 3:
                        layoutParams.addRule(14, -1);
                        break;
                    default:
                        layoutParams.addRule(11, -1);
                        break;
                }
                this.c.setLayoutParams(layoutParams);
                this.c.setVisibility(0);
                Drawable frameSequenceDrawable = new FrameSequenceDrawable(FrameSequence.decodeByteArray(gjo.c()));
                frameSequenceDrawable.setOnFinishedListener(this.a);
                this.c.setImageDrawable(frameSequenceDrawable);
                frameSequenceDrawable.start();
                gwb.a(this.b, 2019);
            }
        }
    }
}
