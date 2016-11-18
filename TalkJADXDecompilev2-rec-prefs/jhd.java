package p000;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public final class jhd extends jgw {
    private dr f20062a;

    public jhd(Context context, ed edVar) {
        super(context, edVar);
    }

    public void mo795a(String str, String str2, String str3, boolean z) {
        if (((dq) this.d.mo1844a("bg_task_progress_dialog")) == null) {
            dq a = m24203a(str, str2);
            a.getArguments().putString("arg_task_tag", str3);
            a.m7008b(z);
            a.mo2341a(this.d, "bg_task_progress_dialog");
        }
    }

    private dq m24203a(String str, String str2) {
        return jya.m25402a(null, str, str2, false, true, this.f20062a);
    }

    public void mo794a(String str) {
        dq dqVar = (dq) this.d.mo1844a("bg_task_progress_dialog");
        if (dqVar != null && TextUtils.equals(str, dqVar.getArguments().getString("arg_task_tag"))) {
            dqVar.m7002a();
            this.d.mo1848b();
        }
    }

    public boolean mo796a(jgz jgz) {
        if (jgz.m24186a(jgz) && m24205a(jgz.m24190b())) {
            return true;
        }
        return m24204a(this.c, jgz, 0);
    }

    private boolean m24204a(Context context, jgz jgz, int i) {
        if (jgz == null || TextUtils.isEmpty(jgz.m24191c())) {
            return false;
        }
        this.e = false;
        Toast.makeText(context, jgz.m24191c(), 0).show();
        return true;
    }

    private boolean m24205a(Exception exception) {
        for (jiy a : jyn.m25438c(this.c, jiy.class)) {
            if (a.m24337a()) {
                this.e = false;
                return true;
            }
        }
        return false;
    }
}
