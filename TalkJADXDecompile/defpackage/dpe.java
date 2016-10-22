package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: dpe */
public final class dpe extends FrameLayout {
    private static final float[] e;
    boolean a;
    int b;
    Handler c;
    Runnable d;
    private final View f;
    private final View g;

    static {
        e = new float[]{1.0f, 1.15f, 1.3f, 1.45f, 1.6f, 1.75f};
    }

    public dpe(Context context, ViewGroup viewGroup) {
        super(context);
        this.a = false;
        this.b = 0;
        this.c = new Handler();
        this.d = new dpf(this);
        dpe.inflate(getContext(), gwb.qm, viewGroup);
        this.f = viewGroup.findViewById(gwb.ql);
        this.g = viewGroup.findViewById(gwb.qk);
    }

    public void a(int i) {
        int e = gld.e(i);
        if (this.b != e) {
            this.f.animate().scaleX(e[e]).scaleY(e[e]).setDuration(200).start();
            this.b = e;
        }
        if (e > 0 && !this.a) {
            this.a = true;
            a();
            this.c.postDelayed(this.d, 2000);
        }
    }

    void a() {
        this.g.setAlpha(0.5f);
        this.g.setScaleX(1.0f);
        this.g.setScaleY(1.0f);
        this.g.animate().alpha(0.0f).scaleX(2.0f).scaleY(2.0f).setDuration(1500).start();
    }
}
