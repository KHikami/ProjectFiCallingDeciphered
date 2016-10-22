package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;

/* renamed from: dva */
public final class dva extends FrameLayout implements dur {
    dus a;
    boolean b;
    private long c;
    private final Runnable d;

    public dva(Context context) {
        this(context, null);
    }

    private dva(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private dva(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.d = new dvb(this);
        dva.inflate(getContext(), gwb.hb, this);
        setContentDescription(getResources().getString(gwb.rL));
        setOnClickListener(new dvc(this));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public void a(dus dus) {
        this.a = dus;
    }

    public void a(long j) {
        this.c = j;
        c();
    }

    public long a() {
        return this.c;
    }

    public View b() {
        return this;
    }

    private void c() {
        Handler handler = getHandler();
        if (handler != null && !this.b) {
            this.b = true;
            handler.postDelayed(this.d, TimeUnit.SECONDS.toMillis((long) gwb.a(gwb.H(), "babel_location_request_suggestion_duration", 45)));
        }
    }
}
