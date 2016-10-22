import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collections;

final class bwi extends iiq<Void, Void, Integer> {
    final /* synthetic */ bwe a;
    private final Context b;
    private final Uri c;
    private final String[] d;
    private final String e;
    private final String[] f;
    private final String g;
    private final bwl h;

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Integer) obj);
    }

    public bwi(bwe bwe, Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, bwl bwl) {
        this.a = bwe;
        this.b = context;
        this.c = uri;
        this.d = strArr;
        this.e = str;
        this.f = strArr2;
        this.g = str2;
        this.h = bwl;
    }

    private Integer a() {
        Object[] objArr = new Object[]{this.c, this.e};
        if (isCancelled()) {
            return null;
        }
        Cursor query = this.b.getContentResolver().query(this.c, this.d, this.e, this.f, this.g);
        if (query == null) {
            return null;
        }
        try {
            if (isCancelled()) {
                return null;
            }
            bub a = bub.a(query);
            this.a.a(a, Collections.emptySet(), this.h);
            Integer valueOf = Integer.valueOf(a.a().length);
            query.close();
            return valueOf;
        } finally {
            query.close();
        }
    }

    protected void onCancelled() {
    }

    private void a(Integer num) {
        if (num == null) {
            Object[] objArr = new Object[]{this.c, this.e};
            return;
        }
        objArr = new Object[]{this.c, this.e};
        if (this.h != null) {
            this.h.a(gwb.a(num));
        }
    }
}
