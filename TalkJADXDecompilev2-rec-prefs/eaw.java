package p000;

import android.content.Context;
import android.content.Intent;

public final class eaw extends fre {
    public eaw() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class mo1822a() {
        return super.mo1822a();
    }

    public Intent m13398a(Context context, int i) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        return m13394b(context, intent);
    }

    public void mo1823a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        eax eax = eat.f11076b;
        eax.m13401a(context, intExtra);
    }
}
