package p000;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;

public final class aeq implements Runnable {
    final /* synthetic */ RecyclerView f430a;
    private int f431b;
    private int f432c;
    private tf f433d;
    private Interpolator f434e = RecyclerView.f1416C;
    private boolean f435f = false;
    private boolean f436g = false;

    public aeq(RecyclerView recyclerView) {
        this.f430a = recyclerView;
        this.f433d = tf.a(recyclerView.getContext(), RecyclerView.f1416C);
    }

    public void run() {
        if (this.f430a.f1449k == null) {
            m851b();
            return;
        }
        this.f436g = false;
        this.f435f = true;
        this.f430a.m3079d();
        tf tfVar = this.f433d;
        u uVar = this.f430a.f1449k.f258r;
        if (tfVar.g()) {
            int d;
            int i;
            int f;
            int i2;
            Object obj;
            Object obj2;
            int b = tfVar.b();
            int c = tfVar.c();
            int i3 = b - this.f431b;
            int i4 = c - this.f432c;
            int i5 = 0;
            int i6 = 0;
            this.f431b = b;
            this.f432c = c;
            int i7 = 0;
            int i8 = 0;
            if (this.f430a.f1448j != null) {
                this.f430a.m3082e();
                this.f430a.m3098l();
                gwb.m2147d("RV Scroll");
                if (i3 != 0) {
                    i5 = this.f430a.f1449k.mo41a(i3, this.f430a.f1441c, this.f430a.f1462x);
                    i7 = i3 - i5;
                }
                if (i4 != 0) {
                    i6 = this.f430a.f1449k.mo48b(i4, this.f430a.f1441c, this.f430a.f1462x);
                    i8 = i4 - i6;
                }
                gwb.m2175e();
                this.f430a.m3109w();
                this.f430a.m3099m();
                this.f430a.m3069b(false);
                if (!(uVar == null || uVar.d() || !uVar.e())) {
                    d = this.f430a.f1462x.m845d();
                    if (d == 0) {
                        uVar.c();
                        i = i7;
                        i7 = i6;
                        i6 = i;
                        if (!this.f430a.f1450l.isEmpty()) {
                            this.f430a.invalidate();
                        }
                        if (this.f430a.getOverScrollMode() != 2) {
                            this.f430a.m3075c(i3, i4);
                        }
                        if (!(i6 == 0 && i8 == 0)) {
                            f = (int) tfVar.f();
                            if (i6 == b) {
                                d = i6 >= 0 ? -f : i6 <= 0 ? f : 0;
                                i2 = d;
                            } else {
                                i2 = 0;
                            }
                            if (i8 != c) {
                                f = 0;
                            } else if (i8 < 0) {
                                f = -f;
                            } else if (i8 <= 0) {
                                f = 0;
                            }
                            if (this.f430a.getOverScrollMode() != 2) {
                                this.f430a.m3080d(i2, f);
                            }
                            if ((i2 != 0 || i6 == b || tfVar.d() == 0) && (f != 0 || i8 == c || tfVar.e() == 0)) {
                                tfVar.h();
                            }
                        }
                        if (!(i5 == 0 && i7 == 0)) {
                            this.f430a.m3094h(i5, i7);
                        }
                        if (!this.f430a.awakenScrollBars()) {
                            this.f430a.invalidate();
                        }
                        obj = (i4 == 0 && this.f430a.f1449k.mo62i() && i7 == i4) ? 1 : null;
                        obj2 = (i3 == 0 && this.f430a.f1449k.mo61h() && i5 == i3) ? 1 : null;
                        obj2 = ((i3 == 0 || i4 != 0) && obj2 == null && obj == null) ? null : 1;
                        if (!tfVar.a() || obj2 == null) {
                            this.f430a.m3046a(0);
                        } else {
                            m847a();
                        }
                    } else {
                        if (uVar.f() >= d) {
                            uVar.a(d - 1);
                        }
                        u.a(uVar, i3 - i7, i4 - i8);
                    }
                }
            }
            i = i7;
            i7 = i6;
            i6 = i;
            if (this.f430a.f1450l.isEmpty()) {
                this.f430a.invalidate();
            }
            if (this.f430a.getOverScrollMode() != 2) {
                this.f430a.m3075c(i3, i4);
            }
            f = (int) tfVar.f();
            if (i6 == b) {
                i2 = 0;
            } else {
                if (i6 >= 0) {
                    if (i6 <= 0) {
                    }
                }
                i2 = d;
            }
            if (i8 != c) {
                f = 0;
            } else if (i8 < 0) {
                f = -f;
            } else if (i8 <= 0) {
                f = 0;
            }
            if (this.f430a.getOverScrollMode() != 2) {
                this.f430a.m3080d(i2, f);
            }
            tfVar.h();
            this.f430a.m3094h(i5, i7);
            if (this.f430a.awakenScrollBars()) {
                this.f430a.invalidate();
            }
            if (i4 == 0) {
            }
            if (i3 == 0) {
            }
            if (i3 == 0) {
            }
            if (tfVar.a()) {
            }
            this.f430a.m3046a(0);
        }
        if (uVar != null) {
            if (uVar.d()) {
                u.a(uVar, 0, 0);
            }
            if (!this.f436g) {
                uVar.c();
            }
        }
        this.f435f = false;
        if (this.f436g) {
            m847a();
        }
    }

    public void m847a() {
        if (this.f435f) {
            this.f436g = true;
            return;
        }
        this.f430a.removeCallbacks(this);
        oa.a(this.f430a, this);
    }

    public void m848a(int i, int i2) {
        this.f430a.m3046a(2);
        this.f432c = 0;
        this.f431b = 0;
        this.f433d.a(0, 0, i, i2, nzf.UNSET_ENUM_VALUE, Integer.MAX_VALUE, nzf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
        m847a();
    }

    public void m852b(int i, int i2) {
        m846a(i, i2, 0, 0);
    }

    public void m850a(int i, int i2, int i3, Interpolator interpolator) {
        if (this.f434e != interpolator) {
            this.f434e = interpolator;
            this.f433d = tf.a(this.f430a.getContext(), interpolator);
        }
        this.f430a.m3046a(2);
        this.f432c = 0;
        this.f431b = 0;
        this.f433d.a(0, 0, i, i2, i3);
        m847a();
    }

    public void m851b() {
        this.f430a.removeCallbacks(this);
        this.f433d.h();
    }

    private void m846a(int i, int i2, int i3, int i4) {
        int round;
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        Object obj = abs > abs2 ? 1 : null;
        int sqrt = (int) Math.sqrt((double) 0);
        int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
        int width = obj != null ? this.f430a.getWidth() : this.f430a.getHeight();
        int i5 = width / 2;
        float sin = (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * ((float) i5)) + ((float) i5);
        if (sqrt > 0) {
            round = Math.round(1000.0f * Math.abs(sin / ((float) sqrt))) * 4;
        } else {
            if (obj != null) {
                round = abs;
            } else {
                round = abs2;
            }
            round = (int) (((((float) round) / ((float) width)) + 1.0f) * 300.0f);
        }
        m849a(i, i2, Math.min(round, 2000));
    }

    public void m849a(int i, int i2, int i3) {
        m850a(i, i2, i3, RecyclerView.f1416C);
    }
}
