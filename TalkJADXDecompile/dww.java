import android.content.Context;
import android.text.TextUtils;

public class dww implements bhm {
    private final int a;
    private final String b;
    private final String c;

    public static dww a(int i, String str) {
        return new dww(i, str, false);
    }

    public dww(int i, String str, boolean z) {
        this.a = i;
        if (z) {
            this.b = str;
            this.c = "";
            return;
        }
        this.b = "";
        this.c = str;
    }

    public int a(Context context, bhb bhb) {
        if (TextUtils.isEmpty(this.b)) {
            ((dwv) jyn.a(context, dwv.class)).a(this.c);
        } else {
            ((dwv) jyn.a(context, dwv.class)).a(this.a, this.b);
        }
        return bhn.a;
    }
}
