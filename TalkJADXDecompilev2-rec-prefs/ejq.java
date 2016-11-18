package p000;

import android.accounts.NetworkErrorException;
import android.content.Context;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ejq extends jgw implements gia<bow> {
    final /* synthetic */ BabelHomeActivity f11656a;
    private czd f11657b;
    private box f11658f;

    public /* synthetic */ void mo775a(ayo ayo, Exception exception) {
        m14018b(exception);
    }

    public ejq(BabelHomeActivity babelHomeActivity, Context context, ed edVar, box box) {
        this.f11656a = babelHomeActivity;
        super(context, edVar);
        this.f11658f = box;
    }

    private void m14016a(bow bow) {
        if (this.f11658f != null) {
            String str = "ConversationChange Type: ";
            String valueOf = String.valueOf(this.f11658f.name());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        if (this.f11657b != null) {
            this.f11657b.mo1484a();
        }
        this.f11656a.f6624x.mo1979a(this.f11656a.f6625y.mo2317a()).mo1693b().mo1714c(3319);
        this.f11656a.startActivity(gwb.m1537a(bow.m6330c(), bow.m6329b(), 2));
    }

    public void mo795a(String str, String str2, String str3, boolean z) {
        this.f11657b = new czd(this.f11656a);
        this.f11657b.mo1486a(str);
    }

    public void mo794a(String str) {
        if (this.f11657b != null) {
            this.f11657b.mo1484a();
        }
    }

    public boolean mo796a(jgz jgz) {
        return false;
    }

    private boolean m14017a(Exception exception) {
        gag a;
        if (this.f11657b != null) {
            this.f11657b.mo1484a();
        }
        if (exception instanceof drb) {
            this.f11656a.f6624x.mo1979a(this.f11656a.f6625y.mo2317a()).mo1693b().mo1714c(3320);
            a = new gah(this.f11656a).m16814a(this.f11656a.getResources().getString(bc.an)).m16811a();
        } else if (exception instanceof NetworkErrorException) {
            a = new gah(this.f11656a).m16814a(this.f11656a.getResources().getString(bc.dy)).m16811a();
        } else {
            a = new gah(this.f11656a).m16814a(this.f11656a.getResources().getString(bc.al)).m16811a();
        }
        if (a != null) {
            if (this.f11656a.f6623w != null) {
                this.f11656a.f6626z.m7656a(this.f11656a.f6623w, a);
            } else {
                this.f11656a.f6626z.m7655a(a);
            }
        }
        return true;
    }

    private void m14018b(Exception exception) {
        m14017a(exception);
    }
}
