package p000;

import android.content.Intent;
import android.util.Pair;
import java.io.IOException;

final class ipj extends iiq<Void, Void, Pair<String, Intent>> {
    final /* synthetic */ ipg f18658a;

    ipj(ipg ipg) {
        this.f18658a = ipg;
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m22846a((Pair) obj);
    }

    private Pair<String, Intent> m22845a() {
        Pair<String, Intent> pair = null;
        try {
            itx.m23277a(3, "vclib", "AuthenticationTask.doInBackgroundTimed");
            String a = this.f18658a.f18647d.m21902a(this.f18658a.f18645b, "oauth2:https://www.googleapis.com/auth/hangouts ");
            itx.m23277a(3, "vclib", "Got authToken for hangouts");
            return Pair.create(a, null);
        } catch (Throwable e) {
            itx.m23281a("vclib", "Got authException", e);
            return Pair.create(pair, e.m18497b());
        } catch (Throwable e2) {
            itx.m23281a("vclib", "Error in getToken", e2);
            return pair;
        } catch (IOException e3) {
            return pair;
        }
    }

    private void m22846a(Pair<String, Intent> pair) {
        itx.m23277a(3, "vclib", "AuthenticationTask.onPostExecute");
        if (isCancelled()) {
            itx.m23277a(3, "vclib", "AuthenticationTask cancelled");
            return;
        }
        this.f18658a.f18652i = null;
        if (pair == null) {
            this.f18658a.f18648e.mo1550k();
        } else if (pair.first != null) {
            this.f18658a.f18653j = (String) pair.first;
            this.f18658a.f18646c.mo3349a(this.f18658a.f18653j, System.currentTimeMillis());
        } else {
            this.f18658a.f18648e.mo1539a((Intent) pair.second);
        }
    }
}
