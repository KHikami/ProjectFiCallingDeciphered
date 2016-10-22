import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

/* compiled from: PG */
public final class zj implements Runnable {
    public int a;
    public int b;
    public ox c;
    public final /* synthetic */ RecyclerView d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public zj(RecyclerView recyclerView) {
        this.d = recyclerView;
        this.e = RecyclerView.F;
        this.f = false;
        this.g = false;
        this.c = ox.a(recyclerView.getContext(), RecyclerView.F);
    }

    public final void run() {
        if (this.d.k == null) {
            b();
            return;
        }
        int i;
        int a;
        this.g = false;
        this.f = true;
        this.d.a();
        ox oxVar = this.c;
        zg zgVar = this.d.k.f;
        if (oxVar.g()) {
            int a2;
            int i2;
            int b = oxVar.b();
            int c = oxVar.c();
            int i3 = b - this.a;
            int i4 = c - this.b;
            i = 0;
            int i5 = 0;
            this.a = b;
            this.b = c;
            int i6 = 0;
            if (this.d.j != null) {
                this.d.b();
                this.d.g();
                buf.d("RV Scroll");
                if (i3 != 0) {
                    a = this.d.k.a(i3, this.d.c, this.d.A);
                    i = i3 - a;
                } else {
                    a = 0;
                    i = 0;
                }
                if (i4 != 0) {
                    i5 = this.d.k.b(i4, this.d.c, this.d.A);
                    i6 = i4 - i5;
                }
                buf.d();
                this.d.l();
                this.d.h();
                this.d.a(false);
                if (!(zgVar == null || zgVar.d || !zgVar.e)) {
                    a2 = this.d.A.a();
                    if (a2 == 0) {
                        zgVar.a();
                        a2 = i5;
                        i5 = i;
                        i = a;
                    } else if (zgVar.a >= a2) {
                        zgVar.a = a2 - 1;
                        a2 = i3 - i;
                        i2 = i4 - i6;
                        r7 = zgVar.b;
                        if (!zgVar.e || zgVar.a == -1 || r7 == null) {
                            zgVar.a();
                        }
                        zgVar.d = false;
                        if (zgVar.f != null) {
                            if (RecyclerView.c(zgVar.f) == zgVar.a) {
                                r14 = zgVar.f;
                                r15 = r7.A;
                                zgVar.a(r14, zgVar.g);
                                r14 = zgVar.g;
                                if (r14.d >= 0) {
                                    r15 = r14.d;
                                    r14.d = -1;
                                    r7.b(r15);
                                    r14.f = false;
                                } else if (!r14.f) {
                                    r14.g = 0;
                                } else if (r14.e != null && r14.c <= 0) {
                                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                                } else if (r14.c <= 0) {
                                    throw new IllegalStateException("Scroll duration must be a positive number");
                                } else {
                                    if (r14.e != null) {
                                        r7.z.a(r14.a, r14.b, r14.c, r14.e);
                                    } else if (r14.c == Integer.MIN_VALUE) {
                                        r7.z.a(r14.a, r14.b);
                                    } else {
                                        r7.z.a(r14.a, r14.b, r14.c);
                                    }
                                    r14.g++;
                                    if (r14.g > 10) {
                                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                                    }
                                    r14.f = false;
                                }
                                zgVar.a();
                            } else {
                                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                                zgVar.f = null;
                            }
                        }
                        if (zgVar.e) {
                            r14 = r7.A;
                            zgVar.a(a2, i2, zgVar.g);
                            if (zgVar.g.d >= 0) {
                                r3 = 1;
                            } else {
                                r3 = null;
                            }
                            r6 = zgVar.g;
                            if (r6.d >= 0) {
                                r14 = r6.d;
                                r6.d = -1;
                                r7.b(r14);
                                r6.f = false;
                            } else if (!r6.f) {
                                r6.g = 0;
                            } else if (r6.e != null && r6.c <= 0) {
                                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                            } else if (r6.c <= 0) {
                                throw new IllegalStateException("Scroll duration must be a positive number");
                            } else {
                                if (r6.e != null) {
                                    r7.z.a(r6.a, r6.b, r6.c, r6.e);
                                } else if (r6.c == oe.INVALID_ID) {
                                    r7.z.a(r6.a, r6.b);
                                } else {
                                    r7.z.a(r6.a, r6.b, r6.c);
                                }
                                r6.g++;
                                if (r6.g > 10) {
                                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                                }
                                r6.f = false;
                            }
                            if (r3 != null) {
                                if (zgVar.e) {
                                    zgVar.d = true;
                                    r7.z.a();
                                    a2 = i5;
                                    i5 = i;
                                    i = a;
                                } else {
                                    zgVar.a();
                                }
                            }
                        }
                        a2 = i5;
                        i5 = i;
                        i = a;
                    } else {
                        a2 = i3 - i;
                        i2 = i4 - i6;
                        r7 = zgVar.b;
                        if (!zgVar.e || zgVar.a == -1 || r7 == null) {
                            zgVar.a();
                        }
                        zgVar.d = false;
                        if (zgVar.f != null) {
                            if (RecyclerView.c(zgVar.f) == zgVar.a) {
                                r14 = zgVar.f;
                                r15 = r7.A;
                                zgVar.a(r14, zgVar.g);
                                r14 = zgVar.g;
                                if (r14.d >= 0) {
                                    r15 = r14.d;
                                    r14.d = -1;
                                    r7.b(r15);
                                    r14.f = false;
                                } else if (!r14.f) {
                                    r14.g = 0;
                                } else if (r14.e != null && r14.c <= 0) {
                                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                                } else if (r14.c <= 0) {
                                    throw new IllegalStateException("Scroll duration must be a positive number");
                                } else {
                                    if (r14.e != null) {
                                        r7.z.a(r14.a, r14.b, r14.c, r14.e);
                                    } else if (r14.c == Integer.MIN_VALUE) {
                                        r7.z.a(r14.a, r14.b);
                                    } else {
                                        r7.z.a(r14.a, r14.b, r14.c);
                                    }
                                    r14.g++;
                                    if (r14.g > 10) {
                                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                                    }
                                    r14.f = false;
                                }
                                zgVar.a();
                            } else {
                                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                                zgVar.f = null;
                            }
                        }
                        if (zgVar.e) {
                            r14 = r7.A;
                            zgVar.a(a2, i2, zgVar.g);
                            if (zgVar.g.d >= 0) {
                                r3 = 1;
                            } else {
                                r3 = null;
                            }
                            r6 = zgVar.g;
                            if (r6.d >= 0) {
                                r14 = r6.d;
                                r6.d = -1;
                                r7.b(r14);
                                r6.f = false;
                            } else if (!r6.f) {
                                r6.g = 0;
                            } else if (r6.e != null && r6.c <= 0) {
                                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                            } else if (r6.c <= 0) {
                                throw new IllegalStateException("Scroll duration must be a positive number");
                            } else {
                                if (r6.e != null) {
                                    r7.z.a(r6.a, r6.b, r6.c, r6.e);
                                } else if (r6.c == oe.INVALID_ID) {
                                    r7.z.a(r6.a, r6.b);
                                } else {
                                    r7.z.a(r6.a, r6.b, r6.c);
                                }
                                r6.g++;
                                if (r6.g > 10) {
                                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                                }
                                r6.f = false;
                            }
                            if (r3 != null) {
                                if (zgVar.e) {
                                    zgVar.d = true;
                                    r7.z.a();
                                    a2 = i5;
                                    i5 = i;
                                    i = a;
                                } else {
                                    zgVar.a();
                                }
                            }
                        }
                    }
                }
                a2 = i5;
                i5 = i;
                i = a;
            } else {
                a2 = 0;
                i5 = 0;
            }
            if (!this.d.l.isEmpty()) {
                this.d.invalidate();
            }
            if (kn.a(this.d) != 2) {
                this.d.a(i3, i4);
            }
            if (!(i5 == 0 && i6 == 0)) {
                int i7;
                i2 = (int) oxVar.f();
                if (i5 != b) {
                    a = i5 < 0 ? -i2 : i5 > 0 ? i2 : 0;
                    i7 = a;
                } else {
                    i7 = 0;
                }
                if (i6 == c) {
                    i2 = 0;
                } else if (i6 < 0) {
                    i2 = -i2;
                } else if (i6 <= 0) {
                    i2 = 0;
                }
                if (kn.a(this.d) != 2) {
                    View view = this.d;
                    if (i7 < 0) {
                        view.c();
                        view.u.a(-i7);
                    } else if (i7 > 0) {
                        view.d();
                        view.w.a(i7);
                    }
                    if (i2 < 0) {
                        view.e();
                        view.v.a(-i2);
                    } else if (i2 > 0) {
                        view.f();
                        view.x.a(i2);
                    }
                    if (!(i7 == 0 && i2 == 0)) {
                        kn.c(view);
                    }
                }
                if ((i7 != 0 || i5 == b || oxVar.d() == 0) && (i2 != 0 || i6 == c || oxVar.e() == 0)) {
                    oxVar.h();
                }
            }
            if (!(i == 0 && a2 == 0)) {
                this.d.c(i, a2);
            }
            if (!this.d.awakenScrollBars()) {
                this.d.invalidate();
            }
            Object obj = (i4 != 0 && this.d.k.d() && a2 == i4) ? 1 : null;
            Object obj2 = (i3 != 0 && this.d.k.c() && i == i3) ? 1 : null;
            obj2 = (!(i3 == 0 && i4 == 0) && obj2 == null && obj == null) ? null : 1;
            if (oxVar.a() || obj2 == null) {
                this.d.a(0);
            } else {
                a();
            }
        }
        if (zgVar != null) {
            if (zgVar.d) {
                RecyclerView recyclerView = zgVar.b;
                if (!zgVar.e || zgVar.a == -1 || recyclerView == null) {
                    zgVar.a();
                }
                zgVar.d = false;
                if (zgVar.f != null) {
                    if (RecyclerView.c(zgVar.f) == zgVar.a) {
                        View view2 = zgVar.f;
                        zi ziVar = recyclerView.A;
                        zgVar.a(view2, zgVar.g);
                        zh zhVar = zgVar.g;
                        if (zhVar.d >= 0) {
                            a = zhVar.d;
                            zhVar.d = -1;
                            recyclerView.b(a);
                            zhVar.f = false;
                        } else if (!zhVar.f) {
                            zhVar.g = 0;
                        } else if (zhVar.e != null && zhVar.c <= 0) {
                            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                        } else if (zhVar.c <= 0) {
                            throw new IllegalStateException("Scroll duration must be a positive number");
                        } else {
                            if (zhVar.e != null) {
                                recyclerView.z.a(zhVar.a, zhVar.b, zhVar.c, zhVar.e);
                            } else if (zhVar.c == oe.INVALID_ID) {
                                recyclerView.z.a(zhVar.a, zhVar.b);
                            } else {
                                recyclerView.z.a(zhVar.a, zhVar.b, zhVar.c);
                            }
                            zhVar.g++;
                            if (zhVar.g > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            zhVar.f = false;
                        }
                        zgVar.a();
                    } else {
                        Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                        zgVar.f = null;
                    }
                }
                if (zgVar.e) {
                    zi ziVar2 = recyclerView.A;
                    zgVar.a(0, 0, zgVar.g);
                    if (zgVar.g.d >= 0) {
                        obj2 = 1;
                    } else {
                        obj2 = null;
                    }
                    zh zhVar2 = zgVar.g;
                    if (zhVar2.d >= 0) {
                        i = zhVar2.d;
                        zhVar2.d = -1;
                        recyclerView.b(i);
                        zhVar2.f = false;
                    } else if (!zhVar2.f) {
                        zhVar2.g = 0;
                    } else if (zhVar2.e != null && zhVar2.c <= 0) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    } else if (zhVar2.c <= 0) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    } else {
                        if (zhVar2.e != null) {
                            recyclerView.z.a(zhVar2.a, zhVar2.b, zhVar2.c, zhVar2.e);
                        } else if (zhVar2.c == oe.INVALID_ID) {
                            recyclerView.z.a(zhVar2.a, zhVar2.b);
                        } else {
                            recyclerView.z.a(zhVar2.a, zhVar2.b, zhVar2.c);
                        }
                        zhVar2.g++;
                        if (zhVar2.g > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        zhVar2.f = false;
                    }
                    if (obj2 != null) {
                        if (zgVar.e) {
                            zgVar.d = true;
                            recyclerView.z.a();
                        } else {
                            zgVar.a();
                        }
                    }
                }
            }
            if (!this.g) {
                zgVar.a();
            }
        }
        this.f = false;
        if (this.g) {
            a();
        }
    }

    public final void a() {
        if (this.f) {
            this.g = true;
            return;
        }
        this.d.removeCallbacks(this);
        kn.a(this.d, (Runnable) this);
    }

    public final void a(int i, int i2) {
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int i3 = abs > abs2 ? 1 : 0;
        int sqrt = (int) Math.sqrt((double) null);
        int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
        int width = i3 != 0 ? this.d.getWidth() : this.d.getHeight();
        int i4 = width / 2;
        float sin = (((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, (((float) sqrt2) * 1.0f) / ((float) width)) - 0.5f)) * 0.4712389167638204d)))) * ((float) i4)) + ((float) i4);
        if (sqrt > 0) {
            i3 = Math.round(1000.0f * Math.abs(sin / ((float) sqrt))) * 4;
        } else {
            if (i3 != 0) {
                i3 = abs;
            } else {
                i3 = abs2;
            }
            i3 = (int) (((((float) i3) / ((float) width)) + 1.0f) * 300.0f);
        }
        a(i, i2, Math.min(i3, 2000));
    }

    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        if (this.e != interpolator) {
            this.e = interpolator;
            this.c = ox.a(this.d.getContext(), interpolator);
        }
        this.d.a(2);
        this.b = 0;
        this.a = 0;
        this.c.a(0, 0, i, i2, i3);
        a();
    }

    public final void b() {
        this.d.removeCallbacks(this);
        this.c.h();
    }

    public final void a(int i, int i2, int i3) {
        a(i, i2, i3, RecyclerView.F);
    }
}
