package com.android.dialer.app.list;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import aq;
import aqe;
import cob;
import rl;
import rq;

/* compiled from: PG */
public class RemoveView extends FrameLayout {
    public aqe a;
    private TextView b;
    private ImageView c;
    private int d;
    private int e;

    public RemoveView(Context context) {
        super(context);
    }

    public RemoveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RemoveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        this.b = (TextView) findViewById(aq.be);
        this.c = (ImageView) findViewById(aq.bd);
        Resources resources = getResources();
        this.d = resources.getColor(cob.ah);
        this.e = resources.getColor(cob.ag);
        resources.getDrawable(cob.aG);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        switch (dragEvent.getAction()) {
            case rq.c /*2*/:
                if (this.a != null) {
                    this.a.a((View) this, (int) dragEvent.getX(), (int) dragEvent.getY());
                    break;
                }
                break;
            case rl.e /*3*/:
                sendAccessibilityEvent(16384);
                if (this.a != null) {
                    this.a.a((int) dragEvent.getX(), (int) dragEvent.getY(), true);
                }
                a();
                break;
            case rl.g /*5*/:
                sendAccessibilityEvent(16384);
                this.b.setTextColor(this.e);
                this.c.setColorFilter(this.e);
                invalidate();
                break;
            case rl.i /*6*/:
                a();
                break;
        }
        return true;
    }

    private final void a() {
        this.b.setTextColor(this.d);
        this.c.setColorFilter(this.d);
        invalidate();
    }
}
