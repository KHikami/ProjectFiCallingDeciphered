package p000;

import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.List;

public final class dhq implements eib {
    final /* synthetic */ HangoutFragment f9766a;

    public dhq(HangoutFragment hangoutFragment) {
        this.f9766a = hangoutFragment;
    }

    public void mo748a(List<eic> list, Bundle bundle) {
        for (eic eic : list) {
            if (eic.f11580a.equals("android.permission.CAMERA") && eic.f11581b) {
                this.f9766a.mo495a();
                return;
            }
        }
    }
}
