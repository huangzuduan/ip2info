package com.ipinfo.util;

/**
 * IP信息类型
 * @author Huang
 * @date 2013-9-27 上午11:12:16
 */
public class DIpInfo {

	
	/**
	 * {
	ret : 1,
	start : "183.61.128.0",
	end : "183.61.139.255",
	country : "中国",
	province : "广东",
	city : "湛江",
	district : "遂溪",
	isp : "电信",
	type : "机房",
	desc : "电信遂溪IDC机房"
}
	 */
	private String ip; //ip
	private String start; // 网络地址
	private String end; // 广播地址
	private String country; // 国家
	private String province; // 省份
	private String city; // 城市
	private String district; // 区域
	private String isp; // 服务商
	private String type; // ip所属类型
	private String desc; // ip所在地址
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getIsp() {
		return isp;
	}
	public void setIsp(String isp) {
		this.isp = isp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
