package p000;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

final class emg extends emv {
    final /* synthetic */ elk f11845a;

    emg(elk elk, String str) {
        this.f11845a = elk;
        super(str);
    }

    public void mo811a() {
        Intent intent = new Intent(this.f11845a.f11810a, DebugOzGetMergedPersonActivity.class);
        intent.putExtra("account_id", this.f11845a.f11812c);
        this.f11845a.f11810a.startActivity(intent);
    }
}
