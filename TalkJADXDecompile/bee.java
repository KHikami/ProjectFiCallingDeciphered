import android.content.Context;

final class bee implements bdm {
    private final Context a;

    bee(Context context) {
        this.a = context;
        ((fnc) jyn.a(context, fnc.class)).a(new bed(context));
    }

    public int a(int i, int i2) {
        jch a = ((jcf) jyn.a(this.a, jcf.class)).a(i);
        if (a.a("app_upgrade_version_code", 0) < i2) {
            return 0;
        }
        return a.a("app_upgrade_type", 0);
    }

    public long a(int i) {
        return ((jcf) jyn.a(this.a, jcf.class)).a(i).a("app_upgrade_timestamp", 0);
    }

    public String b(int i) {
        return ((jcf) jyn.a(this.a, jcf.class)).a(i).a("app_upgrade_url", "");
    }
}
