package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: def */
final class def extends ArrayAdapter<String> {
    final /* synthetic */ dee a;

    public def(dee dee, Context context, List<String> list) {
        this.a = dee;
        super(context, gwb.hu, list);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null || !(view instanceof TextView)) {
            view = (TextView) LayoutInflater.from(getContext()).inflate(gwb.hu, viewGroup, false);
        } else {
            TextView textView = (TextView) view;
        }
        view.setText((String) getItem(i));
        view.setOnClickListener(new deg(this, i));
        return view;
    }
}
