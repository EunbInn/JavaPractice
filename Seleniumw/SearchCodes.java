package Seleniumw;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class SearchCodes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Document doc = Jsoup.connect("https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=102&oid=015&aid=0004525364&m_view=1&includeAllCount=true&m_url=%2Fcomment%2Fall.nhn%3FserviceId%3Dnews%26gno%3Dnews015%2C0004525364%26sort%3Dlikability").get();
		String viewMore = doc.select("div.u_cbox_paginate").outerHtml();

	}

}
