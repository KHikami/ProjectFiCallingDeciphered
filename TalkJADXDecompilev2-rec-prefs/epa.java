package p000;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.hangouts.phone.ShareIntentActivity;

public final class epa implements dbj {
    final /* synthetic */ ShareIntentActivity f11971a;

    public epa(ShareIntentActivity shareIntentActivity) {
        this.f11971a = shareIntentActivity;
    }

    public void mo1142a(bcc bcc) {
        Intent a = gwb.m1537a(this.f11971a.f6697n.m5638g(), bcc.f2975a, bcc.f2976b);
        a.putExtra("conversation_parameters", bcc);
        Parcelable intent = this.f11971a.getIntent();
        intent.putExtra("conversation_id", bcc.f2975a);
        giv.m17744a("ShareIntentActivity.openConversation", intent);
        a.putExtra("share_intent", intent);
        a.setFlags(8388608);
        a.addFlags(1);
        this.f11971a.startActivityForResult(a, 0);
        this.f11971a.overridePendingTransition(gwb.cU, gwb.cV);
    }

    public void mo1145a(String str, boolean z, int i, int i2) {
        iil.m21870a("Should not get called");
    }

    public void mo1141a(Intent intent) {
        iil.m21870a("Should not get called");
    }

    public void B_() {
        iil.m21870a("Should not get called");
    }

    public void mo1085j() {
        iil.m21870a("Should not get called");
    }

    public void mo1143a(gag gag) {
        iil.m21870a("Should not get called");
    }

    public void mo1144a(gag gag, gag gag2) {
        iil.m21870a("Should not get called");
    }
}
