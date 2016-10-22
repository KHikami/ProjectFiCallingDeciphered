package defpackage;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;

/* renamed from: dua */
public final class dua {
    public static float a;
    private static DecelerateInterpolator d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static float j;
    private static float k;
    final duf b;
    Map<dug, ObjectAnimator> c;
    private float l;
    private final int m;
    private final VelocityTracker n;
    private float o;
    private boolean p;
    private boolean q;
    private dug r;
    private View s;
    private boolean t;
    private float u;
    private float v;
    private float w;

    static {
        d = new DecelerateInterpolator(1.0f);
        e = -1;
        a = 0.0f;
    }

    public dua(Resources resources, VelocityTracker velocityTracker, int i, duf duf, float f, float f2) {
        this.c = new ky();
        this.b = duf;
        this.m = 0;
        this.n = velocityTracker;
        this.u = f;
        this.l = f2;
        if (e == -1) {
            e = resources.getInteger(gwb.rG);
            f = resources.getInteger(gwb.rC);
            g = resources.getInteger(gwb.rE);
            h = resources.getInteger(gwb.rD);
            i = resources.getInteger(gwb.rF);
            j = resources.getDimension(gwb.rA);
            k = resources.getDimension(gwb.rB);
        }
    }

    public void a(float f) {
        this.u = f;
    }

    public void b(float f) {
        this.l = f;
    }

    private ObjectAnimator a(View view, float f) {
        return ObjectAnimator.ofFloat(view, this.m == 0 ? "translationX" : "translationY", new float[]{f});
    }

    private float b(View view) {
        return this.m == 0 ? (float) view.getMeasuredWidth() : (float) view.getMeasuredHeight();
    }

    public static void a(View view) {
        dua.a(view, new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom()));
    }

    private static void a(View view, RectF rectF) {
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            view2.getMatrix().mapRect(rectF);
            view2.invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            view = view2;
        }
    }

    public boolean a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case wi.w /*0*/:
                this.v = motionEvent.getY();
                this.p = false;
                this.q = false;
                View a = this.b.a(motionEvent);
                this.r = a instanceof dug ? (dug) a : null;
                this.n.clear();
                if (this.r != null) {
                    if (this.c.containsKey(this.r)) {
                        ((ObjectAnimator) this.c.get(this.r)).cancel();
                    }
                    this.s = this.r.a();
                    this.t = this.b.a(this.r);
                    this.n.addMovement(motionEvent);
                    this.o = motionEvent.getX();
                    this.w = motionEvent.getY();
                    break;
                }
                break;
            case wi.j /*1*/:
            case wi.z /*3*/:
                this.p = false;
                this.r = null;
                this.s = null;
                this.v = -1.0f;
                this.q = false;
                break;
            case wi.l /*2*/:
                if (this.r != null) {
                    if (this.v >= 0.0f && !this.p) {
                        float y = motionEvent.getY();
                        float x = motionEvent.getX();
                        y = Math.abs(y - this.w);
                        x = Math.abs(x - this.o);
                        if (this.q || (y > 2.0f && y > x * 1.2f)) {
                            this.v = motionEvent.getY();
                            if (y <= k) {
                                return false;
                            }
                            this.q = true;
                            return false;
                        }
                    }
                    this.n.addMovement(motionEvent);
                    float x2 = motionEvent.getX() - this.o;
                    if (Math.abs(x2) > this.l) {
                        this.b.a(this.r, (int) Math.signum(x2));
                        this.p = true;
                        this.o = motionEvent.getX() - this.s.getTranslationX();
                        this.w = motionEvent.getY();
                    }
                }
                this.v = motionEvent.getY();
                break;
        }
        return this.p;
    }

    private void a(dug dug) {
        View a = dug.a();
        ObjectAnimator a2 = a(a, 0.0f);
        a2.setDuration((long) i);
        a2.addUpdateListener(new dud(this, a));
        a2.addListener(new due(this, dug, a2, a));
        a2.start();
    }

    public boolean b(MotionEvent motionEvent) {
        if (!this.p) {
            return false;
        }
        this.n.addMovement(motionEvent);
        float xVelocity;
        float yVelocity;
        switch (motionEvent.getAction()) {
            case wi.j /*1*/:
            case wi.z /*3*/:
                if (this.r != null) {
                    Object obj;
                    dug dug;
                    View a;
                    int i;
                    int min;
                    ObjectAnimator a2;
                    this.n.computeCurrentVelocity(1000, ((float) h) * this.u);
                    float f = ((float) e) * this.u;
                    VelocityTracker velocityTracker = this.n;
                    if (this.m == 0) {
                        xVelocity = velocityTracker.getXVelocity();
                    } else {
                        xVelocity = velocityTracker.getYVelocity();
                    }
                    VelocityTracker velocityTracker2 = this.n;
                    if (this.m == 0) {
                        yVelocity = velocityTracker2.getYVelocity();
                    } else {
                        yVelocity = velocityTracker2.getXVelocity();
                    }
                    float abs = Math.abs(this.s.getTranslationX());
                    float b = b(this.s);
                    Object obj2 = ((double) abs) > 0.4d * ((double) b) ? 1 : null;
                    if (Math.abs(xVelocity) > f && Math.abs(xVelocity) > Math.abs(r1)) {
                        Object obj3;
                        obj = xVelocity > 0.0f ? 1 : null;
                        if (this.s.getTranslationX() > 0.0f) {
                            obj3 = 1;
                        } else {
                            obj3 = null;
                        }
                        if (obj == obj3 && ((double) abs) > ((double) b) * 0.05d) {
                            obj = 1;
                            obj2 = (this.b.a(this.r) || (obj == null && obj2 == null)) ? null : 1;
                            if (obj2 == null) {
                                a(this.r);
                                break;
                            }
                            dug = this.r;
                            if (obj == null) {
                                xVelocity = 0.0f;
                            }
                            a = this.r.a();
                            if (xVelocity >= 0.0f || ((xVelocity == 0.0f && a.getTranslationX() < 0.0f) || (xVelocity == 0.0f && a.getTranslationX() == 0.0f && this.m == 1))) {
                                yVelocity = -b(a);
                            } else {
                                yVelocity = b(a);
                            }
                            i = g;
                            if (xVelocity == 0.0f) {
                                min = Math.min(i, (int) ((Math.abs(yVelocity - a.getTranslationX()) * 1000.0f) / Math.abs(xVelocity)));
                            } else {
                                min = f;
                            }
                            if (a != null && a.isHardwareAccelerated()) {
                                a.setLayerType(2, null);
                                a.buildLayer();
                            }
                            a2 = a(a, yVelocity);
                            a2.setInterpolator(d);
                            a2.setDuration((long) min);
                            a2.addListener(new dub(this, a, dug));
                            a2.addUpdateListener(new duc(this, a));
                            a2.start();
                            break;
                        }
                    }
                    obj = null;
                    if (this.b.a(this.r)) {
                    }
                    if (obj2 == null) {
                        dug = this.r;
                        if (obj == null) {
                            xVelocity = 0.0f;
                        }
                        a = this.r.a();
                        if (xVelocity >= 0.0f) {
                            break;
                        }
                        yVelocity = -b(a);
                        i = g;
                        if (xVelocity == 0.0f) {
                            min = f;
                        } else {
                            min = Math.min(i, (int) ((Math.abs(yVelocity - a.getTranslationX()) * 1000.0f) / Math.abs(xVelocity)));
                        }
                        a.setLayerType(2, null);
                        a.buildLayer();
                        a2 = a(a, yVelocity);
                        a2.setInterpolator(d);
                        a2.setDuration((long) min);
                        a2.addListener(new dub(this, a, dug));
                        a2.addUpdateListener(new duc(this, a));
                        a2.start();
                        break;
                    }
                    a(this.r);
                }
                break;
            case wi.l /*2*/:
            case wi.h /*4*/:
                if (this.r != null) {
                    yVelocity = motionEvent.getX() - this.o;
                    if (Math.abs(yVelocity) >= j) {
                        if (this.b.a(this.r)) {
                            xVelocity = yVelocity;
                        } else {
                            float b2 = b(this.s);
                            xVelocity = 0.05f * b2;
                            if (Math.abs(yVelocity) < b2) {
                                xVelocity *= (float) Math.sin(((double) (yVelocity / b2)) * 1.5707963267948966d);
                            } else if (yVelocity <= 0.0f) {
                                xVelocity = -xVelocity;
                            }
                        }
                        this.b.b(this.r, (int) Math.signum(xVelocity));
                        View view = this.s;
                        if (this.m == 0) {
                            view.setTranslationX(xVelocity);
                        } else {
                            view.setTranslationY(xVelocity);
                        }
                        dua.a(this.r.a());
                        break;
                    }
                    return true;
                }
                break;
        }
        return true;
    }
}
