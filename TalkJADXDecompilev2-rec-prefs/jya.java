package p000;

import android.animation.Animator;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class jya extends dq {
    public View aj;
    public Animator ak;
    public boolean al;

    public static jya m25402a(String str, String str2, String str3, boolean z, boolean z2, dr drVar) {
        Bundle bundle = new Bundle();
        if (null != null) {
            bundle.putString("title", null);
        }
        bundle.putString("message", str2);
        if (str3 != null) {
            bundle.putString("submessage", str3);
        }
        bundle.putBoolean("is_animated", true);
        jya jya = new jya();
        jya.setArguments(bundle);
        jya.m7008b(false);
        jya.setTargetFragment(drVar, 0);
        return jya;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m25404r()) {
            m7003a(1, m7011d());
        }
    }

    public Dialog mo792a(Bundle bundle) {
        Bundle arguments = getArguments();
        if (m25404r()) {
            return super.mo792a(bundle);
        }
        Dialog progressDialog = new ProgressDialog(getActivity());
        if (arguments.containsKey("title")) {
            progressDialog.setTitle(arguments.getString("title"));
        }
        progressDialog.setMessage(arguments.getString("message"));
        progressDialog.setCanceledOnTouchOutside(m7012e());
        progressDialog.setProgressStyle(0);
        return progressDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!m25404r()) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        this.aj = layoutInflater.inflate(gwb.zS, viewGroup, false);
        TextView textView = (TextView) this.aj.findViewById(bc.vu);
        CharSequence string = getArguments().getString("message");
        textView.setText(string);
        textView.setContentDescription(string);
        textView = (TextView) this.aj.findViewById(bc.vv);
        string = getArguments().getString("submessage");
        if (!TextUtils.isEmpty(string)) {
            textView.setText(string);
            textView.setContentDescription(string);
            textView.setVisibility(0);
        }
        m25403q();
        return this.aj;
    }

    public void onResume() {
        super.onResume();
        this.al = false;
        if (this.ak != null && !this.ak.isStarted()) {
            m25403q();
        }
    }

    public void onPause() {
        super.onPause();
        this.al = true;
        if (this.ak != null && this.ak.isStarted()) {
            this.ak.cancel();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (getTargetFragment() instanceof jyc) {
            getArguments();
        }
    }

    public void mo2341a(ed edVar, String str) {
        try {
            super.mo2341a(edVar, str);
        } catch (IllegalStateException e) {
        }
    }

    private void m25403q() {
        if (this.ak == null) {
            lo loVar = new lo(3);
            loVar.put("LEFT 1", this.aj.findViewById(bc.vr));
            loVar.put("CENTER 1", this.aj.findViewById(bc.vs));
            loVar.put("RIGHT 1", this.aj.findViewById(bc.vt));
            if (jfq.f19970a == null) {
                jfq.f19970a = new jfq();
            }
            this.ak = jfq.f19970a.m24104a(getActivity(), gwb.zU, loVar);
            this.ak.addListener(new jyb(this));
        }
        if (this.ak.isStarted()) {
            this.ak.cancel();
        }
        this.ak.start();
    }

    private boolean m25404r() {
        return gwb.aH() && getArguments().getBoolean("is_animated");
    }
}
