import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import java.util.HashSet;
import java.util.Set;

public final class irq extends iry {
    private final irt F;
    private final Context G;
    private boolean H;
    final CameraManager a;
    final iru b;
    final irs c;
    final irv d;
    final irw e;
    final irx f;
    final boolean g;
    final Set<Surface> h;
    Surface i;
    ijn j;
    String k;
    String l;
    CameraDevice m;
    CameraCaptureSession n;
    iuc o;
    int p;
    boolean q;

    public irq(Context context, boolean z) {
        super(context);
        this.h = new HashSet();
        this.G = context;
        this.g = z;
        this.s = new irr(this);
        this.F = new irt(this);
        this.b = new iru(this);
        this.c = new irs(this);
        this.d = new irv(this);
        this.e = new irw(this);
        this.f = new irx(this);
        this.a = (CameraManager) context.getSystemService("camera");
        p();
    }

    public void a(ite ite, itq itq) {
        super.a(ite, itq);
        iil.a("Must use CallClient", ite instanceof ijn);
        this.j = (ijn) ite;
        if (this.g) {
            itq.b(b(this.G));
        }
        itx.a(3, "vclib", "Camera2 useMultipleSurfaces: %b", Boolean.valueOf(this.g));
        itq.a(this.s);
        a(this.x);
    }

    public void a(ite ite) {
        super.a(ite);
        this.j = null;
    }

    private static int b(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String str : cameraManager.getCameraIdList()) {
                if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 0) {
                    return 2;
                }
                if (((Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return 1;
                }
            }
            return 3;
        } catch (Throwable e) {
            itx.a("vclib", "Exception reading camera properties", e);
            return 1;
        }
    }

    public static boolean a(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String cameraCharacteristics : cameraManager.getCameraIdList()) {
                if (((Integer) cameraManager.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (Throwable e) {
            itx.a("vclib", "Exception reading camera properties", e);
            return false;
        }
    }

    public boolean a() {
        return this.k != null;
    }

    public boolean b() {
        return this.l != null;
    }

    protected iuc c() {
        iuc iuc;
        synchronized (this.y) {
            iuc = this.o;
        }
        return iuc;
    }

    iuc f() {
        Object obj;
        synchronized (this.y) {
            obj = this.C == 1 ? this.k : this.l;
        }
        iil.b(String.format("Attempting to use a camera that doesn't exist. Camera type: %d", new Object[]{Integer.valueOf(this.C)}), obj);
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.a.getCameraCharacteristics(obj).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            iuc a = iuc.a(this.B, new iuc(this.z.d, this.z.e));
            Size size = new Size(0, 0);
            int i = Integer.MAX_VALUE;
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            int length = outputSizes.length;
            int i2 = 0;
            while (i2 < length) {
                Size size2;
                Size size3 = outputSizes[i2];
                itx.a(3, "vclib", "Camera candidate size: %s ", size3);
                int width = size3.getWidth() - a.a;
                int height = size3.getHeight() - a.b;
                if (width < 0) {
                    width *= -4;
                }
                if (height < 0) {
                    height *= -4;
                }
                height += width;
                if (height < i) {
                    size2 = size3;
                } else {
                    height = i;
                    size2 = size;
                }
                i2++;
                size = size2;
                i = height;
            }
            itx.a("vclib", "Camera preview size: %s", size);
            return new iuc(size.getWidth(), size.getHeight());
        } catch (Throwable e) {
            itx.a("vclib", "Failed to read camera capture sizes", e);
            return new iuc(0, 0);
        }
    }

    private void p() {
        try {
            for (String str : this.a.getCameraIdList()) {
                if (((Integer) this.a.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                    this.k = str;
                } else {
                    this.l = str;
                }
            }
        } catch (Throwable e) {
            itx.a("vclib", "Failed to detect cameras", e);
        }
    }

    protected void d() {
        synchronized (this.y) {
            if (this.H) {
                itx.a(3, "vclib", "Camera was already opened, ignoring");
            } else if (this.C == 0) {
                itx.a("vclib", "openCamera was called with no camera selected.");
            } else {
                this.H = true;
                if (this.m == null) {
                    itx.a(3, "vclib", "Opening camera");
                    String str = this.C == 1 ? this.k : this.l;
                    if (str == null) {
                        this.H = false;
                        itx.a(6, "vclib", "No working camera on device.");
                        l();
                    } else {
                        try {
                            this.a.openCamera(str, this.F, this.v);
                        } catch (Throwable e) {
                            itx.a("vclib", "Failed to open cameras", e);
                            l();
                        }
                    }
                }
            }
        }
    }

    protected void e() {
        synchronized (this.y) {
            if (this.n != null) {
                itx.a(3, "vclib", "Stopping capture session: %s", this.n);
                this.n.close();
                this.n = null;
            }
            if (this.m != null) {
                itx.a(3, "vclib", "Closing camera");
                this.m.close();
                this.m = null;
            }
            if (this.i != null) {
                this.i.release();
            }
            this.h.clear();
            this.H = false;
        }
        n();
    }
}
