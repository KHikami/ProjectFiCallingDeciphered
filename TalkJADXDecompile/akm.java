import android.os.Handler;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.List;

public class akm {
    public Handler a;
    public final /* synthetic */ ViewVCardActivity b;

    public void a() {
        ViewVCardActivity viewVCardActivity = this.b;
        ViewVCardActivity.a("onStart");
    }

    public void a(ajr ajr) {
        ViewVCardActivity viewVCardActivity = this.b;
        String str = "onEntryCreated, display name is ";
        String valueOf = String.valueOf(ajr.b());
        if (valueOf.length() != 0) {
            valueOf = str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        ViewVCardActivity.a(valueOf);
        List<ake> list = ajr.a;
        if (list != null) {
            for (ake ake : list) {
                ViewVCardActivity viewVCardActivity2 = this.b;
                String str2 = "onEntryCreated, ";
                valueOf = String.valueOf(ake.toString());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                ViewVCardActivity.a(valueOf);
            }
        } else {
            viewVCardActivity = this.b;
            ViewVCardActivity.a("onEntryCreated, entry.getPhoneList() is null");
        }
        if (this.a != null) {
            this.a.obtainMessage(1003, ajr).sendToTarget();
        }
    }

    public void b() {
        ViewVCardActivity viewVCardActivity = this.b;
        ViewVCardActivity.a("onEnd");
        if (this.a != null) {
            this.a.sendEmptyMessage(1001);
        }
    }

    public akm(ViewVCardActivity viewVCardActivity, Handler handler) {
        this.b = viewVCardActivity;
        this.a = handler;
    }
}
