import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.LinkedHashMap;

public final class fmq implements OnItemClickListener {
    final /* synthetic */ DebugWakelocksActivity a;

    fmq(DebugWakelocksActivity debugWakelocksActivity) {
        this.a = debugWakelocksActivity;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        LinkedHashMap fmr = new fmr(this, (Intent) ((mfb) adapterView.getItemAtPosition(i)).a);
        View inflate = this.a.getLayoutInflater().inflate(ba.mt, null);
        ((ListView) inflate.findViewById(16908298)).setAdapter(new fms(this.a, ba.b(fmr.keySet()), ba.b(fmr.values())));
        new Builder(this.a).setView(inflate).show();
    }
}
