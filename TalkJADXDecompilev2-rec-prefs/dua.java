package p000;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;

public final class dua {
    public static float f10523a = 0.0f;
    private static DecelerateInterpolator f10524d = new DecelerateInterpolator(1.0f);
    private static int f10525e = -1;
    private static int f10526f;
    private static int f10527g;
    private static int f10528h;
    private static int f10529i;
    private static float f10530j;
    private static float f10531k;
    final duf f10532b;
    Map<dug, ObjectAnimator> f10533c = new ky();
    private float f10534l;
    private final int f10535m;
    private final VelocityTracker f10536n;
    private float f10537o;
    private boolean f10538p;
    private boolean f10539q;
    private dug f10540r;
    private View f10541s;
    private boolean f10542t;
    private float f10543u;
    private float f10544v;
    private float f10545w;

    public dua(Resources resources, VelocityTracker velocityTracker, int i, duf duf, float f, float f2) {
        this.f10532b = duf;
        this.f10535m = 0;
        this.f10536n = velocityTracker;
        this.f10543u = f;
        this.f10534l = f2;
        if (f10525e == -1) {
            f10525e = resources.getInteger(gwb.rG);
            f10526f = resources.getInteger(gwb.rC);
            f10527g = resources.getInteger(gwb.rE);
            f10528h = resources.getInteger(gwb.rD);
            f10529i = resources.getInteger(gwb.rF);
            f10530j = resources.getDimension(gwb.rA);
            f10531k = resources.getDimension(gwb.rB);
        }
    }

    public void m12699a(float f) {
        this.f10543u = f;
    }

    public void m12701b(float f) {
        this.f10534l = f;
    }

    private ObjectAnimator m12694a(View view, float f) {
        return ObjectAnimator.ofFloat(view, this.f10535m == 0 ? "translationX" : "translationY", new float[]{f});
    }

    private float m12698b(View view) {
        return this.f10535m == 0 ? (float) view.getMeasuredWidth() : (float) view.getMeasuredHeight();
    }

    public static void m12695a(View view) {
        dua.m12696a(view, new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom()));
    }

    private static void m12696a(View view, RectF rectF) {
        while (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            view2.getMatrix().mapRect(rectF);
            view2.invalidate((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            view = view2;
        }
    }

    public boolean m12700a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f10544v = motionEvent.getY();
                this.f10538p = false;
                this.f10539q = false;
                View a = this.f10532b.mo1125a(motionEvent);
                this.f10540r = a instanceof dug ? (dug) a : null;
                this.f10536n.clear();
                if (this.f10540r != null) {
                    if (this.f10533c.containsKey(this.f10540r)) {
                        ((ObjectAnimator) this.f10533c.get(this.f10540r)).cancel();
                    }
                    this.f10541s = this.f10540r.mo1251a();
                    this.f10542t = this.f10532b.mo1127a(this.f10540r);
                    this.f10536n.addMovement(motionEvent);
                    this.f10537o = motionEvent.getX();
                    this.f10545w = motionEvent.getY();
                    break;
                }
                break;
            case 1:
            case 3:
                this.f10538p = false;
                this.f10540r = null;
                this.f10541s = null;
                this.f10544v = -1.0f;
                this.f10539q = false;
                break;
            case 2:
                if (this.f10540r != null) {
                    if (this.f10544v >= 0.0f && !this.f10538p) {
                        float y = motionEvent.getY();
                        float x = motionEvent.getX();
                        y = Math.abs(y - this.f10545w);
                        x = Math.abs(x - this.f10537o);
                        if (this.f10539q || (y > 2.0f && y > x * 1.2f)) {
                            this.f10544v = motionEvent.getY();
                            if (y <= f10531k) {
                                return false;
                            }
                            this.f10539q = true;
                            return false;
                        }
                    }
                    this.f10536n.addMovement(motionEvent);
                    float x2 = motionEvent.getX() - this.f10537o;
                    if (Math.abs(x2) > this.f10534l) {
                        this.f10532b.mo1126a(this.f10540r, (int) Math.signum(x2));
                        this.f10538p = true;
                        this.f10537o = motionEvent.getX() - this.f10541s.getTranslationX();
                        this.f10545w = motionEvent.getY();
                    }
                }
                this.f10544v = motionEvent.getY();
                break;
        }
        return this.f10538p;
    }

    private void m12697a(dug dug) {
        View a = dug.mo1251a();
        ObjectAnimator a2 = m12694a(a, 0.0f);
        a2.setDuration((long) f10529i);
        a2.addUpdateListener(new dud(this, a));
        a2.addListener(new due(this, dug, a2, a));
        a2.start();
    }

    public boolean m12702b(MotionEvent motionEvent) {
        if (!this.f10538p) {
            return false;
        }
        this.f10536n.addMovement(motionEvent);
        float xVelocity;
        float yVelocity;
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (this.f10540r != null) {
                    Object obj;
                    dug dug;
                    View a;
                    int i;
                    int min;
                    ObjectAnimator a2;
                    this.f10536n.computeCurrentVelocity(1000, ((float) f10528h) * this.f10543u);
                    float f = ((float) f10525e) * this.f10543u;
                    VelocityTracker velocityTracker = this.f10536n;
                    if (this.f10535m == 0) {
                        xVelocity = velocityTracker.getXVelocity();
                    } else {
                        xVelocity = velocityTracker.getYVelocity();
                    }
                    VelocityTracker velocityTracker2 = this.f10536n;
                    if (this.f10535m == 0) {
                        yVelocity = velocityTracker2.getYVelocity();
                    } else {
                        yVelocity = velocityTracker2.getXVelocity();
                    }
                    float abs = Math.abs(this.f10541s.getTranslationX());
                    float b = m12698b(this.f10541s);
                    Object obj2 = ((double) abs) > 0.4d * ((double) b) ? 1 : null;
                    if (Math.abs(xVelocity) > f && Math.abs(xVelocity) > Math.abs(r1)) {
                        Object obj3;
                        obj = xVelocity > 0.0f ? 1 : null;
                        if (this.f10541s.getTranslationX() > 0.0f) {
                            obj3 = 1;
                        } else {
                            obj3 = null;
                        }
                        if (obj == obj3 && ((double) abs) > ((double) b) * 0.05d) {
                            obj = 1;
                            obj2 = (this.f10532b.mo1127a(this.f10540r) || (obj == null && obj2 == null)) ? null : 1;
                            if (obj2 == null) {
                                m12697a(this.f10540r);
                                break;
                            }
                            dug = this.f10540r;
                            if (obj == null) {
                                xVelocity = 0.0f;
                            }
                            a = this.f10540r.mo1251a();
                            if (xVelocity >= 0.0f || ((xVelocity == 0.0f && a.getTranslationX() < 0.0f) || (xVelocity == 0.0f && a.getTranslationX() == 0.0f && this.f10535m == 1))) {
                                yVelocity = -m12698b(a);
                            } else {
                                yVelocity = m12698b(a);
                            }
                            i = f10527g;
                            if (xVelocity == 0.0f) {
                                min = Math.min(i, (int) ((Math.abs(yVelocity - a.getTranslationX()) * 1000.0f) / Math.abs(xVelocity)));
                            } else {
                                min = f10526f;
                            }
                            if (a != null && a.isHardwareAccelerated()) {
                                a.setLayerType(2, null);
                                a.buildLayer();
                            }
                            a2 = m12694a(a, yVelocity);
                            a2.setInterpolator(f10524d);
                            a2.setDuration((long) min);
                            a2.addListener(new dub(this, a, dug));
                            a2.addUpdateListener(new duc(this, a));
                            a2.start();
                            break;
                        }
                    }
                    obj = null;
                    if (this.f10532b.mo1127a(this.f10540r)) {
                    }
                    if (obj2 == null) {
                        dug = this.f10540r;
                        if (obj == null) {
                            xVelocity = 0.0f;
                        }
                        a = this.f10540r.mo1251a();
                        if (xVelocity >= 0.0f) {
                            break;
                        }
                        yVelocity = -m12698b(a);
                        i = f10527g;
                        if (xVelocity == 0.0f) {
                            min = f10526f;
                        } else {
                            min = Math.min(i, (int) ((Math.abs(yVelocity - a.getTranslationX()) * 1000.0f) / Math.abs(xVelocity)));
                        }
                        a.setLayerType(2, null);
                        a.buildLayer();
                        a2 = m12694a(a, yVelocity);
                        a2.setInterpolator(f10524d);
                        a2.setDuration((long) min);
                        a2.addListener(new dub(this, a, dug));
                        a2.addUpdateListener(new duc(this, a));
                        a2.start();
                        break;
                    }
                    m12697a(this.f10540r);
                }
                break;
            case 2:
            case 4:
                if (this.f10540r != null) {
                    yVelocity = motionEvent.getX() - this.f10537o;
                    if (Math.abs(yVelocity) >= f10530j) {
                        if (this.f10532b.mo1127a(this.f10540r)) {
                            xVelocity = yVelocity;
                        } else {
                            float b2 = m12698b(this.f10541s);
                            xVelocity = 0.05f * b2;
                            if (Math.abs(yVelocity) < b2) {
                                xVelocity *= (float) Math.sin(((double) (yVelocity / b2)) * 1.5707963267948966d);
                            } else if (yVelocity <= 0.0f) {
                                xVelocity = -xVelocity;
                            }
                        }
                        this.f10532b.mo1129b(this.f10540r, (int) Math.signum(xVelocity));
                        View view = this.f10541s;
                        if (this.f10535m == 0) {
                            view.setTranslationX(xVelocity);
                        } else {
                            view.setTranslationY(xVelocity);
                        }
                        dua.m12695a(this.f10540r.mo1251a());
                        break;
                    }
                    return true;
                }
                break;
        }
        return true;
    }
}
