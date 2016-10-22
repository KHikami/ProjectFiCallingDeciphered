package com.android.contacts.common.dialog;

import aaz;
import abc;
import abw;
import ace;
import acf;
import acg;
import ach;
import aci;
import acj;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import buf;
import cob;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class CallSubjectDialog extends Activity {
    private String A;
    private String B;
    private final OnClickListener C;
    private OnClickListener D;
    private OnItemClickListener E;
    public int a;
    public View b;
    public View c;
    public EditText d;
    public ListView e;
    public SharedPreferences f;
    public List g;
    public String h;
    public PhoneAccountHandle i;
    private Charset j;
    private QuickContactBadge k;
    private TextView l;
    private TextView m;
    private TextView n;
    private View o;
    private View p;
    private int q;
    private final TextWatcher r;
    private int s;
    private final OnClickListener t;
    private final OnClickListener u;
    private long v;
    private Uri w;
    private Uri x;
    private String y;
    private boolean z;

    public CallSubjectDialog() {
        this.q = 16;
        this.r = new ace(this);
        this.t = new acf(this);
        this.u = new acg(this);
        this.C = new ach(this);
        this.D = new aci(this);
        this.E = new acj(this);
    }

    public static void a(Activity activity, long j, Uri uri, Uri uri2, String str, boolean z, String str2, String str3, String str4, PhoneAccountHandle phoneAccountHandle) {
        Bundle bundle = new Bundle();
        bundle.putLong("PHOTO_ID", j);
        bundle.putParcelable("PHOTO_URI", uri);
        bundle.putParcelable("CONTACT_URI", uri2);
        bundle.putString("NAME_OR_NUMBER", str);
        bundle.putBoolean("IS_BUSINESS", z);
        bundle.putString("NUMBER", str2);
        bundle.putString("DISPLAY_NUMBER", str3);
        bundle.putString("NUMBER_LABEL", str4);
        bundle.putParcelable("PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
        Intent intent = new Intent(activity, CallSubjectDialog.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    private static List a(SharedPreferences sharedPreferences) {
        int i = 0;
        int i2 = sharedPreferences.getInt("subject_history_count", 0);
        List arrayList = new ArrayList(i2);
        while (i < i2) {
            String valueOf = String.valueOf("subject_history_item");
            CharSequence string = sharedPreferences.getString(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString(), null);
            if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
            i++;
        }
        return arrayList;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getResources().getInteger(buf.di);
        this.f = PreferenceManager.getDefaultSharedPreferences(this);
        this.s = getResources().getDimensionPixelSize(buf.cM);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("CallSubjectDialog", "Arguments cannot be null.");
        } else {
            this.v = extras.getLong("PHOTO_ID");
            this.w = (Uri) extras.getParcelable("PHOTO_URI");
            this.x = (Uri) extras.getParcelable("CONTACT_URI");
            this.y = extras.getString("NAME_OR_NUMBER");
            this.z = extras.getBoolean("IS_BUSINESS");
            this.h = extras.getString("NUMBER");
            this.A = extras.getString("DISPLAY_NUMBER");
            this.B = extras.getString("NUMBER_LABEL");
            this.i = (PhoneAccountHandle) extras.getParcelable("PHONE_ACCOUNT_HANDLE");
        }
        if (VERSION.SDK_INT > 23 && this.i != null) {
            Bundle extras2 = ((TelecomManager) getSystemService("telecom")).getPhoneAccount(this.i).getExtras();
            if (extras2 != null) {
                this.q = extras2.getInt("android.telecom.extra.CALL_SUBJECT_MAX_LENGTH", this.q);
                Object string = extras2.getString("android.telecom.extra.CALL_SUBJECT_CHARACTER_ENCODING");
                if (TextUtils.isEmpty(string)) {
                    this.j = null;
                } else {
                    try {
                        this.j = Charset.forName(string);
                    } catch (UnsupportedCharsetException e) {
                        String str = "CallSubjectDialog";
                        String str2 = "Invalid charset: ";
                        String valueOf = String.valueOf(string);
                        Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        this.j = null;
                    }
                }
            }
        }
        this.g = a(this.f);
        setContentView(buf.dt);
        getWindow().setLayout(-1, -1);
        this.b = findViewById(cob.n);
        this.b.setOnClickListener(this.D);
        this.c = findViewById(cob.J);
        this.k = (QuickContactBadge) findViewById(cob.t);
        this.l = (TextView) findViewById(cob.P);
        this.m = (TextView) findViewById(cob.Q);
        this.d = (EditText) findViewById(cob.m);
        this.d.addTextChangedListener(this.r);
        this.d.setOnClickListener(this.u);
        this.d.setFilters(new InputFilter[]{new LengthFilter(this.q)});
        this.n = (TextView) findViewById(cob.o);
        this.o = findViewById(cob.L);
        this.o.setOnClickListener(this.t);
        this.o.setVisibility(this.g.isEmpty() ? 8 : 0);
        this.p = findViewById(cob.R);
        this.p.setOnClickListener(this.C);
        this.e = (ListView) findViewById(cob.S);
        this.e.setOnItemClickListener(this.E);
        this.e.setVisibility(8);
        if (this.x != null) {
            int i;
            long j = this.v;
            Uri uri = this.w;
            Uri uri2 = this.x;
            String str3 = this.y;
            boolean z = this.z;
            this.k.assignContactUri(uri2);
            if (abw.h()) {
                this.k.setOverlay(null);
            }
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            if (uri2 != null) {
                valueOf = buf.e(uri2);
            } else {
                valueOf = null;
            }
            abc abc = new abc(str3, valueOf, i, true);
            if (j != 0 || uri == null) {
                aaz.a((Context) this).a(this.k, j, false, true, abc);
            } else {
                aaz.a((Context) this).a(this.k, uri, this.s, false, true, abc);
            }
        } else {
            this.k.setVisibility(8);
        }
        this.l.setText(this.y);
        if (TextUtils.isEmpty(this.B) || TextUtils.isEmpty(this.A)) {
            this.m.setVisibility(8);
            this.m.setText(null);
        } else {
            this.m.setVisibility(0);
            this.m.setText(getString(buf.dV, new Object[]{this.B, this.A}));
        }
        a();
    }

    public final void a() {
        int length;
        String obj = this.d.getText().toString();
        if (this.j != null) {
            length = obj.getBytes(this.j).length;
        } else {
            length = obj.length();
        }
        this.n.setText(getString(buf.dU, new Object[]{Integer.valueOf(length), Integer.valueOf(this.q)}));
        if (length >= this.q) {
            this.n.setTextColor(getResources().getColor(buf.cA));
        } else {
            this.n.setTextColor(getResources().getColor(buf.cC));
        }
    }
}
