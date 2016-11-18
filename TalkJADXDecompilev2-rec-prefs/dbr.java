package p000;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class dbr implements OnGlobalLayoutListener {
    final /* synthetic */ dbp f9476a;

    dbr(dbp dbp) {
        this.f9476a = dbp;
    }

    public void onGlobalLayout() {
        gwb.m1797a(this.f9476a.f5431d, (OnGlobalLayoutListener) this);
        if (this.f9476a.getActivity() != null && this.f9476a.f5432e != null) {
            this.f9476a.f5432e.m11433a(this.f9476a.m7790s().x, this.f9476a.f5431d.getHeight());
            this.f9476a.f5432e.c();
            this.f9476a.m7781a(this.f9476a.f5433f, true);
        }
    }
}
