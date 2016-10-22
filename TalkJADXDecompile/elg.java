import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.hangouts.phone.DebugActivity.RecordingService;
import java.util.Date;

public final class elg implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ fio b;

    public elg(fio fio, Intent intent) {
        this.b = fio;
        this.a = intent;
    }

    public void run() {
        Intent intent = (Intent) this.a.clone();
        intent.putExtra("___time", RecordingService.d.format(new Date()));
        this.b.a.c.add(intent);
        if ((this.b.a.e == null || TextUtils.equals(intent.getStringExtra("conversation_id"), this.b.a.e)) && this.b.a.b != null) {
            this.b.a.b.add(intent);
            this.b.a.b.notifyDataSetChanged();
        }
        while (this.b.a.c.size() > 1000) {
            intent = (Intent) this.b.a.c.remove(0);
            if (this.b.a.b != null) {
                this.b.a.b.remove(intent);
            }
        }
    }
}
