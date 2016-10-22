package defpackage;

import com.google.android.apps.hangouts.phone.BabelGatewayActivity;

/* renamed from: ejb */
public final class ejb extends fip {
    final /* synthetic */ BabelGatewayActivity a;

    public ejb(BabelGatewayActivity babelGatewayActivity) {
        this.a = babelGatewayActivity;
    }

    public void a(int i, bko bko, fek fek, fiu fiu) {
        if (i == this.a.D) {
            if (BabelGatewayActivity.r) {
                new StringBuilder(47).append("onConversationCreated called, error ").append(fiu.b());
            }
            if (fiu.b() != 1) {
                this.a.d(bc.cI);
                return;
            }
            iil.a(Boolean.valueOf(fek.c), Boolean.valueOf(this.a.w));
            if (fek.c) {
                new epi(this.a, this.a.s, fek.a, true, this.a.B, this.a.x, this.a.y, this.a.z, this.a.A, this.a.C).b(new Void[0]);
                this.a.setResult(-1);
                this.a.finish();
                return;
            }
            this.a.v = fek.a;
            this.a.e(fek.b);
        }
    }
}
