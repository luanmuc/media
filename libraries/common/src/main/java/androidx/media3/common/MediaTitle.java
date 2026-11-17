package androidx.media3.common;

/** 兼容层：FongMi 分支自定义的媒体标题对象。 */
public final class MediaTitle {

  public int index;
  public String label = "";
  public long durationUs;
  public boolean selected;

  public MediaTitle(int index, String label, long durationUs, boolean selected) {
    this.index = index;
    this.label = label;
    this.durationUs = durationUs;
    this.selected = selected;
  }

  public MediaTitle(int index, String label, long durationUs) {
    this(index, label, durationUs, false);
  }
}
