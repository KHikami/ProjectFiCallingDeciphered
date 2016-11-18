package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ami implements ComponentCallbacks2 {
    private static volatile ami f1283a;
    private final apw f1284b;
    private final ard f1285c;
    private final ase f1286d;
    private final ast f1287e;
    private final amk f1288f;
    private final amr f1289g;
    private final aqy f1290h;
    private final ayj f1291i;
    private final List<amu> f1292j = new ArrayList();

    public static ami m2900a(Context context) {
        if (f1283a == null) {
            synchronized (ami.class) {
                if (f1283a == null) {
                    Context applicationContext = context.getApplicationContext();
                    List<ayx> a = new ayy(applicationContext).m4389a();
                    amj amj = new amj(applicationContext);
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    f1283a = amj.m2913a();
                    for (ayx a2 : a) {
                        a2.mo1310a(f1283a.f1289g);
                    }
                }
            }
        }
        return f1283a;
    }

    ami(Context context, apw apw, ase ase, ard ard, aqy aqy, ayj ayj, int i, azl azl) {
        this.f1284b = apw;
        this.f1285c = ard;
        this.f1290h = aqy;
        this.f1286d = ase;
        this.f1291i = ayj;
        this.f1287e = new ast(ase, ard, (anr) azl.f2602p.m3528a(awn.f2436a));
        Resources resources = context.getResources();
        awn awn = new awn(resources.getDisplayMetrics(), ard, aqy);
        aoa axl = new axl(context, ard, aqy);
        this.f1289g = new amr().m2942a(ByteBuffer.class, new atf()).m2942a(InputStream.class, new auw(aqy)).m2944a(ByteBuffer.class, Bitmap.class, new awb(awn)).m2944a(InputStream.class, Bitmap.class, new awy(awn, aqy)).m2944a(ParcelFileDescriptor.class, Bitmap.class, new axc(ard)).m2943a(Bitmap.class, new avy()).m2944a(ByteBuffer.class, BitmapDrawable.class, new avv(resources, ard, new awb(awn))).m2944a(InputStream.class, BitmapDrawable.class, new avv(resources, ard, new awy(awn, aqy))).m2944a(ParcelFileDescriptor.class, BitmapDrawable.class, new avv(resources, ard, new axc(ard))).m2943a(BitmapDrawable.class, new avw(ard, new avy())).m2950b(InputStream.class, axo.class, new axy(axl, aqy)).m2950b(ByteBuffer.class, axo.class, axl).m2943a(axo.class, new axq()).m2945a(ani.class, ani.class, new avb()).m2944a(ani.class, Bitmap.class, new axx(ard)).m2941a(new axh()).m2945a(File.class, ByteBuffer.class, new ati()).m2945a(File.class, InputStream.class, new atp((byte) 0)).m2944a(File.class, File.class, new axk()).m2945a(File.class, ParcelFileDescriptor.class, new atp()).m2945a(File.class, File.class, new avb()).m2941a(new aor(aqy)).m2945a(Integer.TYPE, InputStream.class, new auv(resources)).m2945a(Integer.TYPE, ParcelFileDescriptor.class, new auu(resources)).m2945a(Integer.class, InputStream.class, new auv(resources)).m2945a(Integer.class, ParcelFileDescriptor.class, new auu(resources)).m2945a(String.class, InputStream.class, new atm()).m2945a(String.class, InputStream.class, new auz()).m2945a(String.class, ParcelFileDescriptor.class, new auy()).m2945a(Uri.class, InputStream.class, new avm()).m2945a(Uri.class, InputStream.class, new asx(context.getAssets())).m2945a(Uri.class, ParcelFileDescriptor.class, new asw(context.getAssets())).m2945a(Uri.class, InputStream.class, new avo(context)).m2945a(Uri.class, InputStream.class, new avq(context)).m2945a(Uri.class, InputStream.class, new avg(context.getContentResolver())).m2945a(Uri.class, ParcelFileDescriptor.class, new ave(context.getContentResolver())).m2945a(Uri.class, InputStream.class, new avi()).m2945a(URL.class, InputStream.class, new avs()).m2945a(Uri.class, File.class, new auc(context)).m2945a(atu.class, InputStream.class, new avk()).m2945a(byte[].class, ByteBuffer.class, new asz()).m2945a(byte[].class, InputStream.class, new atd()).m2946a(Bitmap.class, BitmapDrawable.class, new aya(resources, ard)).m2946a(Bitmap.class, byte[].class, new axz()).m2946a(axo.class, byte[].class, new ayb());
        Context context2 = context;
        this.f1288f = new amk(context2, this.f1289g, new azu(), azl, apw, this, i);
    }

    public ard m2902a() {
        return this.f1285c;
    }

    public aqy m2906b() {
        return this.f1290h;
    }

    public Context m2908c() {
        return this.f1288f.getBaseContext();
    }

    ayj m2909d() {
        return this.f1291i;
    }

    amk m2910e() {
        return this.f1288f;
    }

    public void m2911f() {
        baq.m4685a();
        this.f1286d.m3918a();
        this.f1285c.mo359a();
        this.f1290h.m3783a();
    }

    public void m2903a(int i) {
        baq.m4685a();
        this.f1286d.mo373a(i);
        this.f1285c.mo360a(i);
        this.f1290h.m3784a(i);
    }

    public amr m2912g() {
        return this.f1289g;
    }

    void m2905a(azx<?> azx_) {
        synchronized (this.f1292j) {
            for (amu b : this.f1292j) {
                if (b.m2977b(azx_)) {
                    return;
                }
            }
            throw new IllegalStateException("Failed to remove target from managers");
        }
    }

    void m2904a(amu amu) {
        synchronized (this.f1292j) {
            if (this.f1292j.contains(amu)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f1292j.add(amu);
        }
    }

    void m2907b(amu amu) {
        synchronized (this.f1292j) {
            if (this.f1292j.contains(amu)) {
                this.f1292j.remove(amu);
            } else {
                throw new IllegalStateException("Cannot register not yet registered manager");
            }
        }
    }

    public void onTrimMemory(int i) {
        m2903a(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        m2911f();
    }

    public static amu m2901b(Context context) {
        return ays.f2555a.m4364a(context);
    }
}
