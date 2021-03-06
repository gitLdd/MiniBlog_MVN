package cn.code4j.MiniBlog.commons.beans;

import java.util.Date;

public class Blog {

    private Integer tid;

    private Integer uid;

    private String title;

    private Date releasedate;

    private Integer zannum;

    private Integer talknum;

    private String label;

    private String text;
    
    /*----------------2017-12-28 8:47:14----------------*/
    private String unick;
    public String getUnick() {
		return unick;
	}
	public void setUnick(String unick) {
		this.unick = unick;
	}
	/*----------------2017-12-28 8:47:14----------------*/

	public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Integer getZannum() {
        return zannum;
    }

    public void setZannum(Integer zannum) {
        this.zannum = zannum;
    }

    public Integer getTalknum() {
        return talknum;
    }

    public void setTalknum(Integer talknum) {
        this.talknum = talknum;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

	@Override
	public String toString() {
		return "Blog [tid=" + tid + ", uid=" + uid + ", title=" + title + ", releasedate=" + releasedate + ", zannum="
				+ zannum + ", talknum=" + talknum + ", label=" + label + ", text=" + text + ", unick=" + unick + "]";
	}

    
}