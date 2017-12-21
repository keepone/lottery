package org.lottery.spider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Hello world!
 *
 */
public class GetNews {
	public static void main(String[] args) {

	}

	/**
	 * 310win获取分析 {@link Source}
	 * 
	 * @return {@link JSONArray}
	 */
	public static List<JSONObject> getNewsBy310() {
		JSONArray jsonArray = new JSONArray();
		List<JSONObject> list=new ArrayList<JSONObject>();
		String title = null;
		String href = null;
		Document doc = null;
		try {
			doc = Jsoup
					.connect(
							"http://www.310win.com/jingcailanqiu/info_t1sub2page1.html")
					.timeout(60000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}		Elements hrefs = doc.select("div.td_div3").select("a[href]");
		for (Element a : hrefs) {
			title = a.text();
			if (title.indexOf("NBA竞彩") != -1) {
				JSONObject json = new JSONObject();
				href = a.absUrl("href");
				System.out.println(title + href);
				json.put("name", title);
				json.put("content", href);
				list.add(json);
			}

		}
		return list;
	}
}
