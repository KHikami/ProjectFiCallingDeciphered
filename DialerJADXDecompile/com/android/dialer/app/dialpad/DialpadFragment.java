package com.android.dialer.app.dialpad;

import aiw;
import ajw;
import ake;
import ama;
import amb;
import amc;
import amd;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.provider.Settings.System;
import android.telecom.PhoneAccountHandle;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.RelativeLayout;
import aol;
import aom;
import aon;
import aoo;
import aop;
import aoq;
import aot;
import aou;
import apa;
import aq;
import arq;
import avl;
import awj;
import axk;
import buf;
import cob;
import com.android.contacts.common.dialog.CallSubjectDialog;
import com.android.dialer.app.DialtactsActivity;
import com.android.dialer.app.UsedByReflection;
import com.android.dialer.dialpadview.DialpadKeyButton;
import com.android.dialer.dialpadview.DialpadView;
import java.util.HashSet;
import java.util.List;
import rk;
import rl;

/* compiled from: PG */
public final class DialpadFragment extends Fragment implements TextWatcher, OnClickListener, OnKeyListener, OnLongClickListener, OnItemClickListener, OnMenuItemClickListener, awj {
    public DialpadView a;
    public EditText b;
    public aou c;
    public String d;
    public boolean e;
    public boolean f;
    private final Object g;
    private final HashSet h;
    private final ama i;
    private aot j;
    private int k;
    private View l;
    private PopupMenu m;
    private View n;
    private ToneGenerator o;
    private View p;
    private ajw q;
    private ListView r;
    private aoo s;
    private String t;
    private boolean u;
    private String v;
    private aon w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* compiled from: PG */
    public class DialpadSlidingRelativeLayout extends RelativeLayout {
        public DialpadSlidingRelativeLayout(Context context) {
            super(context);
        }

        public DialpadSlidingRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public DialpadSlidingRelativeLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        @UsedByReflection
        public float getYFraction() {
            int height = getHeight();
            if (height == 0) {
                return 0.0f;
            }
            return getTranslationY() / ((float) height);
        }

        @UsedByReflection
        public void setYFraction(float f) {
            setTranslationY(((float) getHeight()) * f);
        }
    }

    public DialpadFragment() {
        this.g = new Object();
        this.h = new HashSet(12);
        this.i = new ama();
        this.d = "";
        this.e = false;
        this.z = false;
        this.f = false;
    }

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if ("android.intent.action.DIAL".equals(action) || "android.intent.action.VIEW".equals(action)) {
            return intent.getBooleanExtra("add_call_mode", false);
        }
        return false;
    }

    private final TelephonyManager e() {
        return (TelephonyManager) getActivity().getSystemService("phone");
    }

    public final Context getContext() {
        return getActivity();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.x = TextUtils.isEmpty(charSequence);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.x != TextUtils.isEmpty(charSequence)) {
            Activity activity = getActivity();
            if (activity != null) {
                activity.invalidateOptionsMenu();
                boolean z = this.x;
                this.l = this.a.c;
                if (z) {
                    ake.b(this.l, -1);
                } else {
                    ake.a(this.l, -1);
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.y && buf.a(getActivity(), editable.toString(), this.b)) {
            this.b.getText().clear();
        }
        if (d()) {
            this.y = false;
            this.b.setCursorVisible(false);
        }
        if (this.j != null) {
            this.j.a(this.b.getText().toString());
        }
        c();
    }

    public final void onCreate(Bundle bundle) {
        Trace.beginSection("DialpadFragment onCreate");
        super.onCreate(bundle);
        this.z = bundle == null;
        this.v = buf.g(getActivity());
        this.t = getResources().getString(cob.bC);
        if (bundle != null) {
            this.y = bundle.getBoolean("pref_digits_filled_by_intent");
        }
        this.k = getResources().getInteger(buf.ho);
        if (this.w == null) {
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
            this.w = new aon(this);
            getActivity().registerReceiver(this.w, intentFilter);
        }
        Trace.endSection();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Trace.beginSection("DialpadFragment onCreateView");
        Trace.beginSection("DialpadFragment inflate view");
        View inflate = layoutInflater.inflate(buf.hF, viewGroup, false);
        Trace.endSection();
        Trace.beginSection("DialpadFragment buildLayer");
        inflate.buildLayer();
        Trace.endSection();
        Trace.beginSection("DialpadFragment setup views");
        this.a = (DialpadView) inflate.findViewById(aq.af);
        this.a.a(true);
        this.b = this.a.a;
        this.b.setKeyListener(apa.a);
        this.b.setOnClickListener(this);
        this.b.setOnKeyListener(this);
        this.b.setOnLongClickListener(this);
        this.b.addTextChangedListener(this);
        this.b.setElegantTextHeight(false);
        buf.a(getActivity(), this.b);
        if (inflate.findViewById(aq.aO) != null) {
            int[] iArr = new int[]{aq.aO, aq.bD, aq.bB, aq.au, aq.ar, aq.bv, aq.bs, aq.am, aq.aN, aq.bz, aq.bM, aq.aV};
            for (int i = 0; i < 12; i++) {
                ((DialpadKeyButton) inflate.findViewById(iArr[i])).b = this;
            }
            ((DialpadKeyButton) inflate.findViewById(aq.aO)).setOnLongClickListener(this);
            ((DialpadKeyButton) inflate.findViewById(aq.bM)).setOnLongClickListener(this);
        }
        this.n = this.a.b;
        if (this.n != null) {
            this.n.setOnClickListener(this);
            this.n.setOnLongClickListener(this);
        }
        this.p = inflate.findViewById(aq.by);
        this.p.setOnTouchListener(new aol(this));
        this.b.setCursorVisible(false);
        this.r = (ListView) inflate.findViewById(aq.ab);
        this.r.setOnItemClickListener(this);
        View findViewById = inflate.findViewById(aq.ad);
        ImageButton imageButton = (ImageButton) inflate.findViewById(aq.ac);
        imageButton.setOnClickListener(this);
        this.q = new ajw(getActivity(), findViewById, imageButton);
        Trace.endSection();
        Trace.endSection();
        return inflate;
    }

    private final boolean f() {
        return this.b != null;
    }

    private final boolean b(Intent intent) {
        if (!this.z && !this.e) {
            return false;
        }
        String action = intent.getAction();
        if ("android.intent.action.DIAL".equals(action) || "android.intent.action.VIEW".equals(action)) {
            Uri data = intent.getData();
            if (data != null) {
                if ("tel".equals(data.getScheme())) {
                    action = data.getSchemeSpecificPart();
                    this.y = true;
                    b(PhoneNumberUtils.convertKeypadLettersToDigits(PhoneNumberUtils.replaceUnicodeDigits(action)), null);
                    return true;
                } else if (!buf.i(getActivity())) {
                    return false;
                } else {
                    action = intent.getType();
                    if ("vnd.android.cursor.item/person".equals(action) || "vnd.android.cursor.item/phone".equals(action)) {
                        Cursor query = getActivity().getContentResolver().query(intent.getData(), new String[]{"number", "number_key"}, null, null, null);
                        if (query != null) {
                            try {
                                if (query.moveToFirst()) {
                                    this.y = true;
                                    b(query.getString(0), query.getString(1));
                                    return true;
                                }
                                query.close();
                            } finally {
                                query.close();
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a(String str, String str2) {
        DialpadView dialpadView = this.a;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            dialpadView.d.setVisibility(8);
            return;
        }
        dialpadView.d.setVisibility(0);
        dialpadView.e.setText(str);
        dialpadView.f.setText(str2);
    }

    private final void b(String str, String str2) {
        String str3 = this.v;
        Object extractNetworkPortion = PhoneNumberUtils.extractNetworkPortion(str);
        CharSequence extractPostDialPortion = PhoneNumberUtils.extractPostDialPortion(str);
        if (!TextUtils.isEmpty(extractNetworkPortion)) {
            str3 = PhoneNumberUtils.formatNumber(extractNetworkPortion, str2, str3);
            if (TextUtils.isEmpty(extractPostDialPortion)) {
                Object obj = str3;
            } else {
                extractPostDialPortion = str3.concat(extractPostDialPortion);
            }
        }
        if (!TextUtils.isEmpty(extractPostDialPortion)) {
            Editable text = this.b.getText();
            text.replace(0, text.length(), extractPostDialPortion);
            afterTextChanged(text);
        }
    }

    public final void onStart() {
        Trace.beginSection("DialpadFragment onStart");
        super.onStart();
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.g) {
            if (this.o == null) {
                try {
                    this.o = new ToneGenerator(8, 80);
                } catch (RuntimeException e) {
                    String valueOf = String.valueOf(e);
                    Log.w("DialpadFragment", new StringBuilder(String.valueOf(valueOf).length() + 54).append("Exception caught while creating local tone generator: ").append(valueOf).toString());
                    this.o = null;
                }
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            new StringBuilder(53).append("Time for ToneGenerator creation: ").append(currentTimeMillis2);
        }
        Trace.endSection();
    }

    public final void onResume() {
        String action;
        int i = 1;
        Trace.beginSection("DialpadFragment onResume");
        super.onResume();
        DialtactsActivity dialtactsActivity = (DialtactsActivity) getActivity();
        this.j = dialtactsActivity;
        aiw aiw = new aiw("Dialpad.onResume");
        this.d = "";
        if (buf.h(getActivity())) {
            amb amb = new amb(getActivity(), new amd(this));
            ama ama = this.i;
            avl.a();
            new amc(ama, amb.b).execute(new amb[]{amb});
        }
        aiw.a("qloc");
        this.u = System.getInt(dialtactsActivity.getContentResolver(), "dtmf_tone", 1) == 1;
        aiw.a("dtwd");
        aiw.a("hptc");
        this.h.clear();
        Activity activity = getActivity();
        if (activity instanceof DialtactsActivity) {
            Intent intent = activity.getIntent();
            if (f()) {
                boolean z;
                if (!a(intent)) {
                    boolean b = b(intent);
                    if (!(this.e && b)) {
                        action = intent.getAction();
                        if (("android.intent.action.DIAL".equals(action) || "android.intent.action.VIEW".equals(action) || "android.intent.action.MAIN".equals(action)) && i()) {
                            z = true;
                            a(z);
                            this.e = false;
                        }
                    }
                }
                z = false;
                a(z);
                this.e = false;
            }
        } else {
            this.e = false;
        }
        aiw.a("fdin");
        if (!i()) {
            a(false);
        }
        aiw.a("hnt");
        c();
        aiw.a("bes");
        action = "DialpadFragment";
        aiw.a("");
        long longValue = ((Long) aiw.b.get(0)).longValue();
        long longValue2 = ((Long) aiw.b.get(aiw.b.size() - 1)).longValue() - longValue;
        if (longValue2 >= 50) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(aiw.a);
            stringBuilder.append(",");
            stringBuilder.append(longValue2);
            stringBuilder.append(": ");
            while (i < aiw.b.size()) {
                longValue2 = ((Long) aiw.b.get(i)).longValue();
                stringBuilder.append((String) aiw.c.get(i));
                stringBuilder.append(",");
                stringBuilder.append(longValue2 - longValue);
                stringBuilder.append(" ");
                i++;
                longValue = longValue2;
            }
        }
        this.l = this.a.c;
        PopupMenu aom = new aom(this, getActivity(), this.l);
        aom.inflate(buf.hS);
        aom.setOnMenuItemClickListener(this);
        this.m = aom;
        this.l.setOnTouchListener(this.m.getDragToOpenListener());
        this.l.setOnClickListener(this);
        this.l.setVisibility(d() ? 4 : 0);
        if (this.z) {
            onHiddenChanged(false);
        }
        this.z = false;
        Trace.endSection();
    }

    public final void onPause() {
        super.onPause();
        h();
        this.h.clear();
        this.d = "";
        buf.j();
    }

    public final void onStop() {
        super.onStop();
        synchronized (this.g) {
            if (this.o != null) {
                this.o.release();
                this.o = null;
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("pref_digits_filled_by_intent", this.y);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.c != null) {
            aou aou = this.c;
            aou.a();
            aou.a = null;
            this.c = null;
        }
        getActivity().unregisterReceiver(this.w);
    }

    private final void a(int i) {
        if (getView() != null && getView().getTranslationY() == 0.0f) {
            switch (i) {
                case rl.h /*7*/:
                    a(0, -1);
                    break;
                case rl.j /*8*/:
                    a(1, -1);
                    break;
                case rl.l /*9*/:
                    a(2, -1);
                    break;
                case rl.m /*10*/:
                    a(3, -1);
                    break;
                case rl.n /*11*/:
                    a(4, -1);
                    break;
                case rl.k /*12*/:
                    a(5, -1);
                    break;
                case rk.i /*13*/:
                    a(6, -1);
                    break;
                case rk.bV /*14*/:
                    a(7, -1);
                    break;
                case rk.bY /*15*/:
                    a(8, -1);
                    break;
                case rk.bX /*16*/:
                    a(9, -1);
                    break;
                case rk.bZ /*17*/:
                    a(10, -1);
                    break;
                case rk.bW /*18*/:
                    a(11, -1);
                    break;
            }
            getView().performHapticFeedback(1);
            this.b.onKeyDown(i, new KeyEvent(0, i));
            int length = this.b.length();
            if (length == this.b.getSelectionStart() && length == this.b.getSelectionEnd()) {
                this.b.setCursorVisible(false);
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (view.getId() != aq.ak || i != 66) {
            return false;
        }
        g();
        return true;
    }

    public final void a(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == aq.aO) {
                a(8);
            } else if (id == aq.bD) {
                a(9);
            } else if (id == aq.bB) {
                a(10);
            } else if (id == aq.au) {
                a(11);
            } else if (id == aq.ar) {
                a(12);
            } else if (id == aq.bv) {
                a(13);
            } else if (id == aq.bs) {
                a(14);
            } else if (id == aq.am) {
                a(15);
            } else if (id == aq.aN) {
                a(16);
            } else if (id == aq.bM) {
                a(7);
            } else if (id == aq.aV) {
                a(18);
            } else if (id == aq.bz) {
                a(17);
            } else {
                String valueOf = String.valueOf(view);
                Log.wtf("DialpadFragment", new StringBuilder(String.valueOf(valueOf).length() + 44).append("Unexpected onTouch(ACTION_DOWN) event from: ").append(valueOf).toString());
            }
            this.h.add(view);
            return;
        }
        this.h.remove(view);
        if (this.h.isEmpty()) {
            h();
        }
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == aq.ac) {
            view.performHapticFeedback(1);
            g();
        } else if (id == aq.W) {
            a(67);
        } else if (id == aq.ak) {
            if (!d()) {
                this.b.setCursorVisible(true);
            }
        } else if (id == aq.ae) {
            this.m.show();
        } else {
            String valueOf = String.valueOf(view);
            Log.wtf("DialpadFragment", new StringBuilder(String.valueOf(valueOf).length() + 33).append("Unexpected onClick() event from: ").append(valueOf).toString());
        }
    }

    public final boolean onLongClick(View view) {
        Editable text = this.b.getText();
        int id = view.getId();
        if (id == aq.W) {
            text.clear();
            return true;
        } else if (id == aq.aO) {
            if (!d() && !TextUtils.equals(this.b.getText(), "1")) {
                return false;
            }
            a('1');
            List n = buf.n(getActivity());
            boolean z = n.size() > 1 && !n.contains(axk.a(getActivity(), "voicemail"));
            if (z || j()) {
                Context activity = getActivity();
                arq arq = new arq(buf.g());
                arq.a = 2;
                buf.d(activity, arq.a());
                b(false);
                return true;
            } else if (getActivity() == null) {
                return true;
            } else {
                int i;
                DialogFragment aoq;
                Bundle bundle;
                if (System.getInt(getActivity().getContentResolver(), "airplane_mode_on", 0) != 0) {
                    i = cob.cb;
                    aoq = new aoq();
                    bundle = new Bundle();
                    bundle.putInt("argTitleResId", 0);
                    bundle.putInt("argMessageResId", i);
                    aoq.setArguments(bundle);
                    aoq.show(getFragmentManager(), "voicemail_request_during_airplane_mode");
                    return true;
                }
                i = cob.cc;
                aoq = new aoq();
                bundle = new Bundle();
                bundle.putInt("argTitleResId", 0);
                bundle.putInt("argMessageResId", i);
                aoq.setArguments(bundle);
                aoq.show(getFragmentManager(), "voicemail_not_ready");
                return true;
            }
        } else if (id == aq.bM) {
            if (this.h.contains(view)) {
                a('0');
            }
            a(81);
            h();
            this.h.remove(view);
            return true;
        } else if (id != aq.ak) {
            return false;
        } else {
            this.b.setCursorVisible(true);
            return false;
        }
    }

    private final void a(char c) {
        int selectionStart = this.b.getSelectionStart();
        if (selectionStart > 0 && c == this.b.getText().charAt(selectionStart - 1)) {
            this.b.setSelection(selectionStart);
            this.b.getText().delete(selectionStart - 1, selectionStart);
        }
    }

    private final void b(boolean z) {
        ((DialtactsActivity) getActivity()).a(false, true);
    }

    private final void g() {
        boolean z = false;
        if (d()) {
            if (e().getPhoneType() == 2) {
                z = true;
            }
            if (z && i()) {
                Intent a = new arq("").a();
                a.putExtra("com.android.phone.extra.SEND_EMPTY_FLASH", true);
                startActivity(a);
                return;
            } else if (TextUtils.isEmpty(this.d)) {
                a(26, 150);
                return;
            } else {
                this.b.setText(this.d);
                this.b.setSelection(this.b.getText().length());
                return;
            }
        }
        String obj = this.b.getText().toString();
        if (obj == null || TextUtils.isEmpty(this.t) || !obj.matches(this.t)) {
            arq arq = new arq(obj);
            arq.a = 2;
            buf.d(getActivity(), arq.a());
            b(false);
            return;
        }
        if (getActivity() != null) {
            int i = cob.ca;
            DialogFragment aoq = new aoq();
            Bundle bundle = new Bundle();
            bundle.putInt("argTitleResId", 0);
            bundle.putInt("argMessageResId", i);
            aoq.setArguments(bundle);
            aoq.show(getFragmentManager(), "phone_prohibited_dialog");
        }
        a();
    }

    public final void a() {
        if (this.b != null) {
            this.b.getText().clear();
        }
    }

    private final void a(int i, int i2) {
        if (this.u) {
            int ringerMode = ((AudioManager) getActivity().getSystemService("audio")).getRingerMode();
            if (ringerMode != 0 && ringerMode != 1) {
                synchronized (this.g) {
                    if (this.o == null) {
                        Log.w("DialpadFragment", "playTone: mToneGenerator == null, tone: " + i);
                        return;
                    }
                    this.o.startTone(i, i2);
                }
            }
        }
    }

    private final void h() {
        if (this.u) {
            synchronized (this.g) {
                if (this.o == null) {
                    Log.w("DialpadFragment", "stopTone: mToneGenerator == null");
                    return;
                }
                this.o.stopTone();
            }
        }
    }

    public final void a(boolean z) {
        if (getActivity() == null || !f()) {
            return;
        }
        if (z) {
            if (this.a != null) {
                this.a.setVisibility(8);
            }
            this.q.a(false);
            this.r.setVisibility(0);
            if (this.s == null) {
                this.s = new aoo(getActivity());
            }
            this.r.setAdapter(this.s);
            return;
        }
        if (this.a != null) {
            this.a.setVisibility(0);
        } else {
            this.b.setVisibility(0);
        }
        this.q.a(true);
        this.r.setVisibility(8);
    }

    public final boolean b() {
        return this.r.getVisibility() == 0;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = ((aop) adapterView.getItemAtPosition(i)).c;
        if (i2 == 101) {
            c(true);
        } else if (i2 == 102) {
            c(false);
        } else if (i2 == 103) {
            a(false);
        } else {
            Log.w("DialpadFragment", "onItemClick: unexpected itemId: " + i2);
        }
    }

    private final void c(boolean z) {
        axk.a(getActivity(), z);
        getActivity().finish();
    }

    private final boolean i() {
        Context activity = getActivity();
        if (activity != null) {
            return axk.d(activity);
        }
        return false;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == aq.aB) {
            b(',');
            return true;
        } else if (itemId == aq.aD) {
            b(';');
            return true;
        } else if (itemId != aq.aG) {
            return false;
        } else {
            Activity activity = getActivity();
            String obj = this.b.getText().toString();
            CallSubjectDialog.a(activity, -1, null, null, obj, false, obj, null, null, null);
            b(false);
            return true;
        }
    }

    private final void b(char c) {
        Object obj = null;
        if (c == ';' || c == ',') {
            int selectionStart = this.b.getSelectionStart();
            int selectionEnd = this.b.getSelectionEnd();
            int min = Math.min(selectionStart, selectionEnd);
            selectionStart = Math.max(selectionStart, selectionEnd);
            if (min == -1) {
                selectionStart = this.b.length();
                min = selectionStart;
            }
            Object text = this.b.getText();
            if (c == ';' || c == ',') {
                if (min != -1 && selectionStart >= min && min <= text.length() && selectionStart <= text.length() && min != 0 && (c != ';' || (text.charAt(min - 1) != ';' && (text.length() <= selectionStart || text.charAt(selectionStart) != ';')))) {
                    obj = 1;
                }
                if (obj != null) {
                    text.replace(min, selectionStart, Character.toString(c));
                    if (min != selectionStart) {
                        this.b.setSelection(min + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Should not be called for anything other than PAUSE & WAIT");
        }
        throw new IllegalArgumentException("Not expected for anything other than PAUSE & WAIT");
    }

    public final void c() {
        if (getActivity() != null) {
            this.n.setEnabled(!d());
        }
    }

    private final boolean j() {
        try {
            PhoneAccountHandle a = axk.a(getActivity(), "voicemail");
            if (a != null) {
                CharSequence voiceMailNumber;
                Context activity = getActivity();
                if (axk.h(activity)) {
                    voiceMailNumber = axk.j(activity).getVoiceMailNumber(a);
                } else {
                    voiceMailNumber = null;
                }
                if (TextUtils.isEmpty(voiceMailNumber)) {
                    return false;
                }
                return true;
            } else if (TextUtils.isEmpty(e().getVoiceMailNumber())) {
                return false;
            } else {
                return true;
            }
        } catch (SecurityException e) {
            Log.w("DialpadFragment", "SecurityException is thrown. Maybe privilege isn't sufficient.");
            return false;
        }
    }

    public final boolean d() {
        return this.b.length() == 0;
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        DialtactsActivity dialtactsActivity = (DialtactsActivity) getActivity();
        DialpadView dialpadView = (DialpadView) getView().findViewById(aq.af);
        if (dialtactsActivity != null) {
            if (!(z || b())) {
                int i;
                if (this.f) {
                    dialpadView.a();
                }
                this.q.a(false);
                ajw ajw = this.q;
                if (this.f) {
                    i = this.k;
                } else {
                    i = 0;
                }
                ajw.a(i);
                avl.a(dialtactsActivity.g);
                if (dialtactsActivity.g.f) {
                    dialtactsActivity.g.getView().startAnimation(dialtactsActivity.k);
                } else {
                    ((DialpadSlidingRelativeLayout) dialtactsActivity.g.getView()).setYFraction(0.0f);
                }
                dialtactsActivity.h();
                this.b.requestFocus();
            }
            if (!z) {
                return;
            }
            if (this.f) {
                this.q.a();
            } else {
                this.q.a(false);
            }
        }
    }
}
