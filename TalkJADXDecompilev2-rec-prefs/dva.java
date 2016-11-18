package p000;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;

public final class dva extends FrameLayout implements dur {
    dus f10599a;
    boolean f10600b;
    private long f10601c;
    private final Runnable f10602d;

    public dva(Context context) {
        this(context, null);
    }

    private dva(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private dva(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f10602d = new dvb(this);
        dva.inflate(getContext(), gwb.hb, this);
        setContentDescription(getResources().getString(gwb.rL));
        setOnClickListener(new dvc(this));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12764c();
    }

    public void mo1682a(dus dus) {
        this.f10599a = dus;
    }

    public void mo1681a(long j) {
        this.f10601c = j;
        m12764c();
    }

    public long mo1256a() {
        return this.f10601c;
    }

    public View mo1257b() {
        return this;
    }

    private void m12764c() {
        Handler handler = getHandler();
        if (handler != null && !this.f10600b) {
            this.f10600b = true;
            handler.postDelayed(this.f10602d, TimeUnit.SECONDS.toMillis((long) gwb.m1492a(gwb.m1400H(), "babel_location_request_suggestion_duration", 45)));
        }
    }
}
