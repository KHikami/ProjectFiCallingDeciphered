import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class crc extends cql {
    public String a;
    public long b;
    public String c;
    public String d;

    public final /* synthetic */ void a(cql cql) {
        crc crc = (crc) cql;
        if (!TextUtils.isEmpty(this.a)) {
            crc.a = this.a;
        }
        if (this.b != 0) {
            crc.b = this.b;
        }
        if (!TextUtils.isEmpty(this.c)) {
            crc.c = this.c;
        }
        if (!TextUtils.isEmpty(this.d)) {
            crc.d = this.d;
        }
    }

    public final String toString() {
        Map hashMap = new HashMap();
        hashMap.put("variableName", this.a);
        hashMap.put("timeInMillis", Long.valueOf(this.b));
        hashMap.put("category", this.c);
        hashMap.put("label", this.d);
        return cql.a((Object) hashMap);
    }
}
