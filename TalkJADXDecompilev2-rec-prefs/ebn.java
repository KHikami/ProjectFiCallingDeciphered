package p000;

import android.content.Context;
import android.content.Intent;

public final class ebn extends fre {
    public ebn() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class mo1822a() {
        return super.mo1822a();
    }

    public Intent m13465a(Context context, int i, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationId", str);
        intent.putExtra("messageId", str2);
        return super.m13394b(context, intent);
    }

    public void mo1823a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        String stringExtra = intent.getStringExtra("conversationId");
        String stringExtra2 = intent.getStringExtra("messageId");
        if (stringExtra == null && stringExtra2 == null) {
            ebm.m13459a(context, intExtra, true, false);
        } else {
            ebm.m13458a(context, intExtra, stringExtra, stringExtra2);
        }
    }
}
