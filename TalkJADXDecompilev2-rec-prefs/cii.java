package p000;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.rastermill.FrameSequenceDrawable.OnFinishedListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;

final class cii implements bnq {
    private final OnFinishedListener f5372a;
    private final bko f5373b;
    private final ImageView f5374c;
    private bnn f5375d;

    public cii(OnFinishedListener onFinishedListener, bko bko, ImageView imageView) {
        this.f5372a = onFinishedListener;
        this.f5373b = bko;
        this.f5374c = imageView;
    }

    public void m7714a(bnn bnn) {
        this.f5375d = bnn;
    }

    public void m7713a() {
        if (this.f5375d != null) {
            this.f5375d.mo607b();
        }
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (gkt != null) {
            glk.m17982e("Babel", "Unexpected refCountedBitmap returned on a STICKER_REQUEST", new Object[0]);
            gkt.mo2292b();
        }
        if (bnn == this.f5375d) {
            this.f5375d = null;
            if (z && gjo != null) {
                int a;
                if (bnn.m5506l() instanceof Integer) {
                    a = gwb.m1507a((Integer) bnn.m5506l());
                } else {
                    a = 1;
                }
                LayoutParams layoutParams = (LayoutParams) this.f5374c.getLayoutParams();
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
                this.f5374c.setLayoutParams(layoutParams);
                this.f5374c.setVisibility(0);
                Drawable frameSequenceDrawable = new FrameSequenceDrawable(FrameSequence.decodeByteArray(gjo.m17839c()));
                frameSequenceDrawable.setOnFinishedListener(this.f5372a);
                this.f5374c.setImageDrawable(frameSequenceDrawable);
                frameSequenceDrawable.start();
                gwb.m1823a(this.f5373b, 2019);
            }
        }
    }
}
