package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.DebugActivity.RecordingService;
import java.util.Date;

public final class elg implements Runnable {
    final /* synthetic */ Intent f11802a;
    final /* synthetic */ fio f11803b;

    public elg(fio fio, Intent intent) {
        this.f11803b = fio;
        this.f11802a = intent;
    }

    public void run() {
        Intent intent = (Intent) this.f11802a.clone();
        intent.putExtra("___time", RecordingService.f6657d.format(new Date()));
        this.f11803b.f13136a.f6660c.add(intent);
        if ((this.f11803b.f13136a.f6661e == null || TextUtils.equals(intent.getStringExtra("conversation_id"), this.f11803b.f13136a.f6661e)) && this.f11803b.f13136a.f6659b != null) {
            this.f11803b.f13136a.f6659b.add(intent);
            this.f11803b.f13136a.f6659b.notifyDataSetChanged();
        }
        while (this.f11803b.f13136a.f6660c.size() > 1000) {
            intent = (Intent) this.f11803b.f13136a.f6660c.remove(0);
            if (this.f11803b.f13136a.f6659b != null) {
                this.f11803b.f13136a.f6659b.remove(intent);
            }
        }
    }
}
