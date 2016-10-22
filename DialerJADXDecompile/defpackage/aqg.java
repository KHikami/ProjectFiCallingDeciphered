package defpackage;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Trace;
import android.preference.PreferenceManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.android.contacts.common.list.ViewPagerTabs;
import com.android.dialer.app.list.AllContactsFragment;
import com.android.dialer.app.list.RemoveView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: aqg */
public final class aqg extends Fragment implements avs, lm {
    public pl a;
    public aqh b;
    public RemoveView c;
    public arc d;
    amo e;
    AllContactsFragment f;
    amo g;
    boolean h;
    String[] i;
    public int j;
    public avq k;
    private ViewPager l;
    private ViewPagerTabs m;
    private View n;
    private SharedPreferences o;
    private boolean p;
    private boolean q;
    private axp r;
    private ArrayList s;
    private int[] t;

    public aqg() {
        this.s = new ArrayList();
        this.j = 0;
    }

    public final void onCreate(Bundle bundle) {
        Trace.beginSection("ListsFragment onCreate");
        super.onCreate(bundle);
        this.r = new axp();
        this.p = false;
        this.o = PreferenceManager.getDefaultSharedPreferences(getActivity());
        this.h = this.o.getBoolean("has_active_voicemail_provider", false);
        Trace.endSection();
    }

    public final void onResume() {
        Trace.beginSection("ListsFragment onResume");
        super.onResume();
        this.a = ((pz) getActivity()).e().a();
        if (getUserVisibleHint()) {
            b();
        }
        this.k = new avq(getActivity(), getActivity().getContentResolver(), this);
        this.k.a();
        this.k.c();
        Trace.endSection();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Trace.beginSection("ListsFragment onCreateView");
        Trace.beginSection("ListsFragment inflate view");
        View inflate = layoutInflater.inflate(buf.hI, viewGroup, false);
        Trace.endSection();
        Trace.beginSection("ListsFragment setup views");
        this.l = (ViewPager) inflate.findViewById(aq.az);
        this.b = new aqh(this, getChildFragmentManager());
        this.l.a(this.b);
        this.l.c(3);
        this.l.d = this;
        c(0);
        this.i = new String[4];
        this.i[0] = getResources().getString(cob.dd);
        this.i[1] = getResources().getString(cob.dc);
        this.i[2] = getResources().getString(cob.db);
        this.i[3] = getResources().getString(cob.de);
        this.t = new int[4];
        this.t[0] = cob.aw;
        this.t[1] = cob.aH;
        this.t[2] = cob.aA;
        this.t[3] = cob.aM;
        this.m = (ViewPagerTabs) inflate.findViewById(aq.aA);
        ViewPagerTabs viewPagerTabs = this.m;
        int[] iArr = this.t;
        viewPagerTabs.b = iArr;
        viewPagerTabs.c = new int[iArr.length];
        this.m.a(this.l);
        a(this.m);
        this.c = (RemoveView) inflate.findViewById(aq.bb);
        this.n = inflate.findViewById(aq.bc);
        Trace.endSection();
        Trace.endSection();
        return inflate;
    }

    public final void a(lm lmVar) {
        if (!this.s.contains(lmVar)) {
            this.s.add(lmVar);
        }
    }

    public final void c(int i) {
        if (i == 3) {
            if (this.h) {
                this.l.b(d(3));
            } else if (!this.p) {
                this.q = true;
            }
        } else if (i < this.b.a()) {
            this.l.b(d(i));
        }
    }

    public final void a(int i, float f, int i2) {
        this.j = d(i);
        int size = this.s.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((lm) this.s.get(i3)).a(i, f, i2);
        }
    }

    public final void a(int i) {
        this.j = d(i);
        this.q = false;
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((lm) this.s.get(i2)).a(i);
        }
        b();
    }

    public final void a_(int i) {
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((lm) this.s.get(i2)).a_(i);
        }
    }

    public final void b(Cursor cursor) {
        boolean z = true;
        this.p = true;
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (this.r.a(cursor) <= 0) {
                z = false;
            }
            if (z != this.h) {
                this.h = z;
                kg kgVar = this.b;
                synchronized (kgVar) {
                    if (kgVar.b != null) {
                        kgVar.b.onChanged();
                    }
                }
                kgVar.a.notifyChanged();
                if (z) {
                    this.m.d(3);
                } else {
                    this.m.c(3);
                    if (this.g != null) {
                        getChildFragmentManager().beginTransaction().remove(this.g).commitAllowingStateLoss();
                        this.g = null;
                    }
                }
                this.o.edit().putBoolean("has_active_voicemail_provider", z).commit();
            }
            if (z) {
                this.k.b();
            }
            if (this.h && this.q) {
                this.q = false;
                c(3);
            }
        }
    }

    public final void c(Cursor cursor) {
        if (getActivity() != null && !getActivity().isFinishing() && cursor != null) {
            try {
                int count = cursor.getCount();
                this.m.a(count, 3);
                this.m.d(3);
            } finally {
                cursor.close();
            }
        }
    }

    public final void d(Cursor cursor) {
        if (getActivity() != null && !getActivity().isFinishing() && cursor != null) {
            try {
                int count = cursor.getCount();
                this.m.a(count, 1);
                this.m.d(1);
            } finally {
                cursor.close();
            }
        }
    }

    public final boolean a(Cursor cursor) {
        return false;
    }

    public final void a() {
        if (this.k != null) {
            this.k.c();
            if (this.h) {
                this.k.b();
            }
        }
    }

    public final void a(boolean z) {
        float f;
        float f2 = 1.0f;
        this.n.setVisibility(z ? 0 : 8);
        RemoveView removeView = this.c;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        removeView.setAlpha(f);
        ViewPropertyAnimator animate = this.c.animate();
        if (!z) {
            f2 = 0.0f;
        }
        animate.alpha(f2).start();
    }

    final int d(int i) {
        if (buf.k()) {
            return (this.b.a() - 1) - i;
        }
        return i;
    }

    public final void b() {
        if (isResumed()) {
            int i;
            switch (this.j) {
                case rl.c /*0*/:
                    i = 2;
                    break;
                case rq.b /*1*/:
                    i = 3;
                    break;
                case rq.c /*2*/:
                    i = 5;
                    break;
                default:
                    return;
            }
            buf.H(getActivity()).a(i, getActivity());
        }
    }
}
