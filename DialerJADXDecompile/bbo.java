import android.telecom.Call;
import android.telephony.PhoneNumberUtils;

/* compiled from: PG */
public final class bbo extends bdj implements bcv {
    private ayo a;

    public final /* synthetic */ void a(bdq bdq) {
        super.a((bbp) bdq);
        bcj.b().b((bcv) this);
    }

    public final /* synthetic */ void b(bdq bdq) {
        super.b((bbp) bdq);
        bcj.b().a((bcv) this);
        this.a = azs.a.a();
    }

    public final void a(bcu bcu, bcu bcu2, azs azs) {
        this.a = azs.a();
        String valueOf = String.valueOf(this.a);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 25).append("DialpadPresenter mCall = ").append(valueOf).toString());
    }

    public final void a(char c) {
        bdf.a((Object) this, "Processing dtmf key " + c);
        if (!PhoneNumberUtils.is12Key(c) || this.a == null) {
            bdf.a((Object) this, "ignoring dtmf request for '" + c + "'");
            return;
        }
        bdf.a((Object) this, "updating display and sending dtmf tone for '" + c + "'");
        ((bbp) this.i).a(c);
        Object a = bdp.a();
        String str = this.a.d;
        Call a2 = bdp.a(str);
        if (a2 != null) {
            a2.playDtmfTone(c);
            return;
        }
        String str2 = "error playDtmfTone, call not in call list ";
        str = String.valueOf(str);
        bdf.c(a, str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    public final void a() {
        if (this.a != null) {
            bdf.a((Object) this, "stopping remote tone");
            Object a = bdp.a();
            String str = this.a.d;
            Call a2 = bdp.a(str);
            if (a2 != null) {
                a2.stopDtmfTone();
                return;
            }
            String str2 = "error stopDtmfTone, call not in call list ";
            str = String.valueOf(str);
            bdf.c(a, str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }
}
