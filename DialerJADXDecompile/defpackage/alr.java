package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.dialer.app.calllog.CallTypeIconsView;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: alr */
public final class alr extends BaseAdapter {
    private final Context a;
    private final LayoutInflater b;
    private final ane c;
    private final ala[] d;
    private ArrayList e;

    public alr(Context context, LayoutInflater layoutInflater, ane ane, ala[] alaArr) {
        this.e = new ArrayList();
        this.a = context;
        this.b = layoutInflater;
        this.c = ane;
        this.d = alaArr;
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final int getCount() {
        return this.d.length;
    }

    public final Object getItem(int i) {
        return this.d[i];
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getItemViewType(int i) {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        CharSequence charSequence;
        if (view == null) {
            view = this.b.inflate(buf.hA, viewGroup, false);
        }
        ala ala = this.d[i];
        CallTypeIconsView callTypeIconsView = (CallTypeIconsView) view.findViewById(aq.C);
        TextView textView = (TextView) view.findViewById(aq.F);
        TextView textView2 = (TextView) view.findViewById(aq.V);
        TextView textView3 = (TextView) view.findViewById(aq.al);
        int i2 = ala.g[0];
        boolean z = (ala.t & 1) == 1 && buf.e(this.a);
        callTypeIconsView.a();
        callTypeIconsView.a(i2);
        callTypeIconsView.a(z);
        ane ane = this.c;
        switch (i2) {
            case rq.b /*1*/:
                if (!z) {
                    charSequence = ane.a;
                    break;
                }
                charSequence = ane.d;
                break;
            case rq.c /*2*/:
                if (!z) {
                    charSequence = ane.b;
                    break;
                }
                charSequence = ane.e;
                break;
            case rl.e /*3*/:
                if (!z) {
                    charSequence = ane.c;
                    break;
                }
                charSequence = ane.f;
                break;
            case rl.f /*4*/:
                charSequence = ane.g;
                break;
            case rl.g /*5*/:
                charSequence = ane.h;
                break;
            case rl.i /*6*/:
                charSequence = ane.i;
                break;
            default:
                charSequence = ane.c;
                break;
        }
        textView.setText(charSequence);
        textView2.setText(DateUtils.formatDateRange(this.a, ala.h, ala.h, 23));
        if (4 != i2) {
            Object obj;
            if (i2 == 1 || i2 == 2 || i2 == 4) {
                obj = null;
            } else {
                obj = 1;
            }
            if (obj == null) {
                textView3.setVisibility(0);
                long j = ala.i;
                Long l = ala.u;
                if (j >= 60) {
                    j -= 60 * (j / 60);
                    charSequence = this.a.getString(cob.bg, new Object[]{Long.valueOf(r4), Long.valueOf(j)});
                } else {
                    charSequence = this.a.getString(cob.bh, new Object[]{Long.valueOf(j)});
                }
                if (l != null) {
                    this.e.clear();
                    this.e.add(charSequence);
                    this.e.add(Formatter.formatShortFileSize(this.a, l.longValue()));
                    charSequence = buf.a(this.a.getResources(), this.e);
                }
                textView3.setText(charSequence);
                return view;
            }
        }
        textView3.setVisibility(8);
        return view;
    }
}
