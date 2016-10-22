import android.content.Context;
import android.text.TextUtils;
import java.io.Serializable;

public final class dap extends dam implements Serializable {
    public final String a;
    public final String b;

    public dap(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        return this.a;
    }

    public String a(Context context) {
        Object obj;
        String valueOf;
        String valueOf2 = String.valueOf(glq.i(context, this.a));
        if (TextUtils.isEmpty(this.b)) {
            obj = "";
        } else {
            String str = " ";
            valueOf = String.valueOf(this.b);
            obj = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        valueOf = String.valueOf(obj);
        return valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2);
    }

    public String a() {
        return this.b;
    }
}
