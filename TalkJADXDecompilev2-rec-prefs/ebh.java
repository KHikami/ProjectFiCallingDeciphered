package p000;

import android.content.Context;
import android.content.Intent;

public final class ebh extends fre {
    public ebh() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class mo1822a() {
        return super.mo1822a();
    }

    public void m13451a(Context context, int i, boolean z, mfa<Intent> mfa_android_content_Intent) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("silent", z);
        ((fmk) jyn.m25426a(context, fmk.class)).mo2037a(context, m13394b(context, intent), mfa_android_content_Intent);
    }

    public void mo1823a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        boolean booleanExtra = intent.getBooleanExtra("silent", false);
        try {
            ebj ebj = ebf.f11092g;
            ebj.m13453a(context, intExtra, booleanExtra);
        } catch (jcj e) {
        }
    }
}
