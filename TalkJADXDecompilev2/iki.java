package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.List;

public final class iki {
    final /* synthetic */ ikh a;
    private final Context b;
    private final int c;
    private final int d;
    private final long e;
    private final String f;
    private itf g;
    private String h;
    private String i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private String n;
    private String o;
    private String p;

    iki(ikh ikh, Context context, int i, int i2, long j, String str) {
        this.a = ikh;
        this.b = context;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = str;
    }

    public iki a(itf itf) {
        this.g = itf;
        return this;
    }

    public iki a(String str) {
        this.h = str;
        return this;
    }

    public iki b(String str) {
        this.i = str;
        return this;
    }

    public iki a(boolean z) {
        this.k = true;
        return this;
    }

    public iki a(boolean z, int i, int i2) {
        this.j = z;
        this.l = i;
        this.m = i2;
        return this;
    }

    public iki a(String str, String str2, String str3) {
        this.n = str;
        this.o = str2;
        this.p = str3;
        return this;
    }

    public List<mav> a() {
        iil.a();
        List<mav> arrayList = new ArrayList();
        if ((!this.k || this.j) && this.a.a.c() != null) {
            boolean z;
            iil.b("Expected condition to be false", this.a.b.isEmpty());
            if (this.a.b.size() <= 2) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            for (String c : this.a.b.keySet()) {
                arrayList.add(c(c));
            }
            return arrayList;
        }
        arrayList.add(c(null));
        return arrayList;
    }

    private mav c(String str) {
        llg llg;
        String str2;
        int i = 219;
        mav mav = new mav();
        mav.d = this.f;
        mav.p = Integer.valueOf(59);
        mav.j = b();
        lkw lkw = new lkw();
        lkw.f = Integer.valueOf(this.c);
        lkw.g = Long.valueOf(this.e);
        if (!this.j) {
            if (this.l >= 10000) {
                switch (this.l) {
                    case 10000:
                        iil.a("endCause is not set");
                        i = -1;
                        break;
                    case 10001:
                        i = HttpStatusCodes.STATUS_CODE_FOUND;
                        break;
                    case 10002:
                        if (this.g == null || this.g.h() != null || this.g.j() != null) {
                            i = 306;
                            break;
                        }
                        i = 217;
                        break;
                    case 10003:
                        i = HttpStatusCodes.STATUS_CODE_NOT_MODIFIED;
                        break;
                    case 10004:
                        i = 308;
                        break;
                    case 10005:
                        i = 309;
                        break;
                    case 10006:
                        i = 310;
                        break;
                    case 10007:
                        i = 312;
                        break;
                    case 10008:
                        i = 313;
                        break;
                    case 10009:
                        i = 314;
                        break;
                    case 10011:
                        i = 316;
                        break;
                    case 10012:
                        i = 201;
                        break;
                    case 10013:
                        i = 202;
                        break;
                    case 10014:
                        i = 216;
                        break;
                    case 10015:
                        i = HttpStatusCodes.STATUS_CODE_TEMPORARY_REDIRECT;
                        break;
                    case 10016:
                        i = HttpStatusCodes.STATUS_CODE_SEE_OTHER;
                        break;
                    case 10017:
                        i = 212;
                        break;
                    case 10018:
                        i = 209;
                        break;
                    case 10019:
                    case 10026:
                        i = 218;
                        break;
                    case 10020:
                        i = 206;
                        break;
                    case 10021:
                    case 10022:
                    case 10023:
                    case 11003:
                        i = 305;
                        break;
                    case 10028:
                        i = 223;
                        break;
                    case 10030:
                    case 11004:
                    case 11007:
                    case 11009:
                    case 11013:
                        break;
                    case 11000:
                        i = HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES;
                        break;
                    case 11001:
                        i = 210;
                        break;
                    case 11002:
                        i = 208;
                        break;
                    case 11005:
                        i = 229;
                        break;
                    case 11006:
                        i = 230;
                        break;
                    case 11010:
                        i = 102;
                        break;
                    case 11011:
                        i = 100;
                        break;
                    case 11015:
                    case 11018:
                        i = 317;
                        break;
                    case 11016:
                        i = 318;
                        break;
                    case 11017:
                        i = 319;
                        lkw.h = this.p;
                        break;
                    default:
                        iil.a("startupEntry unexpected endCause: " + this.l);
                        i = -1;
                        break;
                }
            }
            i = this.l;
        } else {
            i = 0;
        }
        if (i != -1) {
            lkw.a = Integer.valueOf(i);
        }
        lli lli = new lli();
        if (this.g != null) {
            if (this.g.h() != null) {
                lli.a = this.g.h();
                lli.b = this.g.i();
            } else if (this.g.j() != null) {
                lli.d = this.g.j();
                lli.e = this.g.k();
            } else {
                lli.f = this.g.f();
            }
        }
        lli.g = Integer.valueOf(this.d);
        lkw.b = lli;
        if (this.i != null) {
            lkw.d = gwb.T(this.i);
        }
        if (this.d != 1) {
            llg = null;
        } else if (this.a.d == 0 && this.n == null && this.o == null) {
            llg = null;
        } else {
            llg = new llg();
            if (this.a.d != 0) {
                llg.c = Integer.valueOf(this.a.d);
            }
            if (this.n != null) {
                llg.a = new llh();
                llg.a.a = this.n;
            }
            if (this.o != null) {
                llg.b = new llh();
                llg.b.a = this.o;
            }
        }
        lkw.c = llg;
        mav.k = lkw;
        mav.c = this.a.a.b();
        if (this.h != null) {
            mav.a = this.h;
        }
        if (this.i != null) {
            mav.b = this.a.a.d();
            String T = gwb.T(this.i);
            mav.e = gwb.U(this.i);
            str2 = T;
        } else {
            str2 = null;
        }
        if (!(str == null || this.l == 10000)) {
            int d;
            boolean z;
            iil.b("Expected non-null", (Object) str);
            lko lko = new lko();
            lko.a = str;
            this.a.d();
            if (this.j) {
                d = ikh.d(this.l);
            } else {
                d = 72;
            }
            Object obj = (ikk) this.a.b.get(str);
            iil.b("Expected non-null", obj);
            if (!obj.a) {
                iil.b("Expected condition to be false", obj.a);
                obj.a = true;
                obj.b = d;
                obj.c = (long) ((int) ((SystemClock.elapsedRealtime() - obj.e) / 1000));
            }
            iin iin = this.a.c;
            iil.a("Expected condition to be true", obj.a);
            lko.b = obj.d;
            lko.l = Integer.valueOf(obj.b);
            if (obj.c != -1) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            lko.c = Integer.valueOf((int) obj.c);
            if (obj.g > 0) {
                lko.e = Long.valueOf(obj.g - obj.e);
                if (obj.f > 0) {
                    lko.f = Long.valueOf(obj.f - obj.g);
                }
            }
            obj.a();
            iin a = ikk.a(iin, obj.h);
            iil.b("Expected non-null", (Object) a);
            List a2 = ikh.a(a);
            lko.i = (lkq[]) a2.toArray(new lkq[a2.size()]);
            if (this.a.f != 0) {
                lko.d = Integer.valueOf(this.a.f);
            }
            lko.g = str2;
            lko.k = Integer.valueOf(this.m);
            if (this.p != null) {
                lko.m = this.p;
            }
            mav.f = lko;
        }
        if (this.a.g != 0) {
            if (this.a.e == null) {
                this.a.e = new lld();
            }
            this.a.e.b = Integer.valueOf(this.a.g);
        }
        if (this.a.e != null) {
            mav.m = this.a.e;
        }
        mav.t = Long.valueOf(System.currentTimeMillis());
        return mav;
    }

    private static int a(iud iud) {
        int max = Math.max(iud.a().a, iud.a().b);
        if (max > 1920) {
            return 6;
        }
        if (max > 1280) {
            return 5;
        }
        if (max > 960) {
            return 4;
        }
        if (max > 640) {
            return 3;
        }
        if (max > 320) {
            return 2;
        }
        return 1;
    }

    private llm a(int i, int i2) {
        llm llm = new llm();
        if (iks.c(i2) == null) {
            return null;
        }
        llm.a = Integer.valueOf(i);
        llm.b = Integer.valueOf(iki.a(iks.a(i2)));
        llm.d = Integer.valueOf(iki.a(iks.c(i2)));
        return llm;
    }

    private llj b() {
        int c;
        llj llj = new llj();
        llj.f = Integer.valueOf(ikp.b);
        ikp ikp = ikp.a;
        if (ikp != null) {
            c = ikp.c();
            if (c >= 0) {
                llj.g = Integer.valueOf(c / 1000);
            }
        }
        llj.a = "android";
        llj.n = VERSION.RELEASE;
        llj.u = c();
        try {
            llj.v = this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionName;
            llj.s = String.format("%s/%s", new Object[]{Build.DEVICE, Build.MODEL});
            lll lll = new lll();
            int a = imx.a(this.b, true);
            if ((a & 1) != 0) {
                c = 1;
            } else {
                c = 0;
            }
            if ((a & 2) != 0) {
                c |= 2;
            }
            lll.b = Integer.valueOf(c);
            a = imx.a(this.b, false);
            if ((a & 1) != 0) {
                c = 1;
            } else {
                c = 0;
            }
            if ((a & 2) != 0) {
                c |= 2;
            }
            lll.a = Integer.valueOf(c);
            new iko().a(this.b);
            List arrayList = new ArrayList();
            arrayList.add(a(1, 0));
            llm a2 = a(2, 1);
            if (a2 != null) {
                arrayList.add(a2);
            }
            lll.c = (llm[]) arrayList.toArray(new llm[arrayList.size()]);
            llj.w = lll;
            return llj;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private llk c() {
        int i;
        Throwable e;
        int i2 = 0;
        llk llk = new llk();
        llk.a = Boolean.valueOf(((TelephonyManager) this.b.getSystemService("phone")).getPhoneType() != 0);
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        llk.b = Integer.valueOf((int) (f * 25.4f));
        llk.c = Integer.valueOf((int) (f2 * 25.4f));
        try {
            CameraInfo cameraInfo = new CameraInfo();
            int numberOfCameras = Camera.getNumberOfCameras();
            int i3 = 0;
            i = 0;
            while (i3 < numberOfCameras) {
                try {
                    Camera.getCameraInfo(i3, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        i2++;
                    } else {
                        i++;
                    }
                    i3++;
                } catch (RuntimeException e2) {
                    e = e2;
                }
            }
        } catch (Throwable e3) {
            e = e3;
            i = 0;
            itx.a("vclib", "Unable to read camera info", e);
            llk.d = Integer.valueOf(i2);
            llk.e = Integer.valueOf(i);
            return llk;
        }
        llk.d = Integer.valueOf(i2);
        llk.e = Integer.valueOf(i);
        return llk;
    }
}
