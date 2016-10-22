package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: eav */
public final class eav extends fre {
    public eav() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    public Intent a(Context context, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationIdSetString", str);
        return b(context, intent);
    }

    public void a(Context context, Intent intent) {
        eat.b.a(context, intent.getIntExtra("account_id", -1), intent.getStringExtra("conversationIdSetString"));
    }
}
