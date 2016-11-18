package p000;

import android.app.Activity;
import java.util.HashSet;

public final class ayu extends dr {
    private final ayg f2563a;
    private final ayo f2564b;
    private final HashSet<ayu> f2565c;
    private ayu f2566d;
    private amu f2567e;
    private dr f2568f;

    public ayu() {
        this(new ayg());
    }

    private ayu(ayg ayg) {
        this.f2564b = new ayv(this);
        this.f2565c = new HashSet();
        this.f2563a = ayg;
    }

    public void m4377a(amu amu) {
        this.f2567e = amu;
    }

    ayg m4376a() {
        return this.f2563a;
    }

    public amu m4379b() {
        return this.f2567e;
    }

    public ayo m4380c() {
        return this.f2564b;
    }

    void m4378a(dr drVar) {
        this.f2568f = drVar;
        if (drVar != null && drVar.getActivity() != null) {
            m4374a(drVar.getActivity());
        }
    }

    private void m4374a(dw dwVar) {
        m4375d();
        this.f2566d = ays.f2555a.m4367a(dwVar.J_(), null);
        if (this.f2566d != this) {
            this.f2566d.f2565c.add(this);
        }
    }

    private void m4375d() {
        if (this.f2566d != null) {
            this.f2566d.f2565c.remove(this);
            this.f2566d = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m4374a(getActivity());
        } catch (IllegalStateException e) {
        }
    }

    public void onDetach() {
        super.onDetach();
        this.f2568f = null;
        m4375d();
    }

    public void onStart() {
        super.onStart();
        this.f2563a.m4337a();
    }

    public void onStop() {
        super.onStop();
        this.f2563a.m4339b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f2563a.m4341c();
        m4375d();
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.f2567e != null) {
            this.f2567e.m2971a();
        }
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f2568f;
        }
        String valueOf2 = String.valueOf(parentFragment);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append(valueOf).append("{parent=").append(valueOf2).append("}").toString();
    }
}
