package com.ipinfo.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	private static HashMap<String, DIpInfo> ipGSON = new HashMap<>();

	/**
	 * http
	 * 
	 * @author Huang
	 * @date 2013-6-13 上午10:54:52
	 * @return void
	 */
	private static void ip2Json(List<String> ipList) {
		
		StringBuffer ipsbuff = new StringBuffer();
		for (String ip : ipList) {
			ipsbuff.append(ip).append(",");
		}
		String ipstrs = ipsbuff.substring(0, ipsbuff.length() -1 );
		HttpRequester request = new HttpRequester();
		try {
			HttpRespons hr = request.sendGet(
					"http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip="
							+ ipstrs, 6000);
			String ipJSON = hr.getContent();
			GSONObject gson = new GSONObject(ipJSON);
			for (String ip : ipList) {
				Object gsonT = gson.get(ip);
				GSONObject ipInfoJSON = GSONObject.decode(gsonT.toString());
				DIpInfo ipInfo = new DIpInfo();
				ipInfo.setIp(ip);
				ipInfo.setStart(ipInfoJSON.getString("start"));
				ipInfo.setEnd(ipInfoJSON.getString("end"));
				ipInfo.setCountry(ipInfoJSON.getString("country"));
				ipInfo.setProvince(ipInfoJSON.getString("province"));
				ipInfo.setCity(ipInfoJSON.getString("city"));
				ipInfo.setDistrict(ipInfoJSON.getString("district"));
				ipInfo.setIsp(ipInfoJSON.getString("isp"));
				ipInfo.setType(ipInfoJSON.getString("type"));
				ipInfo.setDesc(ipInfoJSON.getString("desc"));
				ipGSON.put(ip, ipInfo);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		List<String> ipList = new ArrayList<>();
		ipList.add("183.61.136.144");
		ipList.add("183.61.137.71");
		ip2Json(ipList);
	}
}