import android.content.Context;
import android.content.Intent;

public final class ebo extends fre {
    public ebo() {
        super((byte) 0);
    }

    public /* bridge */ /* synthetic */ Class a() {
        return super.a();
    }

    public void a(Context context, Intent intent) {
        ebm.a(context, intent.getIntExtra("account_id", -1), intent.getBooleanExtra("silent", false), intent.getBooleanExtra("live_message", false));
    }

    public void a(Context context, int i, boolean z, boolean z2, mfa<Intent> mfa_android_content_Intent) {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("silent", z);
        intent.putExtra("live_message", z2);
        ((fmk) jyn.a(context, fmk.class)).a(context, b(context, intent), mfa_android_content_Intent);
    }
}
