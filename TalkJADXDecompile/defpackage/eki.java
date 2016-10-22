package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.util.List;

/* renamed from: eki */
public final class eki extends BaseAdapter {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ DebugActivity c;

    public eki(DebugActivity debugActivity, List list, List list2) {
        this.c = debugActivity;
        this.a = list;
        this.b = list2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.c.getLayoutInflater().inflate(gwb.gZ, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(ba.gf);
        String str = (String) this.a.get(i);
        ((TextView) view.findViewById(ba.cS)).setText(str);
        Object obj = this.b.get(i);
        DebugActivity debugActivity = this.c;
        textView.setText(DebugActivity.a(str, obj));
        return view;
    }

    public int getCount() {
        return this.a.size();
    }

    public Object getItem(int i) {
        return new elf(this.c, (String) this.a.get(i), this.b.get(i));
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
