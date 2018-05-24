package com;

public class vdvd {
	public static void main(String[] args){ 
        String url = "";
        String jsonStr = "{s:ss}";
        String httpOrgCreateTestRtn = HttpClientUtil.doPost(url, jsonStr, "utf-8");
    }
}
