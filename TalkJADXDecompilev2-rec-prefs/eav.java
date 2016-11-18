package p000;

import android.content.Context;
import android.content.Intent;

public final class eav extends fre {
    public eav() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class mo1822a() {
        return super.mo1822a();
    }

    public Intent m13395a(Context context, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationIdSetString", str);
        return m13394b(context, intent);
    }

    public void mo1823a(Context context, Intent intent) {
        eat.f11076b.m13402a(context, intent.getIntExtra("account_id", -1), intent.getStringExtra("conversationIdSetString"));
    }
}
