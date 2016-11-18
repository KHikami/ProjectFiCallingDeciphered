package p000;

import com.google.android.apps.hangouts.phone.BabelGatewayActivity;

public final class ejb extends fip {
    final /* synthetic */ BabelGatewayActivity f11636a;

    public ejb(BabelGatewayActivity babelGatewayActivity) {
        this.f11636a = babelGatewayActivity;
    }

    public void mo650a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.f11636a.f6573D) {
            if (BabelGatewayActivity.f6569r) {
                new StringBuilder(47).append("onConversationCreated called, error ").append(fiu.m15391b());
            }
            if (fiu.m15391b() != 1) {
                this.f11636a.m8811d(bc.cI);
                return;
            }
            iil.m21869a(Boolean.valueOf(fek.f12915c), Boolean.valueOf(this.f11636a.f6590w));
            if (fek.f12915c) {
                new epi(this.f11636a, this.f11636a.f6586s, fek.f12913a, true, this.f11636a.f6571B, this.f11636a.f6591x, this.f11636a.f6592y, this.f11636a.f6593z, this.f11636a.f6570A, this.f11636a.f6572C).m4950b(new Void[0]);
                this.f11636a.setResult(-1);
                this.f11636a.finish();
                return;
            }
            this.f11636a.f6589v = fek.f12913a;
            this.f11636a.m8812e(fek.f12914b);
        }
    }
}
