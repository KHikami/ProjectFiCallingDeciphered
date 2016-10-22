package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import bc;
import dal;
import dam;
import dan;
import dap;
import glk;
import gwb;
import java.util.Locale;
import ke;
import kp;

public class ContactDetailItemView extends TextView {
    private static boolean a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static StyleSpan g;
    private static ForegroundColorSpan h;
    private static AccessibilityManager i;

    static {
        g = new StyleSpan(1);
    }

    public ContactDetailItemView(Context context) {
        this(context, null);
    }

    public ContactDetailItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!a) {
            Resources resources = context.getApplicationContext().getResources();
            b = resources.getString(bc.q);
            c = resources.getString(bc.s);
            d = resources.getString(bc.t);
            e = resources.getString(bc.r);
            f = resources.getString(bc.u);
            g = new StyleSpan(1);
            h = new ForegroundColorSpan(resources.getColor(gwb.dP));
            i = (AccessibilityManager) getContext().getSystemService("accessibility");
            a = true;
        }
    }

    public void a(dam dam, String str) {
        if (dam instanceof dan) {
            a(((dan) dam).a, str);
        } else if (dam instanceof dap) {
            a(ke.a().a(((dap) dam).a(gwb.H()), kp.a), str);
        } else if (dam instanceof dal) {
            a(((dal) dam).a(), null);
        } else {
            glk.e("Babel", "Invalid contact detail item", new Object[0]);
        }
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (i.isEnabled() && i.isTouchExplorationEnabled())) {
            setText(str);
            return;
        }
        int indexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2.toUpperCase(Locale.getDefault()));
        if (indexOf == -1) {
            setText(str);
            return;
        }
        int length = str2.length() + indexOf;
        CharSequence spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(g, indexOf, length, 0);
        spannableStringBuilder.setSpan(h, indexOf, length, 0);
        setText(spannableStringBuilder);
    }
}
