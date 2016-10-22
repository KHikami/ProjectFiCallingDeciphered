package com.android.dialer.app.list;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.GridView;
import android.widget.ImageView;
import aqe;
import aqf;
import aqi;
import aqk;
import aql;
import buf;
import rl;
import rq;

/* compiled from: PG */
public class PhoneFavoriteListView extends GridView implements aqf, aqi {
    private static String i;
    public int a;
    public int b;
    public int c;
    public Handler d;
    public Bitmap e;
    public ImageView f;
    public View g;
    public aqe h;
    private int[] j;
    private float k;
    private final Runnable l;
    private boolean m;
    private int n;
    private final AnimatorListenerAdapter o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;

    static {
        i = PhoneFavoriteListView.class.getSimpleName();
    }

    public PhoneFavoriteListView(Context context) {
        this(context, null);
    }

    public PhoneFavoriteListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PhoneFavoriteListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new int[2];
        this.l = new aqk(this);
        this.m = false;
        this.o = new aql(this);
        this.h = new aqe(this);
        this.p = context.getResources().getInteger(buf.hq);
        this.k = (float) ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.h.a(this);
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.k = (float) ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getX();
            this.n = (int) motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        int action = dragEvent.getAction();
        int x = (int) dragEvent.getX();
        int y = (int) dragEvent.getY();
        switch (action) {
            case rq.b /*1*/:
                if (!"PHONE_FAVORITE_TILE".equals(dragEvent.getLocalState())) {
                    return false;
                }
                boolean z;
                aqe aqe = this.h;
                if (buf.c()) {
                    getLocationOnScreen(aqe.c);
                    action = x + aqe.c[0];
                    x = y + aqe.c[1];
                } else {
                    action = x;
                    x = y;
                }
                PhoneFavoriteSquareTileView a = aqe.b.a(action, x);
                if (a == null) {
                    z = false;
                } else {
                    for (int i = 0; i < aqe.a.size(); i++) {
                        ((aqi) aqe.a.get(i)).a(action, x, a);
                    }
                    z = true;
                }
                if (!z) {
                    return false;
                }
                break;
            case rq.c /*2*/:
                this.c = y;
                this.h.a((View) this, x, y);
                if (!this.m && ((float) Math.abs(this.c - this.n)) >= 4.0f * this.k) {
                    this.m = true;
                    a();
                    this.d.postDelayed(this.l, 5);
                    break;
                }
            case rl.e /*3*/:
            case rl.f /*4*/:
            case rl.i /*6*/:
                a();
                this.d.removeCallbacks(this.l);
                this.m = false;
                if (action == 3 || action == 4) {
                    this.h.a(x, y, false);
                    break;
                }
            case rl.g /*5*/:
                y = (int) (((float) getHeight()) * 0.2f);
                this.a = getTop() + y;
                this.b = getBottom() - y;
                break;
        }
        return true;
    }

    private final void a() {
        if (this.d == null) {
            this.d = getHandler();
        }
    }

    public final void a(int i, int i2, PhoneFavoriteSquareTileView phoneFavoriteSquareTileView) {
        if (this.f != null) {
            this.f.clearAnimation();
            this.e = a(phoneFavoriteSquareTileView);
            if (this.e != null) {
                phoneFavoriteSquareTileView.getLocationOnScreen(this.j);
                this.s = this.j[0];
                this.t = this.j[1];
                this.q = i - this.s;
                this.r = i2 - this.t;
                this.g.getLocationOnScreen(this.j);
                this.s -= this.j[0];
                this.t -= this.j[1];
                this.f.setImageBitmap(this.e);
                this.f.setVisibility(0);
                this.f.setAlpha(0.7f);
                this.f.setX((float) this.s);
                this.f.setY((float) this.t);
            }
        }
    }

    public final void b(int i, int i2, PhoneFavoriteSquareTileView phoneFavoriteSquareTileView) {
        this.g.getLocationOnScreen(this.j);
        this.s = (i - this.q) - this.j[0];
        this.t = (i2 - this.r) - this.j[1];
        if (this.f != null) {
            this.f.setX((float) this.s);
            this.f.setY((float) this.t);
        }
    }

    public final void q() {
        if (this.f != null) {
            this.f.clearAnimation();
            this.f.animate().alpha(0.0f).setDuration((long) this.p).setListener(this.o).start();
        }
    }

    public final void r() {
    }

    private static Bitmap a(View view) {
        Bitmap bitmap = null;
        view.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache != null) {
            try {
                bitmap = drawingCache.copy(Config.ARGB_8888, false);
            } catch (Throwable e) {
                Log.w(i, "Failed to copy bitmap from Drawing cache", e);
            }
        }
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public final PhoneFavoriteSquareTileView a(int i, int i2) {
        View childAt;
        getLocationOnScreen(this.j);
        int i3 = i - this.j[0];
        int i4 = i2 - this.j[1];
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            childAt = getChildAt(i5);
            if (i4 >= childAt.getTop() && i4 <= childAt.getBottom() && i3 >= childAt.getLeft() && i3 <= childAt.getRight()) {
                break;
            }
        }
        childAt = null;
        if (childAt instanceof PhoneFavoriteSquareTileView) {
            return (PhoneFavoriteSquareTileView) childAt;
        }
        return null;
    }
}
