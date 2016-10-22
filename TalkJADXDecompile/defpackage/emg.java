package defpackage;

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.DebugOzGetMergedPersonActivity;

/* renamed from: emg */
final class emg extends emv {
    final /* synthetic */ elk a;

    emg(elk elk, String str) {
        this.a = elk;
        super(str);
    }

    public void a() {
        Intent intent = new Intent(this.a.a, DebugOzGetMergedPersonActivity.class);
        intent.putExtra("account_id", this.a.c);
        this.a.a.startActivity(intent);
    }
}
