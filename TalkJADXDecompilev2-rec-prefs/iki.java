package p000;

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
    final /* synthetic */ ikh f17878a;
    private final Context f17879b;
    private final int f17880c;
    private final int f17881d;
    private final long f17882e;
    private final String f17883f;
    private itf f17884g;
    private String f17885h;
    private String f17886i;
    private boolean f17887j;
    private boolean f17888k;
    private int f17889l;
    private int f17890m;
    private String f17891n;
    private String f17892o;
    private String f17893p;

    iki(ikh ikh, Context context, int i, int i2, long j, String str) {
        this.f17878a = ikh;
        this.f17879b = context;
        this.f17880c = i;
        this.f17881d = i2;
        this.f17882e = j;
        this.f17883f = str;
    }

    public iki m22174a(itf itf) {
        this.f17884g = itf;
        return this;
    }

    public iki m22175a(String str) {
        this.f17885h = str;
        return this;
    }

    public iki m22180b(String str) {
        this.f17886i = str;
        return this;
    }

    public iki m22177a(boolean z) {
        this.f17888k = true;
        return this;
    }

    public iki m22178a(boolean z, int i, int i2) {
        this.f17887j = z;
        this.f17889l = i;
        this.f17890m = i2;
        return this;
    }

    public iki m22176a(String str, String str2, String str3) {
        this.f17891n = str;
        this.f17892o = str2;
        this.f17893p = str3;
        return this;
    }

    public List<mav> m22179a() {
        iil.m21867a();
        List<mav> arrayList = new ArrayList();
        if ((!this.f17888k || this.f17887j) && this.f17878a.f17869a.mo2234c() != null) {
            boolean z;
            iil.m21879b("Expected condition to be false", this.f17878a.f17870b.isEmpty());
            if (this.f17878a.f17870b.size() <= 2) {
                z = true;
            } else {
                z = false;
            }
            iil.m21874a("Expected condition to be true", z);
            for (String c : this.f17878a.f17870b.keySet()) {
                arrayList.add(m22173c(c));
            }
            return arrayList;
        }
        arrayList.add(m22173c(null));
        return arrayList;
    }

    private mav m22173c(String str) {
        llg llg;
        String str2;
        int i = 219;
        mav mav = new mav();
        mav.f27161d = this.f17883f;
        mav.f27173p = Integer.valueOf(59);
        mav.f27167j = m22171b();
        lkw lkw = new lkw();
        lkw.f25281f = Integer.valueOf(this.f17880c);
        lkw.f25282g = Long.valueOf(this.f17882e);
        if (!this.f17887j) {
            if (this.f17889l >= 10000) {
                switch (this.f17889l) {
                    case 10000:
                        iil.m21870a("endCause is not set");
                        i = -1;
                        break;
                    case 10001:
                        i = HttpStatusCodes.STATUS_CODE_FOUND;
                        break;
                    case 10002:
                        if (this.f17884g == null || this.f17884g.m23177h() != null || this.f17884g.m23181j() != null) {
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
                        lkw.f25283h = this.f17893p;
                        break;
                    default:
                        iil.m21870a("startupEntry unexpected endCause: " + this.f17889l);
                        i = -1;
                        break;
                }
            }
            i = this.f17889l;
        } else {
            i = 0;
        }
        if (i != -1) {
            lkw.f25276a = Integer.valueOf(i);
        }
        lli lli = new lli();
        if (this.f17884g != null) {
            if (this.f17884g.m23177h() != null) {
                lli.f25339a = this.f17884g.m23177h();
                lli.f25340b = this.f17884g.m23179i();
            } else if (this.f17884g.m23181j() != null) {
                lli.f25342d = this.f17884g.m23181j();
                lli.f25343e = this.f17884g.m23183k();
            } else {
                lli.f25344f = this.f17884g.m23173f();
            }
        }
        lli.f25345g = Integer.valueOf(this.f17881d);
        lkw.f25277b = lli;
        if (this.f17886i != null) {
            lkw.f25279d = gwb.m1451T(this.f17886i);
        }
        if (this.f17881d != 1) {
            llg = null;
        } else if (this.f17878a.f17872d == 0 && this.f17891n == null && this.f17892o == null) {
            llg = null;
        } else {
            llg = new llg();
            if (this.f17878a.f17872d != 0) {
                llg.f25335c = Integer.valueOf(this.f17878a.f17872d);
            }
            if (this.f17891n != null) {
                llg.f25333a = new llh();
                llg.f25333a.f25336a = this.f17891n;
            }
            if (this.f17892o != null) {
                llg.f25334b = new llh();
                llg.f25334b.f25336a = this.f17892o;
            }
        }
        lkw.f25278c = llg;
        mav.f27168k = lkw;
        mav.f27160c = this.f17878a.f17869a.mo2233b();
        if (this.f17885h != null) {
            mav.f27158a = this.f17885h;
        }
        if (this.f17886i != null) {
            mav.f27159b = this.f17878a.f17869a.mo2235d();
            String T = gwb.m1451T(this.f17886i);
            mav.f27162e = gwb.m1454U(this.f17886i);
            str2 = T;
        } else {
            str2 = null;
        }
        if (!(str == null || this.f17889l == 10000)) {
            int d;
            boolean z;
            iil.m21875b("Expected non-null", (Object) str);
            lko lko = new lko();
            lko.f25158a = str;
            this.f17878a.m22168d();
            if (this.f17887j) {
                d = ikh.m22151d(this.f17889l);
            } else {
                d = 72;
            }
            Object obj = (ikk) this.f17878a.f17870b.get(str);
            iil.m21875b("Expected non-null", obj);
            if (!obj.f17894a) {
                iil.m21879b("Expected condition to be false", obj.f17894a);
                obj.f17894a = true;
                obj.f17895b = d;
                obj.f17896c = (long) ((int) ((SystemClock.elapsedRealtime() - obj.f17898e) / 1000));
            }
            iin iin = this.f17878a.f17871c;
            iil.m21874a("Expected condition to be true", obj.f17894a);
            lko.f25159b = obj.f17897d;
            lko.f25169l = Integer.valueOf(obj.f17895b);
            if (obj.f17896c != -1) {
                z = true;
            } else {
                z = false;
            }
            iil.m21874a("Expected condition to be true", z);
            lko.f25160c = Integer.valueOf((int) obj.f17896c);
            if (obj.f17900g > 0) {
                lko.f25162e = Long.valueOf(obj.f17900g - obj.f17898e);
                if (obj.f17899f > 0) {
                    lko.f25163f = Long.valueOf(obj.f17899f - obj.f17900g);
                }
            }
            obj.m22182a();
            iin a = ikk.m22181a(iin, obj.f17901h);
            iil.m21875b("Expected non-null", (Object) a);
            List a2 = ikh.m22148a(a);
            lko.f25166i = (lkq[]) a2.toArray(new lkq[a2.size()]);
            if (this.f17878a.f17874f != 0) {
                lko.f25161d = Integer.valueOf(this.f17878a.f17874f);
            }
            lko.f25164g = str2;
            lko.f25168k = Integer.valueOf(this.f17890m);
            if (this.f17893p != null) {
                lko.f25170m = this.f17893p;
            }
            mav.f27163f = lko;
        }
        if (this.f17878a.f17875g != 0) {
            if (this.f17878a.f17873e == null) {
                this.f17878a.f17873e = new lld();
            }
            this.f17878a.f17873e.f25320b = Integer.valueOf(this.f17878a.f17875g);
        }
        if (this.f17878a.f17873e != null) {
            mav.f27170m = this.f17878a.f17873e;
        }
        mav.f27177t = Long.valueOf(System.currentTimeMillis());
        return mav;
    }

    private static int m22169a(iud iud) {
        int max = Math.max(iud.m23302a().f19032a, iud.m23302a().f19033b);
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

    private llm m22170a(int i, int i2) {
        llm llm = new llm();
        if (iks.m22205c(i2) == null) {
            return null;
        }
        llm.f25378a = Integer.valueOf(i);
        llm.f25379b = Integer.valueOf(iki.m22169a(iks.m22202a(i2)));
        llm.f25381d = Integer.valueOf(iki.m22169a(iks.m22205c(i2)));
        return llm;
    }

    private llj m22171b() {
        int c;
        llj llj = new llj();
        llj.f25351f = Integer.valueOf(ikp.f17925b);
        ikp ikp = ikp.f17924a;
        if (ikp != null) {
            c = ikp.m22195c();
            if (c >= 0) {
                llj.f25352g = Integer.valueOf(c / 1000);
            }
        }
        llj.f25346a = "android";
        llj.f25359n = VERSION.RELEASE;
        llj.f25366u = m22172c();
        try {
            llj.f25367v = this.f17879b.getPackageManager().getPackageInfo(this.f17879b.getPackageName(), 0).versionName;
            llj.f25364s = String.format("%s/%s", new Object[]{Build.DEVICE, Build.MODEL});
            lll lll = new lll();
            int a = imx.m22316a(this.f17879b, true);
            if ((a & 1) != 0) {
                c = 1;
            } else {
                c = 0;
            }
            if ((a & 2) != 0) {
                c |= 2;
            }
            lll.f25375b = Integer.valueOf(c);
            a = imx.m22316a(this.f17879b, false);
            if ((a & 1) != 0) {
                c = 1;
            } else {
                c = 0;
            }
            if ((a & 2) != 0) {
                c |= 2;
            }
            lll.f25374a = Integer.valueOf(c);
            new iko().m22189a(this.f17879b);
            List arrayList = new ArrayList();
            arrayList.add(m22170a(1, 0));
            llm a2 = m22170a(2, 1);
            if (a2 != null) {
                arrayList.add(a2);
            }
            lll.f25376c = (llm[]) arrayList.toArray(new llm[arrayList.size()]);
            llj.f25368w = lll;
            return llj;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private llk m22172c() {
        int i;
        Throwable e;
        int i2 = 0;
        llk llk = new llk();
        llk.f25369a = Boolean.valueOf(((TelephonyManager) this.f17879b.getSystemService("phone")).getPhoneType() != 0);
        WindowManager windowManager = (WindowManager) this.f17879b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        llk.f25370b = Integer.valueOf((int) (f * 25.4f));
        llk.f25371c = Integer.valueOf((int) (f2 * 25.4f));
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
            itx.m23281a("vclib", "Unable to read camera info", e);
            llk.f25372d = Integer.valueOf(i2);
            llk.f25373e = Integer.valueOf(i);
            return llk;
        }
        llk.f25372d = Integer.valueOf(i2);
        llk.f25373e = Integer.valueOf(i);
        return llk;
    }
}
