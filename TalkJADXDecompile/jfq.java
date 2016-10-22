import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class jfq {
    public static jfq a;
    final SparseArray<JSONObject> b;
    private final lo<String, Property<?, ?>[]> c;
    private final lo<String, String[]> d;

    public jfq() {
        this.b = new SparseArray();
        this.c = new lo();
        this.d = new lo();
        this.c.put("position", new Property[]{jfw.e, jfw.f});
        this.d.put("position", new String[]{"x", "y"});
        this.c.put("scale", new Property[]{View.SCALE_X, View.SCALE_Y});
        this.d.put("scale", new String[]{"sx", "sy"});
        this.c.put("opacity", new Property[]{View.ALPHA});
        this.d.put("opacity", null);
    }

    public Animator a(Context context, int i, lo<String, Object> loVar) {
        return a(context, i, loVar, -1.0f, -1.0f);
    }

    private Animator a(Context context, int i, lo<String, Object> loVar, float f, float f2) {
        Throwable e;
        try {
            jfr jfr = new jfr(this, context, i, loVar, -1.0f, -1.0f);
            Animator animatorSet = new AnimatorSet();
            animatorSet.playTogether(b(jfr));
            animatorSet.addListener(new jft(this, jfr));
            return animatorSet;
        } catch (JSONException e2) {
            e = e2;
            throw new jfs(e);
        } catch (IOException e3) {
            e = e3;
            throw new jfs(e);
        } catch (NullPointerException e4) {
            e = e4;
            throw new jfs(e);
        }
    }

    static String a(Context context, int i) {
        InputStream inputStream = null;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            inputStream = context.getResources().openRawResource(i);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuilder.append(readLine);
            }
            String stringBuilder2 = stringBuilder.toString();
            return stringBuilder2;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    void a(jfr jfr) {
        try {
            JSONArray jSONArray = jfr.c.getJSONArray("animations");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Object obj = jfr.d.get(jSONObject.getString("id"));
                if (obj != null && jSONObject.has("initialValues")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("initialValues");
                    Iterator keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (this.d.containsKey(str)) {
                            Property[] propertyArr = (Property[]) this.c.get(str);
                            String[] strArr = (String[]) this.d.get(str);
                            if (strArr == null) {
                                if (jfr.a(propertyArr[0])) {
                                    propertyArr[0].set(obj, Float.valueOf(a(jfr, propertyArr[0], jSONObject2.getDouble(str))));
                                }
                            }
                            JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                            int length2 = strArr == null ? 0 : strArr.length;
                            int i2 = 0;
                            while (i2 < length2) {
                                if (jfr.a(propertyArr[i2]) && jSONObject3.has(strArr[i2])) {
                                    propertyArr[i2].set(obj, Float.valueOf(a(jfr, propertyArr[i2], jSONObject3.getDouble(strArr[i2]))));
                                }
                                i2++;
                            }
                        }
                    }
                    continue;
                }
            }
        } catch (Throwable e) {
            throw new jfs(e);
        }
    }

    private Collection<Animator> b(jfr jfr) {
        JSONArray jSONArray = jfr.c.getJSONArray("animations");
        Collection arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            a(jfr, jSONArray.getJSONObject(i), arrayList);
        }
        return arrayList;
    }

    private void a(jfr jfr, JSONObject jSONObject, Collection<Animator> collection) {
        Object obj = jfr.d.get(jSONObject.getString("id"));
        if (obj != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("animations");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                long j = (long) (jSONObject2.getDouble("duration") * 1000.0d);
                long optDouble = (long) (jSONObject2.optDouble("delay", 0.0d) * 1000.0d);
                String string = jSONObject2.getString("property");
                Property[] propertyArr = (Property[]) this.c.get(string);
                String[] strArr = (String[]) this.d.get(string);
                Object obj2 = strArr == null ? 1 : null;
                JSONArray jSONArray2 = jSONObject2.getJSONArray("keyframes");
                int length2 = jSONArray2.length();
                if (length2 > 0) {
                    int i2 = 0;
                    while (i2 < propertyArr.length) {
                        int i3 = 0;
                        TimeInterpolator timeInterpolator = null;
                        Keyframe[] keyframeArr = null;
                        while (i3 < length2) {
                            JSONArray jSONArray3 = jSONArray2.getJSONArray(i3);
                            JSONObject jSONObject3 = obj2 != null ? null : jSONArray3.getJSONObject(1);
                            if (jSONObject3 != null && !jSONObject3.has(strArr[i2])) {
                                break;
                            }
                            Keyframe[] keyframeArr2;
                            jfu jfu;
                            Object obj3;
                            if (keyframeArr == null) {
                                keyframeArr2 = new Keyframe[length2];
                            } else {
                                keyframeArr2 = keyframeArr;
                            }
                            double d = jSONObject3 != null ? jSONObject3.getDouble(strArr[i2]) : 0.0d;
                            float f = (float) jSONArray3.getDouble(0);
                            Property property = propertyArr[i2];
                            if (obj2 != null) {
                                d = jSONArray3.getDouble(1);
                            }
                            keyframeArr2[i3] = Keyframe.ofFloat(f, a(jfr, property, d));
                            if (timeInterpolator != null) {
                                timeInterpolator.a(keyframeArr2[i3 - 1], keyframeArr2[i3]);
                                keyframeArr2[i3].setInterpolator(timeInterpolator);
                            }
                            if (jSONArray3.length() >= 3) {
                                jSONObject3 = jSONArray3.getJSONObject(2);
                                if (jSONObject3.getString("name").equals("cubic-bezier")) {
                                    jfu = new jfu((float) jSONObject3.getDouble("x1"), (float) jSONObject3.getDouble("y1"), (float) jSONObject3.getDouble("x2"), (float) jSONObject3.getDouble("y2"));
                                    i3++;
                                    obj3 = jfu;
                                    keyframeArr = keyframeArr2;
                                }
                            }
                            jfu = null;
                            i3++;
                            obj3 = jfu;
                            keyframeArr = keyframeArr2;
                        }
                        if (keyframeArr != null) {
                            Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(propertyArr[i2], keyframeArr)});
                            ofPropertyValuesHolder.setDuration(j).setStartDelay(optDouble);
                            collection.add(ofPropertyValuesHolder);
                        }
                        i2++;
                    }
                }
            }
        }
    }

    private static float a(jfr jfr, Property<?, ?> property, double d) {
        if (jfr.a(property)) {
            float f = 1.0f;
            if (property == jfw.e) {
                f = jfr.a;
            } else if (property == jfw.f) {
                f = jfr.b;
            }
            return f * ((float) d);
        }
        throw new jfs("Cannot animate position if stage size was not defined");
    }
}
