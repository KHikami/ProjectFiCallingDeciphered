package p000;

import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;

final class fmr extends LinkedHashMap<String, String> {
    final /* synthetic */ Intent f13471a;
    final /* synthetic */ fmq f13472b;

    fmr(fmq fmq, Intent intent) {
        this.f13472b = fmq;
        this.f13471a = intent;
        put("action", this.f13471a.getAction());
        put("data", this.f13471a.getDataString());
        put("type", this.f13471a.getType());
        put("package", this.f13471a.getPackage());
        Bundle extras = this.f13471a.getExtras();
        for (String str : extras.keySet()) {
            put(str, extras.getString(str));
        }
    }
}
