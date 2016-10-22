package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ecc */
public final class ecc extends fre {
    public ecc() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    public void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        boolean booleanExtra = intent.getBooleanExtra("silent", false);
        boolean booleanExtra2 = intent.getBooleanExtra("live_message", false);
        ecd ecd = ebz.o;
        ecd.a(context, intExtra, booleanExtra, booleanExtra2);
    }

    public void a(Context context, int i, boolean z, boolean z2, mfa<Intent> mfa_android_content_Intent) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("silent", z);
        intent.putExtra("live_message", z2);
        ((fmk) jyn.a(context, fmk.class)).a(context, b(context, intent), mfa_android_content_Intent);
    }
}
