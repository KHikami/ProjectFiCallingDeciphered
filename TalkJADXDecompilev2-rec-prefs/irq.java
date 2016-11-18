package p000;

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
    private final irt f18816F;
    private final Context f18817G;
    private boolean f18818H;
    final CameraManager f18819a;
    final iru f18820b;
    final irs f18821c;
    final irv f18822d;
    final irw f18823e;
    final irx f18824f;
    final boolean f18825g;
    final Set<Surface> f18826h = new HashSet();
    Surface f18827i;
    ijn f18828j;
    String f18829k;
    String f18830l;
    CameraDevice f18831m;
    CameraCaptureSession f18832n;
    iuc f18833o;
    int f18834p;
    boolean f18835q;

    public irq(Context context, boolean z) {
        super(context);
        this.f18817G = context;
        this.f18825g = z;
        this.s = new irr(this);
        this.f18816F = new irt(this);
        this.f18820b = new iru(this);
        this.f18821c = new irs(this);
        this.f18822d = new irv(this);
        this.f18823e = new irw(this);
        this.f18824f = new irx(this);
        this.f18819a = (CameraManager) context.getSystemService("camera");
        m23089p();
    }

    public void mo1321a(ite ite, itq itq) {
        super.mo1321a(ite, itq);
        iil.m21874a("Must use CallClient", ite instanceof ijn);
        this.f18828j = (ijn) ite;
        if (this.f18825g) {
            itq.mo3285b(irq.m23088b(this.f18817G));
        }
        itx.m23279a(3, "vclib", "Camera2 useMultipleSurfaces: %b", Boolean.valueOf(this.f18825g));
        itq.mo3284a(this.s);
        m23059a(this.x);
    }

    public void mo1320a(ite ite) {
        super.mo1320a(ite);
        this.f18828j = null;
    }

    private static int m23088b(Context context) {
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
            itx.m23281a("vclib", "Exception reading camera properties", e);
            return 1;
        }
    }

    public static boolean m23087a(Context context) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        try {
            for (String cameraCharacteristics : cameraManager.getCameraIdList()) {
                if (((Integer) cameraManager.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                    return false;
                }
            }
            return true;
        } catch (Throwable e) {
            itx.m23281a("vclib", "Exception reading camera properties", e);
            return false;
        }
    }

    public boolean mo3387a() {
        return this.f18829k != null;
    }

    public boolean mo3388b() {
        return this.f18830l != null;
    }

    protected iuc mo3389c() {
        iuc iuc;
        synchronized (this.y) {
            iuc = this.f18833o;
        }
        return iuc;
    }

    iuc mo3393f() {
        Object obj;
        synchronized (this.y) {
            obj = this.C == 1 ? this.f18829k : this.f18830l;
        }
        iil.m21875b(String.format("Attempting to use a camera that doesn't exist. Camera type: %d", new Object[]{Integer.valueOf(this.C)}), obj);
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f18819a.getCameraCharacteristics(obj).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            iuc a = iuc.m23299a(this.B, new iuc(this.z.f19003d, this.z.f19004e));
            Size size = new Size(0, 0);
            int i = Integer.MAX_VALUE;
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            int length = outputSizes.length;
            int i2 = 0;
            while (i2 < length) {
                Size size2;
                Size size3 = outputSizes[i2];
                itx.m23279a(3, "vclib", "Camera candidate size: %s ", size3);
                int width = size3.getWidth() - a.f19032a;
                int height = size3.getHeight() - a.f19033b;
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
            itx.m23282a("vclib", "Camera preview size: %s", size);
            return new iuc(size.getWidth(), size.getHeight());
        } catch (Throwable e) {
            itx.m23281a("vclib", "Failed to read camera capture sizes", e);
            return new iuc(0, 0);
        }
    }

    private void m23089p() {
        try {
            for (String str : this.f18819a.getCameraIdList()) {
                if (((Integer) this.f18819a.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                    this.f18829k = str;
                } else {
                    this.f18830l = str;
                }
            }
        } catch (Throwable e) {
            itx.m23281a("vclib", "Failed to detect cameras", e);
        }
    }

    protected void mo3390d() {
        synchronized (this.y) {
            if (this.f18818H) {
                itx.m23277a(3, "vclib", "Camera was already opened, ignoring");
                return;
            } else if (this.C == 0) {
                itx.m23280a("vclib", "openCamera was called with no camera selected.");
                return;
            } else {
                this.f18818H = true;
                if (this.f18831m == null) {
                    itx.m23277a(3, "vclib", "Opening camera");
                    String str = this.C == 1 ? this.f18829k : this.f18830l;
                    if (str == null) {
                        this.f18818H = false;
                        itx.m23277a(6, "vclib", "No working camera on device.");
                        m23074l();
                    } else {
                        try {
                            this.f18819a.openCamera(str, this.f18816F, this.v);
                        } catch (Throwable e) {
                            itx.m23281a("vclib", "Failed to open cameras", e);
                            m23074l();
                        }
                    }
                }
            }
        }
    }

    protected void mo3391e() {
        synchronized (this.y) {
            if (this.f18832n != null) {
                itx.m23279a(3, "vclib", "Stopping capture session: %s", this.f18832n);
                this.f18832n.close();
                this.f18832n = null;
            }
            if (this.f18831m != null) {
                itx.m23277a(3, "vclib", "Closing camera");
                this.f18831m.close();
                this.f18831m = null;
            }
            if (this.f18827i != null) {
                this.f18827i.release();
            }
            this.f18826h.clear();
            this.f18818H = false;
        }
        m23076n();
    }
}
