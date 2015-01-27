/**
 * 
 */
package com.generator.plugin;

import org.mybatis.generator.api.IntrospectedColumn;

/**
 * 
 * @author tanxianwen 2015年1月27日
 */
public class MyIntrospectedColumn extends IntrospectedColumn {

	@Override
	public boolean isBLOBColumn() {
		if (null != properties && "true".equals(properties.getProperty("forceInBlobModel", "false"))) {
			return true;
		}
		return super.isBLOBColumn();
	}
}
