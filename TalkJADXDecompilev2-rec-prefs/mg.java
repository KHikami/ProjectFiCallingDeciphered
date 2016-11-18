package p000;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

final class mg implements mf {
    private static final int f27636l = ViewConfiguration.getLongPressTimeout();
    private static final int f27637m = ViewConfiguration.getTapTimeout();
    private static final int f27638n = ViewConfiguration.getDoubleTapTimeout();
    final Handler f27639a;
    final OnGestureListener f27640b;
    OnDoubleTapListener f27641c;
    boolean f27642d;
    boolean f27643e;
    boolean f27644f;
    MotionEvent f27645g;
    private int f27646h;
    private int f27647i;
    private int f27648j;
    private int f27649k;
    private boolean f27650o;
    private boolean f27651p;
    private MotionEvent f27652q;
    private boolean f27653r;
    private float f27654s;
    private float f27655t;
    private float f27656u;
    private float f27657v;
    private boolean f27658w;
    private VelocityTracker f27659x;

    public mg(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (handler != null) {
            this.f27639a = new mh(this, handler);
        } else {
            this.f27639a = new mh(this);
        }
        this.f27640b = onGestureListener;
        if (onGestureListener instanceof OnDoubleTapListener) {
            m32017a((OnDoubleTapListener) onGestureListener);
        }
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        } else if (this.f27640b == null) {
            throw new IllegalArgumentException("OnGestureListener must not be null");
        } else {
            this.f27658w = true;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
            int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
            this.f27648j = viewConfiguration.getScaledMinimumFlingVelocity();
            this.f27649k = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f27646h = scaledTouchSlop * scaledTouchSlop;
            this.f27647i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        }
    }

    private void m32017a(OnDoubleTapListener onDoubleTapListener) {
        this.f27641c = onDoubleTapListener;
    }

    public boolean mo3745a(MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (this.f27659x == null) {
            this.f27659x = VelocityTracker.obtain();
        }
        this.f27659x.addMovement(motionEvent);
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
                if (this.f27641c != null) {
                    hasMessages = this.f27639a.hasMessages(3);
                    if (hasMessages) {
                        this.f27639a.removeMessages(3);
                    }
                    if (!(this.f27645g == null || this.f27652q == null || !hasMessages)) {
                        MotionEvent motionEvent2 = this.f27645g;
                        MotionEvent motionEvent3 = this.f27652q;
                        if (this.f27651p && motionEvent.getEventTime() - motionEvent3.getEventTime() <= ((long) f27638n)) {
                            pointerCount = ((int) motionEvent2.getX()) - ((int) motionEvent.getX());
                            b = ((int) motionEvent2.getY()) - ((int) motionEvent.getY());
                            if ((b * b) + (pointerCount * pointerCount) < this.f27647i) {
                                hasMessages = true;
                                if (hasMessages) {
                                    this.f27653r = true;
                                    b = (this.f27641c.onDoubleTap(this.f27645g) | 0) | this.f27641c.onDoubleTapEvent(motionEvent);
                                    this.f27654s = f2;
                                    this.f27656u = f2;
                                    this.f27655t = f;
                                    this.f27657v = f;
                                    if (this.f27645g != null) {
                                        this.f27645g.recycle();
                                    }
                                    this.f27645g = MotionEvent.obtain(motionEvent);
                                    this.f27650o = true;
                                    this.f27651p = true;
                                    this.f27642d = true;
                                    this.f27644f = false;
                                    this.f27643e = false;
                                    if (this.f27658w) {
                                        this.f27639a.removeMessages(2);
                                        this.f27639a.sendEmptyMessageAtTime(2, (this.f27645g.getDownTime() + ((long) f27637m)) + ((long) f27636l));
                                    }
                                    this.f27639a.sendEmptyMessageAtTime(1, this.f27645g.getDownTime() + ((long) f27637m));
                                    return b | this.f27640b.onDown(motionEvent);
                                }
                            }
                        }
                        hasMessages = false;
                        if (hasMessages) {
                            this.f27653r = true;
                            b = (this.f27641c.onDoubleTap(this.f27645g) | 0) | this.f27641c.onDoubleTapEvent(motionEvent);
                            this.f27654s = f2;
                            this.f27656u = f2;
                            this.f27655t = f;
                            this.f27657v = f;
                            if (this.f27645g != null) {
                                this.f27645g.recycle();
                            }
                            this.f27645g = MotionEvent.obtain(motionEvent);
                            this.f27650o = true;
                            this.f27651p = true;
                            this.f27642d = true;
                            this.f27644f = false;
                            this.f27643e = false;
                            if (this.f27658w) {
                                this.f27639a.removeMessages(2);
                                this.f27639a.sendEmptyMessageAtTime(2, (this.f27645g.getDownTime() + ((long) f27637m)) + ((long) f27636l));
                            }
                            this.f27639a.sendEmptyMessageAtTime(1, this.f27645g.getDownTime() + ((long) f27637m));
                            return b | this.f27640b.onDown(motionEvent);
                        }
                    }
                    this.f27639a.sendEmptyMessageDelayed(3, (long) f27638n);
                }
                b = 0;
                this.f27654s = f2;
                this.f27656u = f2;
                this.f27655t = f;
                this.f27657v = f;
                if (this.f27645g != null) {
                    this.f27645g.recycle();
                }
                this.f27645g = MotionEvent.obtain(motionEvent);
                this.f27650o = true;
                this.f27651p = true;
                this.f27642d = true;
                this.f27644f = false;
                this.f27643e = false;
                if (this.f27658w) {
                    this.f27639a.removeMessages(2);
                    this.f27639a.sendEmptyMessageAtTime(2, (this.f27645g.getDownTime() + ((long) f27637m)) + ((long) f27636l));
                }
                this.f27639a.sendEmptyMessageAtTime(1, this.f27645g.getDownTime() + ((long) f27637m));
                return b | this.f27640b.onDown(motionEvent);
            case 1:
                this.f27642d = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                if (this.f27653r) {
                    hasMessages = this.f27641c.onDoubleTapEvent(motionEvent) | 0;
                } else if (this.f27644f) {
                    this.f27639a.removeMessages(3);
                    this.f27644f = false;
                    hasMessages = false;
                } else if (this.f27650o) {
                    hasMessages = this.f27640b.onSingleTapUp(motionEvent);
                    if (this.f27643e && this.f27641c != null) {
                        this.f27641c.onSingleTapConfirmed(motionEvent);
                    }
                } else {
                    VelocityTracker velocityTracker = this.f27659x;
                    int pointerId = motionEvent.getPointerId(0);
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f27649k);
                    b2 = nw.b(velocityTracker, pointerId);
                    a = nw.a(velocityTracker, pointerId);
                    hasMessages = (Math.abs(b2) > ((float) this.f27648j) || Math.abs(a) > ((float) this.f27648j)) ? this.f27640b.onFling(this.f27645g, motionEvent, a, b2) : false;
                }
                if (this.f27652q != null) {
                    this.f27652q.recycle();
                }
                this.f27652q = obtain;
                if (this.f27659x != null) {
                    this.f27659x.recycle();
                    this.f27659x = null;
                }
                this.f27653r = false;
                this.f27643e = false;
                this.f27639a.removeMessages(1);
                this.f27639a.removeMessages(2);
                return hasMessages;
            case 2:
                if (this.f27644f) {
                    return false;
                }
                a = this.f27654s - f2;
                b2 = this.f27655t - f;
                if (this.f27653r) {
                    return this.f27641c.onDoubleTapEvent(motionEvent) | 0;
                }
                if (this.f27650o) {
                    i = (int) (f2 - this.f27656u);
                    int i2 = (int) (f - this.f27657v);
                    i = (i * i) + (i2 * i2);
                    if (i > this.f27646h) {
                        hasMessages = this.f27640b.onScroll(this.f27645g, motionEvent, a, b2);
                        this.f27654s = f2;
                        this.f27655t = f;
                        this.f27650o = false;
                        this.f27639a.removeMessages(3);
                        this.f27639a.removeMessages(1);
                        this.f27639a.removeMessages(2);
                    } else {
                        hasMessages = false;
                    }
                    if (i > this.f27646h) {
                        this.f27651p = false;
                    }
                    return hasMessages;
                } else if (Math.abs(a) < 1.0f && Math.abs(b2) < 1.0f) {
                    return false;
                } else {
                    boolean onScroll = this.f27640b.onScroll(this.f27645g, motionEvent, a, b2);
                    this.f27654s = f2;
                    this.f27655t = f;
                    return onScroll;
                }
            case 3:
                this.f27639a.removeMessages(1);
                this.f27639a.removeMessages(2);
                this.f27639a.removeMessages(3);
                this.f27659x.recycle();
                this.f27659x = null;
                this.f27653r = false;
                this.f27642d = false;
                this.f27650o = false;
                this.f27651p = false;
                this.f27643e = false;
                if (!this.f27644f) {
                    return false;
                }
                this.f27644f = false;
                return false;
            case 5:
                this.f27654s = f2;
                this.f27656u = f2;
                this.f27655t = f;
                this.f27657v = f;
                this.f27639a.removeMessages(1);
                this.f27639a.removeMessages(2);
                this.f27639a.removeMessages(3);
                this.f27653r = false;
                this.f27650o = false;
                this.f27651p = false;
                this.f27643e = false;
                if (!this.f27644f) {
                    return false;
                }
                this.f27644f = false;
                return false;
            case 6:
                this.f27654s = f2;
                this.f27656u = f2;
                this.f27655t = f;
                this.f27657v = f;
                this.f27659x.computeCurrentVelocity(1000, (float) this.f27649k);
                int b3 = nh.b(motionEvent);
                b = motionEvent.getPointerId(b3);
                f2 = nw.a(this.f27659x, b);
                float b4 = nw.b(this.f27659x, b);
                for (b = 0; b < pointerCount; b++) {
                    if (b != b3) {
                        i = motionEvent.getPointerId(b);
                        if ((nw.b(this.f27659x, i) * b4) + (nw.a(this.f27659x, i) * f2) < 0.0f) {
                            this.f27659x.clear();
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
