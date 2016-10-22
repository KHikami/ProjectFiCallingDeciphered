import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public final class jhd extends jgw {
    private dr a;

    public jhd(Context context, ed edVar) {
        super(context, edVar);
    }

    public void a(String str, String str2, String str3, boolean z) {
        if (((dq) this.d.a("bg_task_progress_dialog")) == null) {
            dq a = a(str, str2);
            a.getArguments().putString("arg_task_tag", str3);
            a.b(z);
            a.a(this.d, "bg_task_progress_dialog");
        }
    }

    private dq a(String str, String str2) {
        return jya.a(null, str, str2, false, true, this.a);
    }

    public void a(String str) {
        dq dqVar = (dq) this.d.a("bg_task_progress_dialog");
        if (dqVar != null && TextUtils.equals(str, dqVar.getArguments().getString("arg_task_tag"))) {
            dqVar.a();
            this.d.b();
        }
    }

    public boolean a(jgz jgz) {
        if (jgz.a(jgz) && a(jgz.b())) {
            return true;
        }
        return a(this.c, jgz, 0);
    }

    private boolean a(Context context, jgz jgz, int i) {
        if (jgz == null || TextUtils.isEmpty(jgz.c())) {
            return false;
        }
        this.e = false;
        Toast.makeText(context, jgz.c(), 0).show();
        return true;
    }

    private boolean a(Exception exception) {
        for (jiy a : jyn.c(this.c, jiy.class)) {
            if (a.a()) {
                this.e = false;
                return true;
            }
        }
        return false;
    }
}
