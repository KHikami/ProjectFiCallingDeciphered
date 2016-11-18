package defpackage;

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
    public String a;
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
    public String b;
    public String c;
    public Intent d;
    public agm e;
    public ahf f;
    public BroadcastReceiver g;
    public PhotoView h;
    public ImageView i;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (ahk) obj);
    }

    public static void a(Intent intent, int i, boolean z, ahg ahg) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", z);
        ahg.setArguments(bundle);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.e = d();
        if (this.e == null) {
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        }
        this.f = this.e.b();
        if (this.f == null) {
            throw new IllegalStateException("Callback reported null adapter");
        }
        u();
    }

    protected agm d() {
        return ((agy) getActivity()).h();
    }

    public void onDetach() {
        this.e = null;
        super.onDetach();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = (Intent) arguments.getParcelable("arg-intent");
            this.au = this.d.getBooleanExtra("display_thumbs_fullscreen", false);
            this.am = arguments.getInt("arg-position");
            this.ap = arguments.getBoolean("arg-show-spinner");
            this.aq = true;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT");
                if (bundle2 != null) {
                    this.d = new Intent().putExtras(bundle2);
                }
            }
            if (this.d != null) {
                this.a = this.d.getStringExtra("resolved_photo_uri");
                this.b = this.d.getStringExtra("thumbnail_uri");
                this.c = this.d.getStringExtra("content_description");
                this.ao = this.d.getBooleanExtra("watch_network", false);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(gwb.cJ, viewGroup, false);
        a(inflate);
        return inflate;
    }

    protected void a(View view) {
        this.h = (PhotoView) view.findViewById(gwb.cE);
        this.h.a(this.d.getFloatExtra("max_scale", 1.0f));
        this.h.setOnClickListener(this);
        this.h.a(this.an);
        this.h.b(false);
        this.h.setContentDescription(this.c);
        this.ar = view.findViewById(gwb.cC);
        this.i = (ImageView) view.findViewById(gwb.cD);
        this.as = false;
        this.al = new ahx((ProgressBar) view.findViewById(gwb.cw), (ProgressBar) view.findViewById(gwb.cy), true);
        this.aj = (TextView) view.findViewById(gwb.cx);
        this.ak = (ImageView) view.findViewById(gwb.cG);
        u();
    }

    public void onResume() {
        super.onResume();
        this.e.a(this.am, (ago) this);
        this.e.a((agn) this);
        if (this.ao) {
            if (this.g == null) {
                this.g = new ahh(this);
            }
            getActivity().registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getActivity().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.at = activeNetworkInfo.isConnected();
            } else {
                this.at = false;
            }
        }
        if (!s()) {
            this.aq = true;
            this.ar.setVisibility(0);
            getLoaderManager().a(2, null, this);
            getLoaderManager().a(3, null, this);
        }
    }

    public void onPause() {
        if (this.ao) {
            getActivity().unregisterReceiver(this.g);
        }
        this.e.b((agn) this);
        this.e.c(this.am);
        super.onPause();
    }

    public void onDestroyView() {
        if (this.h != null) {
            this.h.c();
            this.h = null;
        }
        super.onDestroyView();
    }

    public String e() {
        return this.a;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.d != null) {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", this.d.getExtras());
        }
    }

    public ig<ahk> onCreateLoader(int i, Bundle bundle) {
        String str = null;
        if (this.ap) {
            return null;
        }
        switch (i) {
            case 2:
                str = this.b;
                break;
            case 3:
                str = this.a;
                break;
        }
        return this.e.a(i, str);
    }

    public void a(ig<ahk> igVar, ahk ahk) {
        if (getView() != null && isAdded()) {
            Drawable a = ahk.a(getResources());
            switch (igVar.p()) {
                case 2:
                    if (!this.au) {
                        if (!s()) {
                            if (a == null) {
                                this.i.setImageResource(gwb.cv);
                                this.as = false;
                            } else {
                                this.i.setImageDrawable(a);
                                this.as = true;
                            }
                            this.i.setVisibility(0);
                            if (getResources().getBoolean(gwb.cp)) {
                                this.i.setScaleType(ScaleType.CENTER);
                            }
                            a(false);
                            break;
                        }
                        return;
                    }
                case 3:
                    a(ahk);
                    break;
            }
            if (!this.aq) {
                this.al.a(8);
            }
            u();
        }
    }

    private void a(ahk ahk) {
        if (ahk.c == 1) {
            this.aq = false;
            this.aj.setText(gwb.cK);
            this.aj.setVisibility(0);
            this.e.a(this, false);
            return;
        }
        this.aj.setVisibility(8);
        Drawable a = ahk.a(getResources());
        if (a != null) {
            if (this.h != null) {
                this.h.a(a);
            }
            a(true);
            this.ar.setVisibility(8);
            this.aq = false;
        }
        this.e.a(this, true);
    }

    public Drawable q() {
        return this.h != null ? this.h.d() : null;
    }

    public void a(boolean z) {
        this.h.b(z);
    }

    public void onLoaderReset(ig<ahk> igVar) {
    }

    public void onClick(View view) {
        this.e.a();
    }

    public void a() {
        u();
    }

    public void c() {
        r();
    }

    public void b() {
        if (!this.e.a((dr) this)) {
            r();
        } else if (!s()) {
            getLoaderManager().b(2, null, this);
        }
    }

    public void r() {
        if (this.h != null) {
            this.h.f();
        }
    }

    public boolean a(float f, float f2) {
        if (this.e.a((dr) this) && this.h != null && this.h.a()) {
            return true;
        }
        return false;
    }

    public boolean b(float f, float f2) {
        if (this.e.a((dr) this) && this.h != null && this.h.b()) {
            return true;
        }
        return false;
    }

    public boolean s() {
        return this.h != null && this.h.e();
    }

    private void u() {
        b(this.e == null ? false : this.e.b((dr) this));
    }

    public void b(boolean z) {
        this.an = z;
    }

    public void a(Cursor cursor) {
        if (this.f != null && cursor.moveToPosition(this.am) && !s()) {
            ahj ahj;
            fg loaderManager = getLoaderManager();
            ig b = loaderManager.b(3);
            if (b != null) {
                ahj = (ahj) b;
                this.a = this.f.b(cursor);
                ahj.a(this.a);
                ahj.v();
            }
            if (!this.as) {
                b = loaderManager.b(2);
                if (b != null) {
                    ahj = (ahj) b;
                    this.b = this.f.c(cursor);
                    ahj.a(this.b);
                    ahj.v();
                }
            }
        }
    }

    public int t() {
        return this.am;
    }
}
