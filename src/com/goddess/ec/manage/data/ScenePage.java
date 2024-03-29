package com.goddess.ec.manage.data;

import org.apache.commons.lang3.StringUtils;


public enum ScenePage {

    COMMODITY_LIST("1", "/commodities/", "/commodities/getCommoditiesByScene/", "商品列表页"),
	
    COMMODITY_DETAIL("2", "/commodity/", "/commodities/get/", "商品详情页"),

    BRAND_DETAIL("3", "/brand/", "/brands/get/", "品牌详情页"),

    ACTIVITY("4", "/activity/", "", "活动页");
	
	private String _code;
	private String _text;
	private String _routeUrl;
	private String _sceneUrl;
	
	private ScenePage(String code, String routeUrl, String sceneUrl, String text) {
		this._code = code;
		this._text = text;
		this._routeUrl = routeUrl;
		this._sceneUrl = sceneUrl;
	}
	
	public String getCode() {
		return _code;
	}
	
	public String getText() {
		return _text;
	}

	public String getRouteUrl() {
		return _routeUrl;
	}
	
	public String getSceneUrl() {
		return _sceneUrl;
	}
	
	public static ScenePage getEnumByCode(String code) {
		if (StringUtils.isEmpty(code)) return null;
		ScenePage[] types = ScenePage.values();
		for (ScenePage t : types) {
			if (t.getCode().equals(code))
				return t;
		}
		return null;
	}
	
	public String getSceneUrl(int sceneId, String commodityId) {
		if ("1".equals(_code))
			return _sceneUrl + sceneId;
		return _sceneUrl + commodityId;
	}
	
	public String getRouteUrl(int sceneId, String commodityId) {
		if ("2".equals(_code))
			return _routeUrl + commodityId;
		return _routeUrl + sceneId;
	}
}
