package p000;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.api.Status;

public abstract class C0260u implements guq {
    public int f35185a;
    public RecyclerView f35186b;
    public aef f35187c;
    public boolean f35188d;
    public boolean f35189e;
    public View f35190f;
    public final aeo f35191g;

    public abstract boolean m40865a();

    public abstract boolean m40869b();

    public abstract View m40874g();

    public abstract gum<S> m40875h();

    public abstract boolean m40876i();

    public abstract int m40877j();

    public abstract V m40878k();

    public void m40863a(int i) {
        this.f35185a = i;
    }

    public void m40870c() {
        if (this.f35189e) {
            this.f35186b.x.a = -1;
            this.f35190f = null;
            this.f35185a = -1;
            this.f35188d = false;
            this.f35189e = false;
            aef aef = this.f35187c;
            if (aef.r == this) {
                aef.r = null;
            }
            this.f35187c = null;
            this.f35186b = null;
        }
    }

    public boolean m40871d() {
        return this.f35188d;
    }

    public boolean m40872e() {
        return this.f35189e;
    }

    public int m40873f() {
        return this.f35185a;
    }

    public void m40864a(int i, int i2) {
        RecyclerView recyclerView = this.f35186b;
        if (!this.f35189e || this.f35185a == -1 || recyclerView == null) {
            m40870c();
        }
        this.f35188d = false;
        if (this.f35190f != null) {
            if (m40860a(this.f35190f) == this.f35185a) {
                aep aep = recyclerView.x;
                aeo aeo = this.f35191g;
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
                m40870c();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f35190f = null;
            }
        }
        if (this.f35189e) {
            aep = recyclerView.x;
            boolean a = this.f35191g.a();
            aeo aeo2 = this.f35191g;
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
            if (this.f35189e) {
                this.f35188d = true;
                recyclerView.w.a();
                return;
            }
            m40870c();
        }
    }

    public int m40860a(View view) {
        return this.f35186b.e(view);
    }

    public void m40868b(View view) {
        if (m40860a(view) == m40873f()) {
            this.f35190f = view;
        }
    }

    public Status m40862a(Status status) {
        return status;
    }

    public boolean m40866a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return m40876i();
    }

    public int m40861a(T t) {
        if (t == null) {
            return 0;
        }
        return m40877j();
    }

    public mti<V> m40867b(K k, V v) {
        bm.a(k);
        bm.a(v);
        return msy.T(m40878k());
    }
}
