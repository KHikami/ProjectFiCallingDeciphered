package p000;

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

final class gmk extends ArrayAdapter<gmh> {
    private final Context f15652a;

    gmk(Context context, List<gmh> list) {
        super(context, ba.mv, list);
        this.f15652a = context;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        gml gml;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(ba.mv, viewGroup, false);
            gml gml2 = new gml((TextView) view.findViewById(bn.f4025u), (TextView) view.findViewById(bn.f4024t), (AvatarView) view.findViewById(bn.f4022r), (ImageView) view.findViewById(bn.f4023s));
            view.setTag(gml2);
            gml = gml2;
        } else {
            gml = (gml) view.getTag();
        }
        gmh gmh = (gmh) getItem(i);
        gml.f15653a.setText(gmh.m18087a());
        if (TextUtils.isEmpty(gmh.m18088b())) {
            gml.f15654b.setVisibility(8);
        } else {
            gml.f15654b.setText(gmh.m18088b());
            gml.f15654b.setVisibility(0);
        }
        if (gmh.m18090d()) {
            gml.f15655c.m9238a(gmh.m18089c(), gmh.m18087a(), fde.m15018e(((jca) jyn.m25426a(this.f15652a, jca.class)).mo2317a()));
            gml.f15655c.setVisibility(0);
            gml.f15656d.setVisibility(8);
        } else if (gmh.m18091e() != 0) {
            Drawable drawable = this.f15652a.getResources().getDrawable(gmh.m18091e());
            drawable.mutate().setColorFilter(this.f15652a.getResources().getColor(gwb.wQ), Mode.MULTIPLY);
            gml.f15656d.setImageDrawable(drawable);
            gml.f15656d.setVisibility(0);
            gml.f15655c.setVisibility(8);
        } else {
            gml.f15655c.setVisibility(8);
            gml.f15656d.setVisibility(8);
        }
        return view;
    }
}
