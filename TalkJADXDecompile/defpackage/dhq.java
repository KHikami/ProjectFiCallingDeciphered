package defpackage;

import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.List;

/* renamed from: dhq */
public final class dhq implements eib {
    final /* synthetic */ HangoutFragment a;

    public dhq(HangoutFragment hangoutFragment) {
        this.a = hangoutFragment;
    }

    public void a(List<eic> list, Bundle bundle) {
        for (eic eic : list) {
            if (eic.a.equals("android.permission.CAMERA") && eic.b) {
                this.a.a();
                return;
            }
        }
    }
}
