package p000;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;

final class dxx implements dxc {
    private final Context f10786a;

    dxx(Context context) {
        this.f10786a = context;
    }

    public Collection<String> mo1759a(int i, String str) {
        Collection hashSet = new HashSet();
        Builder buildUpon = dwz.f6496g.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(i));
        buildUpon.appendQueryParameter("gaia_id", str);
        dxb dxb = new dxb(null, this.f10786a.getContentResolver().query(buildUpon.build(), dxa.m12954c(), null, null, null));
        while (dxb.moveToNext()) {
            try {
                CharSequence n = dxb.mo592a().mo580n();
                if (!TextUtils.isEmpty(n)) {
                    hashSet.add(n);
                }
            } finally {
                dxb.close();
            }
        }
        return hashSet;
    }
}
