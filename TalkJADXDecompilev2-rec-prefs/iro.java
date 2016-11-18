package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.util.List;

public final class iro extends iry {
    SurfaceTexture f18808a;
    private int f18809b;
    private int f18810c;
    private int f18811d;
    private int f18812e;
    private Camera f18813f;
    private iuc f18814g;

    public iro(Context context) {
        int i = 0;
        super(context);
        this.f18809b = -1;
        this.f18810c = -1;
        this.f18811d = 0;
        this.f18812e = 0;
        this.s = new irp(this);
        try {
            CameraInfo cameraInfo = new CameraInfo();
            int numberOfCameras = Camera.getNumberOfCameras();
            while (i < numberOfCameras) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    this.f18809b = i;
                    this.f18811d = cameraInfo.orientation;
                } else {
                    this.f18810c = i;
                    this.f18812e = cameraInfo.orientation;
                }
                i++;
            }
        } catch (Throwable e) {
            itx.m23281a("vclib", "Failed to detect cameras", e);
        }
    }

    public void mo1321a(ite ite, itq itq) {
        super.mo1321a(ite, itq);
        itq.mo3284a(this.s);
    }

    public boolean mo3387a() {
        return this.f18809b != -1;
    }

    public boolean mo3388b() {
        return this.f18810c != -1;
    }

    protected iuc mo3389c() {
        iuc iuc;
        synchronized (this.y) {
            iuc = this.f18814g;
        }
        return iuc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void mo3390d() {
        synchronized (this.y) {
            if (this.f18813f != null) {
                itx.m23277a(3, "vclib", "Camera was already opened, ignoring");
            } else if (this.C == 0) {
                itx.m23280a("vclib", "openCamera was called with no camera selected.");
            } else if (this.f18813f != null || this.w == null || this.z == null || this.f18808a == null) {
            } else {
                iil.m21879b("Attempted to open camera without a camera selected", this.C == 0);
                try {
                    int i;
                    int i2;
                    int i3;
                    this.f18813f = Camera.open(this.C == 1 ? this.f18809b : this.f18810c);
                    Parameters parameters = this.f18813f.getParameters();
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int[] iArr = (int[]) supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                    int i4 = this.z.f19002c * 1000;
                    int[] iArr2 = iArr;
                    for (int[] iArr3 : supportedPreviewFpsRange) {
                        itx.m23279a(3, "vclib", "Camera FPS range: %d-%d", Integer.valueOf(iArr3[0]), Integer.valueOf(iArr3[1]));
                        if (iArr3[1] > iArr2[1] || iArr3[1] < i4 || (iArr3[1] >= iArr2[1] && iArr3[0] > iArr2[0])) {
                            iArr3 = iArr2;
                        }
                        iArr2 = iArr3;
                    }
                    itx.m23282a("vclib", "Using camera FPS range: %d-%d", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
                    parameters.setPreviewFpsRange(iArr2[0], iArr2[1]);
                    iuc a = iuc.m23299a(this.B, new iuc(this.z.f19003d, this.z.f19004e));
                    Size size = null;
                    i4 = Integer.MAX_VALUE;
                    for (Size size2 : parameters.getSupportedPreviewSizes()) {
                        Size size3;
                        itx.m23279a(3, "vclib", "Camera preview candidate: %d x %d", Integer.valueOf(size2.width), Integer.valueOf(size2.height));
                        int i5 = size2.width - a.f19032a;
                        i = size2.height - a.f19033b;
                        if (i5 < 0) {
                            i5 *= -4;
                        }
                        if (i < 0) {
                            i *= -4;
                        }
                        i += i5;
                        if (i < i4) {
                            i2 = i;
                            size3 = size2;
                            i3 = i2;
                        } else {
                            i3 = i4;
                            size3 = size;
                        }
                        i4 = i3;
                        size = size3;
                    }
                    parameters.setPreviewSize(size.width, size.height);
                    float f = ((float) size.width) / ((float) size.height);
                    Size size4 = null;
                    float f2 = Float.MAX_VALUE;
                    i = Integer.MAX_VALUE;
                    for (Size size22 : parameters.getSupportedPictureSizes()) {
                        itx.m23279a(3, "vclib", "Camera picture candidate: %d x %d", Integer.valueOf(size22.width), Integer.valueOf(size22.height));
                        if (size22.width >= size.width && size22.height >= size.height) {
                            if (size22.width == size.width && size22.height == size.height) {
                                break;
                            }
                            float f3;
                            Size size5;
                            float abs = Math.abs((((float) size22.width) / ((float) size22.height)) - f);
                            i4 = size22.width * size22.height;
                            if (abs < f2 || (abs == f2 && i4 < i)) {
                                f3 = abs;
                                i2 = i4;
                                size5 = size22;
                                i3 = i2;
                            } else {
                                i3 = i;
                                size5 = size4;
                                f3 = f2;
                            }
                            f2 = f3;
                            size4 = size5;
                            i = i3;
                        }
                    }
                    Size size222 = size4;
                    if (size222 == null) {
                        itx.m23277a(5, "vclib", "No picture size appropriate for current preview size.");
                    } else {
                        itx.m23282a("vclib", "Camera picture size: %d x %d ", Integer.valueOf(size222.width), Integer.valueOf(size222.height));
                        parameters.setPictureSize(size222.width, size222.height);
                    }
                    this.f18813f.setParameters(parameters);
                    this.f18814g = new iuc(parameters.getPreviewSize().width, parameters.getPreviewSize().height);
                    if (this.C == 1) {
                        i3 = (360 - this.f18811d) % 360;
                    } else {
                        i3 = this.f18812e;
                    }
                    this.f18813f.setDisplayOrientation(i3);
                    itx.m23282a("vclib", "Camera preview size: %s ", this.f18814g);
                    try {
                        this.w.mo3283a(new itp().m23259a(this.f18814g.f19032a, this.f18814g.f19033b));
                        this.f18813f.setPreviewTexture(this.f18808a);
                    } catch (Throwable e) {
                        itx.m23286b("vclib", "Failure setting preview display", e);
                    }
                    try {
                        this.f18813f.startPreview();
                        m23061b(this.C == 1 ? this.f18811d : this.f18812e);
                    } catch (Throwable e2) {
                        itx.m23281a("vclib", "startPreview failed; something else is using the camera.", e2);
                        m23074l();
                    }
                } catch (Throwable e22) {
                    itx.m23281a("vclib", "Error opening camera", e22);
                    m23074l();
                }
            }
        }
    }

    protected void mo3391e() {
        synchronized (this.y) {
            if (this.f18813f != null) {
                this.f18813f.stopPreview();
                this.f18813f.release();
                this.f18813f = null;
            }
        }
        m23076n();
    }
}
