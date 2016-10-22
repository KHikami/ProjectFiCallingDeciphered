import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public final class bcd {
    final Set a;
    public boolean b;
    private String c;
    private String d;
    private boolean e;
    private Context f;

    public bcd(Context context) {
        this.a = Collections.newSetFromMap(new ConcurrentHashMap(8, 0.9f, 1));
        this.e = false;
        this.b = true;
        this.f = context;
    }

    public final void a(boolean z) {
        this.b = z;
        for (bce c : this.a) {
            c.c(this.b);
        }
    }

    public final String a() {
        Context context = this.f;
        if (!(this.e || context == null)) {
            bdf.b((Object) this, "initializeCameraList");
            try {
                CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                if (cameraManager != null) {
                    try {
                        String[] cameraIdList = cameraManager.getCameraIdList();
                        for (int i = 0; i < cameraIdList.length; i++) {
                            CameraCharacteristics cameraCharacteristics = null;
                            try {
                                cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[i]);
                            } catch (IllegalArgumentException e) {
                            } catch (CameraAccessException e2) {
                            }
                            if (cameraCharacteristics != null) {
                                int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
                                if (intValue == 0) {
                                    this.c = cameraIdList[i];
                                } else if (intValue == 1) {
                                    this.d = cameraIdList[i];
                                }
                            }
                        }
                        this.e = true;
                        bdf.b((Object) this, "initializeCameraList : done");
                    } catch (CameraAccessException e3) {
                        String valueOf = String.valueOf(e3);
                        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 25).append("Could not access camera: ").append(valueOf).toString());
                    }
                }
            } catch (Exception e4) {
                bdf.c((Object) this, "Could not get camera service.");
            }
        }
        if (this.b) {
            return this.c;
        }
        return this.d;
    }
}
