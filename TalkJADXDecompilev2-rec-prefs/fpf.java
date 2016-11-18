package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public final class fpf implements fqd {
    private static final long serialVersionUID = 1;
    private final List<String> f13655a = new ArrayList();
    private final List<String> f13656b = new ArrayList();
    private final String f13657c;

    public fpf(lol lol, String str) {
        int i = 0;
        this.f13657c = str;
        for (ltr ltr : lol.f25882a) {
            this.f13655a.add(ltr.f26403b);
        }
        ltr[] ltrArr = lol.f25883b;
        int length = ltrArr.length;
        while (i < length) {
            this.f13656b.add(ltrArr[i].f26403b);
            i++;
        }
    }

    public void mo2060a(int i, mfa<Intent> mfa_android_content_Intent) {
        String str = this.f13657c;
        String str2 = "ContactsNotification.selfFanoutId == ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            valueOf = new String(str2);
        }
        if (!eul.m14388b(str)) {
            ((bhl) jyn.m25426a(gwb.m1400H(), bhl.class)).mo550a(new fkr(i));
        }
    }
}
