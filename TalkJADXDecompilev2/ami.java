package defpackage;

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
    private static volatile ami a;
    private final apw b;
    private final ard c;
    private final ase d;
    private final ast e;
    private final amk f;
    private final amr g;
    private final aqy h;
    private final ayj i;
    private final List<amu> j = new ArrayList();

    public static ami a(Context context) {
        if (a == null) {
            synchronized (ami.class) {
                if (a == null) {
                    Context applicationContext = context.getApplicationContext();
                    List<ayx> a = new ayy(applicationContext).a();
                    amj amj = new amj(applicationContext);
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    a = amj.a();
                    for (ayx a2 : a) {
                        a2.a(a.g);
                    }
                }
            }
        }
        return a;
    }

    ami(Context context, apw apw, ase ase, ard ard, aqy aqy, ayj ayj, int i, azl azl) {
        this.b = apw;
        this.c = ard;
        this.h = aqy;
        this.d = ase;
        this.i = ayj;
        this.e = new ast(ase, ard, (anr) azl.p.a(awn.a));
        Resources resources = context.getResources();
        awn awn = new awn(resources.getDisplayMetrics(), ard, aqy);
        aoa axl = new axl(context, ard, aqy);
        this.g = new amr().a(ByteBuffer.class, new atf()).a(InputStream.class, new auw(aqy)).a(ByteBuffer.class, Bitmap.class, new awb(awn)).a(InputStream.class, Bitmap.class, new awy(awn, aqy)).a(ParcelFileDescriptor.class, Bitmap.class, new axc(ard)).a(Bitmap.class, new avy()).a(ByteBuffer.class, BitmapDrawable.class, new avv(resources, ard, new awb(awn))).a(InputStream.class, BitmapDrawable.class, new avv(resources, ard, new awy(awn, aqy))).a(ParcelFileDescriptor.class, BitmapDrawable.class, new avv(resources, ard, new axc(ard))).a(BitmapDrawable.class, new avw(ard, new avy())).b(InputStream.class, axo.class, new axy(axl, aqy)).b(ByteBuffer.class, axo.class, axl).a(axo.class, new axq()).a(ani.class, ani.class, new avb()).a(ani.class, Bitmap.class, new axx(ard)).a(new axh()).a(File.class, ByteBuffer.class, new ati()).a(File.class, InputStream.class, new atp((byte) 0)).a(File.class, File.class, new axk()).a(File.class, ParcelFileDescriptor.class, new atp()).a(File.class, File.class, new avb()).a(new aor(aqy)).a(Integer.TYPE, InputStream.class, new auv(resources)).a(Integer.TYPE, ParcelFileDescriptor.class, new auu(resources)).a(Integer.class, InputStream.class, new auv(resources)).a(Integer.class, ParcelFileDescriptor.class, new auu(resources)).a(String.class, InputStream.class, new atm()).a(String.class, InputStream.class, new auz()).a(String.class, ParcelFileDescriptor.class, new auy()).a(Uri.class, InputStream.class, new avm()).a(Uri.class, InputStream.class, new asx(context.getAssets())).a(Uri.class, ParcelFileDescriptor.class, new asw(context.getAssets())).a(Uri.class, InputStream.class, new avo(context)).a(Uri.class, InputStream.class, new avq(context)).a(Uri.class, InputStream.class, new avg(context.getContentResolver())).a(Uri.class, ParcelFileDescriptor.class, new ave(context.getContentResolver())).a(Uri.class, InputStream.class, new avi()).a(URL.class, InputStream.class, new avs()).a(Uri.class, File.class, new auc(context)).a(atu.class, InputStream.class, new avk()).a(byte[].class, ByteBuffer.class, new asz()).a(byte[].class, InputStream.class, new atd()).a(Bitmap.class, BitmapDrawable.class, new aya(resources, ard)).a(Bitmap.class, byte[].class, new axz()).a(axo.class, byte[].class, new ayb());
        Context context2 = context;
        this.f = new amk(context2, this.g, new azu(), azl, apw, this, i);
    }

    public ard a() {
        return this.c;
    }

    public aqy b() {
        return this.h;
    }

    public Context c() {
        return this.f.getBaseContext();
    }

    ayj d() {
        return this.i;
    }

    amk e() {
        return this.f;
    }

    public void f() {
        baq.a();
        this.d.a();
        this.c.a();
        this.h.a();
    }

    public void a(int i) {
        baq.a();
        this.d.a(i);
        this.c.a(i);
        this.h.a(i);
    }

    public amr g() {
        return this.g;
    }

    void a(azx<?> azx_) {
        synchronized (this.j) {
            for (amu b : this.j) {
                if (b.b(azx_)) {
                    return;
                }
            }
            throw new IllegalStateException("Failed to remove target from managers");
        }
    }

    void a(amu amu) {
        synchronized (this.j) {
            if (this.j.contains(amu)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.j.add(amu);
        }
    }

    void b(amu amu) {
        synchronized (this.j) {
            if (this.j.contains(amu)) {
                this.j.remove(amu);
            } else {
                throw new IllegalStateException("Cannot register not yet registered manager");
            }
        }
    }

    public void onTrimMemory(int i) {
        a(i);
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        f();
    }

    public static amu b(Context context) {
        return ays.a.a(context);
    }
}
