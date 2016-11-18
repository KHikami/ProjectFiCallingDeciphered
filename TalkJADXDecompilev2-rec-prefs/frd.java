package p000;

import android.content.Intent;
import java.util.Map;

public abstract class frd extends fmj {
    private final Map<String, fre> f6512a = new ky();

    public abstract fre[] mo1137a();

    public frd(String str) {
        super(str);
        for (Object obj : mo1137a()) {
            this.f6512a.put(obj.getClass().getName(), obj);
        }
    }

    public void mo1136a(Intent intent, mfa<Intent> mfa_android_content_Intent) {
        String str = "DistributedService onHandleIntent ";
        String valueOf = String.valueOf(intent == null ? "null" : intent.getAction());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (intent == null) {
            glk.m17982e("Babel", "DistributedService get null intent", new Object[0]);
            return;
        }
        str = intent.getStringExtra("ds_processor");
        fre fre = (fre) this.f6512a.get(str);
        if (fre != null) {
            fre.mo1823a(this, intent);
            return;
        }
        String valueOf2 = String.valueOf(getClass().getSimpleName());
        glk.m17982e("Babel", new StringBuilder((String.valueOf(str).length() + 104) + String.valueOf(valueOf2).length()).append(str).append(" was not present in ").append(valueOf2).append("'s processorMap.  This could happen if the app was upgraded while an intent was out.").toString(), new Object[0]);
    }
}
