package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public final class bvb extends wv<btf> implements jza, kcd, kcn, kcq {
    static final long a = TimeUnit.MINUTES.toMicros(15);
    private final buc b;
    private final acx c;
    private wt<btf> d;
    private Parcelable e;
    private cgr f;
    private bpm g;
    private final boolean h;

    public /* synthetic */ boolean a(Object obj, Object obj2) {
        return gwb.g((btf) obj, (btf) obj2);
    }

    public /* synthetic */ boolean b(Object obj, Object obj2) {
        return ((btf) obj).a == ((btf) obj2).a;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return btf.a((btf) obj, (btf) obj2);
    }

    public bvb(buc buc, acx acx, boolean z) {
        this.b = buc;
        this.c = acx;
        this.h = z;
    }

    public void a(wt<btf> wtVar) {
        boolean z;
        boolean z2 = true;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        ba.b(z, (Object) "Must be called only once.");
        if (wtVar == null) {
            z2 = false;
        }
        ba.a(z2, (Object) "MessageList must be valid.");
        this.d = wtVar;
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.f = (cgr) jyn.a(cgr.class);
        this.g = (bpm) jyn.a(bpm.class);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.e = bundle.getParcelable("scroll_state");
        }
    }

    public void b(Bundle bundle) {
        this.e = this.c.g();
        bundle.putParcelable("scroll_state", this.e);
    }

    public void a(int i, int i2) {
        boolean z;
        SortedSet e = e(i, (i + i2) - 1);
        this.b.g(i, i2);
        if (i == 0 && this.d.a() > 1) {
            this.b.d(true);
            this.b.b(1, Boolean.valueOf(true));
        }
        a(e, i, i2);
        if (i == 0) {
            z = ((btf) this.d.a(0)).i == fwy.OUTGOING_USER_MESSAGE;
            this.g.a_(this.f.c());
        } else {
            z = false;
        }
        a(z);
        int i3 = i;
        while (i3 < i + i2 && i3 < this.d.a()) {
            if (((btf) this.d.a(i3)).i == fwy.OUTGOING_USER_MESSAGE) {
                this.f.e(true);
                return;
            }
            i3++;
        }
    }

    public void b(int i, int i2) {
        if (this.d.a() == 0 || i >= this.d.a()) {
            this.b.h(i, i2);
            return;
        }
        SortedSet e = e(Math.max(i - 1, 0), Math.min(i, this.d.a() - 1));
        this.b.h(i, i2);
        a(e, 0, 0);
    }

    public void c(int i, int i2) {
        SortedSet e = e(Math.min(i, i2), Math.max(i, i2));
        this.b.e(i, i2);
        a(e, 0, 0);
    }

    public void d(int i, int i2) {
        SortedSet e = e(i, (i + i2) - 1);
        this.b.f(i, i2);
        a(e, i, i2);
    }

    private void a(boolean z) {
        if (this.e != null) {
            this.c.a(this.e);
            this.e = null;
        } else if (this.c.q() == 0 || z) {
            this.c.c(0);
        }
    }

    private SortedSet<Integer> e(int i, int i2) {
        Set treeSet = new TreeSet();
        a(treeSet, i, i2);
        b(treeSet, i, i2);
        return treeSet;
    }

    private void a(SortedSet<Integer> sortedSet, int i, int i2) {
        int i3 = -1;
        int i4 = 0;
        for (Integer a : sortedSet) {
            int a2 = gwb.a(a);
            if (i > a2 || a2 >= i + i2) {
                if (i3 < 0) {
                    i4 = 1;
                    i3 = a2;
                } else if (a2 == i3 + i4) {
                    i4++;
                } else {
                    this.b.f(i3, i4);
                    i4 = 1;
                    i3 = a2;
                }
            }
        }
        if (i3 >= 0) {
            this.b.f(i3, i4);
        }
    }

    private void a(Set<Integer> set, int i, int i2) {
        int i3;
        int i4 = i;
        while (i4 > 0) {
            btf btf = (btf) this.d.a(i4);
            btf btf2 = (btf) this.d.a(i4 - 1);
            if (!btf.a() || !btf2.a()) {
                break;
            } else if (!btf.a(btf2)) {
                i3 = i4 - 1;
                break;
            } else {
                i4--;
            }
        }
        i3 = i4;
        for (i4 = i3; i4 <= i2; i4++) {
            btf = (btf) this.d.a(i4);
            if (btf.a()) {
                if (i4 + 1 != this.d.a()) {
                    btf2 = (btf) this.d.a(i4 + 1);
                    boolean z = (btf2.a() && btf.a(btf2)) ? false : true;
                    a(i4, z, (Set) set);
                } else if (btf.a()) {
                    a(i4, true, (Set) set);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    private void a(int i, boolean z, Set<Integer> set) {
        btf btf = (btf) this.d.a(i);
        if (btf.u.a != z) {
            btf.u.a = z;
            set.add(Integer.valueOf(i));
        }
    }

    private void b(Set<Integer> set, int i, int i2) {
        long j;
        int i3 = i;
        while (i3 > 0) {
            btf btf = (btf) this.d.a(i3);
            btf btf2 = (btf) this.d.a(i3 - 1);
            if (btf.a() && btf2.a()) {
                if (!btf2.u.b) {
                    if (!this.h && !btf.a(btf2)) {
                        break;
                    }
                    i3--;
                } else {
                    j = btf2.g;
                    break;
                }
            }
            break;
        }
        j = Long.MAX_VALUE;
        long j2 = j;
        while (true) {
            if (i3 > i2) {
                Object obj;
                if (i3 != 0) {
                    if (i3 > this.d.a() - 1) {
                        obj = null;
                    } else {
                        btf = (btf) this.d.a(i3);
                        if (!btf.a()) {
                            obj = null;
                        } else if (j2 - btf.g > a) {
                            obj = !btf.u.b ? 1 : null;
                        } else if (!btf.u.b) {
                            if (i3 >= this.d.a() - 1) {
                                obj = null;
                            } else {
                                btf2 = (btf) this.d.a(i3 + 1);
                                if (!btf2.a()) {
                                    obj = null;
                                } else if (!(this.h || btf.a(btf2))) {
                                    obj = null;
                                }
                            }
                        }
                    }
                    if (obj == null) {
                        return;
                    }
                }
                obj = 1;
                if (obj == null) {
                    return;
                }
            }
            btf = (btf) this.d.a(i3);
            if (!btf.a()) {
                j = Long.MAX_VALUE;
            } else if (i3 == 0 || j2 - btf.g > a) {
                b(i3, true, (Set) set);
                j = btf.g;
            } else {
                btf2 = (btf) this.d.a(i3 - 1);
                if (this.h || btf.a(btf2)) {
                    b(i3, false, (Set) set);
                    j = j2;
                } else {
                    b(i3, true, (Set) set);
                    j = btf.g;
                }
            }
            i3++;
            j2 = j;
        }
    }

    private void b(int i, boolean z, Set<Integer> set) {
        btf btf = (btf) this.d.a(i);
        if (btf.u.b != z) {
            btf.u.b = z;
            set.add(Integer.valueOf(i));
        }
    }
}
