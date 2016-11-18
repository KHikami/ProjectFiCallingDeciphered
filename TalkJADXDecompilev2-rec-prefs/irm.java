package p000;

import android.os.AsyncTask;
import com.google.android.libraries.hangouts.video.internal.CallService;
import java.io.IOException;

final class irm extends AsyncTask<Void, Void, String> {
    final irl f18780a;
    final /* synthetic */ iri f18781b;
    private final iiu f18782c;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m23048a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m23049a((String) obj);
    }

    irm(iri iri, iiu iiu, irl irl) {
        this.f18781b = iri;
        this.f18782c = iiu;
        this.f18780a = irl;
    }

    private String m23048a() {
        Throwable e;
        try {
            return this.f18782c.m21902a(this.f18781b.f18771a, "oauth2:https://www.googleapis.com/auth/hangouts ");
        } catch (IOException e2) {
            e = e2;
            itx.m23278a(5, "vclib", "Failed to get credentials for user", e);
            return null;
        } catch (gsr e3) {
            e = e3;
            itx.m23278a(5, "vclib", "Failed to get credentials for user", e);
            return null;
        }
    }

    private void m23049a(String str) {
        if (str == null) {
            this.f18780a.mo2249a();
            return;
        }
        loh loh = new loh();
        loh.f25866a = Integer.valueOf(1);
        loh.f25869d = Long.valueOf(CallService.m10301a(this.f18781b.f18771a));
        loe loe = new loe();
        ipg ipg = new ipg(this.f18781b.f18771a, this.f18781b.f18772b, str);
        ipg.mo3361a(loh);
        ipg.mo3360a(loe);
        nzf lyi = new lyi();
        lyi.f26894c = new lyh[1];
        lyi.f26894c[0] = new lyh();
        lyi.f26894c[0].f26867b = Integer.valueOf(1);
        lyi.f26894c[0].f26878m = Integer.valueOf(2);
        ipg.mo3358a("hangouts/add", lyi, lyj.class, new irn(this, ipg));
    }
}
