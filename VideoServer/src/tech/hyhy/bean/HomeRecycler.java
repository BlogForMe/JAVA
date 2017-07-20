package tech.hyhy.bean;

/**
 * 首页的数据对象
 * @author Administrator
 *
 */
public class HomeRecycler {
	private String h_title;
	private String h_describe;
	private String h_imgurl;

	public HomeRecycler(String h_title, String h_describe, String h_imgurl) {
		super();
		this.h_title = h_title;
		this.h_describe = h_describe;
		this.h_imgurl = h_imgurl;
	}

	public String getH_title() {
		return h_title;
	}

	public void setH_title(String h_title) {
		this.h_title = h_title;
	}

	public String getH_describe() {
		return h_describe;
	}

	public void setH_describe(String h_describe) {
		this.h_describe = h_describe;
	}

	public String getH_imgurl() {
		return h_imgurl;
	}

	public void setH_imgurl(String h_imgurl) {
		this.h_imgurl = h_imgurl;
	}

	@Override
	public String toString() {
		return "HomeRecycler [h_title=" + h_title + ", h_describe=" + h_describe + ", h_imgurl=" + h_imgurl + "]";
	}

}
