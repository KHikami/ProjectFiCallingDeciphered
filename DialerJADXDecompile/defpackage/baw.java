package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: baw */
public final class baw extends BaseAdapter {
    final HashMap a;
    final Context b;
    final aic c;
    List d;
    boolean e;
    private final ListView f;
    private final LayoutInflater g;
    private final aaz h;
    private OnClickListener i;
    private OnClickListener j;

    public baw(ListView listView, Context context, LayoutInflater layoutInflater, aaz aaz) {
        this.a = new HashMap();
        this.i = new bax(this);
        this.j = new bay(this);
        this.d = new ArrayList();
        this.f = listView;
        this.b = context;
        this.c = buf.M(this.b);
        this.g = layoutInflater;
        this.h = aaz;
    }

    public final int getCount() {
        return this.d.size();
    }

    public final Object getItem(int i) {
        return this.d.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    final void a(String str) {
        int firstVisiblePosition = this.f.getFirstVisiblePosition();
        int lastVisiblePosition = this.f.getLastVisiblePosition();
        for (int i = 0; i <= lastVisiblePosition - firstVisiblePosition; i++) {
            View childAt = this.f.getChildAt(i);
            if (((String) childAt.getTag()).equals(str)) {
                getView(i + firstVisiblePosition, childAt, this.f);
                return;
            }
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object obj;
        abc abc;
        if (view == null) {
            view = this.g.inflate(buf.kU, viewGroup, false);
        }
        bbb bbb = (bbb) this.d.get(i);
        ayo ayo = bbb.a;
        bbe bbe = bbb.b;
        bbc a = bbc.a(this.b);
        if (!bbb.c) {
            a.a(bbb.a, bbb.a.c() == 4, new bba(this));
        }
        if (this.e && ayo.b.getDetails().can(4096)) {
            obj = 1;
        } else {
            obj = null;
        }
        boolean can = ayo.b.getDetails().can(8192);
        String str = bbe.a;
        CharSequence a2 = aim.a(bbe.a, bbe.b, this.c);
        Object obj2 = bbe.c;
        CharSequence charSequence = bbe.e;
        String str2 = bbe.l;
        Uri uri = bbe.j;
        ImageView imageView = (ImageView) view.findViewById(az.t);
        TextView textView = (TextView) view.findViewById(az.y);
        TextView textView2 = (TextView) view.findViewById(az.z);
        TextView textView3 = (TextView) view.findViewById(az.A);
        View findViewById = view.findViewById(az.x);
        View findViewById2 = view.findViewById(az.B);
        findViewById.setVisibility(can ? 0 : 8);
        if (can) {
            findViewById.setOnClickListener(this.i);
        } else {
            findViewById.setOnClickListener(null);
        }
        findViewById2.setVisibility(obj != null ? 0 : 8);
        if (obj != null) {
            findViewById2.setOnClickListener(this.j);
        } else {
            findViewById2.setOnClickListener(null);
        }
        if (uri != null) {
            abc = null;
        } else {
            abc = new abc(str, str2, true);
        }
        this.h.a(imageView, uri, false, true, abc);
        textView.setText(a2);
        if (TextUtils.isEmpty(obj2)) {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(buf.a(BidiFormatter.getInstance().unicodeWrap(obj2, TextDirectionHeuristics.LTR)));
            textView3.setVisibility(0);
            textView3.setText(charSequence);
        }
        view.setTag(ayo.d);
        return view;
    }
}
