package defpackage;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.apps.hangouts.fragments.InvitationFragment;

/* renamed from: ddf */
public final class ddf extends AsyncTask<Void, Void, Void> {
    final String a;
    final /* synthetic */ InvitationFragment b;

    public ddf(InvitationFragment invitationFragment) {
        this.b = invitationFragment;
        this.a = this.b.c;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Void) obj);
    }

    private void a(Void voidR) {
        super.onPostExecute(voidR);
        if (this.b.aj != null && TextUtils.equals(this.b.c, this.a)) {
            this.b.scheduleFragmentRestart(new bcc(this.b.c, this.b.g));
        }
    }

    private Void a() {
        blo blo = new blo(this.b.context, this.b.f.g());
        blo.C(this.b.c);
        blo.j(this.b.c);
        return null;
    }
}
