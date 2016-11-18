package p000;

import android.content.Context;
import android.content.Intent;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.concurrent.TimeUnit;

final class gbk extends czj<evq, fad> {
    final /* synthetic */ gbg f14597d;
    private final Context f14598e;
    private final String f14599f;

    public gbk(gbg gbg, Context context, String str) {
        this.f14597d = gbg;
        this.f14598e = context;
        this.f14599f = str;
    }

    public void mo1480a(fme fme) {
        RealTimeChatService.m9052a(fme, this.f14597d.f14586c, this.f14599f);
    }

    public Class<evq> mo1481d() {
        return evq.class;
    }

    public Class<fad> mo1482e() {
        return fad.class;
    }

    public String mo1479a() {
        return this.f14598e.getString(bc.tJ);
    }

    protected int mo1990h() {
        return (int) TimeUnit.SECONDS.toMillis(3);
    }

    public void mo1478g() {
        m16848j();
        super.mo1478g();
    }

    public void mo1475b() {
        m16848j();
        Toast.makeText(this.f14598e, bc.lb, 0).show();
    }

    private void m16848j() {
        Intent intent = new Intent(this.f14598e, RequestWriter.class);
        intent.putExtra("cancel_request", this.f14599f);
        this.f14598e.startService(intent);
    }

    public void mo1476c() {
        this.f14597d.f14587d.m14332a(this.f14597d.f14586c.m5638g(), this.f14597d.f14586c.m5632b().f11244a, etx.STATUS_MESSAGE, this.f14599f);
        gbg gbg = this.f14597d;
        ((InputMethodManager) gbg.f14584a.getSystemService("input_method")).hideSoftInputFromWindow(gbg.f14588e.getWindowToken(), 0);
        gbg.f14585b.getActivity().finish();
    }
}
