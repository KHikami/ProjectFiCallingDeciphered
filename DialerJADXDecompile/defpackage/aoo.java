package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: aoo */
public final class aoo extends BaseAdapter {
    private LayoutInflater a;
    private aop[] b;

    public aoo(Context context) {
        this.b = new aop[3];
        this.a = LayoutInflater.from(context);
        this.b[0] = new aop(context.getString(cob.bZ), BitmapFactory.decodeResource(context.getResources(), cob.av), 101);
        this.b[1] = new aop(context.getString(cob.bY), BitmapFactory.decodeResource(context.getResources(), cob.au), 102);
        this.b[2] = new aop(context.getString(cob.bW), BitmapFactory.decodeResource(context.getResources(), cob.at), 103);
    }

    public final int getCount() {
        return 3;
    }

    public final Object getItem(int i) {
        return this.b[i];
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.inflate(buf.hE, null);
        }
        ((TextView) view.findViewById(aq.bA)).setText(this.b[i].a);
        ((ImageView) view.findViewById(aq.aw)).setImageBitmap(this.b[i].b);
        return view;
    }
}
