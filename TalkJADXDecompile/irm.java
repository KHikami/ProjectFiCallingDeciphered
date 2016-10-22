import android.os.AsyncTask;
import com.google.android.libraries.hangouts.video.internal.CallService;
import java.io.IOException;

final class irm extends AsyncTask<Void, Void, String> {
    final irl a;
    final /* synthetic */ iri b;
    private final iiu c;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((String) obj);
    }

    irm(iri iri, iiu iiu, irl irl) {
        this.b = iri;
        this.c = iiu;
        this.a = irl;
    }

    private String a() {
        Throwable e;
        try {
            return this.c.a(this.b.a, "oauth2:https://www.googleapis.com/auth/hangouts ");
        } catch (IOException e2) {
            e = e2;
            itx.a(5, "vclib", "Failed to get credentials for user", e);
            return null;
        } catch (gsr e3) {
            e = e3;
            itx.a(5, "vclib", "Failed to get credentials for user", e);
            return null;
        }
    }

    private void a(String str) {
        if (str == null) {
            this.a.a();
            return;
        }
        loh loh = new loh();
        loh.a = Integer.valueOf(1);
        loh.d = Long.valueOf(CallService.a(this.b.a));
        loe loe = new loe();
        ipg ipg = new ipg(this.b.a, this.b.b, str);
        ipg.a(loh);
        ipg.a(loe);
        nzf lyi = new lyi();
        lyi.c = new lyh[1];
        lyi.c[0] = new lyh();
        lyi.c[0].b = Integer.valueOf(1);
        lyi.c[0].m = Integer.valueOf(2);
        ipg.a("hangouts/add", lyi, lyj.class, new irn(this, ipg));
    }
}
