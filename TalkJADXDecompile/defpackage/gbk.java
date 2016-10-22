package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: gbk */
final class gbk extends czj<evq, fad> {
    final /* synthetic */ gbg d;
    private final Context e;
    private final String f;

    public gbk(gbg gbg, Context context, String str) {
        this.d = gbg;
        this.e = context;
        this.f = str;
    }

    public void a(fme fme) {
        RealTimeChatService.a(fme, this.d.c, this.f);
    }

    public Class<evq> d() {
        return evq.class;
    }

    public Class<fad> e() {
        return fad.class;
    }

    public String a() {
        return this.e.getString(bc.tJ);
    }

    protected int h() {
        return (int) TimeUnit.SECONDS.toMillis(3);
    }

    public void g() {
        j();
        super.g();
    }

    public void b() {
        j();
        Toast.makeText(this.e, bc.lb, 0).show();
    }

    private void j() {
        Intent intent = new Intent(this.e, RequestWriter.class);
        intent.putExtra("cancel_request", this.f);
        this.e.startService(intent);
    }

    public void c() {
        this.d.d.a(this.d.c.g(), this.d.c.b().a, etx.STATUS_MESSAGE, this.f);
        gbg gbg = this.d;
        ((InputMethodManager) gbg.a.getSystemService("input_method")).hideSoftInputFromWindow(gbg.e.getWindowToken(), 0);
        gbg.b.getActivity().finish();
    }
}
