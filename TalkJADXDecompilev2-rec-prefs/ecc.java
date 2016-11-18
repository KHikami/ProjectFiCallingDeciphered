package p000;

import android.content.Context;
import android.content.Intent;

public final class ecc extends fre {
    public ecc() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class mo1822a() {
        return super.mo1822a();
    }

    public void mo1823a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        boolean booleanExtra = intent.getBooleanExtra("silent", false);
        boolean booleanExtra2 = intent.getBooleanExtra("live_message", false);
        ecd ecd = ebz.f11038o;
        ecd.m13491a(context, intExtra, booleanExtra, booleanExtra2);
    }

    public void m13489a(Context context, int i, boolean z, boolean z2, mfa<Intent> mfa_android_content_Intent) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("silent", z);
        intent.putExtra("live_message", z2);
        ((fmk) jyn.m25426a(context, fmk.class)).mo2037a(context, m13394b(context, intent), mfa_android_content_Intent);
    }
}
