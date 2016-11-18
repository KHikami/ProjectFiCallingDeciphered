package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;

final class bwi extends iiq<Void, Void, Integer> {
    final /* synthetic */ bwe f4644a;
    private final Context f4645b;
    private final Uri f4646c;
    private final String[] f4647d;
    private final String f4648e;
    private final String[] f4649f;
    private final String f4650g;
    private final bwl f4651h;

    protected /* synthetic */ void onPostExecute(Object obj) {
        m6824a((Integer) obj);
    }

    public bwi(bwe bwe, Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, bwl bwl) {
        this.f4644a = bwe;
        this.f4645b = context;
        this.f4646c = uri;
        this.f4647d = strArr;
        this.f4648e = str;
        this.f4649f = strArr2;
        this.f4650g = str2;
        this.f4651h = bwl;
    }

    private Integer m6823a() {
        Object[] objArr = new Object[]{this.f4646c, this.f4648e};
        if (isCancelled()) {
            return null;
        }
        Cursor query = this.f4645b.getContentResolver().query(this.f4646c, this.f4647d, this.f4648e, this.f4649f, this.f4650g);
        if (query == null) {
            return null;
        }
        try {
            if (isCancelled()) {
                return null;
            }
            bub a = bub.m6672a(query);
            this.f4644a.m6816a(a, Collections.emptySet(), this.f4651h);
            Integer valueOf = Integer.valueOf(a.m6673a().length);
            query.close();
            return valueOf;
        } finally {
            query.close();
        }
    }

    protected void onCancelled() {
    }

    private void m6824a(Integer num) {
        if (num == null) {
            Object[] objArr = new Object[]{this.f4646c, this.f4648e};
            return;
        }
        objArr = new Object[]{this.f4646c, this.f4648e};
        if (this.f4651h != null) {
            this.f4651h.mo751a(gwb.m1507a(num));
        }
    }
}
