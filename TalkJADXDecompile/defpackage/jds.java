package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jds */
final class jds implements jcr {
    private final Context a;

    jds(Context context) {
        this.a = context;
    }

    public jco[] a() {
        List arrayList = new ArrayList();
        for (jcq a : jyn.c(this.a, jcq.class)) {
            arrayList.addAll(a.a());
        }
        return (jco[]) arrayList.toArray(new jco[arrayList.size()]);
    }

    public jco a(String str) {
        for (jco jco : a()) {
            if (jco.a().equals(str)) {
                return jco;
            }
        }
        return null;
    }

    public <T extends dr & jcs> void a(T t) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        AccountManager.get(this.a).addAccount("com.google", "webupdates", null, bundle, null, new jdt(this, t), null);
    }
}
