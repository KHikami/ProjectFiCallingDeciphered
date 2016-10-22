package defpackage;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: aij */
public final class aij extends BaseAdapter {
    public int a;
    private final LayoutInflater b;
    private final List c;
    private final afb d;
    private final Context e;

    public final /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    public aij(Context context, aik aik) {
        this(context, aik, null);
    }

    private aij(Context context, aik aik, agd agd) {
        List arrayList;
        this.a = -1;
        this.e = context;
        this.d = afb.a(context);
        if (aik == aik.ACCOUNTS_GROUP_WRITABLE) {
            arrayList = new ArrayList(this.d.a());
        } else {
            Object arrayList2 = new ArrayList(this.d.a(aik == aik.ACCOUNTS_CONTACT_WRITABLE));
        }
        this.c = arrayList;
        this.b = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            int i2;
            LayoutInflater layoutInflater = this.b;
            if (this.a > 0) {
                i2 = this.a;
            } else {
                i2 = buf.dn;
            }
            view = layoutInflater.inflate(i2, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(16908308);
        TextView textView2 = (TextView) view.findViewById(16908309);
        ImageView imageView = (ImageView) view.findViewById(16908294);
        agd agd = (agd) this.c.get(i);
        afv a = this.d.a(agd.b, agd.c);
        textView.setText(a.a(this.e));
        textView2.setText(agd.a);
        textView2.setEllipsize(TruncateAt.MIDDLE);
        imageView.setImageDrawable(a.b(this.e));
        return view;
    }

    public final int getCount() {
        return this.c.size();
    }

    public final agd a(int i) {
        return (agd) this.c.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }
}
