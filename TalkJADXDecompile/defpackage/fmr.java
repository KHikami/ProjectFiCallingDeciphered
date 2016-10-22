package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* renamed from: fmr */
final class fmr extends LinkedHashMap<String, String> {
    final /* synthetic */ Intent a;
    final /* synthetic */ fmq b;

    fmr(fmq fmq, Intent intent) {
        this.b = fmq;
        this.a = intent;
        put("action", this.a.getAction());
        put("data", this.a.getDataString());
        put("type", this.a.getType());
        put("package", this.a.getPackage());
        Bundle extras = this.a.getExtras();
        for (String str : extras.keySet()) {
            put(str, extras.getString(str));
        }
    }
}
