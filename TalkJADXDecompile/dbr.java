import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class dbr implements OnGlobalLayoutListener {
    final /* synthetic */ dbp a;

    dbr(dbp dbp) {
        this.a = dbp;
    }

    public void onGlobalLayout() {
        gwb.a(this.a.d, (OnGlobalLayoutListener) this);
        if (this.a.getActivity() != null && this.a.e != null) {
            this.a.e.a(this.a.s().x, this.a.d.getHeight());
            this.a.e.c();
            this.a.a(this.a.f, true);
        }
    }
}
