package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import ba;
import bc;
import bko;
import dcl;
import enx;
import enz;
import eoa;
import fde;
import gwb;
import jca;
import jcu;

public class GoogleVoiceTermsOfServiceActivity extends dcl {
    private static final int[][] v;
    private static final String[] w;
    public final jca r;
    public bko s;
    private Button t;
    private Button u;

    public GoogleVoiceTermsOfServiceActivity() {
        this.r = new jcu(this, this.F).a(this.E);
    }

    static {
        r0 = new int[3][];
        r0[0] = new int[]{ba.fR, bc.uu, 0};
        r0[1] = new int[]{ba.fT, bc.uv, 1};
        r0[2] = new int[]{ba.fU, bc.uw, 2};
        v = r0;
        w = new String[]{"voice_android_calling", "voice_rates", "voice_legal"};
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.hI);
        this.s = fde.e(this.r.a());
        setTitle(getString(bc.fN));
        this.t = (Button) findViewById(ba.fS);
        this.u = (Button) findViewById(ba.fQ);
        for (int[] iArr : v) {
            TextView textView = (TextView) findViewById(iArr[0]);
            textView.setText(Html.fromHtml(getString(iArr[1], new Object[]{gwb.K(w[iArr[2]]).toString()})));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            Spannable spannable = (Spannable) textView.getText();
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                int spanStart = spannable.getSpanStart(uRLSpan);
                int spanEnd = spannable.getSpanEnd(uRLSpan);
                spannable.removeSpan(uRLSpan);
                spannable.setSpan(new eoa(this, uRLSpan.getURL()), spanStart, spanEnd, 0);
            }
            textView.setText(spannable);
        }
        this.u.setSelected(true);
        this.u.setOnClickListener(new enx(this));
        this.t.setOnClickListener(new enz(this));
    }

    protected void onStart() {
        super.onStart();
        g().b(true);
        gwb.a(this.s, 1097);
    }

    protected boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.a(menuItem);
        }
        d(0);
        return true;
    }

    public void d(int i) {
        if (i == -1) {
            gwb.a(this.s, 1098);
        } else if (i == 0) {
            gwb.a(this.s, 1099);
        }
        setResult(i, getIntent());
        finish();
    }
}
