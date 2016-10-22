package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* renamed from: eqq */
final class eqq extends ArrayAdapter<fra> {
    private final Context a;

    public eqq(Context context, List<fra> list) {
        super(context, gwb.tz, list);
        this.a = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        fra fra = (fra) getItem(i);
        if (view == null || !(view instanceof TextView)) {
            view = (TextView) LayoutInflater.from(this.a).inflate(gwb.tz, viewGroup, false);
        } else {
            TextView textView = (TextView) view;
        }
        view.setSingleLine(false);
        view.setSingleLine(true);
        String valueOf = String.valueOf(fra.d);
        String str = fra.c;
        str = String.valueOf(new StringBuilder(String.valueOf(str).length() + 5).append("\u202a(+").append(str).append(")\u202c").toString());
        view.setText(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(" ").append(str).toString());
        return view;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getView(i, view, viewGroup);
    }
}
