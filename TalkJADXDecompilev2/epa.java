package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;

public final class epa implements dbj {
    final /* synthetic */ ShareIntentActivity a;

    public epa(ShareIntentActivity shareIntentActivity) {
        this.a = shareIntentActivity;
    }

    public void a(bcc bcc) {
        Intent a = gwb.a(this.a.n.g(), bcc.a, bcc.b);
        a.putExtra("conversation_parameters", bcc);
        Parcelable intent = this.a.getIntent();
        intent.putExtra("conversation_id", bcc.a);
        giv.a("ShareIntentActivity.openConversation", intent);
        a.putExtra("share_intent", intent);
        a.setFlags(8388608);
        a.addFlags(1);
        this.a.startActivityForResult(a, 0);
        this.a.overridePendingTransition(gwb.cU, gwb.cV);
    }

    public void a(String str, boolean z, int i, int i2) {
        iil.a("Should not get called");
    }

    public void a(Intent intent) {
        iil.a("Should not get called");
    }

    public void B_() {
        iil.a("Should not get called");
    }

    public void j() {
        iil.a("Should not get called");
    }

    public void a(gag gag) {
        iil.a("Should not get called");
    }

    public void a(gag gag, gag gag2) {
        iil.a("Should not get called");
    }
}
