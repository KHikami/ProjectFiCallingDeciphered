package p000;

import android.content.Context;
import android.content.Intent;

public final class ecb extends fre {
    public ecb() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class mo1822a() {
        return super.mo1822a();
    }

    public Intent m13485a(Context context, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationIdSetString", str);
        return super.m13394b(context, intent);
    }

    public void mo1823a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        String stringExtra = intent.getStringExtra("conversationIdSetString");
        ebz.f11038o.m13492a(context, intExtra, new blo(context, intExtra), stringExtra);
    }
}
