import android.content.Intent;
import java.util.Map;

public abstract class frd extends fmj {
    private final Map<String, fre> a;

    public abstract fre[] a();

    public frd(String str) {
        super(str);
        this.a = new ky();
        for (Object obj : a()) {
            this.a.put(obj.getClass().getName(), obj);
        }
    }

    public void a(Intent intent, mfa<Intent> mfa_android_content_Intent) {
        String str = "DistributedService onHandleIntent ";
        String valueOf = String.valueOf(intent == null ? "null" : intent.getAction());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (intent == null) {
            glk.e("Babel", "DistributedService get null intent", new Object[0]);
            return;
        }
        str = intent.getStringExtra("ds_processor");
        fre fre = (fre) this.a.get(str);
        if (fre != null) {
            fre.a(this, intent);
            return;
        }
        String valueOf2 = String.valueOf(getClass().getSimpleName());
        glk.e("Babel", new StringBuilder((String.valueOf(str).length() + 104) + String.valueOf(valueOf2).length()).append(str).append(" was not present in ").append(valueOf2).append("'s processorMap.  This could happen if the app was upgraded while an intent was out.").toString(), new Object[0]);
    }
}
