package p000;

import android.os.Handler;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.List;

public class akm {
    public Handler f1133a;
    public final /* synthetic */ ViewVCardActivity f1134b;

    public void m2737a() {
        ViewVCardActivity viewVCardActivity = this.f1134b;
        ViewVCardActivity.m8959a("onStart");
    }

    public void m2738a(ajr ajr) {
        ViewVCardActivity viewVCardActivity = this.f1134b;
        String str = "onEntryCreated, display name is ";
        String valueOf = String.valueOf(ajr.m2661b());
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        ViewVCardActivity.m8959a(valueOf);
        List<ake> list = ajr.f1030a;
        if (list != null) {
            for (ake ake : list) {
                ViewVCardActivity viewVCardActivity2 = this.f1134b;
                String str2 = "onEntryCreated, ";
                valueOf = String.valueOf(ake.toString());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                ViewVCardActivity.m8959a(valueOf);
            }
        } else {
            viewVCardActivity = this.f1134b;
            ViewVCardActivity.m8959a("onEntryCreated, entry.getPhoneList() is null");
        }
        if (this.f1133a != null) {
            this.f1133a.obtainMessage(1003, ajr).sendToTarget();
        }
    }

    public void m2739b() {
        ViewVCardActivity viewVCardActivity = this.f1134b;
        ViewVCardActivity.m8959a("onEnd");
        if (this.f1133a != null) {
            this.f1133a.sendEmptyMessage(1001);
        }
    }

    public akm(ViewVCardActivity viewVCardActivity, Handler handler) {
        this.f1134b = viewVCardActivity;
        this.f1133a = handler;
    }
}
