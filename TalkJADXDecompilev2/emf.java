package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.phone.DebugBitmapsActivity;

final class emf extends emv {
    final /* synthetic */ elk a;

    emf(elk elk, String str) {
        this.a = elk;
        super(str);
    }

    public void a() {
        this.a.a.startActivity(new Intent(this.a.a, DebugBitmapsActivity.class));
    }
}
