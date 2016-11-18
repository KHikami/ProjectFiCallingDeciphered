package p000;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class dpe extends FrameLayout {
    private static final float[] f10275e = new float[]{1.0f, 1.15f, 1.3f, 1.45f, 1.6f, 1.75f};
    boolean f10276a = false;
    int f10277b = 0;
    Handler f10278c = new Handler();
    Runnable f10279d = new dpf(this);
    private final View f10280f;
    private final View f10281g;

    public dpe(Context context, ViewGroup viewGroup) {
        super(context);
        dpe.inflate(getContext(), gwb.qm, viewGroup);
        this.f10280f = viewGroup.findViewById(gwb.ql);
        this.f10281g = viewGroup.findViewById(gwb.qk);
    }

    public void m12412a(int i) {
        int e = gld.m17949e(i);
        if (this.f10277b != e) {
            this.f10280f.animate().scaleX(f10275e[e]).scaleY(f10275e[e]).setDuration(200).start();
            this.f10277b = e;
        }
        if (e > 0 && !this.f10276a) {
            this.f10276a = true;
            m12411a();
            this.f10278c.postDelayed(this.f10279d, 2000);
        }
    }

    void m12411a() {
        this.f10281g.setAlpha(0.5f);
        this.f10281g.setScaleX(1.0f);
        this.f10281g.setScaleY(1.0f);
        this.f10281g.animate().alpha(0.0f).scaleX(2.0f).scaleY(2.0f).setDuration(1500).start();
    }
}
