package p000;

import android.content.Context;
import android.content.Intent;

public final class ebg extends fre {
    public ebg() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class mo1822a() {
        return super.mo1822a();
    }

    public Intent m13447a(Context context, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationIdSetString", str);
        return m13394b(context, intent);
    }

    public void mo1823a(Context context, Intent intent) {
        try {
            ebf.f11092g.m13454a(context, intent.getIntExtra("account_id", -1), intent.getStringExtra("conversationIdSetString"));
        } catch (jcj e) {
        } catch (bmu e2) {
        }
    }
}
