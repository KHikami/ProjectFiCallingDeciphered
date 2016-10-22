import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class cqu extends cql {
    public String a;
    public String b;
    public String c;
    public String d;

    public final void a(cqu cqu) {
        if (!TextUtils.isEmpty(this.a)) {
            cqu.a = this.a;
        }
        if (!TextUtils.isEmpty(this.b)) {
            cqu.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            cqu.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            cqu.d = this.d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("appName", this.a);
        hashMap.put("appVersion", this.b);
        hashMap.put("appId", this.c);
        hashMap.put("appInstallerId", this.d);
        return cql.a((Object) hashMap);
    }
}
