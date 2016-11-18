package p000;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ex.photo.views.PhotoView;

public class ahg extends dr implements agn, ago, OnClickListener, fh<ahk> {
    public String f764a;
    public TextView aj;
    public ImageView ak;
    public ahx al;
    public int am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public boolean aq = true;
    public View ar;
    public boolean as;
    public boolean at;
    public boolean au;
    public String f765b;
    public String f766c;
    public Intent f767d;
    public agm f768e;
    public ahf f769f;
    public BroadcastReceiver f770g;
    public PhotoView f771h;
    public ImageView f772i;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        mo1093a(igVar, (ahk) obj);
    }

    public static void m1252a(Intent intent, int i, boolean z, ahg ahg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", z);
        ahg.setArguments(bundle);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f768e = m1264d();
        if (this.f768e == null) {
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        }
        this.f769f = this.f768e.mo178b();
        if (this.f769f == null) {
            throw new IllegalStateException("Callback reported null adapter");
        }
        m1253u();
    }

    protected agm m1264d() {
        return ((agy) getActivity()).mo160h();
    }

    public void onDetach() {
        this.f768e = null;
        super.onDetach();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f767d = (Intent) arguments.getParcelable("arg-intent");
            this.au = this.f767d.getBooleanExtra("display_thumbs_fullscreen", false);
            this.am = arguments.getInt("arg-position");
            this.ap = arguments.getBoolean("arg-show-spinner");
            this.aq = true;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT");
                if (bundle2 != null) {
                    this.f767d = new Intent().putExtras(bundle2);
                }
            }
            if (this.f767d != null) {
                this.f764a = this.f767d.getStringExtra("resolved_photo_uri");
                this.f765b = this.f767d.getStringExtra("thumbnail_uri");
                this.f766c = this.f767d.getStringExtra("content_description");
                this.ao = this.f767d.getBooleanExtra("watch_network", false);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.cJ, viewGroup, false);
        m1256a(inflate);
        return inflate;
    }

    protected void m1256a(View view) {
        this.f771h = (PhotoView) view.findViewById(gwb.cE);
        this.f771h.m8200a(this.f767d.getFloatExtra("max_scale", 1.0f));
        this.f771h.setOnClickListener(this);
        this.f771h.m8203a(this.an);
        this.f771h.m8205b(false);
        this.f771h.setContentDescription(this.f766c);
        this.ar = view.findViewById(gwb.cC);
        this.f772i = (ImageView) view.findViewById(gwb.cD);
        this.as = false;
        this.al = new ahx((ProgressBar) view.findViewById(gwb.cw), (ProgressBar) view.findViewById(gwb.cy), true);
        this.aj = (TextView) view.findViewById(gwb.cx);
        this.ak = (ImageView) view.findViewById(gwb.cG);
        m1253u();
    }

    public void onResume() {
        super.onResume();
        this.f768e.mo174a(this.am, (ago) this);
        this.f768e.mo175a((agn) this);
        if (this.ao) {
            if (this.f770g == null) {
                this.f770g = new ahh(this);
            }
            getActivity().registerReceiver(this.f770g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getActivity().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.at = activeNetworkInfo.isConnected();
            } else {
                this.at = false;
            }
        }
        if (!m1268s()) {
            this.aq = true;
            this.ar.setVisibility(0);
            getLoaderManager().mo1994a(2, null, this);
            getLoaderManager().mo1994a(3, null, this);
        }
    }

    public void onPause() {
        if (this.ao) {
            getActivity().unregisterReceiver(this.f770g);
        }
        this.f768e.mo179b((agn) this);
        this.f768e.mo181c(this.am);
        super.onPause();
    }

    public void onDestroyView() {
        if (this.f771h != null) {
            this.f771h.m8207c();
            this.f771h = null;
        }
        super.onDestroyView();
    }

    public String m1265e() {
        return this.f764a;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f767d != null) {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", this.f767d.getExtras());
        }
    }

    public ig<ahk> onCreateLoader(int i, Bundle bundle) {
        String str = null;
        if (this.ap) {
            return null;
        }
        switch (i) {
            case 2:
                str = this.f765b;
                break;
            case 3:
                str = this.f764a;
                break;
        }
        return this.f768e.mo172a(i, str);
    }

    public void mo1093a(ig<ahk> igVar, ahk ahk) {
        if (getView() != null && isAdded()) {
            Drawable a = ahk.m1322a(getResources());
            switch (igVar.m1287p()) {
                case 2:
                    if (!this.au) {
                        if (!m1268s()) {
                            if (a == null) {
                                this.f772i.setImageResource(gwb.cv);
                                this.as = false;
                            } else {
                                this.f772i.setImageDrawable(a);
                                this.as = true;
                            }
                            this.f772i.setVisibility(0);
                            if (getResources().getBoolean(gwb.cp)) {
                                this.f772i.setScaleType(ScaleType.CENTER);
                            }
                            m1258a(false);
                            break;
                        }
                        return;
                    }
                case 3:
                    m1251a(ahk);
                    break;
            }
            if (!this.aq) {
                this.al.m1361a(8);
            }
            m1253u();
        }
    }

    private void m1251a(ahk ahk) {
        if (ahk.f793c == 1) {
            this.aq = false;
            this.aj.setText(gwb.cK);
            this.aj.setVisibility(0);
            this.f768e.mo176a(this, false);
            return;
        }
        this.aj.setVisibility(8);
        Drawable a = ahk.m1322a(getResources());
        if (a != null) {
            if (this.f771h != null) {
                this.f771h.m8202a(a);
            }
            m1258a(true);
            this.ar.setVisibility(8);
            this.aq = false;
        }
        this.f768e.mo176a(this, true);
    }

    public Drawable m1266q() {
        return this.f771h != null ? this.f771h.m8208d() : null;
    }

    public void m1258a(boolean z) {
        this.f771h.m8205b(z);
    }

    public void onLoaderReset(ig<ahk> igVar) {
    }

    public void onClick(View view) {
        this.f768e.mo173a();
    }

    public void mo193a() {
        m1253u();
    }

    public void mo198c() {
        m1267r();
    }

    public void mo196b() {
        if (!this.f768e.mo177a((dr) this)) {
            m1267r();
        } else if (!m1268s()) {
            getLoaderManager().mo1998b(2, null, this);
        }
    }

    public void m1267r() {
        if (this.f771h != null) {
            this.f771h.m8210f();
        }
    }

    public boolean mo195a(float f, float f2) {
        if (this.f768e.mo177a((dr) this) && this.f771h != null && this.f771h.m8204a()) {
            return true;
        }
        return false;
    }

    public boolean mo197b(float f, float f2) {
        if (this.f768e.mo177a((dr) this) && this.f771h != null && this.f771h.m8206b()) {
            return true;
        }
        return false;
    }

    public boolean m1268s() {
        return this.f771h != null && this.f771h.m8209e();
    }

    private void m1253u() {
        m1261b(this.f768e == null ? false : this.f768e.mo180b((dr) this));
    }

    public void m1261b(boolean z) {
        this.an = z;
    }

    public void mo194a(Cursor cursor) {
        if (this.f769f != null && cursor.moveToPosition(this.am) && !m1268s()) {
            ahj ahj;
            fg loaderManager = getLoaderManager();
            ig b = loaderManager.mo1997b(3);
            if (b != null) {
                ahj = (ahj) b;
                this.f764a = this.f769f.m1220b(cursor);
                ahj.mo211a(this.f764a);
                ahj.m1310v();
            }
            if (!this.as) {
                b = loaderManager.mo1997b(2);
                if (b != null) {
                    ahj = (ahj) b;
                    this.f765b = this.f769f.m1221c(cursor);
                    ahj.mo211a(this.f765b);
                    ahj.m1310v();
                }
            }
        }
    }

    public int m1269t() {
        return this.am;
    }
}
