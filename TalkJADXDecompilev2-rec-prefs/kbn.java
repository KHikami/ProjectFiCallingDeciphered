package p000;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public final class kbn extends kbu {
    private kbz f21365c;
    private kbz f21366d;
    private kbz f21367e;
    private kbz f21368f;
    private kbz f21369g;

    public void m25556a(Activity activity) {
        this.f21365c = m25513a(new kbo(this, activity));
    }

    public void m25557a(Bundle bundle) {
        this.f21366d = m25513a(new kbp(this, bundle));
    }

    public void m25559a(boolean z) {
        if (this.f21369g != null) {
            m25522b(this.f21369g);
        }
        if (z) {
            for (int i = 0; i < this.a.size(); i++) {
                kbn.m25554a((kcq) this.a.get(i), z);
            }
            return;
        }
        this.f21369g = m25513a(new kbq(this, z));
    }

    static void m25554a(kcq kcq, boolean z) {
        if (kcq instanceof kbl) {
            ((kbl) kcq).mo3632a(z);
        }
    }

    public void m25560b(Bundle bundle) {
        this.f21368f = m25513a(new kbr(this, bundle));
    }

    public void m25558a(View view, Bundle bundle) {
        this.f21367e = m25513a(new kbs(this, bundle, view));
    }

    public void m25555a() {
        m25522b(this.f21367e);
        for (int i = 0; i < this.a.size(); i++) {
            kcq kcq = (kcq) this.a.get(i);
            if (kcq instanceof kbj) {
                ((kbj) kcq).mo641a();
            }
        }
    }

    public void mo3638c() {
        super.mo3638c();
        m25522b(this.f21366d);
        m25522b(this.f21368f);
    }

    public void m25562d() {
        m25522b(this.f21365c);
    }
}
