import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;

final class dxx implements dxc {
    private final Context a;

    dxx(Context context) {
        this.a = context;
    }

    public Collection<String> a(int i, String str) {
        Collection hashSet = new HashSet();
        Builder buildUpon = dwz.g.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(i));
        buildUpon.appendQueryParameter("gaia_id", str);
        dxb dxb = new dxb(null, this.a.getContentResolver().query(buildUpon.build(), dxa.c(), null, null, null));
        while (dxb.moveToNext()) {
            try {
                CharSequence n = dxb.a().n();
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
