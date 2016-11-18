package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

final class mg implements mf {
    private static final int l = ViewConfiguration.getLongPressTimeout();
    private static final int m = ViewConfiguration.getTapTimeout();
    private static final int n = ViewConfiguration.getDoubleTapTimeout();
    final Handler a;
    final OnGestureListener b;
    OnDoubleTapListener c;
    boolean d;
    boolean e;
    boolean f;
    MotionEvent g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean o;
    private boolean p;
    private MotionEvent q;
    private boolean r;
    private float s;
    private float t;
    private float u;
    private float v;
    private boolean w;
    private VelocityTracker x;

    public mg(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (handler != null) {
            this.a = new mh(this, handler);
        } else {
            this.a = new mh(this);
        }
        this.b = onGestureListener;
        if (onGestureListener instanceof OnDoubleTapListener) {
            a((OnDoubleTapListener) onGestureListener);
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        } else if (this.b == null) {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        } else {
            this.w = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.j = viewConfiguration.getScaledMinimumFlingVelocity();
            this.k = viewConfiguration.getScaledMaximumFlingVelocity();
            this.h = scaledTouchSlop * scaledTouchSlop;
            this.i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }
    }

    private void a(OnDoubleTapListener onDoubleTapListener) {
        this.c = onDoubleTapListener;
    }

    public boolean a(MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (this.x == null) {
            this.x = VelocityTracker.obtain();
        }
        this.x.addMovement(motionEvent);
        boolean z = (action & 255) == 6;
        int b = z ? nh.b(motionEvent) : -1;
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (i = 0; i < pointerCount; i++) {
            if (b != i) {
                f2 += motionEvent.getX(i);
                f += motionEvent.getY(i);
            }
        }
        b = z ? pointerCount - 1 : pointerCount;
        f2 /= (float) b;
        f /= (float) b;
        boolean hasMessages;
        float b2;
        float a;
        switch (action & 255) {
            case 0:
                if (this.c != null) {
                    hasMessages = this.a.hasMessages(3);
                    if (hasMessages) {
                        this.a.removeMessages(3);
                    }
                    if (!(this.g == null || this.q == null || !hasMessages)) {
                        MotionEvent motionEvent2 = this.g;
                        MotionEvent motionEvent3 = this.q;
                        if (this.p && motionEvent.getEventTime() - motionEvent3.getEventTime() <= ((long) n)) {
                            pointerCount = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                            b = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                            if ((b * b) + (pointerCount * pointerCount) < this.i) {
                                hasMessages = true;
                                if (hasMessages) {
                                    this.r = true;
                                    b = (this.c.onDoubleTap(this.g) | 0) | this.c.onDoubleTapEvent(motionEvent);
                                    this.s = f2;
                                    this.u = f2;
                                    this.t = f;
                                    this.v = f;
                                    if (this.g != null) {
                                        this.g.recycle();
                                    }
                                    this.g = MotionEvent.obtain(motionEvent);
                                    this.o = true;
                                    this.p = true;
                                    this.d = true;
                                    this.f = false;
                                    this.e = false;
                                    if (this.w) {
                                        this.a.removeMessages(2);
                                        this.a.sendEmptyMessageAtTime(2, (this.g.getDownTime() + ((long) m)) + ((long) l));
                                    }
                                    this.a.sendEmptyMessageAtTime(1, this.g.getDownTime() + ((long) m));
                                    return b | this.b.onDown(motionEvent);
                                }
                            }
                        }
                        hasMessages = false;
                        if (hasMessages) {
                            this.r = true;
                            b = (this.c.onDoubleTap(this.g) | 0) | this.c.onDoubleTapEvent(motionEvent);
                            this.s = f2;
                            this.u = f2;
                            this.t = f;
                            this.v = f;
                            if (this.g != null) {
                                this.g.recycle();
                            }
                            this.g = MotionEvent.obtain(motionEvent);
                            this.o = true;
                            this.p = true;
                            this.d = true;
                            this.f = false;
                            this.e = false;
                            if (this.w) {
                                this.a.removeMessages(2);
                                this.a.sendEmptyMessageAtTime(2, (this.g.getDownTime() + ((long) m)) + ((long) l));
                            }
                            this.a.sendEmptyMessageAtTime(1, this.g.getDownTime() + ((long) m));
                            return b | this.b.onDown(motionEvent);
                        }
                    }
                    this.a.sendEmptyMessageDelayed(3, (long) n);
                }
                b = 0;
                this.s = f2;
                this.u = f2;
                this.t = f;
                this.v = f;
                if (this.g != null) {
                    this.g.recycle();
                }
                this.g = MotionEvent.obtain(motionEvent);
                this.o = true;
                this.p = true;
                this.d = true;
                this.f = false;
                this.e = false;
                if (this.w) {
                    this.a.removeMessages(2);
                    this.a.sendEmptyMessageAtTime(2, (this.g.getDownTime() + ((long) m)) + ((long) l));
                }
                this.a.sendEmptyMessageAtTime(1, this.g.getDownTime() + ((long) m));
                return b | this.b.onDown(motionEvent);
            case 1:
                this.d = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (this.r) {
                    hasMessages = this.c.onDoubleTapEvent(motionEvent) | 0;
                } else if (this.f) {
                    this.a.removeMessages(3);
                    this.f = false;
                    hasMessages = false;
                } else if (this.o) {
                    hasMessages = this.b.onSingleTapUp(motionEvent);
                    if (this.e && this.c != null) {
                        this.c.onSingleTapConfirmed(motionEvent);
                    }
                } else {
                    VelocityTracker velocityTracker = this.x;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, (float) this.k);
                    b2 = nw.b(velocityTracker, pointerId);
                    a = nw.a(velocityTracker, pointerId);
                    hasMessages = (Math.abs(b2) > ((float) this.j) || Math.abs(a) > ((float) this.j)) ? this.b.onFling(this.g, motionEvent, a, b2) : false;
                }
                if (this.q != null) {
                    this.q.recycle();
                }
                this.q = obtain;
                if (this.x != null) {
                    this.x.recycle();
                    this.x = null;
                }
                this.r = false;
                this.e = false;
                this.a.removeMessages(1);
                this.a.removeMessages(2);
                return hasMessages;
            case 2:
                if (this.f) {
                    return false;
                }
                a = this.s - f2;
                b2 = this.t - f;
                if (this.r) {
                    return this.c.onDoubleTapEvent(motionEvent) | 0;
                }
                if (this.o) {
                    i = (int) (f2 - this.u);
                    int i2 = (int) (f - this.v);
                    i = (i * i) + (i2 * i2);
                    if (i > this.h) {
                        hasMessages = this.b.onScroll(this.g, motionEvent, a, b2);
                        this.s = f2;
                        this.t = f;
                        this.o = false;
                        this.a.removeMessages(3);
                        this.a.removeMessages(1);
                        this.a.removeMessages(2);
                    } else {
                        hasMessages = false;
                    }
                    if (i > this.h) {
                        this.p = false;
                    }
                    return hasMessages;
                } else if (Math.abs(a) < 1.0f && Math.abs(b2) < 1.0f) {
                    return false;
                } else {
                    boolean onScroll = this.b.onScroll(this.g, motionEvent, a, b2);
                    this.s = f2;
                    this.t = f;
                    return onScroll;
                }
            case 3:
                this.a.removeMessages(1);
                this.a.removeMessages(2);
                this.a.removeMessages(3);
                this.x.recycle();
                this.x = null;
                this.r = false;
                this.d = false;
                this.o = false;
                this.p = false;
                this.e = false;
                if (!this.f) {
                    return false;
                }
                this.f = false;
                return false;
            case 5:
                this.s = f2;
                this.u = f2;
                this.t = f;
                this.v = f;
                this.a.removeMessages(1);
                this.a.removeMessages(2);
                this.a.removeMessages(3);
                this.r = false;
                this.o = false;
                this.p = false;
                this.e = false;
                if (!this.f) {
                    return false;
                }
                this.f = false;
                return false;
            case 6:
                this.s = f2;
                this.u = f2;
                this.t = f;
                this.v = f;
                this.x.computeCurrentVelocity(1000, (float) this.k);
                int b3 = nh.b(motionEvent);
                b = motionEvent.getPointerId(b3);
                f2 = nw.a(this.x, b);
                float b4 = nw.b(this.x, b);
                for (b = 0; b < pointerCount; b++) {
                    if (b != b3) {
                        i = motionEvent.getPointerId(b);
                        if ((nw.b(this.x, i) * b4) + (nw.a(this.x, i) * f2) < 0.0f) {
                            this.x.clear();
                            return false;
                        }
                    }
                }
                return false;
            default:
                return false;
        }
    }
}
