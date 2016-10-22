import android.content.Context;
import android.content.Intent;

public final class ebh extends fre {
    public ebh() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    public void a(Context context, int i, boolean z, mfa<Intent> mfa_android_content_Intent) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("silent", z);
        ((fmk) jyn.a(context, fmk.class)).a(context, b(context, intent), mfa_android_content_Intent);
    }

    public void a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account_id", -1);
        boolean booleanExtra = intent.getBooleanExtra("silent", false);
        try {
            ebj ebj = ebf.g;
            ebj.a(context, intExtra, booleanExtra);
        } catch (jcj e) {
        }
    }
}
