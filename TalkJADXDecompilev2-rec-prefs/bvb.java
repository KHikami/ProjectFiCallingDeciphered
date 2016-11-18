package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public final class bvb extends wv<btf> implements jza, kcd, kcn, kcq {
    static final long f4562a = TimeUnit.MINUTES.toMicros(15);
    private final buc f4563b;
    private final acx f4564c;
    private wt<btf> f4565d;
    private Parcelable f4566e;
    private cgr f4567f;
    private bpm f4568g;
    private final boolean f4569h;

    public /* synthetic */ boolean m6757a(Object obj, Object obj2) {
        return gwb.m2223g((btf) obj, (btf) obj2);
    }

    public /* synthetic */ boolean m6760b(Object obj, Object obj2) {
        return ((btf) obj).f4388a == ((btf) obj2).f4388a;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return btf.m6582a((btf) obj, (btf) obj2);
    }

    public bvb(buc buc, acx acx, boolean z) {
        this.f4563b = buc;
        this.f4564c = acx;
        this.f4569h = z;
    }

    public void m6756a(wt<btf> wtVar) {
        boolean z;
        boolean z2 = true;
        if (this.f4565d == null) {
            z = true;
        } else {
            z = false;
        }
        ba.m4610b(z, (Object) "Must be called only once.");
        if (wtVar == null) {
            z2 = false;
        }
        ba.m4578a(z2, (Object) "MessageList must be valid.");
        this.f4565d = wtVar;
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4567f = (cgr) jyn.m25443a(cgr.class);
        this.f4568g = (bpm) jyn.m25443a(bpm.class);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            this.f4566e = bundle.getParcelable("scroll_state");
        }
    }

    public void mo645b(Bundle bundle) {
        this.f4566e = this.f4564c.mo59g();
        bundle.putParcelable("scroll_state", this.f4566e);
    }

    public void m6753a(int i, int i2) {
        boolean z;
        SortedSet e = m6752e(i, (i + i2) - 1);
        this.f4563b.m6695g(i, i2);
        if (i == 0 && this.f4565d.a() > 1) {
            this.f4563b.m6691d(true);
            this.f4563b.m6687b(1, Boolean.valueOf(true));
        }
        m6748a(e, i, i2);
        if (i == 0) {
            z = ((btf) this.f4565d.a(0)).f4396i == fwy.OUTGOING_USER_MESSAGE;
            this.f4568g.a_(this.f4567f.mo943c());
        } else {
            z = false;
        }
        m6749a(z);
        int i3 = i;
        while (i3 < i + i2 && i3 < this.f4565d.a()) {
            if (((btf) this.f4565d.a(i3)).f4396i == fwy.OUTGOING_USER_MESSAGE) {
                this.f4567f.mo948e(true);
                return;
            }
            i3++;
        }
    }

    public void m6758b(int i, int i2) {
        if (this.f4565d.a() == 0 || i >= this.f4565d.a()) {
            this.f4563b.m6696h(i, i2);
            return;
        }
        SortedSet e = m6752e(Math.max(i - 1, 0), Math.min(i, this.f4565d.a() - 1));
        this.f4563b.m6696h(i, i2);
        m6748a(e, 0, 0);
    }

    public void m6761c(int i, int i2) {
        SortedSet e = m6752e(Math.min(i, i2), Math.max(i, i2));
        this.f4563b.m6692e(i, i2);
        m6748a(e, 0, 0);
    }

    public void m6762d(int i, int i2) {
        SortedSet e = m6752e(i, (i + i2) - 1);
        this.f4563b.m6694f(i, i2);
        m6748a(e, i, i2);
    }

    private void m6749a(boolean z) {
        if (this.f4566e != null) {
            this.f4564c.mo44a(this.f4566e);
            this.f4566e = null;
        } else if (this.f4564c.m568q() == 0 || z) {
            this.f4564c.mo51c(0);
        }
    }

    private SortedSet<Integer> m6752e(int i, int i2) {
        Set treeSet = new TreeSet();
        m6747a(treeSet, i, i2);
        m6751b(treeSet, i, i2);
        return treeSet;
    }

    private void m6748a(SortedSet<Integer> sortedSet, int i, int i2) {
        int i3 = -1;
        int i4 = 0;
        for (Integer a : sortedSet) {
            int a2 = gwb.m1507a(a);
            if (i > a2 || a2 >= i + i2) {
                if (i3 < 0) {
                    i4 = 1;
                    i3 = a2;
                } else if (a2 == i3 + i4) {
                    i4++;
                } else {
                    this.f4563b.m6694f(i3, i4);
                    i4 = 1;
                    i3 = a2;
                }
            }
        }
        if (i3 >= 0) {
            this.f4563b.m6694f(i3, i4);
        }
    }

    private void m6747a(Set<Integer> set, int i, int i2) {
        int i3;
        int i4 = i;
        while (i4 > 0) {
            btf btf = (btf) this.f4565d.a(i4);
            btf btf2 = (btf) this.f4565d.a(i4 - 1);
            if (!btf.m6585a() || !btf2.m6585a()) {
                break;
            } else if (!btf.m6586a(btf2)) {
                i3 = i4 - 1;
                break;
            } else {
                i4--;
            }
        }
        i3 = i4;
        for (i4 = i3; i4 <= i2; i4++) {
            btf = (btf) this.f4565d.a(i4);
            if (btf.m6585a()) {
                if (i4 + 1 != this.f4565d.a()) {
                    btf2 = (btf) this.f4565d.a(i4 + 1);
                    boolean z = (btf2.m6585a() && btf.m6586a(btf2)) ? false : true;
                    m6746a(i4, z, (Set) set);
                } else if (btf.m6585a()) {
                    m6746a(i4, true, (Set) set);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    private void m6746a(int i, boolean z, Set<Integer> set) {
        btf btf = (btf) this.f4565d.a(i);
        if (btf.f4408u.f4411a != z) {
            btf.f4408u.f4411a = z;
            set.add(Integer.valueOf(i));
        }
    }

    private void m6751b(Set<Integer> set, int i, int i2) {
        long j;
        int i3 = i;
        while (i3 > 0) {
            btf btf = (btf) this.f4565d.a(i3);
            btf btf2 = (btf) this.f4565d.a(i3 - 1);
            if (btf.m6585a() && btf2.m6585a()) {
                if (!btf2.f4408u.f4412b) {
                    if (!this.f4569h && !btf.m6586a(btf2)) {
                        break;
                    }
                    i3--;
                } else {
                    j = btf2.f4394g;
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
                    if (i3 > this.f4565d.a() - 1) {
                        obj = null;
                    } else {
                        btf = (btf) this.f4565d.a(i3);
                        if (!btf.m6585a()) {
                            obj = null;
                        } else if (j2 - btf.f4394g > f4562a) {
                            obj = !btf.f4408u.f4412b ? 1 : null;
                        } else if (!btf.f4408u.f4412b) {
                            if (i3 >= this.f4565d.a() - 1) {
                                obj = null;
                            } else {
                                btf2 = (btf) this.f4565d.a(i3 + 1);
                                if (!btf2.m6585a()) {
                                    obj = null;
                                } else if (!(this.f4569h || btf.m6586a(btf2))) {
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
            btf = (btf) this.f4565d.a(i3);
            if (!btf.m6585a()) {
                j = Long.MAX_VALUE;
            } else if (i3 == 0 || j2 - btf.f4394g > f4562a) {
                m6750b(i3, true, (Set) set);
                j = btf.f4394g;
            } else {
                btf2 = (btf) this.f4565d.a(i3 - 1);
                if (this.f4569h || btf.m6586a(btf2)) {
                    m6750b(i3, false, (Set) set);
                    j = j2;
                } else {
                    m6750b(i3, true, (Set) set);
                    j = btf.f4394g;
                }
            }
            i3++;
            j2 = j;
        }
    }

    private void m6750b(int i, boolean z, Set<Integer> set) {
        btf btf = (btf) this.f4565d.a(i);
        if (btf.f4408u.f4412b != z) {
            btf.f4408u.f4412b = z;
            set.add(Integer.valueOf(i));
        }
    }
}
