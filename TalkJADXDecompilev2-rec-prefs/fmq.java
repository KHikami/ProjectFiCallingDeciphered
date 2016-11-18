package p000;

import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.LinkedHashMap;

public final class fmq implements OnItemClickListener {
    final /* synthetic */ DebugWakelocksActivity f13470a;

    fmq(DebugWakelocksActivity debugWakelocksActivity) {
        this.f13470a = debugWakelocksActivity;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        LinkedHashMap fmr = new fmr(this, (Intent) ((mfb) adapterView.getItemAtPosition(i)).f27604a);
        View inflate = this.f13470a.getLayoutInflater().inflate(ba.mt, null);
        ((ListView) inflate.findViewById(16908298)).setAdapter(new fms(this.f13470a, ba.m4601b(fmr.keySet()), ba.m4601b(fmr.values())));
        new Builder(this.f13470a).setView(inflate).show();
    }
}
