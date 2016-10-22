import android.app.Activity;
import java.util.HashSet;

public final class ayu extends dr {
    private final ayg a;
    private final ayo b;
    private final HashSet<ayu> c;
    private ayu d;
    private amu e;
    private dr f;

    public ayu() {
        this(new ayg());
    }

    private ayu(ayg ayg) {
        this.b = new ayv(this);
        this.c = new HashSet();
        this.a = ayg;
    }

    public void a(amu amu) {
        this.e = amu;
    }

    ayg a() {
        return this.a;
    }

    public amu b() {
        return this.e;
    }

    public ayo c() {
        return this.b;
    }

    void a(dr drVar) {
        this.f = drVar;
        if (drVar != null && drVar.getActivity() != null) {
            a(drVar.getActivity());
        }
    }

    private void a(dw dwVar) {
        d();
        this.d = ays.a.a(dwVar.J_(), null);
        if (this.d != this) {
            this.d.c.add(this);
        }
    }

    private void d() {
        if (this.d != null) {
            this.d.c.remove(this);
            this.d = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(getActivity());
        } catch (IllegalStateException e) {
        }
    }

    public void onDetach() {
        super.onDetach();
        this.f = null;
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

    public void onLowMemory() {
        super.onLowMemory();
        if (this.e != null) {
            this.e.a();
        }
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        Object parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f;
        }
        String valueOf2 = String.valueOf(parentFragment);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append(valueOf).append("{parent=").append(valueOf2).append("}").toString();
    }
}
