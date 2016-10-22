package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import java.util.HashSet;

/* renamed from: ayq */
public final class ayq extends Fragment {
    private final ayg a;
    private final ayo b;
    private final HashSet<ayq> c;
    private amu d;
    private ayq e;
    private Fragment f;

    public ayq() {
        this(new ayg());
    }

    private ayq(ayg ayg) {
        this.b = new ayr(this);
        this.c = new HashSet();
        this.a = ayg;
    }

    public void a(amu amu) {
        this.d = amu;
    }

    ayg a() {
        return this.a;
    }

    public amu b() {
        return this.d;
    }

    public ayo c() {
        return this.b;
    }

    void a(Fragment fragment) {
        this.f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            a(fragment.getActivity());
        }
    }

    private void a(Activity activity) {
        d();
        this.e = ays.a.a(activity.getFragmentManager(), null);
        if (this.e != this) {
            this.e.c.add(this);
        }
    }

    private void d() {
        if (this.e != null) {
            this.e.c.remove(this);
            this.e = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e) {
        }
    }

    public void onDetach() {
        super.onDetach();
        d();
    }

    public void onStart() {
        super.onStart();
        this.a.a();
    }

    public void onStop() {
        super.onStop();
        this.a.b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        d();
    }

    public void onTrimMemory(int i) {
        if (this.d != null) {
            this.d.a(i);
        }
    }

    public void onLowMemory() {
        if (this.d != null) {
            this.d.a();
        }
    }

    public String toString() {
        Object parentFragment;
        String valueOf = String.valueOf(super.toString());
        if (VERSION.SDK_INT >= 17) {
            parentFragment = getParentFragment();
        } else {
            parentFragment = null;
        }
        if (parentFragment == null) {
            parentFragment = this.f;
        }
        String valueOf2 = String.valueOf(parentFragment);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append(valueOf).append("{parent=").append(valueOf2).append("}").toString();
    }
}
