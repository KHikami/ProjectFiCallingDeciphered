package com.google.android.apps.hangouts.fragments.dialpad;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ba;
import bc;
import cxo;
import del;
import dem;
import dep;
import dr;
import gld;
import gwb;
import jyn;

public class DialpadFragment extends dr implements dep {
    private static final int[][] c;
    private static final SparseArray<Integer> d;
    private static final SparseIntArray e;
    private dem a;
    private del b;

    static {
        r0 = new int[12][];
        r0[0] = new int[]{ba.gm, bc.aL, bc.aK};
        r0[1] = new int[]{ba.dK, bc.aN, bc.aM};
        r0[2] = new int[]{ba.fZ, bc.aP, bc.aO};
        r0[3] = new int[]{ba.fI, bc.aR, bc.aQ};
        r0[4] = new int[]{ba.bt, bc.aT, bc.aS};
        r0[5] = new int[]{ba.bj, bc.aV, bc.aU};
        r0[6] = new int[]{ba.fj, bc.aX, bc.aW};
        r0[7] = new int[]{ba.ff, bc.aZ, bc.aY};
        r0[8] = new int[]{ba.aR, bc.bb, bc.ba};
        r0[9] = new int[]{ba.dB, bc.bd, bc.bc};
        r0[10] = new int[]{ba.fr, bc.br, bc.bq};
        r0[11] = new int[]{ba.ef, bc.bn, bc.bm};
        c = r0;
        SparseArray sparseArray = new SparseArray();
        d = sparseArray;
        sparseArray.put(ba.dK, Integer.valueOf(8));
        d.put(ba.fZ, Integer.valueOf(9));
        d.put(ba.fI, Integer.valueOf(10));
        d.put(ba.bt, Integer.valueOf(11));
        d.put(ba.bj, Integer.valueOf(12));
        d.put(ba.fj, Integer.valueOf(13));
        d.put(ba.ff, Integer.valueOf(14));
        d.put(ba.aR, Integer.valueOf(15));
        d.put(ba.dB, Integer.valueOf(16));
        d.put(ba.gm, Integer.valueOf(7));
        d.put(ba.ef, Integer.valueOf(18));
        d.put(ba.fr, Integer.valueOf(17));
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        sparseIntArray.put(8, 1);
        e.put(9, 2);
        e.put(10, 3);
        e.put(11, 4);
        e.put(12, 5);
        e.put(13, 6);
        e.put(14, 7);
        e.put(15, 8);
        e.put(16, 9);
        e.put(7, 0);
        e.put(18, 11);
        e.put(17, 10);
    }

    private static int a(int i) {
        return gwb.a((Integer) d.get(i), -1);
    }

    public void a(dem dem) {
        this.a = dem;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = new del(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.go, viewGroup, false);
        Resources resources = getResources();
        int i = 0;
        while (i < c.length) {
            View view = (DialpadKeyButton) inflate.findViewById(c[i][0]);
            TextView textView = (TextView) view.findViewById(ba.aK);
            TextView textView2 = (TextView) view.findViewById(ba.aJ);
            gld.a(view, true);
            view.a((dep) this);
            CharSequence string = resources.getString(c[i][1]);
            textView.setText(string);
            view.setContentDescription(string);
            textView2.setText(resources.getString(c[i][2]));
            if (c[i][0] == ba.gm) {
                view.a(resources.getString(bc.bk));
                textView2.setTextSize(0, resources.getDimension(gwb.eE));
            }
            if (c[i][0] == ba.fr || c[i][0] == ba.ef) {
                textView.setTextColor(getResources().getColor(gwb.dK));
                textView.setTextSize(0, getResources().getDimension(gwb.eF));
                textView.setTypeface(Typeface.create(null, 0));
                textView.setPadding(textView.getPaddingLeft(), resources.getDimensionPixelOffset(gwb.eG), textView.getPaddingRight(), textView.getPaddingBottom());
            }
            i++;
        }
        if (((cxo) jyn.b(getActivity(), cxo.class)) != null) {
            inflate.setPadding(0, 0, 0, getResources().getDimensionPixelSize(gwb.fg));
        }
        return inflate;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.b.c();
        }
    }

    public void onResume() {
        super.onResume();
        this.b.b();
    }

    public void onPause() {
        super.onPause();
        this.b.c();
    }

    public void onDestroy() {
        super.onDestroy();
        this.b.c();
        this.b.a();
    }

    public void a(View view, boolean z) {
        int a = a(view.getId());
        if (a != -1) {
            this.a.a(a, z);
            if (z) {
                this.b.a(e.get(a));
                this.b.d();
                return;
            }
            this.b.c();
        }
    }

    public void a(View view) {
        int a = a(view.getId());
        if (a != -1) {
            this.a.a(a);
            this.b.c();
        }
    }
}
