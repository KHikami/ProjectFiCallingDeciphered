package p000;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

public final class ddf extends AsyncTask<Void, Void, Void> {
    final String f9533a = this.f9534b.f6274c;
    final /* synthetic */ InvitationFragment f9534b;

    public ddf(InvitationFragment invitationFragment) {
        this.f9534b = invitationFragment;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m11472a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m11473a((Void) obj);
    }

    private void m11473a(Void voidR) {
        super.onPostExecute(voidR);
        if (this.f9534b.aj != null && TextUtils.equals(this.f9534b.f6274c, this.f9533a)) {
            this.f9534b.scheduleFragmentRestart(new bcc(this.f9534b.f6274c, this.f9534b.f6278g));
        }
    }

    private Void m11472a() {
        blo blo = new blo(this.f9534b.context, this.f9534b.f6277f.m5638g());
        blo.m5911C(this.f9534b.f6274c);
        blo.m6072j(this.f9534b.f6274c);
        return null;
    }
}
