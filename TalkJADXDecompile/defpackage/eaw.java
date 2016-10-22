package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: eaw */
public final class eaw extends fre {
    public eaw() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    public Intent a(Context context, int i) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        return b(context, intent);
    }

    public void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        eax eax = eat.b;
        eax.a(context, intExtra);
    }
}
