package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* renamed from: aaa */
public final class aaa extends TouchDelegate {
    private final View a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final int e;
    private boolean f;

    public aaa(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.b = new Rect();
        this.d = new Rect();
        this.c = new Rect();
        a(rect, rect2);
        this.a = view;
    }

    public final void a(Rect rect, Rect rect2) {
        this.b.set(rect);
        this.d.set(rect);
        this.d.inset(-this.e, -this.e);
        this.c.set(rect2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r1 = 1;
        r0 = 0;
        r2 = r7.getX();
        r3 = (int) r2;
        r2 = r7.getY();
        r4 = (int) r2;
        r2 = r7.getAction();
        switch(r2) {
            case 0: goto L_0x003c;
            case 1: goto L_0x0048;
            case 2: goto L_0x0048;
            case 3: goto L_0x0056;
            default: goto L_0x0013;
        };
    L_0x0013:
        r2 = r0;
    L_0x0014:
        if (r2 == 0) goto L_0x003b;
    L_0x0016:
        if (r1 == 0) goto L_0x005b;
    L_0x0018:
        r0 = r6.c;
        r0 = r0.contains(r3, r4);
        if (r0 != 0) goto L_0x005b;
    L_0x0020:
        r0 = r6.a;
        r0 = r0.getWidth();
        r0 = r0 / 2;
        r0 = (float) r0;
        r1 = r6.a;
        r1 = r1.getHeight();
        r1 = r1 / 2;
        r1 = (float) r1;
        r7.setLocation(r0, r1);
    L_0x0035:
        r0 = r6.a;
        r0 = r0.dispatchTouchEvent(r7);
    L_0x003b:
        return r0;
    L_0x003c:
        r2 = r6.b;
        r2 = r2.contains(r3, r4);
        if (r2 == 0) goto L_0x0013;
    L_0x0044:
        r6.f = r1;
        r2 = r1;
        goto L_0x0014;
    L_0x0048:
        r2 = r6.f;
        if (r2 == 0) goto L_0x0014;
    L_0x004c:
        r5 = r6.d;
        r5 = r5.contains(r3, r4);
        if (r5 != 0) goto L_0x0014;
    L_0x0054:
        r1 = r0;
        goto L_0x0014;
    L_0x0056:
        r2 = r6.f;
        r6.f = r0;
        goto L_0x0014;
    L_0x005b:
        r0 = r6.c;
        r0 = r0.left;
        r0 = r3 - r0;
        r0 = (float) r0;
        r1 = r6.c;
        r1 = r1.top;
        r1 = r4 - r1;
        r1 = (float) r1;
        r7.setLocation(r0, r1);
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: aaa.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
