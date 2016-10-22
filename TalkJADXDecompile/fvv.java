import android.content.Context;

public class fvv {
    private final jcf a;
    private final biw b;

    fvv(Context context) {
        this.a = (jcf) jyn.a(context, jcf.class);
        this.b = (biw) jyn.a(context, biw.class);
    }

    public boolean a(int i) {
        if (this.b.a("babel_device_presence", false)) {
            return this.a.a(i).a("share_device_presence_preferences_key", false);
        }
        return false;
    }

    public boolean b(int i) {
        return this.a.a(i).a("last_seen_bool_key", false);
    }

    public void a(int i, boolean z) {
        this.a.b(i).b("last_seen_bool_key", z).d();
    }

    public boolean c(int i) {
        return this.a.a(i).a("rich_status_device_reporting_key", false);
    }

    public void b(int i, boolean z) {
        this.a.b(i).b("rich_status_device_reporting_key", z).d();
    }
}
