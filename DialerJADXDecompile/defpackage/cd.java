package defpackage;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: cd */
public abstract class cd extends kg {
    private final FragmentManager c;
    private FragmentTransaction d;
    private Fragment e;

    public abstract Fragment a(int i);

    public cd(FragmentManager fragmentManager) {
        this.d = null;
        this.e = null;
        this.c = fragmentManager;
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public Object a(ViewGroup viewGroup, int i) {
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        long b = b(i);
        Fragment findFragmentByTag = this.c.findFragmentByTag(cd.a(viewGroup.getId(), b));
        if (findFragmentByTag != null) {
            this.d.attach(findFragmentByTag);
        } else {
            findFragmentByTag = a(i);
            this.d.add(viewGroup.getId(), findFragmentByTag, cd.a(viewGroup.getId(), b));
        }
        if (findFragmentByTag != this.e) {
            bv.a(findFragmentByTag, false);
            bv.b(findFragmentByTag, false);
        }
        return findFragmentByTag;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.d == null) {
            this.d = this.c.beginTransaction();
        }
        this.d.detach((Fragment) obj);
    }

    public final void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.e) {
            if (this.e != null) {
                bv.a(this.e, false);
                bv.b(this.e, false);
            }
            if (fragment != null) {
                bv.a(fragment, true);
                bv.b(fragment, true);
            }
            this.e = fragment;
        }
    }

    public final void b(ViewGroup viewGroup) {
        if (this.d != null) {
            this.d.commitAllowingStateLoss();
            this.d = null;
            this.c.executePendingTransactions();
        }
    }

    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public long b(int i) {
        return (long) i;
    }

    private static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
