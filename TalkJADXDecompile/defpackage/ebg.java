package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ebg */
public final class ebg extends fre {
    public ebg() {
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
        try {
            ebf.g.a(context, intent.getIntExtra("account_id", -1), intent.getStringExtra("conversationIdSetString"));
        } catch (jcj e) {
        } catch (bmu e2) {
        }
    }
}
