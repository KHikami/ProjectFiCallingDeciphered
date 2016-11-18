package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;

public final class aeq implements Runnable {
    final /* synthetic */ RecyclerView a;
    private int b;
    private int c;
    private tf d;
    private Interpolator e = RecyclerView.C;
    private boolean f = false;
    private boolean g = false;

    public aeq(RecyclerView recyclerView) {
        this.a = recyclerView;
        this.d = tf.a(recyclerView.getContext(), RecyclerView.C);
    }

    public void run() {
        if (this.a.k == null) {
            b();
            return;
        }
        this.g = false;
        this.f = true;
        this.a.d();
        tf tfVar = this.d;
        u uVar = this.a.k.r;
        if (tfVar.g()) {
            int d;
            int i;
            int f;
            int i2;
            Object obj;
            Object obj2;
            int b = tfVar.b();
            int c = tfVar.c();
            int i3 = b - this.b;
            int i4 = c - this.c;
            int i5 = 0;
            int i6 = 0;
            this.b = b;
            this.c = c;
            int i7 = 0;
            int i8 = 0;
            if (this.a.j != null) {
                this.a.e();
                this.a.l();
                gwb.d("RV Scroll");
                if (i3 != 0) {
                    i5 = this.a.k.a(i3, this.a.c, this.a.x);
                    i7 = i3 - i5;
                }
                if (i4 != 0) {
                    i6 = this.a.k.b(i4, this.a.c, this.a.x);
                    i8 = i4 - i6;
                }
                gwb.e();
                this.a.w();
                this.a.m();
                this.a.b(false);
                if (!(uVar == null || uVar.d() || !uVar.e())) {
                    d = this.a.x.d();
                    if (d == 0) {
                        uVar.c();
                        i = i7;
                        i7 = i6;
                        i6 = i;
                        if (!this.a.l.isEmpty()) {
                            this.a.invalidate();
                        }
                        if (this.a.getOverScrollMode() != 2) {
                            this.a.c(i3, i4);
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
                            if (this.a.getOverScrollMode() != 2) {
                                this.a.d(i2, f);
                            }
                            if ((i2 != 0 || i6 == b || tfVar.d() == 0) && (f != 0 || i8 == c || tfVar.e() == 0)) {
                                tfVar.h();
                            }
                        }
                        if (!(i5 == 0 && i7 == 0)) {
                            this.a.h(i5, i7);
                        }
                        if (!this.a.awakenScrollBars()) {
                            this.a.invalidate();
                        }
                        obj = (i4 == 0 && this.a.k.i() && i7 == i4) ? 1 : null;
                        obj2 = (i3 == 0 && this.a.k.h() && i5 == i3) ? 1 : null;
                        obj2 = ((i3 == 0 || i4 != 0) && obj2 == null && obj == null) ? null : 1;
                        if (!tfVar.a() || obj2 == null) {
                            this.a.a(0);
                        } else {
                            a();
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
            if (this.a.l.isEmpty()) {
                this.a.invalidate();
            }
            if (this.a.getOverScrollMode() != 2) {
                this.a.c(i3, i4);
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
            if (this.a.getOverScrollMode() != 2) {
                this.a.d(i2, f);
            }
            tfVar.h();
            this.a.h(i5, i7);
            if (this.a.awakenScrollBars()) {
                this.a.invalidate();
            }
            if (i4 == 0) {
            }
            if (i3 == 0) {
            }
            if (i3 == 0) {
            }
            if (tfVar.a()) {
            }
            this.a.a(0);
        }
        if (uVar != null) {
            if (uVar.d()) {
                u.a(uVar, 0, 0);
            }
            if (!this.g) {
                uVar.c();
            }
        }
        this.f = false;
        if (this.g) {
            a();
        }
    }

    public void a() {
        if (this.f) {
            this.g = true;
            return;
        }
        this.a.removeCallbacks(this);
        oa.a(this.a, this);
    }

    public void a(int i, int i2) {
        this.a.a(2);
        this.c = 0;
        this.b = 0;
        this.d.a(0, 0, i, i2, nzf.UNSET_ENUM_VALUE, Integer.MAX_VALUE, nzf.UNSET_ENUM_VALUE, Integer.MAX_VALUE);
        a();
    }

    public void b(int i, int i2) {
        a(i, i2, 0, 0);
    }

    public void a(int i, int i2, int i3, Interpolator interpolator) {
        if (this.e != interpolator) {
            this.e = interpolator;
            this.d = tf.a(this.a.getContext(), interpolator);
        }
        this.a.a(2);
        this.c = 0;
        this.b = 0;
        this.d.a(0, 0, i, i2, i3);
        a();
    }

    public void b() {
        this.a.removeCallbacks(this);
        this.d.h();
    }

    private void a(int i, int i2, int i3, int i4) {
        int round;
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        Object obj = abs > abs2 ? 1 : null;
        int sqrt = (int) Math.sqrt((double) 0);
        int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
        int width = obj != null ? this.a.getWidth() : this.a.getHeight();
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
        a(i, i2, Math.min(round, 2000));
    }

    public void a(int i, int i2, int i3) {
        a(i, i2, i3, RecyclerView.C);
    }
}
