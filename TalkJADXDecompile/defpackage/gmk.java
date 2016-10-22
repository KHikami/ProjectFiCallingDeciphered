package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;
import java.util.List;

/* renamed from: gmk */
final class gmk extends ArrayAdapter<gmh> {
    private final Context a;

    gmk(Context context, List<gmh> list) {
        super(context, ba.mv, list);
        this.a = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        gml gml;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(ba.mv, viewGroup, false);
            gml gml2 = new gml((TextView) view.findViewById(bn.u), (TextView) view.findViewById(bn.t), (AvatarView) view.findViewById(bn.r), (ImageView) view.findViewById(bn.s));
            view.setTag(gml2);
            gml = gml2;
        } else {
            gml = (gml) view.getTag();
        }
        gmh gmh = (gmh) getItem(i);
        gml.a.setText(gmh.a());
        if (TextUtils.isEmpty(gmh.b())) {
            gml.b.setVisibility(8);
        } else {
            gml.b.setText(gmh.b());
            gml.b.setVisibility(0);
        }
        if (gmh.d()) {
            gml.c.a(gmh.c(), gmh.a(), fde.e(((jca) jyn.a(this.a, jca.class)).a()));
            gml.c.setVisibility(0);
            gml.d.setVisibility(8);
        } else if (gmh.e() != 0) {
            Drawable drawable = this.a.getResources().getDrawable(gmh.e());
            drawable.mutate().setColorFilter(this.a.getResources().getColor(gwb.wQ), Mode.MULTIPLY);
            gml.d.setImageDrawable(drawable);
            gml.d.setVisibility(0);
            gml.c.setVisibility(8);
        } else {
            gml.c.setVisibility(8);
            gml.d.setVisibility(8);
        }
        return view;
    }
}
