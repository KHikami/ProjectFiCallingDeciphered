package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.Status;

public abstract class u implements guq {
    public int a;
    public RecyclerView b;
    public aef c;
    public boolean d;
    public boolean e;
    public View f;
    public final aeo g;

    public abstract boolean a();

    public abstract boolean b();

    public abstract View g();

    public abstract gum<S> h();

    public abstract boolean i();

    public abstract int j();

    public abstract V k();

    public void a(int i) {
        this.a = i;
    }

    public void c() {
        if (this.e) {
            this.b.x.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.e = false;
            aef aef = this.c;
            if (aef.r == this) {
                aef.r = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    public boolean d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public int f() {
        return this.a;
    }

    public void a(int i, int i2) {
        RecyclerView recyclerView = this.b;
        if (!this.e || this.a == -1 || recyclerView == null) {
            c();
        }
        this.d = false;
        if (this.f != null) {
            if (a(this.f) == this.a) {
                aep aep = recyclerView.x;
                aeo aeo = this.g;
                if (aeo.d >= 0) {
                    int i3 = aeo.d;
                    aeo.d = -1;
                    recyclerView.c(i3);
                    aeo.f = false;
                } else if (!aeo.f) {
                    aeo.g = 0;
                } else if (aeo.e != null && aeo.c <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (aeo.c <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    if (aeo.e != null) {
                        recyclerView.w.a(aeo.a, aeo.b, aeo.c, aeo.e);
                    } else if (aeo.c == nzf.UNSET_ENUM_VALUE) {
                        recyclerView.w.b(aeo.a, aeo.b);
                    } else {
                        recyclerView.w.a(aeo.a, aeo.b, aeo.c);
                    }
                    aeo.g++;
                    if (aeo.g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    aeo.f = false;
                }
                c();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            aep = recyclerView.x;
            boolean a = this.g.a();
            aeo aeo2 = this.g;
            if (aeo2.d >= 0) {
                int i4 = aeo2.d;
                aeo2.d = -1;
                recyclerView.c(i4);
                aeo2.f = false;
            } else if (!aeo2.f) {
                aeo2.g = 0;
            } else if (aeo2.e != null && aeo2.c <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            } else if (aeo2.c <= 0) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            } else {
                if (aeo2.e != null) {
                    recyclerView.w.a(aeo2.a, aeo2.b, aeo2.c, aeo2.e);
                } else if (aeo2.c == nzf.UNSET_ENUM_VALUE) {
                    recyclerView.w.b(aeo2.a, aeo2.b);
                } else {
                    recyclerView.w.a(aeo2.a, aeo2.b, aeo2.c);
                }
                aeo2.g++;
                if (aeo2.g > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                aeo2.f = false;
            }
            if (!a) {
                return;
            }
            if (this.e) {
                this.d = true;
                recyclerView.w.a();
                return;
            }
            c();
        }
    }

    public int a(View view) {
        return this.b.e(view);
    }

    public void b(View view) {
        if (a(view) == f()) {
            this.f = view;
        }
    }

    public Status a(Status status) {
        return status;
    }

    public boolean a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return i();
    }

    public int a(T t) {
        if (t == null) {
            return 0;
        }
        return j();
    }

    public mti<V> b(K k, V v) {
        bm.a(k);
        bm.a(v);
        return msy.T(k());
    }
}
