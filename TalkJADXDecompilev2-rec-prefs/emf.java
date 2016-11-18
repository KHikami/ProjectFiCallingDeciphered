package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.phone.DebugBitmapsActivity;

final class emf extends emv {
    final /* synthetic */ elk f11844a;

    emf(elk elk, String str) {
        this.f11844a = elk;
        super(str);
    }

    public void mo811a() {
        this.f11844a.f11810a.startActivity(new Intent(this.f11844a.f11810a, DebugBitmapsActivity.class));
    }
}
