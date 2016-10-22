import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

public abstract class acm implements OnTouchListener {
    private final float a;
    private final int b;
    final View c;
    Runnable d;
    boolean e;
    int f;
    private final int g;
    private Runnable h;
    private final int[] i;

    public abstract ys a();

    public acm(View view) {
        this.i = new int[2];
        this.c = view;
        view.setLongClickable(true);
        if (VERSION.SDK_INT >= 12) {
            view.addOnAttachStateChangeListener(new acn(this));
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new aco(this));
        }
        this.a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.b = ViewConfiguration.getTapTimeout();
        this.g = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        r11 = this;
        r4 = 3;
        r5 = 0;
        r8 = 1;
        r7 = 0;
        r10 = r11.e;
        if (r10 == 0) goto L_0x0078;
    L_0x0008:
        r1 = r11.c;
        r0 = r11.a();
        if (r0 == 0) goto L_0x0016;
    L_0x0010:
        r2 = r0.d();
        if (r2 != 0) goto L_0x0028;
    L_0x0016:
        r0 = r7;
    L_0x0017:
        if (r0 != 0) goto L_0x001f;
    L_0x0019:
        r0 = r11.c();
        if (r0 != 0) goto L_0x0076;
    L_0x001f:
        r0 = r8;
    L_0x0020:
        r11.e = r0;
        if (r0 != 0) goto L_0x0026;
    L_0x0024:
        if (r10 == 0) goto L_0x0027;
    L_0x0026:
        r7 = r8;
    L_0x0027:
        return r7;
    L_0x0028:
        r0 = r0.e();
        r0 = (acj) r0;
        if (r0 == 0) goto L_0x0036;
    L_0x0030:
        r2 = r0.isShown();
        if (r2 != 0) goto L_0x0038;
    L_0x0036:
        r0 = r7;
        goto L_0x0017;
    L_0x0038:
        r2 = android.view.MotionEvent.obtainNoHistory(r13);
        r3 = r11.i;
        r1.getLocationOnScreen(r3);
        r1 = r3[r7];
        r1 = (float) r1;
        r3 = r3[r8];
        r3 = (float) r3;
        r2.offsetLocation(r1, r3);
        r1 = r11.i;
        r0.getLocationOnScreen(r1);
        r3 = r1[r7];
        r3 = -r3;
        r3 = (float) r3;
        r1 = r1[r8];
        r1 = -r1;
        r1 = (float) r1;
        r2.offsetLocation(r3, r1);
        r1 = r11.f;
        r1 = r0.a(r2, r1);
        r2.recycle();
        r0 = nh.a(r13);
        if (r0 == r8) goto L_0x0072;
    L_0x0069:
        if (r0 == r4) goto L_0x0072;
    L_0x006b:
        r0 = r8;
    L_0x006c:
        if (r1 == 0) goto L_0x0074;
    L_0x006e:
        if (r0 == 0) goto L_0x0074;
    L_0x0070:
        r0 = r8;
        goto L_0x0017;
    L_0x0072:
        r0 = r7;
        goto L_0x006c;
    L_0x0074:
        r0 = r7;
        goto L_0x0017;
    L_0x0076:
        r0 = r7;
        goto L_0x0020;
    L_0x0078:
        r1 = r11.c;
        r0 = r1.isEnabled();
        if (r0 == 0) goto L_0x0087;
    L_0x0080:
        r0 = nh.a(r13);
        switch(r0) {
            case 0: goto L_0x00a8;
            case 1: goto L_0x0121;
            case 2: goto L_0x00d5;
            case 3: goto L_0x0121;
            default: goto L_0x0087;
        };
    L_0x0087:
        r0 = r7;
    L_0x0088:
        if (r0 == 0) goto L_0x0126;
    L_0x008a:
        r0 = r11.b();
        if (r0 == 0) goto L_0x0126;
    L_0x0090:
        r9 = r8;
    L_0x0091:
        if (r9 == 0) goto L_0x00a5;
    L_0x0093:
        r0 = android.os.SystemClock.uptimeMillis();
        r2 = r0;
        r6 = r5;
        r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7);
        r1 = r11.c;
        r1.onTouchEvent(r0);
        r0.recycle();
    L_0x00a5:
        r0 = r9;
        goto L_0x0020;
    L_0x00a8:
        r0 = r13.getPointerId(r7);
        r11.f = r0;
        r0 = r11.d;
        if (r0 != 0) goto L_0x00b9;
    L_0x00b2:
        r0 = new acp;
        r0.<init>(r11);
        r11.d = r0;
    L_0x00b9:
        r0 = r11.d;
        r2 = r11.b;
        r2 = (long) r2;
        r1.postDelayed(r0, r2);
        r0 = r11.h;
        if (r0 != 0) goto L_0x00cc;
    L_0x00c5:
        r0 = new acq;
        r0.<init>(r11);
        r11.h = r0;
    L_0x00cc:
        r0 = r11.h;
        r2 = r11.g;
        r2 = (long) r2;
        r1.postDelayed(r0, r2);
        goto L_0x0087;
    L_0x00d5:
        r0 = r11.f;
        r0 = r13.findPointerIndex(r0);
        if (r0 < 0) goto L_0x0087;
    L_0x00dd:
        r2 = r13.getX(r0);
        r0 = r13.getY(r0);
        r3 = r11.a;
        r6 = -r3;
        r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x011f;
    L_0x00ec:
        r6 = -r3;
        r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x011f;
    L_0x00f1:
        r6 = r1.getRight();
        r9 = r1.getLeft();
        r6 = r6 - r9;
        r6 = (float) r6;
        r6 = r6 + r3;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x011f;
    L_0x0100:
        r2 = r1.getBottom();
        r6 = r1.getTop();
        r2 = r2 - r6;
        r2 = (float) r2;
        r2 = r2 + r3;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x011f;
    L_0x010f:
        r0 = r8;
    L_0x0110:
        if (r0 != 0) goto L_0x0087;
    L_0x0112:
        r11.d();
        r0 = r1.getParent();
        r0.requestDisallowInterceptTouchEvent(r8);
        r0 = r8;
        goto L_0x0088;
    L_0x011f:
        r0 = r7;
        goto L_0x0110;
    L_0x0121:
        r11.d();
        goto L_0x0087;
    L_0x0126:
        r9 = r7;
        goto L_0x0091;
        */
        throw new UnsupportedOperationException("Method not decompiled: acm.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean b() {
        ys a = a();
        if (!(a == null || a.d())) {
            a.a();
        }
        return true;
    }

    protected boolean c() {
        ys a = a();
        if (a != null && a.d()) {
            a.c();
        }
        return true;
    }

    void d() {
        if (this.h != null) {
            this.c.removeCallbacks(this.h);
        }
        if (this.d != null) {
            this.c.removeCallbacks(this.d);
        }
    }
}
