import android.app.Fragment;
import android.app.FragmentManager;
import android.view.ViewGroup;
import com.android.dialer.app.list.AllContactsFragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class aqh extends cd {
    private final List c;
    private /* synthetic */ aqg d;

    public aqh(aqg aqg, FragmentManager fragmentManager) {
        this.d = aqg;
        super(fragmentManager);
        this.c = new ArrayList();
        for (int i = 0; i < 4; i++) {
            this.c.add(null);
        }
    }

    public final long b(int i) {
        return (long) this.d.d(i);
    }

    public final Fragment a(int i) {
        switch (this.d.d(i)) {
            case rl.c /*0*/:
                this.d.d = new arc();
                return this.d.d;
            case rq.b /*1*/:
                this.d.e = new amo(-1);
                return this.d.e;
            case rq.c /*2*/:
                this.d.f = new AllContactsFragment();
                return this.d.f;
            case rl.e /*3*/:
                this.d.g = new anz();
                return this.d.g;
            default:
                throw new IllegalStateException("No fragment at position " + i);
        }
    }

    public final int a(Object obj) {
        if (this.d.h || this.c.indexOf(obj) != 3) {
            return -1;
        }
        return -2;
    }

    public final int a() {
        return this.d.h ? 4 : 3;
    }

    public final CharSequence c(int i) {
        return this.d.i[i];
    }

    public final /* synthetic */ Object a(ViewGroup viewGroup, int i) {
        Fragment fragment = (Fragment) super.a(viewGroup, i);
        if (fragment instanceof arc) {
            this.d.d = (arc) fragment;
        } else if ((fragment instanceof amo) && i == 1) {
            this.d.e = (amo) fragment;
        } else if (fragment instanceof AllContactsFragment) {
            this.d.f = (AllContactsFragment) fragment;
        } else if ((fragment instanceof amo) && i == 3) {
            this.d.g = (amo) fragment;
        }
        this.c.set(i, fragment);
        return fragment;
    }
}
