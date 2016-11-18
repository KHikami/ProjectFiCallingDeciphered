package defpackage;

import android.content.Context;
import android.content.Intent;

public final class ebn extends fre {
    public ebn() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    public Intent a(Context context, int i, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationId", str);
        intent.putExtra("messageId", str2);
        return super.b(context, intent);
    }

    public void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        String stringExtra = intent.getStringExtra("conversationId");
        String stringExtra2 = intent.getStringExtra("messageId");
        if (stringExtra == null && stringExtra2 == null) {
            ebm.a(context, intExtra, true, false);
        } else {
            ebm.a(context, intExtra, stringExtra, stringExtra2);
        }
    }
}
