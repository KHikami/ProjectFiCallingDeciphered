import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class gjg {
    boolean a;
    private final Context b;
    private final String c;
    private final String d;

    public gjg(Context context, String str, String str2) {
        this.b = context;
        this.c = str;
        this.d = str2;
    }

    public boolean a() {
        BroadcastReceiver gjh = new gjh(this);
        ik a = ik.a(this.b);
        a.a(gjh, new IntentFilter(this.d));
        a.b(new Intent(this.c));
        a.a(gjh);
        return this.a;
    }
}
