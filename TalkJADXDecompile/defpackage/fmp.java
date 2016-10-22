package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.List;

/* renamed from: fmp */
public final class fmp extends ArrayAdapter<mfb<Intent, Long>> {
    final /* synthetic */ DebugWakelocksActivity a;

    fmp(DebugWakelocksActivity debugWakelocksActivity, Context context, int i, int i2, List list) {
        this.a = debugWakelocksActivity;
        super(context, i, i2, list);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2.findViewById(gwb.uG);
        textView.setTextColor(this.a.getResources().getColor(gwb.uF));
        textView.setText(((Intent) ((mfb) getItem(i)).a).getIntExtra("android.support.content.wakelockid", -1));
        textView = (TextView) view2.findViewById(gwb.uH);
        textView.setTextColor(this.a.getResources().getColor(gwb.uF));
        textView.setText(String.format("%.02fs", new Object[]{Double.valueOf(((double) (glj.b() - gwb.a((Long) ((mfb) getItem(i)).b))) / 1000.0d)}));
        return view2;
    }
}
