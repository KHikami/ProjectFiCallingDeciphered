import android.os.Bundle;
import android.view.View;

final class aet extends lt {
    final /* synthetic */ aes a;

    aet(aes aes) {
        this.a = aes;
    }

    public void a(View view, ql qlVar) {
        super.a(view, qlVar);
        if (!this.a.a.v() && this.a.a.c() != null) {
            this.a.a.c().a(view, qlVar);
        }
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (this.a.a.v() || this.a.a.c() == null) {
            return false;
        }
        return this.a.a.c().a(view, i, bundle);
    }
}
