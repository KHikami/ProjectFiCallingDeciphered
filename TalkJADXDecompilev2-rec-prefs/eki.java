package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.List;

public final class eki extends BaseAdapter {
    final /* synthetic */ List f11751a;
    final /* synthetic */ List f11752b;
    final /* synthetic */ DebugActivity f11753c;

    public eki(DebugActivity debugActivity, List list, List list2) {
        this.f11753c = debugActivity;
        this.f11751a = list;
        this.f11752b = list2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f11753c.getLayoutInflater().inflate(gwb.gZ, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(ba.gf);
        String str = (String) this.f11751a.get(i);
        ((TextView) view.findViewById(ba.cS)).setText(str);
        Object obj = this.f11752b.get(i);
        DebugActivity debugActivity = this.f11753c;
        textView.setText(DebugActivity.m8912a(str, obj));
        return view;
    }

    public int getCount() {
        return this.f11751a.size();
    }

    public Object getItem(int i) {
        return new elf(this.f11753c, (String) this.f11751a.get(i), this.f11752b.get(i));
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
