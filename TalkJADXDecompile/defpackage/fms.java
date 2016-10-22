package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.List;

/* renamed from: fms */
public final class fms extends BaseAdapter {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ DebugWakelocksActivity c;

    fms(DebugWakelocksActivity debugWakelocksActivity, List list, List list2) {
        this.c = debugWakelocksActivity;
        this.a = list;
        this.b = list2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.c.getLayoutInflater().inflate(ba.mu, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(gwb.uH);
        ((TextView) view.findViewById(gwb.uG)).setText((CharSequence) this.a.get(i));
        textView.setText((CharSequence) this.b.get(i));
        return view;
    }

    public int getCount() {
        return this.a.size();
    }

    public Object getItem(int i) {
        return mfb.a((String) this.a.get(i), (String) this.b.get(i));
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
