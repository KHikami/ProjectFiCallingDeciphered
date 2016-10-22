import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

final class dhn implements dpo {
    final /* synthetic */ dhm a;

    dhn(dhm dhm) {
        this.a = dhm;
    }

    public void a(Activity activity, Bundle bundle) {
        did s = dgg.a().s();
        if (s != null) {
            s.a(bundle);
            ikd p = s.p();
            if (p != null) {
                p.a(bundle);
            }
            bko e = fde.e(((jca) jyn.a((Context) activity, jca.class)).a());
            if (e != null && gwb.d(e)) {
                s.e("Triggering log upload for troubleshooting.");
            }
        }
    }
}
