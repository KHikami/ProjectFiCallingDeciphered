import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class cqw extends cql {
    public String a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final /* synthetic */ void a(cql cql) {
        cqw cqw = (cqw) cql;
        if (this.b != 0) {
            cqw.b = this.b;
        }
        if (this.c != 0) {
            cqw.c = this.c;
        }
        if (this.d != 0) {
            cqw.d = this.d;
        }
        if (this.e != 0) {
            cqw.e = this.e;
        }
        if (this.f != 0) {
            cqw.f = this.f;
        }
        if (!TextUtils.isEmpty(this.a)) {
            cqw.a = this.a;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("language", this.a);
        hashMap.put("screenColors", Integer.valueOf(this.b));
        hashMap.put("screenWidth", Integer.valueOf(this.c));
        hashMap.put("screenHeight", Integer.valueOf(this.d));
        hashMap.put("viewportWidth", Integer.valueOf(this.e));
        hashMap.put("viewportHeight", Integer.valueOf(this.f));
        return cql.a((Object) hashMap);
    }
}
