package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.List;

public final class fms extends BaseAdapter {
    final /* synthetic */ List f13473a;
    final /* synthetic */ List f13474b;
    final /* synthetic */ DebugWakelocksActivity f13475c;

    fms(DebugWakelocksActivity debugWakelocksActivity, List list, List list2) {
        this.f13475c = debugWakelocksActivity;
        this.f13473a = list;
        this.f13474b = list2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f13475c.getLayoutInflater().inflate(ba.mu, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(gwb.uH);
        ((TextView) view.findViewById(gwb.uG)).setText((CharSequence) this.f13473a.get(i));
        textView.setText((CharSequence) this.f13474b.get(i));
        return view;
    }

    public int getCount() {
        return this.f13473a.size();
    }

    public Object getItem(int i) {
        return mfb.m31979a((String) this.f13473a.get(i), (String) this.f13474b.get(i));
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
