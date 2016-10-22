package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ecb */
public final class ecb extends fre {
    public ecb() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    public Intent a(Context context, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationIdSetString", str);
        return super.b(context, intent);
    }

    public void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        String stringExtra = intent.getStringExtra("conversationIdSetString");
        ebz.o.a(context, intExtra, new blo(context, intExtra), stringExtra);
    }
}
