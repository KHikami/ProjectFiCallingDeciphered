package defpackage;

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

    public static jya a(String str, String str2, String str3, boolean z, boolean z2, dr drVar) {
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
        jya.b(false);
        jya.setTargetFragment(drVar, 0);
        return jya;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (r()) {
            a(1, d());
        }
    }

    public Dialog a(Bundle bundle) {
        Bundle arguments = getArguments();
        if (r()) {
            return super.a(bundle);
        }
        Dialog progressDialog = new ProgressDialog(getActivity());
        if (arguments.containsKey("title")) {
            progressDialog.setTitle(arguments.getString("title"));
        }
        progressDialog.setMessage(arguments.getString("message"));
        progressDialog.setCanceledOnTouchOutside(e());
        progressDialog.setProgressStyle(0);
        return progressDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!r()) {
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
        q();
        return this.aj;
    }

    public void onResume() {
        super.onResume();
        this.al = false;
        if (this.ak != null && !this.ak.isStarted()) {
            q();
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

    public void a(ed edVar, String str) {
        try {
            super.a(edVar, str);
        } catch (IllegalStateException e) {
        }
    }

    private void q() {
        if (this.ak == null) {
            lo loVar = new lo(3);
            loVar.put("LEFT 1", this.aj.findViewById(bc.vr));
            loVar.put("CENTER 1", this.aj.findViewById(bc.vs));
            loVar.put("RIGHT 1", this.aj.findViewById(bc.vt));
            if (jfq.a == null) {
                jfq.a = new jfq();
            }
            this.ak = jfq.a.a(getActivity(), gwb.zU, loVar);
            this.ak.addListener(new jyb(this));
        }
        if (this.ak.isStarted()) {
            this.ak.cancel();
        }
        this.ak.start();
    }

    private boolean r() {
        return gwb.aH() && getArguments().getBoolean("is_animated");
    }
}
