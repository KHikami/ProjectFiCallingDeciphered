package p000;

import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class jds implements jcr {
    private final Context f19912a;

    jds(Context context) {
        this.f19912a = context;
    }

    public jco[] mo3478a() {
        List arrayList = new ArrayList();
        for (jcq a : jyn.m25438c(this.f19912a, jcq.class)) {
            arrayList.addAll(a.mo1740a());
        }
        return (jco[]) arrayList.toArray(new jco[arrayList.size()]);
    }

    public jco mo3476a(String str) {
        for (jco jco : mo3478a()) {
            if (jco.m23898a().equals(str)) {
                return jco;
            }
        }
        return null;
    }

    public <T extends dr & jcs> void mo3477a(T t) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        AccountManager.get(this.f19912a).addAccount("com.google", "webupdates", null, bundle, null, new jdt(this, t), null);
    }
}
