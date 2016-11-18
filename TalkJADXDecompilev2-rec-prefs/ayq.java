package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import java.util.HashSet;

public final class ayq extends Fragment {
    private final ayg f2548a;
    private final ayo f2549b;
    private final HashSet<ayq> f2550c;
    private amu f2551d;
    private ayq f2552e;
    private Fragment f2553f;

    public ayq() {
        this(new ayg());
    }

    private ayq(ayg ayg) {
        this.f2549b = new ayr(this);
        this.f2550c = new HashSet();
        this.f2548a = ayg;
    }

    public void m4354a(amu amu) {
        this.f2551d = amu;
    }

    ayg m4353a() {
        return this.f2548a;
    }

    public amu m4356b() {
        return this.f2551d;
    }

    public ayo m4357c() {
        return this.f2549b;
    }

    void m4355a(Fragment fragment) {
        this.f2553f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m4351a(fragment.getActivity());
        }
    }

    private void m4351a(Activity activity) {
        m4352d();
        this.f2552e = ays.f2555a.m4366a(activity.getFragmentManager(), null);
        if (this.f2552e != this) {
            this.f2552e.f2550c.add(this);
        }
    }

    private void m4352d() {
        if (this.f2552e != null) {
            this.f2552e.f2550c.remove(this);
            this.f2552e = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m4351a(activity);
        } catch (IllegalStateException e) {
        }
    }

    public void onDetach() {
        super.onDetach();
        m4352d();
    }

    public void onStart() {
        super.onStart();
        this.f2548a.m4337a();
    }

    public void onStop() {
        super.onStop();
        this.f2548a.m4339b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f2548a.m4341c();
        m4352d();
    }

    public void onTrimMemory(int i) {
        if (this.f2551d != null) {
            this.f2551d.m2972a(i);
        }
    }

    public void onLowMemory() {
        if (this.f2551d != null) {
            this.f2551d.m2971a();
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
            parentFragment = this.f2553f;
        }
        String valueOf2 = String.valueOf(parentFragment);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append(valueOf).append("{parent=").append(valueOf2).append("}").toString();
    }
}
