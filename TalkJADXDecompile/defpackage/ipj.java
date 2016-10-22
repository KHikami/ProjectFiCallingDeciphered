package defpackage;

import android.content.Intent;
import android.util.Pair;
import java.io.IOException;

/* renamed from: ipj */
final class ipj extends iiq<Void, Void, Pair<String, Intent>> {
    final /* synthetic */ ipg a;

    ipj(ipg ipg) {
        this.a = ipg;
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Pair) obj);
    }

    private Pair<String, Intent> a() {
        Pair<String, Intent> pair = null;
        try {
            itx.a(3, "vclib", "AuthenticationTask.doInBackgroundTimed");
            String a = this.a.d.a(this.a.b, "oauth2:https://www.googleapis.com/auth/hangouts ");
            itx.a(3, "vclib", "Got authToken for hangouts");
            return Pair.create(a, null);
        } catch (Throwable e) {
            itx.a("vclib", "Got authException", e);
            return Pair.create(pair, e.b());
        } catch (Throwable e2) {
            itx.a("vclib", "Error in getToken", e2);
            return pair;
        } catch (IOException e3) {
            return pair;
        }
    }

    private void a(Pair<String, Intent> pair) {
        itx.a(3, "vclib", "AuthenticationTask.onPostExecute");
        if (isCancelled()) {
            itx.a(3, "vclib", "AuthenticationTask cancelled");
            return;
        }
        this.a.i = null;
        if (pair == null) {
            this.a.e.k();
        } else if (pair.first != null) {
            this.a.j = (String) pair.first;
            this.a.c.a(this.a.j, System.currentTimeMillis());
        } else {
            this.a.e.a((Intent) pair.second);
        }
    }
}
